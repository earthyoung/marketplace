package core.marketplace.dto;

import core.marketplace.domain.Customer;
import lombok.Data;
import lombok.Getter;

import java.time.LocalDateTime;

@Data
@Getter
public class CustomerJoinResponseDto {

    Long customerId;
    String name;
    String email;
    LocalDateTime registeredAt;

    public CustomerJoinResponseDto(Customer customer) {
        this.customerId = customer.getId();
        this.name = customer.getName();
        this.email = customer.getEmail();
        this.registeredAt = customer.getCreatedAt();
    }

}
