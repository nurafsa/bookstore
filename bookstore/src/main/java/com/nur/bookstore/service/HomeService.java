package com.nur.bookstore.service;

import com.nur.bookstore.model.Author;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HomeService {
    public List<Author> getAuthors(){

        List<Author> authors = new ArrayList<>();

        Author author1 = new Author(1, "https://images.unsplash.com/photo-1579783483458-83d02161294e?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1456&q=80", "Alia", "Life is good." );
        Author author2 = new Author(2, "https://images.unsplash.com/photo-1532074205216-d0e1f4b87368?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=381&q=80", "Jenny", "Life is a test." );
        Author author3 = new Author(3, "https://images.unsplash.com/photo-1474447976065-67d23accb1e3?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1532&q=80", "Korima", "Enjoy the life." );

        authors.add(author1);
        authors.add(author2);
        authors.add(author3);

        return authors;
    }

    public List<Author> searchedAuthors(String authorName){

        List<Author> authors = new ArrayList<>();

        Author author1 = new Author(1, "https://images.unsplash.com/photo-1579783483458-83d02161294e?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1456&q=80", authorName, "Life is good." );

        authors.add(author1);


        return authors;
    }
}

