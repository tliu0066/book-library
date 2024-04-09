package com.example.demo.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.CrossOrigin;

@Entity
@Data
@Getter
@Setter
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id" )
    private Long id;
    @Column(name ="title" )
    private String title;
    @Column(name ="author" )
    private String author;
    @Column(name = "description")
    private String description;
    @Column(name = "copies")
    private int copies;
    @Column(name = "copies_available")
    private int copiesAvailable;
    @Column(name = "category")
    private String category;
    @Column(name = "img")
    private String img;


}
