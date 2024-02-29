package core.marketplace.dto.owner;

import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class OwnerDeleteResponseDto {
    Long id;

    public OwnerDeleteResponseDto(Long id) {
        this.id = id;
    }
}
