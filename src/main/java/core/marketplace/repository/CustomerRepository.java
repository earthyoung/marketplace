package core.marketplace.repository;

import core.marketplace.domain.Customer;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class CustomerRepository {

    private final EntityManager em;

    public Customer findOne(Long customerId) {
        return em.find(Customer.class, customerId);
    }

    public List<Customer> findAll() {
        return em.createQuery("select c from Customer c", Customer.class)
                .getResultList();
    }

    public Long save(Customer customer) {
        em.persist(customer);
        return customer.getId();
    }

    public Long remove(Customer customer) {
        Long customerId = customer.getId();
        em.remove(customer);
        return customerId;
    }

}
