package e.pavanmalisetti.androiduberclone.Common;

import android.location.Location;

import e.pavanmalisetti.androiduberclone.Remote.FCMClient;
import e.pavanmalisetti.androiduberclone.Remote.IFCMService;
import e.pavanmalisetti.androiduberclone.Remote.IGoogleAPI;
import e.pavanmalisetti.androiduberclone.Remote.RetrofitClient;
import retrofit2.Retrofit;

public class Common {

    public static final String driver_tbl="Drivers";
    public static final String user_driver_tbl="DriversInformation";
    public static final String user_rider_tbl="RidersInformation";
    public static final String pickup_request_tbl="PickupRequest";
    public static final String token_tbl="Tokens";

    public static Location mLastLocation=null;

    public static final String baseURL="https://maps.googleapis.com";
    public static final String fcmURL="https://fcm.googleapis.com";

    public static IGoogleAPI getGoogleAPI()
    {
        return RetrofitClient.getClient(baseURL).create(IGoogleAPI.class);
    }

    public static IFCMService getFCMService()
    {
        return FCMClient.getClient(fcmURL).create(IFCMService.class);
    }
}
