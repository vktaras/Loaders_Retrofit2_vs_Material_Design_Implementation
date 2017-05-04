package ua.com.aswitch.vtm.retrofit.services;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;
import ua.com.aswitch.vtm.models.Movie;
import ua.com.aswitch.vtm.models.MoviePage;
import ua.com.aswitch.vtm.utils.Constants;

/**
 * Created by taras on 4/18/17.
 */

public interface MoviesService {

    @Headers({
            "Accept: application/json",
            "Content-Type: application/json"
    })
    @GET(Constants.MOVIES_ENDPOINT)
    public Call<MoviePage> getMoviePageById(@Query("api_key") String api_key, @Query("page")Integer page);

}
