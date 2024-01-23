package core.marketplace.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import static jakarta.persistence.FetchType.LAZY;

@Entity
@Getter
@Setter
public class Store {

    @Id
    @GeneratedValue
    @Column(name = "store_id")
    private Long id;

    @ManyToOne(fetch = LAZY)
    private Owner owner;

    private String name;

    @Embedded
    private StoreInfo storeInfo;

}
