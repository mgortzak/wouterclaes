package nl.wouterclaes.controller;

import nl.wouterclaes.model.Person;
import nl.wouterclaes.model.Relation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class PersonController {

    @RequestMapping("/persons")
    public Person fetchPersons(@RequestParam(value = "firstName", required = false) String firstName, @RequestParam(value = "lastName", required = false) String lastName) {
        return new Person(1, "Pietje", "Puk", "ergens in 1740",
                Arrays.asList(new Relation(2, "Dordrecht", "21-5-1762", Arrays.asList(new Person(3, "Jantje", "Beton", "22-5-1763", null))))
        );
    }
}
