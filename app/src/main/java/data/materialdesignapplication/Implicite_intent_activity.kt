package data.materialdesignapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class Implicite_intent_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_implicite_intent)

//        var edtxtmind = findViewById<EditText>(R.id.edtxtMind)
    }

    fun openwebsite(view: View) {
        var edtxturl = findViewById<EditText>(R.id.edtxtUrl)
        var uri = Uri.parse(edtxturl.text.toString())
        startActivity(Intent(Intent.ACTION_VIEW,uri))
    }

    fun opendailpad(view: View) {
        var edtxtphone = findViewById<EditText>(R.id.edtxtPhone)
        var uri = Uri.parse("tel:"+edtxtphone.text.toString())
        startActivity(Intent(Intent.ACTION_VIEW,uri))
    }
    fun searchmap(view: View) {
        var edtxtlocation = findViewById<EditText>(R.id.edtxtLocation)
        var uri = Uri.parse("geo:0,0?q="+edtxtlocation.text.toString())
        startActivity(Intent(Intent.ACTION_VIEW,uri))
    }

    fun tvconnect(view: View) {

    }

    fun ibtnBack(view: View) {
        startActivity(Intent(this,MainActivity::class.java))
    }
}