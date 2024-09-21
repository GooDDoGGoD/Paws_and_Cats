package ru.osipov.database;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private LocalDate birthday;

    @OneToMany(
            mappedBy = "owner",
            cascade = CascadeType.ALL
    )
    private List<Cat> cats = new ArrayList<>();

    public void setCats(List<Cat> cats) {
        this.cats = cats;
    }

    public List<Cat> getCats() {
        return cats;
    }
    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
}
