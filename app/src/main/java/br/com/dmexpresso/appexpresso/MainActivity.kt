package br.com.dmexpresso.appexpresso

import android.app.Activity
import android.os.Bundle
import android.view.Gravity
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val welcomeMessage = TextView(this).apply {
            text = getString(R.string.app_welcome)
            textSize = 22f
            gravity = Gravity.CENTER
        }

        setContentView(welcomeMessage)
    }
}
