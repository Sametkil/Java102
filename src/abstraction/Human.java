package src.abstraction;

public abstract class Human {
    private String name;

    public abstract void eat();


    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
