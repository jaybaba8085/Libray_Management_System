package com.example.LibraryManagementSystem.Service;

import com.example.LibraryManagementSystem.Convertors.AuthorConvertor;
import com.example.LibraryManagementSystem.Models.Author;
import com.example.LibraryManagementSystem.Repository.AuthorRepository;
import com.example.LibraryManagementSystem.RequestDto.AuthorRequestDto;
import com.example.LibraryManagementSystem.ResponseDto.AuthorResponseDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class AuthorService {

    @Autowired
    AuthorRepository authorRepository;

    public String createAuthor(AuthorRequestDto authorRequestDto) {
        try {
            Author author = AuthorConvertor.convertDtoToEntity(authorRequestDto);
            authorRepository.save(author);
        } catch (Exception e) {
            log.info("createAuthor has caused an error");
            return "Create author didnt work";
        }
        return "Author created successfully";
    }

    public List<AuthorResponseDto> findByAuthorName(String name)
    {
       List<Author> authors = authorRepository.findByName(name);
       List<AuthorResponseDto> authorResponseDtos=AuthorConvertor.convertDtoToEntity(authors);
       return authorResponseDtos;
    }
}
