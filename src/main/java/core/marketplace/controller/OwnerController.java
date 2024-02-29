package core.marketplace.controller;

import core.marketplace.domain.Owner;
import core.marketplace.dto.Result;
import core.marketplace.dto.owner.*;
import core.marketplace.service.OwnerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class OwnerController {

    private final OwnerService ownerService;

    @GetMapping("/api/v1/owners/{id}")
    public OwnerRetrieveResponseDto retrieveOwner(@PathVariable("id") Long ownerId) {
        Owner owner = ownerService.findOwner(ownerId);
        return new OwnerRetrieveResponseDto(owner);
    }

    @GetMapping("/api/v1/owners")
    public Result<List<OwnerListResponseDto>> listOwner() {
        List<Owner> owners = ownerService.findAllOwner();
        ArrayList<OwnerListResponseDto> ownerList = new ArrayList<>();
        for (Owner owner : owners) {
            ownerList.add(new OwnerListResponseDto(owner));
        }
        return new Result<List<OwnerListResponseDto>>(ownerList);
    }

    @PostMapping("/api/v1/owners")
    public OwnerCreateResponseDto join(@RequestBody OwnerCreateRequestDto requestDto) {
        Owner owner = new Owner();
        owner.setName(requestDto.getName());
        owner.setEmail(requestDto.getEmail());
        owner.setLoginType(requestDto.getLoginType());
        Long ownerId = ownerService.join(owner);
        Owner savedOwner = ownerService.findOwner(ownerId);
        return new OwnerCreateResponseDto(savedOwner);
    }

    @PatchMapping("/api/v1/owners/{id}")
    public OwnerUpdateResponseDto updateOwner(
            @RequestBody OwnerUpdateRequestDto requestDto,
            @PathVariable("id") Long ownerId
    ) {
        ownerService.update(ownerId, requestDto.getName());
        Owner savedOwner = ownerService.findOwner(ownerId);
        return new OwnerUpdateResponseDto(savedOwner);
    }

    @DeleteMapping("/api/v1/owners/{id}")
    public OwnerDeleteResponseDto deleteOwner(@PathVariable("id") Long ownerId) {
        return new OwnerDeleteResponseDto(ownerService.removeOwner(ownerId));
    }

}
