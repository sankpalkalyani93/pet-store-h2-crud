package com.example.petstore2;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PetRepository  extends CrudRepository<Pet, Integer>{

}
