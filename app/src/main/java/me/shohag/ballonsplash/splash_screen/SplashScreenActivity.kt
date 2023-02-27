package me.shohag.ballonsplash.splash_screen

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import me.shohag.ballonsplash.MainActivity
import me.shohag.ballonsplash.R
import java.util.*
import kotlin.concurrent.timerTask

@SuppressLint("CustomSplashScreen")
class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        navigateToMain()
    }

    private fun navigateToMain() {
        Timer().schedule(timerTask {
            startActivity(Intent(applicationContext, MainActivity::class.java))
        }, 3000)
    }
}