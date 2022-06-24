package cr.una.example.frontend_car_service_app.utils

import android.app.Application

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        createSessionManager(SessionManager(applicationContext))
    }

    companion object {
        var sessionManager: SessionManager? = null

        fun createSessionManager(newInstance: SessionManager){
            sessionManager = newInstance
        }
    }
}