package com.mobile.petra.presentation.viewmodel.product

import com.mobile.petra.data.remote.PetraRepositoryImpl
import org.koin.dsl.module

import org.koin.core.module.dsl.viewModel


val productModule = module {
    single { PetraRepositoryImpl() }
    single { ProductsViewModel(get()) } // now a singleton, app-wide
}


//val productModule = module {
//    single { PetraRepositoryImpl() }
//    viewModel { ProductsViewModel(get()) }
//}

//val productModule = module {
//    singleOf(::PetraRepositoryImpl) { bind<PetraRepositoryImpl>() }
//    viewModelOf(::ProductsViewModel)
//}