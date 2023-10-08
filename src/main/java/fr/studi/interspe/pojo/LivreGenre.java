package fr.studi.interspe.pojo;

import fr.studi.interspe.pojo.composite.CompositeBookKey;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.Data;

@Entity
@Data
@IdClass(CompositeBookKey.class)
public class LivreGenre {
    @Id
    private Long livre_id;
    @Id
    private Long genre_id;
}
