package core.marketplace.domain;


import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;

@Embeddable
@Getter
@Setter
public class StoreInfo {

    private String city;
    private String zipcode;
    private LocalTime openTime;
    private LocalTime closeTime;
    private String phoneNumber;

    protected StoreInfo() {}

    public StoreInfo(String city, String zipcode, LocalTime openTime, LocalTime closeTime, String phoneNumber) {
        this.city = city;
        this.zipcode = zipcode;
        this.openTime = openTime;
        this.closeTime = closeTime;
        this.phoneNumber = phoneNumber;
    }

}
