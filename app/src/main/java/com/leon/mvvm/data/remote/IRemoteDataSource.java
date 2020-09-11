package com.leon.mvvm.data.remote;

import com.leon.mvvm.BuildConfig;
import com.leon.mvvm.data.model.BaseResponse;
import com.leon.mvvm.data.model.EmptyResponse;
import com.leon.mvvm.ui.login.model.LoginRequest;
import com.leon.mvvm.ui.login.model.LoginResponse;
import com.leon.mvvm.ui.main.home.model.HomeTestBean;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface IRemoteDataSource {
    public static String BASE_URL = BuildConfig.DEBUG ? "http://rap2api.taobao.org/app/mock/22156/" : "";
    public static int TIMEOUT = 10;
    public static int READ_TIMEOUT = 10;

    @POST("user/login/")
    Observable<BaseResponse<LoginResponse>> login(@Body LoginRequest loginRequest);

    @GET("tests/")
    Observable<BaseResponse<List<HomeTestBean>>> getTestList();

    @GET("empty/")
    Observable<BaseResponse<EmptyResponse>> getEmpty();
}
