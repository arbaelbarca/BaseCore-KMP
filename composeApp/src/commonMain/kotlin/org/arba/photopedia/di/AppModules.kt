package org.arba.photopedia.di

import org.koin.compose.viewmodel.dsl.viewModel
import org.koin.core.context.startKoin
import org.koin.dsl.module


val provideViewModel = module {
//    viewModel { TaskViewModel(get()) }
}

val provideReposity = module {
//    single { TaskRepository(get<AppDatabase>().getDao()) }
}

val provideDbModule = module {
    single {
//        getRoomDatabase(getDatabaseBuilder())
    }
}

fun initializeKoin() {
    startKoin {
        modules(
            provideDbModule,
            provideViewModel,
            provideReposity,
//            provideViewModel,
//            provideRepostiry,
//            provideHttpClient
        )
    }
}
