package com.example.LibraryManagementSystem.RequestDto;

import jakarta.persistence.Column;
import lombok.Data;
import lombok.Setter;


@Data
@Setter
public class AuthorRequestDto {


    private String name;

    private  int age;

    private String country;

    @Column(unique = true)
    private String email;
}
