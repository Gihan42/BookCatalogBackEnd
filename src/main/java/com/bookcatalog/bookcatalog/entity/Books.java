package com.bookcatalog.bookcatalog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Books {
    @Id
    private int bookId;
    private String  bookName;
    private String  description;
    private String  author;
    private double price;
}
