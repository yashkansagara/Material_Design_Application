package data.materialdesignapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var actvcity = findViewById<AutoCompleteTextView>(R.id.actvCity)
        var city = arrayOf("Rajkot","Patanvav","Surat","Ahemdabad","Pune")
        var adpt = ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,city)
        actvcity.setAdapter(adpt)

        var txtname = findViewById<EditText>(R.id.txtName)
        var txtemail = findViewById<EditText>(R.id.txtEmail)
        var txtpassword = findViewById<EditText>(R.id.txtPassword)
        var txtphone = findViewById<EditText>(R.id.txtPhone)
        var txtcity = findViewById<EditText>(R.id.actvCity)

        var tv = findViewById<TextView>(R.id.tvMsg)
        var btnsubmit = findViewById<Button>(R.id.btnSubmit)
        btnsubmit.setOnClickListener {
            tv.setText("Name = "+txtname.text.toString()+ "\nEmail = "+ txtemail.text.toString()+ "\nPassword = "+ txtpassword.text.toString()+"\nPhone = "+txtphone.text.toString()+
                    "\nCity = "+ txtcity.text.toString())
        }

        var btnconnect = findViewById<Button>(R.id.btnconnect)
        btnconnect.setOnClickListener {
            startActivity(Intent(this,Implicite_intent_activity::class.java))
        }
    }
}