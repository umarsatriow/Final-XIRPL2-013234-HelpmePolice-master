package id.sch.smktelkom_mlg.afinal.xirpl2013234.helpmepolice.Remote;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by Umar on 26/4/2018.
 */

public interface IGoogleAPI {
    @GET
    Call<String> getPath(@Url String url);
}
