package ua.com.aswitch.vtm.loaders;

import android.content.Context;
import android.support.v4.content.AsyncTaskLoader;

import java.io.IOException;
import java.util.Map;

import ua.com.aswitch.vtm.models.RequestResult;
import ua.com.aswitch.vtm.models.Response;

/**
 * Created by taras on 4/18/17.
 */

public abstract class BaseLoader extends AsyncTaskLoader<Response> {

        public BaseLoader(Context context) {
            super(context);
        }

        @Override
        protected void onStartLoading() {
            super.onStartLoading();
            forceLoad();
        }

        @Override
        public Response loadInBackground() {
            try {
                Response response = apiCall();
                if (response.getRequestResult() == RequestResult.SUCCESS) {
                    onSuccess();
                } else {
                    onError();
                }
                return response;
            } catch (IOException e) {
                onError();
                return new Response();
            }
        }

        protected void onSuccess() {
        }

        protected void onError() {
        }

        protected abstract Response apiCall() throws IOException;

    }
