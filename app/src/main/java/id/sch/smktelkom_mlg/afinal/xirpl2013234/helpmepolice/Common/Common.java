package id.sch.smktelkom_mlg.afinal.xirpl2013234.helpmepolice.Common;

import android.location.Location;

import id.sch.smktelkom_mlg.afinal.xirpl2013234.helpmepolice.Model.User;
import id.sch.smktelkom_mlg.afinal.xirpl2013234.helpmepolice.Remote.FCMClient;
import id.sch.smktelkom_mlg.afinal.xirpl2013234.helpmepolice.Remote.IFCMService;
import id.sch.smktelkom_mlg.afinal.xirpl2013234.helpmepolice.Remote.IGoogleAPI;
import id.sch.smktelkom_mlg.afinal.xirpl2013234.helpmepolice.Remote.RetrofitClient;

/**
 * Created by Umar on 26/4/2018.
 */

public class Common {


    public static final String driver_tbl = "Drivers";
    public static final String user_driver_tbl = "Users";
    public static final String user_rider_tbl = "Riders";
    public static final String pickup_request_tbl = "PickupRequest";
    public static final String token_tbl = "Tokens";
    public static final int PICK_IMAGE_REQUEST = 9999;
    public static final String baseURL = "https://maps.googleapis.com";
    public static final String fcmURL = "https://fcm.googleapis.com/";
    public static final String user_field = "usr";
    public static final String pwd_field = "pwd";
    public static User currentUser;
    public static Location mLastLocation = null;

    public static IGoogleAPI getGoogleAPI() {
        return RetrofitClient.getClient(baseURL).create(IGoogleAPI.class);
    }

    public static IFCMService getFCMService() {
        return FCMClient.getClient(fcmURL).create(IFCMService.class);
    }
}
