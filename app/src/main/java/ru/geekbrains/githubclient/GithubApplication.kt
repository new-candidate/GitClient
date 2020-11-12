package ru.geekbrains.githubclient

import android.app.Application
import ru.terrakok.cicerone.Cicerone
import ru.terrakok.cicerone.NavigatorHolder
import ru.terrakok.cicerone.Router

class GithubApplication : Application() {
    private val cicerone: Cicerone<Router> by lazy { Cicerone.create() }
    override fun onCreate() {
        super.onCreate()
        application = this
    }

    val router: Router
        get() = cicerone.router

    val navigatorHolder: NavigatorHolder
        get() = cicerone.navigatorHolder

    companion object {
        var application: GithubApplication? = null
    }
}
