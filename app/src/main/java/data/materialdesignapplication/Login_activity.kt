package data.materialdesignapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class Login_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun btnlogin(view: View) {
        var txtname = findViewById<EditText>(R.id.txtUserName)
        var txtpassword = findViewById<EditText>(R.id.txtPassword)
        if (txtname.text.toString().lowercase() == "admin" && txtpassword.text.toString() == "admin"){
            startActivity(Intent(this,MainActivity::class.java))
        }
        else{
            Toast.makeText(applicationContext,"Username or Password Invalid...!!",Toast.LENGTH_LONG).show()
        }
    }

}