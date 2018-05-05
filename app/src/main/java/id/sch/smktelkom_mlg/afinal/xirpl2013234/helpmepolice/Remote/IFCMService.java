package id.sch.smktelkom_mlg.afinal.xirpl2013234.helpmepolice.Remote;

import id.sch.smktelkom_mlg.afinal.xirpl2013234.helpmepolice.Model.FCMResponse;
import id.sch.smktelkom_mlg.afinal.xirpl2013234.helpmepolice.Model.Sender;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by Umar on 26/4/2018.
 */

public interface IFCMService {
    @Headers({
            "Content-Type:application/json",
            "Authorization:key=AAAAXLKdAEo:APA91bFzIAGUKjlTYdHdlqo7Tmj_IG5q9rd6MdaMh9jhIUh2iwfjZvm2mwo74-r1z79kmDyR9Cx7RjsxdL_Df-jechi3FsawRx7d86jwWZJpgUeU0SJsRS59yu0xcThdm2nxGywI3Bxr"
    })
    @POST("fcm/send")
    Call<FCMResponse> sendMessage(@Body Sender body);
}
