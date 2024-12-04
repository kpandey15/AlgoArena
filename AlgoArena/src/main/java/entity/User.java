package entity;

import jakarta.persistence.*;

@Entity
public class User {

    @Id // primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // annotation is used to specify the strategy for automatically generating primary key values, geIt tells JPA how the primary key should be generated when a new record is inserted into the database.generationType is enum.
    private long id;

    @Column(nullable = false, unique = true)
    //The @Column annotation in JPA (Java Persistence API) is used to specify the mapping between a field in an entity class and a column in the database table
    private String username;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
