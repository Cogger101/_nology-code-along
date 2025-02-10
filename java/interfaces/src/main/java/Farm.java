import java.util.ArrayList;
import java.util.List;

public class Farm {
    private List<Animal> animals= new ArrayList<>();

    public Farm() {
        animals.add(new Cow());
        animals.add(new Dog());
        animals.add(new Duck());
    }

    public List<Animal> getAnimals(){
        return animals;
    }

    public List<CanMakeSound> getAnimalsThatMakeSound(){
        List<CanMakeSound> animalSound = new ArrayList<>();
        for (Animal animal :animals){
            if (animal instanceof CanMakeSound){
                animalSound.add((CanMakeSound) animal);
            }
        }
            return animalSound;
    }

    public List<CanFly> getAnimalsThatCanFly(){
        List<CanFly> flying = new ArrayList<>();
        for (Animal animal :animals){
            if (animal instanceof CanFly){
                flying.add((CanFly) animal);
            }
        }
        return flying;
    }

    public List<Animal> getAnimalsThatCanFLyAndMakeSound(){
        List<Animal> flyingAnimalSound = new ArrayList<>();
        for (Animal animal : animals){
            if (animal instanceof CanFly && animal instanceof CanMakeSound){
                flyingAnimalSound.add(animal);
            }
        }
        return flyingAnimalSound;
    }

}
