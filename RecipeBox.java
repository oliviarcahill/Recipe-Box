
/**
 * 9-2 Final Project Submission: Collection Manager Program
 * @author Olivia Cahill
 */


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class RecipeBox {

  
    private ArrayList<Recipe> listOfRecipes = new ArrayList<>();

    /**
     * Accessor and Mutator
     *
     */
    // Getter
    public ArrayList getListOfRecipes() {
        return listOfRecipes;
    }
    // Setter
    public void setListOfRecipes(ArrayList<Recipe> newListOfRecipes) {
        this.listOfRecipes = newListOfRecipes;
    }

    /**
     * Constructors initializing recipe box
     */
    public void SteppingStone6_RecipeBox() {
        this.listOfRecipes = new ArrayList<Recipe>();
    }
    public void SteppingStone6_RecipeBox(ArrayList<Recipe> listOfRecipes){
	this.listOfRecipes = listOfRecipes;
    }
    /*
    * Printing info about selected recipe
    
    */
    public void printAllRecipeDetails(String selectedRecipe) {
        //SteppingStone5_Recipe1 recipe1 = new SteppingStone5_Recipe1();
        boolean found = listOfRecipes.contains(selectedRecipe);
        if (found) {
            int index = listOfRecipes.indexOf(selectedRecipe);
            listOfRecipes.get(index);
            Recipe recipe = new Recipe();
            recipe.printRecipe();
        }
    }
    
    /*
    * Print all recipe names and looping
     */
    public void printAllRecipeNames() {
        for (int i = 0; i < listOfRecipes.size(); i++) {
            System.out.println(listOfRecipes.get(i));
        }
    }
    /*
    * Add new recipe to recipe box
    */
    public void addNewRecipe() {
        List<Object> newRecipe = Recipe.createNewRecipe();
        System.out.println(newRecipe);
        
        for (int i = 0; i < listOfRecipes.size(); i++) {
            System.out.println(listOfRecipes.get(i));
        }   
    }
    
    
    public static void main(String[] args) {

        RecipeBox myRecipeBox = new RecipeBox(); 
        final Recipe recipe = new Recipe();
        Scanner menuScnr = new Scanner(System.in);
        
        recipe.getRecipeName();

        /**
         * Print menu asking the user for 3 options to select 
         * Print out info based on option selected by user-user can add recipe, print all recipe details or print recipe name
         */
        System.out.println("Menu\n" + "1. Add Recipe\n" + "2. Print All Recipe Details\n" + "3. Print All Recipe Names\n" + "\nPlease select a menu item:");
        while (menuScnr.hasNextInt() || menuScnr.hasNextLine()) {
            System.out.println("Menu\n" + "1. Add Recipe\n" + "2. Print All Recipe Details\n" + "3. Print All Recipe Names\n" + "\nPlease select a menu item:");
            int input = menuScnr.nextInt();

            if (input == 1) {
                myRecipeBox.addNewRecipe();
            } else if (input == 2) {
                System.out.println("Which recipe?\n");
                String selectedRecipeName = menuScnr.next();
                myRecipeBox.printAllRecipeDetails(selectedRecipeName);
            } else if (input == 3) {
                for (int j = 0; j < myRecipeBox.listOfRecipes.size(); j++) {
                    System.out.println((j + 1) + ": " + myRecipeBox.listOfRecipes.get(j));
                }
            } else {
                System.out.println("Menu\n" + "1. Add Recipe\n" + "2. Print All Recipe Details\n" + "3. Print All Recipe Names\n" + "\nPlease select a menu item:");            
            }
            System.out.println("Menu\n" + "1. Add Recipe\n" + "2. Print All Recipe Details\n" + "3. Print All Recipe Names\n" + "\nPlease select a menu item:");
        }
    }
}
