package com.example.asterik.movietvshowjetpack.TvShow;

import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import com.example.asterik.movietvshowjetpack.Movie.DataMovie.MovieEntity;
import com.example.asterik.movietvshowjetpack.Movie.MovieAdapter;
import com.example.asterik.movietvshowjetpack.Movie.MovieViewModel;
import com.example.asterik.movietvshowjetpack.R;
import com.example.asterik.movietvshowjetpack.TvShow.DataTvShow.TvShowEntity;

import java.util.List;

public class TvShowFragment extends Fragment {
    private RecyclerView rvCourse;
    private ProgressBar progressBar;

    public TvShowFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.tv_show_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvCourse = view.findViewById(R.id.rv_academy);
        progressBar = view.findViewById(R.id.progress_bar);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (getActivity() != null) {
            TvShowViewModel viewModel = new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory()).get(TvShowViewModel.class);
            List<TvShowEntity> tvshow = viewModel.getTvShow();

            TvShowAdapter academyAdapter = new TvShowAdapter();
            academyAdapter.setTvShow(tvshow);

            rvCourse.setLayoutManager(new LinearLayoutManager(getContext()));
            rvCourse.setHasFixedSize(true);
            rvCourse.setAdapter(academyAdapter);
        }
    }

}