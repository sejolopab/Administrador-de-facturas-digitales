package com.example.administradordefacturas.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Store (
    val name: String? = null,
    val uses: Int = 0,
    val tag: Int? = null
) : Parcelable