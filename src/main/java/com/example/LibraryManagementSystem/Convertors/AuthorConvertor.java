package com.example.LibraryManagementSystem.Convertors;

import com.example.LibraryManagementSystem.Models.Author;
import com.example.LibraryManagementSystem.RequestDto.AuthorRequestDto;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorConvertor {


    public static Author convertDtoToEntity(AuthorRequestDto authorRequestDto){

        Author author = Author.builder().
                name(authorRequestDto.getName())
                .age(authorRequestDto.getAge()).country(authorRequestDto.getCountry())
                .email(authorRequestDto.getEmail()).build();


        return  author;
    }

}
