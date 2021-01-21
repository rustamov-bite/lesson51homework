package com.example.musiclistener.entities;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "authors")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Builder
public class Author {
    @Id
    private int id;

    @Indexed
    private String name;

    @DBRef
    private List<Music> musics;

    @DBRef
    private List<Album> albums;

}
