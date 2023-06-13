package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 12/28/19.
 * Modified by Collin Shriner 09/13/2023
 */
@Profile({"dog", "default"})
@Service
public class DogPetService implements PetService{
    public String getPetType(){
        return "Dogs are the best!";
    }
}
