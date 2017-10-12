package ua.com.aswitch.vtm.models;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by taras on 4/18/17.
 */

// We implement only serializable,
// because basically we transfer the only one movie item between fragments.
// Parcelable has the advantages in case of transferring array of objects.
public class Movie implements Serializable {
    private String poster_path;
    private Boolean adult;
    private String overview;
    private String release_date;
    private ArrayList<Integer> genre_ids;
    private Long id;
    private String original_title;
    private String original_language;
    private String title;
    private String backdrop_path;
    private Float popularity;
    private Long vote_count;
    private Boolean video;
    private Double vote_average;
    private boolean isAdapterMovieItem;

    public Movie() {
        isAdapterMovieItem = true;
    }

    public Movie(Boolean isAdapterMovieItem) {
        this.isAdapterMovieItem = isAdapterMovieItem;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getPoster_path() {
        return poster_path;
    }

    public void setPoster_path(String poster_path) {
        this.poster_path = poster_path;
    }

    public Boolean getAdult() {
        return adult;
    }

    public void setAdult(Boolean adult) {
        this.adult = adult;
    }

    public boolean isAdapterMovieItem() {
        return isAdapterMovieItem;
    }

    public void setIsAdapterMovieItem(boolean isAdapterMovieItem) {
        this.isAdapterMovieItem = isAdapterMovieItem;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public ArrayList<Integer> getGenre_ids() {
        return genre_ids;
    }

    public void setGenre_ids(ArrayList<Integer> genre_ids) {
        this.genre_ids = genre_ids;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    public String getOriginal_language() {
        return original_language;
    }

    public void setOriginal_language(String original_language) {
        this.original_language = original_language;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBackdrop_path() {
        return backdrop_path;
    }

    public void setBackdrop_path(String backdrop_path) {
        this.backdrop_path = backdrop_path;
    }

    public Float getPopularity() {
        return popularity;
    }

    public void setPopularity(Float popularity) {
        this.popularity = popularity;
    }

    public Long getVote_count() {
        return vote_count;
    }

    public void setVote_count(Long vote_count) {
        this.vote_count = vote_count;
    }

    public Boolean getVideo() {
        return video;
    }

    public void setVideo(Boolean video) {
        this.video = video;
    }

    public Double getVote_average() {
        return vote_average;
    }

    public void setVote_average(Double vote_average) {
        this.vote_average = vote_average;
    }

    public void setAdapterMovieItem(boolean adapterMovieItem) {
        isAdapterMovieItem = adapterMovieItem;
    }
}
