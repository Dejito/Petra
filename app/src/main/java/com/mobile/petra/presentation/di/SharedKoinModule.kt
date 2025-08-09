package com.mobile.petra.presentation.di

import com.mobile.petra.presentation.viewmodel.auth.authModule
import com.mobile.petra.presentation.viewmodel.product.productModule

val sharedKoinModules = listOf(
    productModule,
    authModule
)