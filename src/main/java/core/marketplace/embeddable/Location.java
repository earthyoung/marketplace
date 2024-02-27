package core.marketplace.embeddable;

import core.marketplace.enums.City;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Embeddable
@Getter
@AllArgsConstructor
public class Location {

    @Enumerated(EnumType.STRING)
    private City city;
    private String street;
    private String zipcode;

}
