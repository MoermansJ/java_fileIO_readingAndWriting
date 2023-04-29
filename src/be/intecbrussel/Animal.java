package be.intecbrussel;

public class Animal {
    //properties
    private String name;
    private boolean edible;


    //constructors
    public Animal(String name, boolean edible) {
        this.name = name;
        this.edible = edible;
    }


    //getters & setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isEdible() {
        return edible;
    }

    public void setEdible(boolean edible) {
        this.edible = edible;
    }
}
