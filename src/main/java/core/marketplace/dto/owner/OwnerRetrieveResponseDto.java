package core.marketplace.dto.owner;

import core.marketplace.domain.Owner;
import core.marketplace.domain.enums.LoginType;
import lombok.Data;
import lombok.Getter;

import java.time.LocalDateTime;

@Data
@Getter
public class OwnerRetrieveResponseDto {
    Long id;
    String name;
    String email;
    LoginType loginType;
    LocalDateTime registeredAt;
    LocalDateTime updatedAt;

    public OwnerRetrieveResponseDto(Owner owner) {
        this.id = owner.getId();
        this.name = owner.getName();
        this.email = owner.getEmail();
        this.loginType = owner.getLoginType();
        this.registeredAt = owner.getCreatedAt();
        this.updatedAt = owner.getUpdatedAt();
    }
}
