package com.example.LibraryManagementSystem.RequestDto;

import com.example.LibraryManagementSystem.Enums.Genre;
import lombok.Data;

@Data
public class BookRequestDto {


    private String name;

    private Genre genre;

    private  int authorId;


}
