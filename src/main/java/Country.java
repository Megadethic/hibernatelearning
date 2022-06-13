
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

@Getter
@Setter
@ToString
@Entity
public class Country {
    @Id
    @Column(name = "country_id")
    private Long id;
    @Column(name = "country")
    private String name;
    @Column(name = "last_update")
    private Timestamp lastUpdate;
}
