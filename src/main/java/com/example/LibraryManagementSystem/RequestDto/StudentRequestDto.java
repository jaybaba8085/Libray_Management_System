package com.example.LibraryManagementSystem.RequestDto;


import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentRequestDto {

    @Column(nullable = false)
    private String name;

    private int age;

    private String country;

    @Column(nullable = false)
    private String email;

}
