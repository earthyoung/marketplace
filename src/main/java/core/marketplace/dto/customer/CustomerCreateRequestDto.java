package core.marketplace.dto.customer;

import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class CustomerCreateRequestDto {
    String name;
    String email;
    String loginType;
}
