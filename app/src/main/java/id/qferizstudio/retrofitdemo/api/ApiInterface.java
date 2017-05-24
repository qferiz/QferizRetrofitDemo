package id.qferizstudio.retrofitdemo.api;

import java.util.List;

import id.qferizstudio.retrofitdemo.model.Contact;
import retrofit2.Call;
import retrofit2.http.POST;

/**
 * Created by Qferiz on 24/05/2017.
 */

public interface ApiInterface {

    @POST("readcontact.php")
    Call<List<Contact>> getContacts();

}
