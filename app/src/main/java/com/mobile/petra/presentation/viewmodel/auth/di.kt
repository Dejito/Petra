package com.mobile.petra.presentation.viewmodel.auth

import com.mobile.petra.data.remote.PetraRepositoryImpl
import com.mobile.petra.data.remote.PetraRepository
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.singleOf
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val authModule = module {
    singleOf(::PetraRepositoryImpl) { bind<PetraRepository>() }
    viewModelOf(::AuthViewModel)
}