package com.nology.zoology.zoo;

import com.nology.zoology.animal.Lion;
import com.nology.zoology.animal.Llama;
import com.nology.zoology.animal.Tiger;

import java.util.ArrayList;


public class Zoo {


private ArrayList<Tiger> tigers = new ArrayList<>();
    private ArrayList<Lion> lions = new ArrayList<>();
    private ArrayList<Llama> llamas = new ArrayList<>();


public void addTiger(Tiger tiger){
    this.tigers.add(tiger);
}

    public void addLlama(Llama llama){
        this.llamas.add(llama);
    }

    public void addLion(Lion lion){
        this.lions.add(lion);
    }

public int getAnimalCount(){

   return this.tigers.size() + this.lions.size() + this.llamas.size();
}

public void listAnimals(){
    for (Tiger tiger: tigers){
        System.out.println(tiger.getInformation());
    }
    for (Lion lion: lions){
        System.out.println(lion.getInformation());
    }
    for (Llama llama: llamas){
        System.out.println(llama.getInformation());
    }

}

}
