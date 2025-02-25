package com.example.spring_mysql_api.Controller;

import com.example.spring_mysql_api.Models.Pet;
import com.example.spring_mysql_api.Models.PetData;
import com.example.spring_mysql_api.Repositories.PetRepository;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/pets")
public class PetController {
    private PetRepository petRepository;

    @Autowired
    public PetController(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    //GET /pets => return all pets

    @GetMapping
    public List<Pet> getAllPets(){
        return petRepository.findAll();
    }

    // GET /pets{id} => return pets with ID = id
    @GetMapping("/{petId}")
    public Optional<Pet> getPetById(@PathVariable(required = true) Long petId){
        return petRepository.findById(petId);
    }

    //POST /pets => creates a new record of a pet in the pets table

    @PostMapping()
    public Pet createPet(@RequestBody Pet pet){
        petRepository.save(pet);
        return pet;



//        return newPet;
    }



    // DELETE on pets/{id} => should delete (archive) pets with ID = id
    @DeleteMapping("/{getid}")
    public String deleteById(@PathVariable(required = true)Long petId){
        petRepository.deleteById(petId);
        return String.format("Record with id: %d has been successfully deleted", petId );
    }


    // DELETE on /pets => Should delete all the records in the table
    @DeleteMapping
    public String deleteAllPets(){
        try{
            if(petRepository.count() == 0){
                throw new IllegalArgumentException();
            }
            petRepository.deleteAll();
            return "All pets were removed from the pets table";
        } catch(IllegalArgumentException e){
            e.printStackTrace();
            return "The pets table is already empty";
        }
    }



    @PostMapping("/populatedb")
    public String seedDB(@RequestParam(required = false) String count){
        int counter;
        counter = count != null ? Integer.parseInt(count) : 5;


        if(petRepository.count() > 0){
            return "Pets table already has pet entries";
        }

        List<Pet> pets = new ArrayList<>();
        for(int i = 0; i < counter; i++){
            String randomName = PetData.getRandomName();
            String randomBreed = PetData.getRandomBreed();
            Date randomDob = PetData.getRandomDoB();
            pets.add(new Pet(randomName, randomBreed, randomDob));
        }
petRepository.saveAll(pets);
        return String.format("%s pets were added successfully to the table", counter);
    }

    // PATCH or PUT




}
