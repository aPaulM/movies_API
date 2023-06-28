package com.example.movies.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "movies")
@Data // comes from lombok...
// allows us not to have to generate/code the getters, setters, and toString methods.
@AllArgsConstructor // comes from lombok... is self explanatory.
@NoArgsConstructor // comes from lombok... also is self explanatory.
public class Movie {

    @Id
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;
//---------------------------------------------
    @DocumentReference // this @Annotation will make the DB store only the IDs
    // of the Reviews and the Reviews will be in a separate collection.
    private List<Review> reviewIds;


}
