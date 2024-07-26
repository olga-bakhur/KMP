package domain.repositoryImpl

import data.repository.MyRepository
import data.source.local.database.DBClient

class MyRepositoryImpl(
    private val dbClient: DBClient
) : MyRepository {
    override fun helloWorld(): String {
        return "Hello world!"
    }
}