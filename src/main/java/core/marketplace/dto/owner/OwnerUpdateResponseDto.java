package core.marketplace.dto.owner;

import core.marketplace.domain.Owner;
import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class OwnerUpdateResponseDto {
    Long id;
    String name;
    String email;

    public OwnerUpdateResponseDto(Owner owner) {
        this.id = owner.getId();
        this.name = owner.getName();
        this.email = owner.getEmail();
    }
}
