package com.example.LibraryManagementSystem.Service;


import com.example.LibraryManagementSystem.Convertors.BookConvertor;
import com.example.LibraryManagementSystem.Models.Author;
import com.example.LibraryManagementSystem.Models.Book;
import com.example.LibraryManagementSystem.Repository.AuthorRepository;
import com.example.LibraryManagementSystem.Repository.BookRepository;
import com.example.LibraryManagementSystem.RequestDto.BookRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    AuthorRepository authorRepository;

    @Autowired
    BookRepository bookRepository;


    public String createBook(BookRequestDto bookRequestDto){

        Book book = BookConvertor.convertDtoToEntity(bookRequestDto);

        //I need to set the AuthorEntity :

        int authorId = bookRequestDto.getAuthorId();

        //Getting the author Entity
        Author author  = authorRepository.findById(authorId).get();

        book.setAuthor(author);

        //That book list also needs to be updated

        List<Book> currentListOfBooks = author.getBookwritten();
        currentListOfBooks.add(book);
        author.setBookwritten(currentListOfBooks);

        //Save the author
        authorRepository.save(author);

        //Save the book
        bookRepository.save(book);

        return "succesfully added book";

    }

}
