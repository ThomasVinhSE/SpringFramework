package vinhnq27.springframework.petclinic.model;

import java.time.LocalDate;

public class Pet extends BaseEntity{
    private PetType petType;
    private Owner onwer;
    private LocalDate birthDate;

    public Pet(Long id, PetType petType, Owner onwer, LocalDate birthDate) {
        super(id);
        this.petType = petType;
        this.onwer = onwer;
        this.birthDate = birthDate;
    }

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Owner getOnwer() {
        return onwer;
    }

    public void setOnwer(Owner onwer) {
        this.onwer = onwer;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
