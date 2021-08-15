package vinhnq27.springframework.petclinic.model;

import java.util.Set;

public class Owner extends Person{
    private Set<Pet> pets;

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }

    public Owner() {
    }

    public Owner(Long id, String firstName, String lastName) {
        super(id, firstName, lastName);
    }
}
