package com.example.asterik.movietvshowjetpack.TvShow.DetailTvShow;

import androidx.lifecycle.ViewModel;
import com.example.asterik.movietvshowjetpack.TvShow.DataTvShow.TvShowEntity;
import com.example.asterik.movietvshowjetpack.Utils.DataDummyTvShow;

import java.util.ArrayList;

public class DetailTvShowViewModel extends ViewModel {
    private int tvShowId;

    public void setSelectedCourse(int tvShowId) {
        this.tvShowId = tvShowId;
    }

    public TvShowEntity getTvShow() {
        TvShowEntity tvshow = null;
        ArrayList<TvShowEntity> tvshowEntities = DataDummyTvShow.detailTvShow();
        for (TvShowEntity tvshowEntity : tvshowEntities) {
            if (tvshowEntity.getTVShowId()==tvShowId) {
                tvshow = tvshowEntity;
            }
        }
        return tvshow;
    }
}
