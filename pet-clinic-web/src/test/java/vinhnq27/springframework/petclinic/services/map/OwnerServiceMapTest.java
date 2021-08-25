package vinhnq27.springframework.petclinic.services.map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import vinhnq27.springframework.petclinic.model.Owner;
import vinhnq27.springframework.petclinic.services.PetService;
import vinhnq27.springframework.petclinic.services.PetTypeService;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(SpringExtension.class)
class OwnerServiceMapTest {

    OwnerServiceMap ownerServiceMap;
    final Long ownerId = 1l;
    final String lastName = "smith";
    @BeforeEach
    void setUp() {
        Owner owner = new Owner();
        owner.setId(ownerId);
        owner.setLastName(lastName);
        ownerServiceMap = new OwnerServiceMap(new PetTypeMapService(), new PetServiceMap());
        ownerServiceMap.save(owner);
    }

    @Test
    void findAll() {
        Set<Owner> owners = ownerServiceMap.findAll();
        assertEquals(ownerId, owners.size());
    }

    @Test
    void findById() {
        Owner owner = ownerServiceMap.findById(ownerId);
        assertEquals(ownerId, owner.getId());
    }

    @Test
    void saveExistingId() {
        Long id = 2L;
        Owner owner2 = new Owner();
        owner2.setId(id);
        Owner savedOwner = ownerServiceMap.save(owner2);
        assertEquals(id, savedOwner.getId());
    }
    @Test
    void saveNoId() {
        Owner owner2 = new Owner();
        Owner savedOwner = ownerServiceMap.save(owner2);
        assertNotNull(savedOwner);
        assertNotNull(savedOwner.getId());
    }

    @Test
    void delete() {
        ownerServiceMap.delete(ownerServiceMap.findById(ownerId));
        assertEquals(0, ownerServiceMap.findAll().size());
    }

    @Test
    void deleteById() {
        ownerServiceMap.deleteById(ownerId);
        assertEquals(0, ownerServiceMap.findAll().size());
    }

    @Test
    void findByLastName() {
        Owner smith = ownerServiceMap.findByLastName(lastName);
        assertNotNull(smith);
        assertEquals(ownerId, smith.getId());
    }
    @Test
    void findByLastNameNotFound() {
        Owner smith = ownerServiceMap.findByLastName("foo");
        assertNull(smith);
    }

}