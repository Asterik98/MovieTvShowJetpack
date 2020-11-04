package com.example.asterik.movietvshowjetpack.TvShow.DetailTvShow;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.ViewModelProvider;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.asterik.movietvshowjetpack.R;
import com.example.asterik.movietvshowjetpack.TvShow.DataTvShow.TvShowEntity;

public class DetailTvShowActivity extends AppCompatActivity {
    public static final String EXTRA_TVSHOW = "extra_tvshow";
    private TextView textTitle;
    private TextView textDesc;
    private TextView textDate;
    private TextView persenTeks;
    private TextView genre;
    private TextView cast1;
    private TextView cast2;
    private TextView cast3;
    private TextView peran1;
    private TextView peran2;
    private TextView peran3;
    private TextView waktu;
    private ImageView imagePoster;
    private ProgressBar progressBar;
    private ProgressBar persen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_tvshow);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        textTitle = findViewById(R.id.text_title);
        textDesc = findViewById(R.id.text_description);
        textDate = findViewById(R.id.text_date);
        imagePoster = findViewById(R.id.image_poster);
        progressBar = findViewById(R.id.progress_bar);
        persen = findViewById(R.id.stats_progressbar);
        persenTeks = findViewById(R.id.persen);
        genre = findViewById(R.id.text_genre);
        cast1 = findViewById(R.id.text_cast1);
        cast2 = findViewById(R.id.text_cast2);
        cast3= findViewById(R.id.text_cast3);
        peran1= findViewById(R.id.text_peran1);
        peran2= findViewById(R.id.text_peran2);
        peran3= findViewById(R.id.text_peran3);
        waktu= findViewById(R.id.text_waktu);
        DetailTvShowViewModel viewModel = new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory()).get(DetailTvShowViewModel.class);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            Integer tvShowId = extras.getInt(EXTRA_TVSHOW);
            if (tvShowId != null) {
                viewModel.setSelectedCourse(tvShowId);
                populateTvShow(viewModel.getTvShow());

            }
        }
    }
    private void populateTvShow(TvShowEntity courseEntity) {
        textTitle.setText(courseEntity.getJudul());
        textDesc.setText(courseEntity.getDeskripsi());
        textDate.setText(String.format("Tanggal Rilis: %s", courseEntity.getTanggalRilis()));
        genre.setText(courseEntity.getGenre());
        cast1.setText(courseEntity.getCast1());
        cast2.setText(courseEntity.getCast2());
        cast3.setText(courseEntity.getCast3());
        peran1.setText(courseEntity.getPeran1());
        peran2.setText(courseEntity.getPeran2());
        peran3.setText(courseEntity.getPeran3());
        waktu.setText(courseEntity.getWaktu());
        persen.setProgress(courseEntity.getScore());
        persenTeks.setText(String.valueOf(courseEntity.getScore()+"%"));
        if(courseEntity.getScore()>=75){
            persen.setProgressTintList(ColorStateList.valueOf(Color.CYAN));
        }else if(courseEntity.getScore()<75 && courseEntity.getScore()>=50){
            persen.setProgressTintList(ColorStateList.valueOf(Color.YELLOW));
        }else if(courseEntity.getScore()<50 && courseEntity.getScore()>=25){
            persen.setProgressTintList(ColorStateList.valueOf(Color.MAGENTA));
        }else if(courseEntity.getScore()<25 && courseEntity.getScore()>=0){
            persen.setProgressTintList(ColorStateList.valueOf(Color.RED));
        }
        Glide.with(this)
                .load(courseEntity.getImagePath())
                .apply(RequestOptions.placeholderOf(R.drawable.ic_loading)
                        .error(R.drawable.ic_error))
                .into(imagePoster);

    }
}
