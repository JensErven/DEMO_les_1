package be.ehb.stuvo.demo.les1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonClickMe = findViewById<Button>(R.id.button_left)
        val txtHello = findViewById<TextView>(R.id.txt)


        txtHello.text = getString(R.string.kotlintext)

        buttonClickMe.setOnClickListener {
            txtHello.text = "You clicked me!"
        }
    }

}