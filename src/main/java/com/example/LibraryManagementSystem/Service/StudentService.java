package com.example.LibraryManagementSystem.Service;

import com.example.LibraryManagementSystem.Enums.CardStatus;
import com.example.LibraryManagementSystem.Models.Card;
import com.example.LibraryManagementSystem.Models.Student;
import com.example.LibraryManagementSystem.Repository.StudentRepository;
import com.example.LibraryManagementSystem.RequestDto.StudentRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;


    @Autowired
    CardService cardService;

    public String createStudent(StudentRequestDto studentRequestDto){

        //Step pending here :
        //Convert Dto to Entity ??

        Student student = new Student();
        student.setName(studentRequestDto.getName());
        student.setAge(studentRequestDto.getAge());
        student.setCountry(studentRequestDto.getCountry());
        student.setEmail(studentRequestDto.getEmail());


        Card newCard = new Card();

        newCard.setCardStatus(CardStatus.ACTIVATED);

        newCard.setStudent(student); //For that new foreign key column

        //For that bidirectional relation
        student.setCard(newCard);

        studentRepository.save(student);


        return "Successfully added student and card";
    }


}
