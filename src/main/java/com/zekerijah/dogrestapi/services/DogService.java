package com.zekerijah.dogrestapi.services;

import com.zekerijah.dogrestapi.entity.Dog;

import java.util.List;

public interface DogService {
    List<Dog> getDogs();
    List<String> getDogBreed();
    String getDogByBreedId(Long id);
    List<String> getDogNames();
}
