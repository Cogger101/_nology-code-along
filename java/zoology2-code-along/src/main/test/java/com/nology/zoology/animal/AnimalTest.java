package com.nology.zoology.animal;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
    private static final int ANIMAL_ID = 1;
    private static final String ANIMAL_NAME = "Sean";
    private static final int AGE = 2;
    protected short HUNGER = 50;
    private static int HUNGER_LEVEL = 40;

    private Animal animal;

    public AnimalTest(){
    System.out.println("Creating a new AnimalTest!");
    }

    @BeforeEach
    void setUp() {
        System.out.println("Creating a new Animal");
        this.animal = new Animal( ANIMAL_ID, ANIMAL_NAME, AGE);
    }

    @AfterEach
    void tidyUp(){
        System.out.println("Cleaning up after Animal...!");
    }

    @BeforeAll
    static void beforeAllTest(){
        System.out.println("Should run once before any testing begins");
    }

    @AfterAll
    static void afterAllTests(){
        System.out.println("Tests have concluded!! ");
    }

    @Test
    void getId_ValidData_ReturnId() {
        assertEquals(ANIMAL_ID, animal.getId());
    }

    @Test
    @DisplayName("getHunger should return the correct level of hunger")
    void getHunger_ValidData_ReturnCorrectHungerLevel() {
        assertEquals(HUNGER, animal.getHunger());
    }

    @Test
    @DisplayName("setHunger should set the hunger to the correct level")
    void setHunger_HungerSetTo20_returnsVOid() {
        animal.setHunger((short) 20);
        assertEquals(20, animal.getHunger());
    }

    @Test
    @DisplayName("When Hunger is 25, animal should not be hungry")
    void isHungry_HUnger25_ReturnFalse() {
        animal.setHunger((short)25);
        assertFalse(animal.isHungry());
    }

    @Test
    @DisplayName("When Hunger is 25, animal should be hungry")
    void isHungry_HUnger50_ReturnTrue() {
        animal.setHunger((short)50);
        assertTrue(animal.isHungry());
    }

    @Test
    @DisplayName("Feed should reduce hunger")
    void feed_NoInputs_ReducesHunger() {
        animal.feed();
        assertEquals(40, animal.getHunger());
    }
}