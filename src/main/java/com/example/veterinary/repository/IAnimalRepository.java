package com.example.veterinary.repository;

import com.example.veterinary.entity.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface IAnimalRepository  extends JpaRepository<Animal,Long> {

}
