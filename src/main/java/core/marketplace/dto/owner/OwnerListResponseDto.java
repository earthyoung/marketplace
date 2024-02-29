package core.marketplace.dto.owner;

import core.marketplace.domain.Owner;
import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class OwnerListResponseDto {
    Long id;
    String name;
    String email;

    public OwnerListResponseDto(Owner owner) {
        this.id = owner.getId();
        this.name = owner.getName();
        this.email = owner.getEmail();
    }

}
