package org.example.finalmovies.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Serie {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private  int id_serie;

  private String titre;
  private Date date_sortie;
  private String genre ;
  private String realisateur;
  private String note;

    @ManyToOne
    @JoinColumn(name = "id_favorie", referencedColumnName = "id_favorie")
    private Favorie favorie;

}
