package com.example.petstore2;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PetController {

	@Autowired
	private PetService petService;
	
	// mapping to save pet
	@PostMapping("/pet")
	public int savePet(@RequestBody Pet pet) {
		petService.savePet(pet);
		return pet.getId();  // check for the id saved
	}
	
	// mapping to find all pets
	@GetMapping("/pets")
	public List<Pet> fetchAllPets(){
		return petService.findAllPets();
	}
	
	// mapping find a pet by id
	@GetMapping("/pets/{id}")
	public Pet findAPet(@PathVariable("id") int id) {
		return petService.findPetById(id);
	}
	
	// mapping delete a pet by id
	@DeleteMapping("/pets/{id}")
	public void deleteAPet(@PathVariable("id") int id) {
		petService.deletePetById(id);
	}
	
	
	@GetMapping("/home")
	public String welcome() {
		return "welcome";
	}
}
