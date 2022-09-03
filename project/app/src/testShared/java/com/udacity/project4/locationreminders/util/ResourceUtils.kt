package com.udacity.project4.locationreminders.util

/*This for access app res*/
import android.content.Context
import androidx.annotation.StringRes
import androidx.test.core.app.ApplicationProvider

fun getString(@StringRes name: Int, vararg formatArgs: Any): String =
    ApplicationProvider.getApplicationContext<Context>().getString(name, formatArgs)