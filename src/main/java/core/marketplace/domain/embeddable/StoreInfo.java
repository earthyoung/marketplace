package core.marketplace.domain.embeddable;


import core.marketplace.domain.enums.City;
import jakarta.persistence.Embeddable;
import lombok.Getter;

import java.time.LocalTime;

@Embeddable
@Getter
public class StoreInfo {

    private Location location;
    private LocalTime openTime;
    private LocalTime closeTime;
    private String phoneNumber;

    protected StoreInfo() {}

    public StoreInfo(String city, String street, String zipcode, LocalTime openTime, LocalTime closeTime, String phoneNumber) {
        this.location = new Location(City.valueOf(city), street, zipcode);
        this.openTime = openTime;
        this.closeTime = closeTime;
        this.phoneNumber = phoneNumber;
    }

}
