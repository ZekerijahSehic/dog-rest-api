package com.zekerijah.dogrestapi.services;

import com.zekerijah.dogrestapi.entity.Dog;
import com.zekerijah.dogrestapi.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DogServiceImpl implements DogService {

    @Autowired
    private DogRepository dogRepository;

    @Override
    public List<Dog> getDogs() {
        return (List<Dog>) dogRepository.findAll();
    }

    @Override
    public List<String> getDogBreed() {
        return (List<String>) dogRepository.findAllByBreed();
    }

    @Override
    public String getDogByBreedId(Long id) {
        return (String) dogRepository.findBreedById(id);
    }

    @Override
    public List<String> getDogNames() {
        return (List<String>) dogRepository.findAllByName();
    }
}
