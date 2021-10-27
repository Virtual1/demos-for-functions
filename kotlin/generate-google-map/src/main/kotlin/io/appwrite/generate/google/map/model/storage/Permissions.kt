package io.appwrite.generate.google.map.model.storage

import kotlinx.serialization.Serializable

@Serializable
data class Permissions(
    val read: Collection<String>,
    val write: Collection<String>,
)
