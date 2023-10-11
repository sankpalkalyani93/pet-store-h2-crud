package com.example.petstore2;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PetService{

	@Autowired
	private PetRepository petRepository;
	
	// to save a pet
	public void savePet(Pet pet) {
		petRepository.save(pet);
	}
	
	// to find all pets
	public List<Pet> findAllPets(){
		List<Pet> petList = new ArrayList<Pet>();
		petRepository.findAll().forEach(pet1 -> petList.add(pet1));
		return petList;
	}
	
	// to find a specific pet by id
	public Pet findPetById(int id) {
		return petRepository.findById(id).get();
	}
	
	// to delete a specific pet by id
	public void deletePetById(int id) {
		petRepository.deleteById(id);
	}
	
	
}
