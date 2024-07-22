package di

import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module
import dependencies.DBClient

actual val platformModule: Module = module {
    singleOf(::DBClient)
}