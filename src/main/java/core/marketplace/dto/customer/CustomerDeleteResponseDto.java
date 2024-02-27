package core.marketplace.dto.customer;

import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class CustomerDeleteResponseDto {
    Long id;

    public CustomerDeleteResponseDto(Long customerId) {
        this.id = customerId;
    }

}
