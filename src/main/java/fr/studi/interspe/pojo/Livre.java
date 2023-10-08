package fr.studi.interspe.pojo;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Livre {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String isbn;
    private String titre;
    @ManyToOne
    @JoinColumn(name = "id")
    private Auteur auteur;

    
    private Boolean archive;

}
