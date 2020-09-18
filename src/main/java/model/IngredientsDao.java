package model;

import java.util.ArrayList;
import java.util.List;

public class IngredientsDao implements Ingredients{
    private List<Ingredient> ingredients = new ArrayList<>();

    @Override
    public Ingredient findById(long id) {
        return null;
    }

    @Override
    public long createIngredient(Ingredient ingredient) {
        return 0;
    }
}
