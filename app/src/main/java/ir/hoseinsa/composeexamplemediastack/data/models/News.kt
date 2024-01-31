package ir.hoseinsa.composeexamplemediastack.data.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class News(
    @SerialName("data")
    val `data`: List<Data>,
    @SerialName("pagination")
    val pagination: Pagination
)