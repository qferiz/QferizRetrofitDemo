package id.qferizstudio.retrofitdemo.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Qferiz on 24/05/2017.
 */

public class Contact {

    @SerializedName("name")
    private String Name;

    @SerializedName("email")
    private String Email;

    public String getName() {
        return Name;
    }

    public String getEmail() {
        return Email;
    }
}
