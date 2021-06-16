package com.zekerijah.dogrestapi.repository;

import com.zekerijah.dogrestapi.entity.Dog;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DogRepository extends CrudRepository<Dog, Long> {

    @Query("select dog.id, dog.name from Dog dog")
    List<String> findAllByName();

    @Query("select dog.id, dog.breed from Dog dog")
    List<String> findAllByBreed();

    @Query("select dog.id, dog.breed from Dog dog where dog.id=:id")
    String findBreedById(Long id);

}
