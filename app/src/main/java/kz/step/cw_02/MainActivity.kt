package kz.step.cw_02

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var button: Button? = null
    var textView: TextView? = null
    var editText: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializeViews()
        initializeLiseners()
    }


    fun initializeViews(){
        button = findViewById(R.id.button)
        textView = findViewById(R.id.text_view)
        editText = findViewById(R.id.user_input)
    }

    fun initializeLiseners(){
        button?.setOnClickListener {
            var isTrue: Boolean = true
            var text: String? = editText?.text.toString()
            if (text != null) {
                for (char in text){
                    if (char.toString().toInt() != null){
                        isTrue = false
                        break;
                    }
                }
                if (isTrue){
                    textView?.setTextColor(Color.BLACK)
                    textView?.text = "Everithing looks fine!"
                }
                else{
                    textView?.setTextColor(Color.RED)
                    textView?.text = "“Error, we have digits in our name!"
                }
            }
        }
    }
}
