package model;

public interface Ingredients {
    Ingredient findById(long id);
    long createIngredient(Ingredient ingredient);

}
