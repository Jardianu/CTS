package main;

import java.util.ArrayList;
import java.util.List;


public class Zoo implements ZooInterface {
	private Zookeeper zookeper;
	private List<Animal> animalList;
	
	public Zoo() {
		animalList = new ArrayList<>();
		zookeper = new Zookeeper("Ion");
	}
	
	public void AdaugaAnimal(Animal animal) {
		animalList.add(animal);
	}
	
	@Override
	public void feedAllAnimals() {
		for(Animal animal : animalList) {
			zookeper.feed(animal);
		}
	}

	@Override
	public void addAnimal(Animal animal) {
		// TODO Auto-generated method stub
		AdaugaAnimal(animal);
	}
}