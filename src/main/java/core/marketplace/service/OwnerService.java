package core.marketplace.service;

import core.marketplace.domain.Owner;
import core.marketplace.repository.OwnerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class OwnerService {

    private final OwnerRepository ownerRepository;

    public Owner findOwner(Long ownerId) {
        return ownerRepository.findOne(ownerId);
    }

    public Long join(Owner owner) {
        owner.setCreatedAt(LocalDateTime.now());
        owner.setUpdatedAt(LocalDateTime.now());
        return ownerRepository.save(owner);
    }

    public List<Owner> findAllOwner() {
        return ownerRepository.findAll();
    }

    public Long removeOwner(Long ownerId) {
        Owner owner = findOwner(ownerId);
        return ownerRepository.remove(owner);
    }

    @Transactional
    public void update(Long id, String name) {
        Owner owner = findOwner(id);
        owner.setName(name);
    }

}
