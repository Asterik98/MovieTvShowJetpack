package com.example.asterik.movietvshowjetpack.TvShow;

import androidx.lifecycle.ViewModel;

import com.example.asterik.movietvshowjetpack.Movie.DataMovie.MovieEntity;
import com.example.asterik.movietvshowjetpack.TvShow.DataTvShow.TvShowEntity;
import com.example.asterik.movietvshowjetpack.Utils.DataDummyMovie;
import com.example.asterik.movietvshowjetpack.Utils.DataDummyTvShow;

import java.util.List;

public class TvShowViewModel extends ViewModel {
    public List<TvShowEntity> getTvShow() {
        return DataDummyTvShow.detailTvShow();
    }
}