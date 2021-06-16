package com.zekerijah.dogrestapi.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Data
@Entity
public class Dog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    private String name;
    private String breed;
    private String origin;


}
