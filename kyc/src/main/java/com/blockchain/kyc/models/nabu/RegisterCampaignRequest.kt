package com.blockchain.kyc.models.nabu

import com.blockchain.serialization.JsonSerializable

data class RegisterCampaignRequest(
    val data: Map<String, String>,
    val newUser: Boolean
) : JsonSerializable {

    fun registerSunriver(accountId: String) = RegisterCampaignRequest(
        mapOf("x-campaign-address" to accountId),
        false
    )
}