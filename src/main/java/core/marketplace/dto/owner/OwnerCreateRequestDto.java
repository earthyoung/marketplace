package core.marketplace.dto.owner;

import core.marketplace.domain.enums.LoginType;
import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class OwnerCreateRequestDto {
    String name;
    String email;
    LoginType loginType;
}
