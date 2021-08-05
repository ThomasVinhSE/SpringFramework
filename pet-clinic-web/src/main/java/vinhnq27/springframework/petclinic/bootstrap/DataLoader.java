package vinhnq27.springframework.petclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import vinhnq27.springframework.petclinic.model.Owner;
import vinhnq27.springframework.petclinic.model.Vet;
import vinhnq27.springframework.petclinic.services.OwnerService;
import vinhnq27.springframework.petclinic.services.VetService;
import vinhnq27.springframework.petclinic.services.map.OwnerServiceMap;
import vinhnq27.springframework.petclinic.services.map.VetServiceMap;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Nguyen");
        owner1.setLastName("Quoc Vinh");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Le");
        owner2.setLastName("Minh Tuan");

        ownerService.save(owner2);

        System.out.println("Loader Owner");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Pham");
        vet1.setLastName("Long");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Minh");
        vet2.setLastName("Tam");

        vetService.save(vet2);

        System.out.println("Loader Vet");
    }
}
