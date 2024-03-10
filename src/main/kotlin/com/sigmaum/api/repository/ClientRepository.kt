package com.sigmaum.api.repository

import com.sigmaum.api.model.Client
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface ClientRepository : MongoRepository<Client, String> {
    fun findByClientId(clientId: String?): List<Client>
}