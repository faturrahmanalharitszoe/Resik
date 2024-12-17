package com.example.resik.data.remote

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.security.SecureRandom
import java.security.cert.X509Certificate
import javax.net.ssl.*

object RetrofitInstance {
    private const val BASE_URL = "https://10.0.2.2:8080/"

    private fun getUnsafeOkHttpClient(): OkHttpClient {
        val trustAllCertificates = arrayOf<TrustManager>(
            object : X509TrustManager {
                override fun checkClientTrusted(chain: Array<out X509Certificate>?, authType: String?) {}
                override fun checkServerTrusted(chain: Array<out X509Certificate>?, authType: String?) {}
                override fun getAcceptedIssuers(): Array<X509Certificate> = arrayOf()
            }
        )

        val sslContext = SSLContext.getInstance("TLS")
        sslContext.init(null, trustAllCertificates, SecureRandom())

        return OkHttpClient.Builder()
            .sslSocketFactory(
                sslContext.socketFactory,
                trustAllCertificates[0] as X509TrustManager
            )
            .hostnameVerifier(HostnameVerifier { _, _ -> true })
            .build()
    }

    val api: ApiService by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(getUnsafeOkHttpClient())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService::class.java)
    }
}