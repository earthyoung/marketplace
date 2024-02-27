package core.marketplace.controller;

import core.marketplace.domain.Customer;
import core.marketplace.domain.enums.LoginType;
import core.marketplace.dto.CustomerJoinRequestDto;
import core.marketplace.dto.CustomerJoinResponseDto;
import core.marketplace.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping("/api/v1/customers/join")
    public CustomerJoinResponseDto saveCustomer(@RequestBody CustomerJoinRequestDto requestDto) {
        System.out.println(requestDto.getName() + " " + requestDto.getEmail());
        Customer customer = new Customer();
        customer.setName(requestDto.getName());
        customer.setEmail(requestDto.getEmail());
        customer.setLoginType(LoginType.PASSWORD);
        Long customerId = customerService.join(customer);
        Customer savedCustomer = customerService.findCustomer(customerId);
        return new CustomerJoinResponseDto(savedCustomer);
    }

}
