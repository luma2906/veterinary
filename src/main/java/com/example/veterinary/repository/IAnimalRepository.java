package com.example.veterinary.repository;

import com.example.veterinary.entity.Animal;
import org.springframework.data.repository.CrudRepository;

public interface IAnimalRepository  extends CrudRepository<Animal,Long> {

}
