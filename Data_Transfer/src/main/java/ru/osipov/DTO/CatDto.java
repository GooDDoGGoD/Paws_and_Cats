package ru.osipov.DTO;

import java.time.LocalDate;
import java.util.List;

public class CatDto {
    private Integer id;
    private String name;
    private LocalDate birthDate;
    private String breed;
    private String color;
    private List<CatDto> cats;
}