package core.marketplace.dto.customer;

import core.marketplace.domain.Customer;
import core.marketplace.domain.enums.LoginType;
import lombok.Data;
import lombok.Getter;

import java.time.LocalDateTime;

@Data
@Getter
public class CustomerRetrieveResponseDto {
    Long id;
    String name;
    String email;
    LoginType loginType;
    LocalDateTime registeredAt;
    LocalDateTime updatedAt;

    public CustomerRetrieveResponseDto(Customer customer) {
        this.id = customer.getId();
        this.name = customer.getName();
        this.email = customer.getEmail();
        this.loginType = customer.getLoginType();
        this.registeredAt = customer.getCreatedAt();
        this.updatedAt = customer.getUpdatedAt();
    }

}
