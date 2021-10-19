package com.gkaynak.retrofit.service

import com.gkaynak.retrofit.model.CryptoModel
import retrofit2.Call
import io.reactivex.Observable
import retrofit2.http.GET
import java.util.*

interface CryptoAPI {
    //GET,POST,UPDATE,DELETE
    @GET("prices?key=3a14f52e6a9aa51ff677df4229dea11ca09eb6c6")

    fun getData():Observable<List<CryptoModel>>
    //fun getData(): Call<List<CryptoModel>>

}