package ir.hoseinsa.composeexamplemediastack.data.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Data(
    @SerialName("author")
    val author: String,
    @SerialName("category")
    val category: String,
    @SerialName("country")
    val country: String,
    @SerialName("description")
    val description: String,
    @SerialName("image")
    val image: String,
    @SerialName("language")
    val language: String,
    @SerialName("published_at")
    val published_at: String,
    @SerialName("source")
    val source: String,
    @SerialName("title")
    val title: String,
    @SerialName("url")
    val url: String
)