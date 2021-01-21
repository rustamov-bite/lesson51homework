package com.example.musiclistener.entities;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "musics")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Builder
public class Music {
    @Id
    private int id;
    @Indexed
    private String title;
    private State state;

    @DBRef
    private Album album;

    @DBRef
    private Author author;
}
