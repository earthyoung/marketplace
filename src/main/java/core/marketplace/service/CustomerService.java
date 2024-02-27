package core.marketplace.service;

import core.marketplace.domain.Customer;
import core.marketplace.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Service
@Transactional
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;

    public Long join(Customer customer) {
        customer.setCreatedAt(LocalDateTime.now());
        customer.setUpdatedAt(LocalDateTime.now());
        return customerRepository.save(customer);
    }

    public Customer findCustomer(Long customerId) {
        return customerRepository.findOne(customerId);
    }

    public Long removeCustomer(Long customerId) {
        Customer customer = findCustomer(customerId);
        return customerRepository.remove(customer);
    }

}
