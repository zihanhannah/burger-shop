package model;

import java.util.ArrayList;
import java.util.List;

public class BurgersDao implements Burgers{

    // Create a temporary list, to hold the burgers as they are created
    private List<Burger> burgers = new ArrayList<>();

    // if we had a MySQL connection _instead_ of an ArrayList, the create and find methods would still do the exact same thing and return the exact same data types
    // And everywhere except this exact file has no idea what storage medium we are using
    @Override
    public Burger findById(long id) {
        // we want to find the burger with the ID that's passed in as an argument to this method
        // QUESTION: Are ArrayLists 1-indexed or 0-indexed?
        // ANSWER: 0-indexed
        // So to get the burger with an ID of 1, we need to get the element at index 0 of our `burgers` ArrayList

        // ArrayList.get(index) expects `index` to be an int, so we have to type-caste id from a long to an int
       return  burgers.get((int)id -1);
    }

    @Override
    public long createBurger(Burger burger) {
        burger.setId(burgers.size() + 1);
        burgers.add(burger);
        return burger.getId();
    }
}
