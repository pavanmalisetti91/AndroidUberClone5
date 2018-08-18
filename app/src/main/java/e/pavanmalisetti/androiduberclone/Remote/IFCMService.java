package e.pavanmalisetti.androiduberclone.Remote;

import e.pavanmalisetti.androiduberclone.Model.FCMResponse;
import e.pavanmalisetti.androiduberclone.Model.Sender;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IFCMService {
    @Headers({
            "Content-Type:application/json",
            "Authorization:key=AAAA_KSPH-0:APA91bGJ-Yk8XNYR5VVpPUhrJ2QPzj1YKiIlpKwS54KB6JMcySg_-icLgK7tkCY0AF86vw_UfTW2vN6GnovvyiVBgqC5qeDL4jVaFsAfNA4jJrfIfEm28mOEjo7iOnjpP2EyozmHh9v6rtW7Z_x-vPHNhwsl7MMeUQ"
    })
    @POST("fcm/send")
    Call<FCMResponse> sendMessage(@Body Sender body);
}
