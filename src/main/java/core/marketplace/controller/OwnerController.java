package core.marketplace.controller;

import core.marketplace.service.OwnerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OwnerController {

    private final OwnerService ownerService;

}
