package com.sigmaum.api.model

import java.time.Instant
import lombok.Data
import org.springframework.data.mongodb.core.mapping.Document

@Data
@Document(collection = "oauth2Client")
data class Client(
    val id: String,
    val clientId: String,
    val clientIdIssuedAt: Instant,
    val clientSecret: String,
    val clientSecretExpiresAt: Instant,
    val clientName: String,
    val clientAuthenticationMethods: String,
    val authorizationGrantTypes: String,
    val redirectUris: String,
    val postLogoutRedirectUris: String,
    val scopes: String,
    val clientSettings: String,
    val tokenSettings: String
)
