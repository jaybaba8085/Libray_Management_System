package com.example.LibraryManagementSystem.Convertors;

import com.example.LibraryManagementSystem.Models.Author;
import com.example.LibraryManagementSystem.RequestDto.AuthorRequestDto;
import com.example.LibraryManagementSystem.ResponseDto.AuthorResponseDto;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AuthorConvertor {


    public static Author convertDtoToEntity(AuthorRequestDto authorRequestDto){

        Author author = Author.builder().
                name(authorRequestDto.getName())
                .age(authorRequestDto.getAge()).country(authorRequestDto.getCountry())
                .email(authorRequestDto.getEmail()).build();


        return  author;
    }
    public static List<AuthorResponseDto> convertDtoToEntity(List<Author> authors)
    {
        List<AuthorResponseDto>authorResponseDtoList
                 =new ArrayList<>();

        for(Author author:authors)
        {
            AuthorResponseDto authorResponseDto= AuthorResponseDto.builder().name(author.getName()).
            age(author.getAge()).id(author.getId()).country(author.getCountry()).email(author.getEmail()).build();

            authorResponseDtoList.add(authorResponseDto);
        }
        return  authorResponseDtoList;

    }

}
