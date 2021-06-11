package com.practice.api.amanda.movies.resources.movieStuff;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//"https://api.themoviedb.org/3/genre/movie/list?api_key=7e6263d0869610ea3ea6f89e32d7ebfc",
//
@Data
@NoArgsConstructor
@AllArgsConstructor
public  class Genre {
    private int id;
    private String name;


}

