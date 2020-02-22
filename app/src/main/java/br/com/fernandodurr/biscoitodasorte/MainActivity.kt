package br.com.fernandodurr.biscoitodasorte

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnNewMessage.setOnClickListener { tvMessage.text = getMessage() }
    }

    fun getMessage() : String {
        val messages = resources.getStringArray(R.array.messages)
        val messageNumber = Random().nextInt(messages.size)

        return messages[messageNumber]
    }
}
