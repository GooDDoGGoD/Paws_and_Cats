package ru.osipov.DTO;

import java.time.LocalDate;

public class CatDto {
    public CatDto(int id, String name, LocalDate birthDate, String breed, String color) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.breed = breed;
        this.color = color;
    }
    private Integer id;
    private String name;
    private LocalDate birthDate;
    private String breed;
    private String color;
//    private List<CatDto> cats;
}