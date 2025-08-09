package com.mobile.petra.presentation.viewmodel.auth

import com.mobile.petra.data.remote.PetraRepositoryImpl
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

//val authModule = module {
//    singleOf(::PetraRepositoryImpl) { bind<PetraRepository>() }
//    viewModelOf(::AuthViewModel)
//}

val authModule = module {
    single { PetraRepositoryImpl() }
    viewModel { AuthViewModel(get()) }
}