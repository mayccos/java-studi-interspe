package fr.studi.interspe.pojo.composite;

import lombok.Data;

import java.io.Serializable;
@Data
public class CompositeBookKey implements Serializable {

    private Long livre_id;

    private  Long genre_id;
}
