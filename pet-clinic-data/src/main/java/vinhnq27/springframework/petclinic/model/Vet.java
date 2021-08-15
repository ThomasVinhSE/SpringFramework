package vinhnq27.springframework.petclinic.model;

import java.util.Set;

public class Vet extends Person{
    private Set<Speciality> specialities;
    public Vet() {
    }

    public Vet(Long id, String firstName, String lastName) {
        super(id, firstName, lastName);
    }

    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Speciality> specialities) {
        this.specialities = specialities;
    }
}
