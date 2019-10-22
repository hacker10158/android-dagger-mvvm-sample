package com.troywuma.daggermvvm.core

import javax.inject.Inject

/**
 * this sample class for constructor inject
 */
class PrintObject @Inject constructor() {
    fun print(): String {
        return "Print object"
    }
}