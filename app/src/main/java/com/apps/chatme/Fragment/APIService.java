package com.apps.chatme.Fragment;

import com.apps.chatme.Notifications.MyResponse;
import com.apps.chatme.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAIJNXpkw:APA91bEP7OkiQpwl5jDwkEevjTD5xQKkfzji6B9LUDhLsCMMZGnYRM9klaj44RWi_sV8NjaBwGyD_hkMrAUSH5bx9Ki6IkYKSUlXJlaPt2-LwfdbTOCRkiC3JgQy0jJnKEkwZgFviWrz"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}