package com.example.asterik.movietvshowjetpack.Movie.DataMovie;

import java.util.Date;

public class MovieEntity {
    private int movieId;
    private String judul;
    private String deskripsi;
    private String tanggalRilis;
    private String cast1;
    private String peran1;
    private String cast2;
    private String peran2;
    private String cast3;
    private String peran3;
    private int imagePath;
    private String genre;
    private int score;
    private String waktu;

    public MovieEntity(Integer movieId, String judul, String deskripsi, String tanggalRilis, String cast1, String peran1, String cast2, String peran2, String cast3, String peran3, int imagePath, String genre, int score, String waktu) {
        this.movieId=movieId;
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.tanggalRilis = tanggalRilis;
        this.cast1 = cast1;
        this.peran1 = peran1;
        this.cast2 = cast2;
        this.peran2 = peran2;
        this.cast3 = cast3;
        this.peran3 = peran3;
        this.imagePath = imagePath;
        this.genre = genre;
        this.score = score;
        this.waktu = waktu;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getPeran1() {
        return peran1;
    }

    public void setPeran1(String peran1) {
        this.peran1 = peran1;
    }

    public String getPeran2() {
        return peran2;
    }

    public void setPeran2(String peran2) {
        this.peran2 = peran2;
    }

    public String getPeran3() {
        return peran3;
    }

    public void setPeran3(String peran3) {
        this.peran3 = peran3;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getTanggalRilis() {
        return tanggalRilis;
    }

    public void setTanggalRilis(String tanggalRilis) {
        this.tanggalRilis = tanggalRilis;
    }

    public String getCast1() {
        return cast1;
    }

    public void setCast1(String cast1) {
        this.cast1 = cast1;
    }

    public String getCast2() {
        return cast2;
    }

    public void setCast2(String cast2) {
        this.cast2 = cast2;
    }

    public String getCast3() {
        return cast3;
    }

    public void setCast3(String cast3) {
        this.cast3 = cast3;
    }

    public int getImagePath() {
        return imagePath;
    }

    public void setImagePath(int imagePath) {
        this.imagePath = imagePath;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getWaktu() {
        return waktu;
    }

    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }


}
