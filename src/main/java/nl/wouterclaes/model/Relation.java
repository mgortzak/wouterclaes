package nl.wouterclaes.model;

import java.util.List;

public class Relation {
    private final long id;
    private final String location;
    private final String date; // can be a fuzzy date
    private final List<Person> children;

    public Relation(long id, String location, String date, List<Person> children) {
        this.id = id;
        this.location = location;
        this.date = date;
        this.children = children;
    }

    public long getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public String getDate() {
        return date;
    }

    public List<Person> getChildren() {
        return children;
    }
}
