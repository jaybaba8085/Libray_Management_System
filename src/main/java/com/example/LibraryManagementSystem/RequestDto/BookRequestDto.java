package com.example.LibraryManagementSystem.RequestDto;

import com.example.LibraryManagementSystem.Enums.Genre;
import lombok.Data;
import lombok.Setter;

@Data
@Setter
public class BookRequestDto {


    private String name;

    private Genre genre;

    private  int authorId;


}
