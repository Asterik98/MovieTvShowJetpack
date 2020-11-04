package com.example.asterik.movietvshowjetpack.TvShow;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.asterik.movietvshowjetpack.Movie.DataMovie.MovieEntity;
import com.example.asterik.movietvshowjetpack.Movie.DetailMovie.DetailMovieActivity;
import com.example.asterik.movietvshowjetpack.Movie.MovieAdapter;
import com.example.asterik.movietvshowjetpack.R;
import com.example.asterik.movietvshowjetpack.TvShow.DataTvShow.TvShowEntity;
import com.example.asterik.movietvshowjetpack.TvShow.DetailTvShow.DetailTvShowActivity;

import java.util.ArrayList;
import java.util.List;

public class TvShowAdapter extends RecyclerView.Adapter<TvShowAdapter.TvShowViewHolder>{
    private List<TvShowEntity> listTvShow = new ArrayList<>();

    void setTvShow(List<TvShowEntity> listTvShow) {
        if (listTvShow == null) return;
        this.listTvShow.clear();
        this.listTvShow.addAll(listTvShow);
    }

    @NonNull
    @Override
    public TvShowAdapter.TvShowViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.items_tvshow, parent, false);
        return new TvShowAdapter.TvShowViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final TvShowAdapter.TvShowViewHolder holder, int position) {
        TvShowEntity tvshow = listTvShow.get(position);
        holder.bind(tvshow);
    }

    @Override
    public int getItemCount() {
        return listTvShow.size();
    }

    class TvShowViewHolder extends RecyclerView.ViewHolder {
        final TextView tvTitle;
        final TextView tvDate;
        final ImageView imgPoster;

        TvShowViewHolder(View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tv_item_title);
            imgPoster = itemView.findViewById(R.id.img_poster);
            tvDate = itemView.findViewById(R.id.tv_item_date);
        }

        void bind(TvShowEntity tvshow) {
            tvTitle.setText(tvshow.getJudul());
            tvDate.setText(String.format("Deadline %s", tvshow.getTanggalRilis()));
            itemView.setOnClickListener(v -> {
                Intent intent = new Intent(itemView.getContext(), DetailTvShowActivity.class);
                intent.putExtra(DetailTvShowActivity.EXTRA_TVSHOW, tvshow.getTVShowId());
                itemView.getContext().startActivity(intent);
            });
            Glide.with(itemView.getContext())
                    .load(tvshow.getImagePath())
                    .apply(RequestOptions.placeholderOf(R.drawable.ic_loading).error(R.drawable.ic_error))
                    .into(imgPoster);
        }
    }
}
