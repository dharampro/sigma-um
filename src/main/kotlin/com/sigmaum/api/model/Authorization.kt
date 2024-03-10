package com.sigmaum.api.model

import java.time.Instant
import lombok.Data
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Data
@Document(collection = "oauth2Authorization")
data class Authorization(
    @Id
    val id: String,
    val registeredClientId: String,
    val principalName: String,
    val authorizationGrantType: String,
    val authorizedScopes: String,
    val attributes: String,
    val state: String,
    val authorizationCodeValue: String,
    val authorizationCodeIssuedAt: Instant,
    val authorizationCodeExpiresAt: Instant,
    val authorizationCodeMetadata: String,
    val accessTokenValue: String,
    val accessTokenIssuedAt: Instant,
    val accessTokenExpiresAt: Instant,
    val accessTokenMetadata: String,
    val accessTokenType: String,
    val accessTokenScopes: String,
    val refreshTokenValue: String,
    val refreshTokenIssuedAt: Instant,
    val refreshTokenExpiresAt: Instant,
    val refreshTokenMetadata: String,
    val oidcIdTokenValue: String,
    val oidcIdTokenIssuedAt: Instant,
    val oidcIdTokenExpiresAt: Instant,
    val oidcIdTokenMetadata: String,
    val oidcIdTokenClaims: String,
    val userCodeValue: String,
    val userCodeIssuedAt: Instant,
    val userCodeExpiresAt: Instant,
    val userCodeMetadata: String,
    val deviceCodeValue: String,
    val deviceCodeIssuedAt: Instant,
    val deviceCodeExpiresAt: Instant
)
