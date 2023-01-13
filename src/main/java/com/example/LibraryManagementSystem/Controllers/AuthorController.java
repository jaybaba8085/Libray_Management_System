package com.example.LibraryManagementSystem.Controllers;


import com.example.LibraryManagementSystem.Models.Author;
import com.example.LibraryManagementSystem.Repository.AuthorRepository;
import com.example.LibraryManagementSystem.RequestDto.AuthorRequestDto;
import com.example.LibraryManagementSystem.ResponseDto.AuthorResponseDto;
import com.example.LibraryManagementSystem.Service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/author")

public class AuthorController {

    @Autowired
    AuthorService authorService;
    @Autowired
    private AuthorRepository authorRepository;

    @PostMapping("/create")
    public String createAuthor(@RequestBody()AuthorRequestDto authorRequestDto)
    {
        return authorService.createAuthor(authorRequestDto);
    }

    @GetMapping("/findBy/{name}")
    public List<AuthorResponseDto> findByName(@PathVariable(name = "name") String name)
    {
        return authorService.findByAuthorName(name) ;
    }


}
