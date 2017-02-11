package contact.gojek.com.Rest.Interface;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Pankaj on 11/02/17.
 */

public interface Contacts {

    @GET("contacts.json")
    Call<List<Contacts>> getAllContactList();

    @GET("contacts/{contact_id}.json")
    Call<List<Contacts>> getContactByContactId(@Path("contact_id") int contactId);
}
