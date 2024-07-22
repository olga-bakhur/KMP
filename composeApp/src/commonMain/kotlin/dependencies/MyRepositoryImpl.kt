package dependencies

class MyRepositoryImpl(
    private val dbClient: DBClient
) : MyRepository {
    override fun helloWorld(): String {
        return "Hello world!"
    }
}