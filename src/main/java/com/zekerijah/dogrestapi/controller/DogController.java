package com.zekerijah.dogrestapi.controller;

import com.zekerijah.dogrestapi.entity.Dog;
import com.zekerijah.dogrestapi.services.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Locale;

@RestController
public class DogController {

    @Autowired
    private DogService dogService;

    @GetMapping("/dogs")
    public ResponseEntity<List<Dog>> getAllDogs(){
        List<Dog> dogList = dogService.getDogs();
        return new ResponseEntity<List<Dog>>(dogList, HttpStatus.OK);
    }

    @GetMapping("/dogs/breed")
    public ResponseEntity<List<String>> getDogBreeds(){
        List<String> dogBreedsList = dogService.getDogBreed();
        return new ResponseEntity<List<String>>(dogBreedsList, HttpStatus.OK);
    }

    @GetMapping("/breed/{id}")
    public ResponseEntity<String> getBreedById(@PathVariable Long id){
        String breed = dogService.getDogByBreedId(id);
        return new ResponseEntity<String>(breed, HttpStatus.OK);
    }

    @GetMapping("/dogs/names")
    public ResponseEntity<List<String>> getDogNames(){
        List<String> dogNames = dogService.getDogNames();
        return new ResponseEntity<List<String>>(dogNames, HttpStatus.OK);
    }


}
