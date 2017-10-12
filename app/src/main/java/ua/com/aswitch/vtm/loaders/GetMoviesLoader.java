package ua.com.aswitch.vtm.loaders;

import android.content.Context;

import java.io.IOException;

import retrofit2.Call;
import ua.com.aswitch.vtm.loaders.BaseLoader;
import ua.com.aswitch.vtm.models.MoviePage;
import ua.com.aswitch.vtm.models.RequestResult;
import ua.com.aswitch.vtm.models.Response;
import ua.com.aswitch.vtm.retrofit.ApiFactory;
import ua.com.aswitch.vtm.retrofit.services.MoviesService;
import ua.com.aswitch.vtm.utils.Constants;

/**
 * Created by taras on 4/18/17.
 */

public class GetMoviesLoader extends BaseLoader {

    Integer pageId;

    public GetMoviesLoader(Context context, Integer pageId) {
        super(context);
        this.pageId = pageId;
    }

    @Override
    protected Response apiCall() throws IOException {
        MoviesService moviesService = ApiFactory.getMoviesService();
        Call<MoviePage> call = moviesService.getMoviePageById(Constants.API_KEY, pageId);
        MoviePage moviePage = null;
        try {
            moviePage = call.execute().body();
        } catch (Exception e){
            e.printStackTrace();
        }


        return new Response().setAnswer(moviePage).setRequestResult(RequestResult.SUCCESS);
    }
}
