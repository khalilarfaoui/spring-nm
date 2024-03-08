package com.project.PFEBackEnd.entities;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Formation {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  private String name;
  private String description;
  private LocalDateTime date ;
  private int nbMax ;

  private TypeFormation type ;

  @OneToMany
  private List<Ressource> ressourceList ;

  @OneToMany
  private List<Category> categoryList;

  public void setRessourceToFormation(Ressource ressource) {
    this.ressourceList.add(ressource);
  }





  /*  @ManyToOne
  private Utilisateur expert ;*/
}
