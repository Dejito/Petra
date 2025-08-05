package com.mobile.petra.presentation.viewmodel.product

import com.mobile.petra.data.remote.PetraRepository
import com.mobile.petra.data.remote.PetraRepositoryImpl
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.singleOf
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module


val productModule = module {
    singleOf(::PetraRepositoryImpl) { bind<PetraRepository>() }
    viewModelOf(::ProductsViewModel)
}