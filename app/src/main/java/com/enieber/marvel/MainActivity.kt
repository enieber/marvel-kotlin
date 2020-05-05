package com.enieber.marvel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = caracters_list_recyclerview
        recyclerView.adapter = CaractersListAdapter(caractes(), this)
        val layoutManager = StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL)
        recyclerView.layoutManager = layoutManager
    }

    fun caractes(): List<Caracter> {
        return listOf(
            Caracter("Huck", "Cara verde e bem forte"),
            Caracter("Home Aranha", "Adolecente chato cheio de espinha"),
            Caracter("asome Aranha", "Adolecente chato cheio de espinha"),
            Caracter("Hosae Aranha", "Adolecente chato cheio de espinha"),
            Caracter("Hosae Aranha", "Adolecente chato cheio de espinha"),
            Caracter("Hosae Aranha", "Adolecente chato cheio de espinha"),
            Caracter("Hosae Aranha", "Adolecente chato cheio de espinha"),
            Caracter("Hosae Aranha", "Adolecente chato cheio de espinha"),
            Caracter("Hosae Aranha", "Adolecente chato cheio de espinha"),
            Caracter("Hosae Aranha", "Adolecente chato cheio de espinha"),
            Caracter("Hosae Aranha", "Adolecente chato cheio de espinha"),
            Caracter("Hosae Aranha", "Adolecente chato cheio de espinha"),
            Caracter("Hosae Aranha", "Adolecente chato cheio de espinha"),
            Caracter("Hosae Aranha", "Adolecente chato cheio de espinha"),
            Caracter("Hosae Aranha", "Adolecente chato cheio de espinha"),
            Caracter("Hosae Aranha", "Adolecente chato cheio de espinha"),
            Caracter("Hosae Aranha", "Adolecente chato cheio de espinha"),
            Caracter("Hosae Aranha", "Adolecente chato cheio de espinha"),
            Caracter("HomesasafbAranha", "Adolecente chato cheio de espinha"),
            Caracter("HomesasafbAranha", "Adolecente chato cheio de espinha"),
            Caracter("HomesasafbAranha", "Adolecente chato cheio de espinha"),
            Caracter("HomesasafbAranha", "Adolecente chato cheio de espinha"),
            Caracter("Home Aranbsdgha", "Adolecente chato cheio de espinha")
        )
    }
}
