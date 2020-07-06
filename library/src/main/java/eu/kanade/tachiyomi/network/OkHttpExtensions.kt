package eu.kanade.tachiyomi.network

import eu.kanade.tachiyomi.network.ProgressListener
import okhttp3.Call
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import rx.Observable

fun Call.asObservable(): Observable<Response> {
    throw Exception("Stub!")
}

fun Call.asObservableSuccess(): Observable<Response> {
    throw Exception("Stub!")
}

fun OkHttpClient.newCallWithProgress(request: Request, listener: ProgressListener): Call {
    throw Exception("Stub!")
}
