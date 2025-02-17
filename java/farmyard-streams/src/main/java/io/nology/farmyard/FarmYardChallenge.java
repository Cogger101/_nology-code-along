package io.nology.farmyard;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FarmYardChallenge {

    private FarmYard farmYard;
    private final List<Animal> animals;

    public FarmYardChallenge() {
        this.farmYard = new FarmYard();
        animals = farmYard.getAnimals();
    }

    /**
     * Get the total number of animals in the farm yard
     * @return the total number of animals in the farm yard
     */
    public int getAnimalCount() {
        return (int) this.animals.stream().count();
//        animals.size();
    }

    /**
     * The total number of cows in the farm yard.
     * @return
     */
    public int getCowCount() {
        return (int) this.animals.stream().filter(animal -> animal.getType() == AnimalType.cow).count();
    }

    /**
     * Get total number of animals for the given type.
     * @param type
     * @return
     */
    public int getAnimalCountForType(AnimalType type) {
        return (int) this.animals.stream().filter(animal -> animal.getType() == type).count();
    }

    /**
     * Get total number of animals whose name begins with the given prefix
     * @param prefix
     * @return
     */
    public int getAnimalsWithNameBeginningWith(String prefix) {
      return (int) this.animals.stream().filter(animal -> animal.getName().toLowerCase().startsWith(prefix.toLowerCase()))
             .count();
    }

    /**
     * Get the youngest animal, based on age. If more than one is the youngest then just return the first
     * @return
     */
    public Animal getYoungestAnimal() {
        return animals.stream().sorted((a,b) -> b.getAge()).findFirst().orElse(null);
//        return (int) this.animals.stream().map(animal -> animal.getAge()).min();
    }

    /**
     * Get the oldest animal. If more than one is the eldest then just return the first
     * @return
     */
    public Animal getOldestAnimal() {
        return animals.stream().max((a,b)-> Integer.compare(a.getAge() , b.getAge())).orElse(null);
    }

    /**
     * Get the oldest animals, in a List.
     * You will have to do this in two stages, using streams for both!
     * @return
     */
    public List<Animal> getOldestAnimals() {
        int oldestAge = this.getOldestAnimal().getAge();
        return animals.stream().filter(animal -> animal.getAge() == oldestAge).collect(Collectors.toList());
    }

    /**
     * Get a list of all animals of the given type.
     * Order the results by name.
     * @param type
     * @return
     */
    public List<Animal> getAnimalsForType(AnimalType type) {
       return animals.stream().filter(animal -> animal.getType() == type).sorted((a,b) -> a.getName().compareTo(b.getName())).toList();

//        List<Animal> typeList = new ArrayList<>();
//        typeList = animals.stream().filter(animal -> animal.getType() == type).toList();
//        typeList.stream().sorted((a,b)-> a.getName().compareTo(b.getName()));
//        return typeList;

    }

    public Map<AnimalType, Long> getCountsOfAnimalsByType() {
        return animals.stream()
                .collect(Collectors.groupingBy((animal -> animal.getType()), Collectors.counting()));
    }

    public Map<AnimalType, List<Animal>> getMapOfAnimalsByType() {
        return animals.stream().sorted((a,b) -> a.getName().compareTo(b.getName()))
                .collect(Collectors.groupingBy((animal -> animal.getType())));
    }

}
