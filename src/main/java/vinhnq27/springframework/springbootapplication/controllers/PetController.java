package vinhnq27.springframework.springbootapplication.controllers;

import org.springframework.stereotype.Controller;
import vinhnq27.springframework.springbootapplication.services.PetService;

@Controller
public class PetController {
    private final PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }
    public String showPetType() {
        return petService.getPetType();
    }
}
