package org.example.finalmovies.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Favorie implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private  int id_favorie;
    private String titre;


}
