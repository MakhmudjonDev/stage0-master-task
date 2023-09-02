package com.epam.OOP;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        return "This animal is mostly %s.It has %d %s and %s fur".formatted(color, numberOfPaws, numberOfPaws > 1 ? "paws" : "paw", hasFur ? "a" : "no");
    }

    public static void main(String[] args) {
        Animal animal = new Animal("yellow", 4, true);
        System.out.println(animal.getDescription());
//        Here I am describing a lion, accordingly, getDescription method returns 'This animal is mostly yellow. It has 4 paws and a fur'
        Animal animal1 = new Animal("White", 1, false);
        System.out.println(animal1.getDescription());
//        I have no idea, what kind of animal is that, but it says 1 paw to show the optional result.

        Dog dog = new Dog();
        System.out.println(dog.getDescription());
//        Here I am describing a lion, accordingly, getDescription method returns 'This animal is mostly brown. It has 4 paws and a fur'
        Bird bird = new Bird();
        System.out.println(bird.getDescription());
//        Here I am describing a lion, accordingly, getDescription method returns 'This animal is mostly blue. It has 2 paws and no fur. Moreover, it has 2 wings and can fly'
//        Additionally, Bird class has an overwritten getDescription method that yields slightly different result!

    }
}
