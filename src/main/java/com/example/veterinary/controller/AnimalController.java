package com.example.veterinary.controller;

import com.example.veterinary.entity.Animal;
import com.example.veterinary.service.IAnimalService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/animal")
public class AnimalController {
    private final IAnimalService animalService;

    public AnimalController(IAnimalService animalService) {
        this.animalService = animalService;
    }

    @GetMapping("/")
    public ResponseEntity<Iterable<Animal>> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(animalService.getAllAnimals());
    }

    @PostMapping("")
    public ResponseEntity<Animal> createAnimal(@RequestBody Animal animal){
        return ResponseEntity.status(HttpStatus.OK).body(animalService.createAnimal(animal));
    }

    @GetMapping("/findById/{idAnimal}")
    public ResponseEntity<Optional<Animal>> findById(@PathVariable long idAnimal){
        return ResponseEntity.status(HttpStatus.OK).body(animalService.findAnimalById(idAnimal));
    }
}
