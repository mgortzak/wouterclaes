package nl.wouterclaes.model;

import java.util.List;

public class Person {

    private final long id;
    private final String firstName;
    private final String lastName;
    private final String dateOfBirth; // can be a fuzzy date
    private final List<Relation> relations;

    public Person(long id, String firstName, String lastName, String dateOfBirth, List<Relation> relations) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.relations = relations;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public List<Relation> getRelations() {
        return relations;
    }
}
