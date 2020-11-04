package com.example.asterik.movietvshowjetpack.Movie;

import androidx.lifecycle.ViewModel;

import com.example.asterik.movietvshowjetpack.Movie.DataMovie.MovieEntity;
import com.example.asterik.movietvshowjetpack.Utils.DataDummyMovie;

import java.util.List;

public class MovieViewModel extends ViewModel {
    public List<MovieEntity> getMovies() {
        return DataDummyMovie.detailMovies();
    }
}