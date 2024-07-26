package di

import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module
import data.source.local.database.DBClient

actual val platformModule: Module = module {
    singleOf(::DBClient)
}