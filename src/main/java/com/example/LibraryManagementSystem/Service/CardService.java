package com.example.LibraryManagementSystem.Service;

import com.example.LibraryManagementSystem.Enums.CardStatus;
import com.example.LibraryManagementSystem.Models.Card;
import com.example.LibraryManagementSystem.Models.Student;
import org.springframework.stereotype.Service;

@Service
public class CardService {


    public Card createCard(Student student){

        Card newCard = new Card();


        newCard.setCardStatus(CardStatus.ACTIVATED);
        newCard.setStudent(student); //For that new foreign key column

        return newCard;
    }
}
