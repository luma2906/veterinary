package com.example.veterinary.service;

import com.example.veterinary.entity.Animal;

import java.util.List;
import java.util.Optional;

public interface IAnimalService {

    Animal createAnimal(Animal animal);

    Optional<Animal> findAnimalById(Long idAnimal);

    List<Animal> getAllAnimals();

}
