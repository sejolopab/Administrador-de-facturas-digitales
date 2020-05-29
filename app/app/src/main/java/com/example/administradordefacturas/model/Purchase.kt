package com.example.administradordefacturas.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Purchase (
    val place: Store,
    val date: String? = null,
    val amount: Int? = null
) :Parcelable