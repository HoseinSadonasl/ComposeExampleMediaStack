package ir.hoseinsa.composeexamplemediastack.data

import io.ktor.client.HttpClient
import io.ktor.client.request.get
import ir.hoseinsa.composeexamplemediastack.data.models.News

class NewsApi(private val client: HttpClient) {

    private val BASE_URL = "http://api.mediastack.com/v1/"
    private val ACCESS_KEY = "d47b29a3a5143b3afa702b1a0f1a854d"
    private val END_POINT_NEWS = "news"

    suspend fun getNews(): News = client.get("$BASE_URL$END_POINT_NEWS?$ACCESS_KEY")

}