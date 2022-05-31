package com.example.veterinary.service;

import com.example.veterinary.entity.Animal;
import com.example.veterinary.repository.IAnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ImpAnimalService implements IAnimalService {

    private final IAnimalRepository iAnimalRepository;

    public ImpAnimalService(@Autowired IAnimalRepository iAnimalRepository) {
        this.iAnimalRepository = iAnimalRepository;
    }

    @Override
    public Animal createAnimal(Animal animal) {
        return iAnimalRepository.save(animal);
    }

    @Override
    public Optional<Animal> findAnimalById(Long idAnimal) {
        return iAnimalRepository.findById(idAnimal);
    }

    @Override
    public List<Animal> getAllAnimals() {
        return iAnimalRepository.findAll();
    }
}
