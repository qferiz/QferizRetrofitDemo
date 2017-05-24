package id.qferizstudio.retrofitdemo.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Qferiz on 24/05/2017.
 */

public class ApiClient {

    // Test AVD on Localhost
    public static final String BASE_URL = "http://10.0.2.2/contactapp/";
    public static Retrofit retrofit = null;

    public static Retrofit getApiClient() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder().baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }


}
