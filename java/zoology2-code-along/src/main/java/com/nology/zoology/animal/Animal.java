package com.nology.zoology.animal;

public abstract class Animal implements Comparable<Animal> {
    private int id;
    protected String name;
    protected int age;
    protected boolean isPettable;
    protected short hunger = 50;
    private static final int HUNGER_LEVEL = 40;

    // Can we have a way to know when an animal is hungry and when it should
    // be fed?

    public Animal(int id, String name, int age) {
        validateAnimalName(name);
        validateAnimalAge(age);
        this.id = id;
        this.name=name;
        this.age = age;
        this.isPettable = getType().isPettable();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        validateAnimalName(name);
            this.name =name;
    }

    private void validateAnimalName(String name){
        if (name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        validateAnimalAge(age);
        this.age = age;
    }

    private void validateAnimalAge(int age){
        if (age < 1 || age > 99 ){
            throw new IllegalArgumentException("Age must be between 1 - 99");
        }
        this.age = age;
    }


    public short getHunger() {
        return hunger;
    }


    public void setHunger(short hunger) {
        validateAnimalHunger(hunger);
        this.hunger = hunger;
    }
    private void validateAnimalHunger(short hunger){
        if ( hunger < 0 || hunger > 100){
            throw new IllegalArgumentException("Hunger must be between 0 - 100");
        }
        this.hunger=hunger;
    }


    public boolean isHungry() {
        return this.hunger >= HUNGER_LEVEL;
    };

    public void feed() {
        hunger -= 10;
        makeSound();
    }

    public abstract void makeSound();
    public abstract String getInformation();

    public AnimalType getType() {
        return null;
    }

    @Override
    public int compareTo(Animal other) {
        // We want to compare the ID - object is ID current Object.id to
        // otherObject.id
        // -1 - current id is smaller than other id
        // 0 IDs are the same
        // +1 current ID is greater than other id

        return this.id - other.id;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + String.format("[id=%s, name=%s, " +
                "age=%d]", this.id, this.name, this.age);
    }
}
