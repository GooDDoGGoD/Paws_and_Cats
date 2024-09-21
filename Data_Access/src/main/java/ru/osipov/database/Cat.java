package ru.osipov.database;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Cats")
public class Cat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private LocalDate birthday;
    private String breed;
    private String color;

    @ManyToMany
    @JoinTable(
            name = "Cat_friends",
            joinColumns = @JoinColumn(name = "cat_id"),
            inverseJoinColumns = @JoinColumn(name = "friend_id")
    )
    private List<Cat> friends = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;

    public void addFriend(Cat friend) {
        friends.add(friend);
    }

    public void removeFriend(Cat friend) {
        friends.remove(friend);
    }

    public List<Cat> getFriends() {
        return friends;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }
}
