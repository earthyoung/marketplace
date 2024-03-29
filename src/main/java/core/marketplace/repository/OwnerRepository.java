package core.marketplace.repository;

import core.marketplace.domain.Owner;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class OwnerRepository {

    private final EntityManager em;

    public Owner findOne(Long ownerId) {
        return em.find(Owner.class, ownerId);
    }

    public List<Owner> findAll() {
        return em.createQuery("select o from Owner o", Owner.class)
                .getResultList();
    }

    public Long save(Owner owner) {
        em.persist(owner);
        return owner.getId();
    }

    public Long remove(Owner owner) {
        Long ownerId = owner.getId();
        em.remove(owner);
        return ownerId;
    }

}
