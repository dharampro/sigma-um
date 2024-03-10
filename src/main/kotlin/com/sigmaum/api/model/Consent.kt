package com.sigmaum.api.model

import lombok.Data
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Data
@Document(collection = "oauth2Consent")
data class Consent(
    @Id
    val id: String,
    val registeredClientId: String,
    val principalName: String,
    val authorities: String
)
