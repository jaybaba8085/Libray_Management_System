package com.example.LibraryManagementSystem.ResponseDto;


import com.example.LibraryManagementSystem.Models.Book;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
public class AuthorResponseDto {


    private  int id;

    private String name;

    private  int age;

    private String country;

    private String email;

   // private List<BookResponseDto> bookwritten;

}
