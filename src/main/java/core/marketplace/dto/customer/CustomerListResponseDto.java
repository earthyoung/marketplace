package core.marketplace.dto.customer;

import core.marketplace.domain.Customer;
import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class CustomerListResponseDto {
    Long id;
    String name;
    String email;

    public CustomerListResponseDto(Customer customer) {
        this.id = customer.getId();
        this.name = customer.getName();
        this.email = customer.getEmail();
    }
}
