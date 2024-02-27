package core.marketplace.dto.customer;

import core.marketplace.domain.Customer;
import core.marketplace.domain.enums.LoginType;
import lombok.Data;
import lombok.Getter;

import java.time.LocalDateTime;

@Data
@Getter
public class CustomerCreateResponseDto {

    Long id;
    LoginType loginType;
    String name;
    String email;
    LocalDateTime registeredAt;

    public CustomerCreateResponseDto(Customer customer) {
        this.id = customer.getId();
        this.loginType = customer.getLoginType();
        this.name = customer.getName();
        this.email = customer.getEmail();
        this.registeredAt = customer.getCreatedAt();
    }

}
