package nl.pcstet.mixdex

import android.app.Application
import nl.pcstet.mixdex.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MixdexApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MixdexApplication)
            modules(appModule)
        }
    }
}