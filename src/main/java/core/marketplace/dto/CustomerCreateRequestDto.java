package core.marketplace.dto;

import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class CustomerCreateRequestDto {
    String name;
    String email;
    String loginType;
}
