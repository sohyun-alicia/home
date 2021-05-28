package com.austin.home.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
@Data
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)     // IDENTITY : 하나씩 증가시킬때
    private Long id;
    private String title;
    private String content;
    private Timestamp datetime;
}
