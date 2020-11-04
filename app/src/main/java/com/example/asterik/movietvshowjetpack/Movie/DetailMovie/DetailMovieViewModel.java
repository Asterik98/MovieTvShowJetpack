package com.example.asterik.movietvshowjetpack.Movie.DetailMovie;

import androidx.lifecycle.ViewModel;

import com.example.asterik.movietvshowjetpack.Movie.DataMovie.MovieEntity;
import com.example.asterik.movietvshowjetpack.Utils.DataDummyMovie;

import java.util.ArrayList;


public class DetailMovieViewModel extends ViewModel {
    private int movieId;

    public void setSelectedCourse(int movieId) {
        this.movieId = movieId;
    }

    public MovieEntity getMovies() {
        MovieEntity movie = null;
        ArrayList<MovieEntity>movieEntities = DataDummyMovie.detailMovies();
        for (MovieEntity movieEntity : movieEntities) {
            if (movieEntity.getMovieId()==movieId) {
                movie = movieEntity;
            }
        }
        return movie;
    }

}
