package org.example.finalmovies.models;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Film  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
      private int id_film;
      private String titre;
      private Date date_debut;
      private Date date_fin;
      private String realisateur;
      private String note ;
    @ManyToOne
    @JoinColumn(name = "id_favorie", referencedColumnName = "id_favorie")  // Clé étrangère nommée idu
    private Favorie favorie;


}
