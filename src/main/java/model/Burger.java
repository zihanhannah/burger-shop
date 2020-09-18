package model;

import java.io.Serializable;
//when using MVC, must implement Serializable for our Beans!!!
public class Burger implements Serializable {
    // properties for bun, pickles, numPatties, Cheese
    private long id;

    private String burgerName;
    private int numBuns; // 3 for big mac, etc
    private int numPickles;
    private int numPatties;
    private boolean cheese; // true or false

    // We have to create a 'zero-argument' constructor, so that Java can reserve space in memory for this object

    public Burger() {}

    public String getBurgerName() {
        return burgerName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setBurgerName(String burgerName) {
        this.burgerName = burgerName;
    }

    public int getNumBuns() {
        return numBuns;
    }

    public void setNumBuns(int numBuns) {
        this.numBuns = numBuns;
    }

    public int getNumPickles() {
        return numPickles;
    }

    public void setNumPickles(int numPickles) {
        this.numPickles = numPickles;
    }

    public int getNumPatties() {
        return numPatties;
    }

    public void setNumPatties(int numPatties) {
        this.numPatties = numPatties;
    }

    public boolean isCheese() {
        return cheese;
    }

    public void setCheese(boolean cheese) {
        this.cheese = cheese;
    }

    public Burger(String burgerName, int numBuns, int numPickles, int numPatties, boolean cheese) {
        this.burgerName = burgerName;
        this.numBuns = numBuns;
        this.numPickles = numPickles;
        this.numPatties = numPatties;
        this.cheese = cheese;


    }
}