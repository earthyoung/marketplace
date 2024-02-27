package core.marketplace.controller;

import core.marketplace.domain.Customer;
import core.marketplace.domain.enums.LoginType;
import core.marketplace.dto.customer.*;
import core.marketplace.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping("/api/v1/customers")
    public CustomerCreateResponseDto saveCustomer(@RequestBody CustomerCreateRequestDto requestDto) {
        Customer customer = new Customer();
        customer.setName(requestDto.getName());
        customer.setEmail(requestDto.getEmail());
        customer.setLoginType(LoginType.valueOf(requestDto.getLoginType()));
        Long customerId = customerService.join(customer);
        Customer savedCustomer = customerService.findCustomer(customerId);
        return new CustomerCreateResponseDto(savedCustomer);
    }

    @PatchMapping("/api/v1/customers/{id}")
    public CustomerUpdateResponseDto updateCustomer(
            @RequestBody CustomerUpdateRequestDto requestDto,
            @PathVariable("id") Long customerId
    ) {
        Customer customer = customerService.findCustomer(customerId);
        customer.setName(requestDto.getName());
        return new CustomerUpdateResponseDto(customer);
    }

    @DeleteMapping("/api/v1/customers/{id}")
    public CustomerDeleteResponseDto deleteCustomer(
            @PathVariable("id") Long customerId
    ) {
        return new CustomerDeleteResponseDto(customerService.removeCustomer(customerId));
    }

}
