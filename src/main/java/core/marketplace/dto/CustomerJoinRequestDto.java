package core.marketplace.dto;

import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class CustomerJoinRequestDto {
    String name;
    String email;
}
