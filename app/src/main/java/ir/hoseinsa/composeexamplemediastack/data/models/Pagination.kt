package ir.hoseinsa.composeexamplemediastack.data.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Pagination(
    @SerialName("count")
    val count: Int,
    @SerialName("limit")
    val limit: Int,
    @SerialName("offset")
    val offset: Int,
    @SerialName("total")
    val total: Int
)