package com.fsck.k9

interface CoreResourceProvider {
    fun defaultSignature(): String
    fun defaultIdentityDescription(): String

    fun sendAlternateChooserTitle(): String

    fun internalStorageProviderName(): String
    fun externalStorageProviderName(): String

    fun contactDisplayNamePrefix(): String
}
