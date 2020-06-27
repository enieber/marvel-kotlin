package com.enieber.marvel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.facebook.drawee.backends.pipeline.Fresco
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Fresco.initialize(this);
        setContentView(R.layout.activity_main)

        val recyclerView = caracters_list_recyclerview
        recyclerView.adapter = CaractersListAdapter(caractes(), this)
        val layoutManager = StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL)
        recyclerView.layoutManager = layoutManager
    }

    fun caractes(): List<Caracter> {
        return listOf(
            Caracter("https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fi.ytimg.com%2Fvi%2FiTqfGJnp-PE%2Fhqdefault.jpg", "Huck", "Cara verde e bem forte"),
            Caracter("https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fi.ytimg.com%2Fvi%2FiTqfGJnp-PE%2Fhqdefault.jpg","Home Aranha", "Adolecente chato cheio de espinha"),
            Caracter("https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fi.ytimg.com%2Fvi%2FiTqfGJnp-PE%2Fhqdefault.jpg","asome Aranha", "Adolecente chato cheio de espinha"),
            Caracter("https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fi.ytimg.com%2Fvi%2FiTqfGJnp-PE%2Fhqdefault.jpg","Hosae Aranha", "Adolecente chato cheio de espinha"),
            Caracter("https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fi.ytimg.com%2Fvi%2FiTqfGJnp-PE%2Fhqdefault.jpg","Hosae Aranha", "Adolecente chato cheio de espinha"),
            Caracter("https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fi.ytimg.com%2Fvi%2FiTqfGJnp-PE%2Fhqdefault.jpg","Hosae Aranha", "Adolecente chato cheio de espinha"),
            Caracter("https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fi.ytimg.com%2Fvi%2FiTqfGJnp-PE%2Fhqdefault.jpg","Hosae Aranha", "Adolecente chato cheio de espinha"),
            Caracter("https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fi.ytimg.com%2Fvi%2FiTqfGJnp-PE%2Fhqdefault.jpg","Hosae Aranha", "Adolecente chato cheio de espinha"),
            Caracter("https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fi.ytimg.com%2Fvi%2FiTqfGJnp-PE%2Fhqdefault.jpg","Hosae Aranha", "Adolecente chato cheio de espinha"),
            Caracter("https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fi.ytimg.com%2Fvi%2FiTqfGJnp-PE%2Fhqdefault.jpg","Hosae Aranha", "Adolecente chato cheio de espinha"),
            Caracter("https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fi.ytimg.com%2Fvi%2FiTqfGJnp-PE%2Fhqdefault.jpg","Hosae Aranha", "Adolecente chato cheio de espinha"),
            Caracter("https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fi.ytimg.com%2Fvi%2FiTqfGJnp-PE%2Fhqdefault.jpg","Hosae Aranha", "Adolecente chato cheio de espinha"),
            Caracter("https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fi.ytimg.com%2Fvi%2FiTqfGJnp-PE%2Fhqdefault.jpg","Hosae Aranha", "Adolecente chato cheio de espinha"),
            Caracter("https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fi.ytimg.com%2Fvi%2FiTqfGJnp-PE%2Fhqdefault.jpg","Hosae Aranha", "Adolecente chato cheio de espinha"),
            Caracter("https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fi.ytimg.com%2Fvi%2FiTqfGJnp-PE%2Fhqdefault.jpg","Hosae Aranha", "Adolecente chato cheio de espinha"),
            Caracter("https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fi.ytimg.com%2Fvi%2FiTqfGJnp-PE%2Fhqdefault.jpg","Hosae Aranha", "Adolecente chato cheio de espinha"),
            Caracter("https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fi.ytimg.com%2Fvi%2FiTqfGJnp-PE%2Fhqdefault.jpg","Hosae Aranha", "Adolecente chato cheio de espinha"),
            Caracter("https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fi.ytimg.com%2Fvi%2FiTqfGJnp-PE%2Fhqdefault.jpg","Hosae Aranha", "Adolecente chato cheio de espinha"),
            Caracter("https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fi.ytimg.com%2Fvi%2FiTqfGJnp-PE%2Fhqdefault.jpg","HomesasafbAranha", "Adolecente chato cheio de espinha"),
            Caracter("https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fi.ytimg.com%2Fvi%2FiTqfGJnp-PE%2Fhqdefault.jpg","HomesasafbAranha", "Adolecente chato cheio de espinha"),
            Caracter("https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fi.ytimg.com%2Fvi%2FiTqfGJnp-PE%2Fhqdefault.jpg","HomesasafbAranha", "Adolecente chato cheio de espinha"),
            Caracter("https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fi.ytimg.com%2Fvi%2FiTqfGJnp-PE%2Fhqdefault.jpg","HomesasafbAranha", "Adolecente chato cheio de espinha"),
            Caracter("https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fi.ytimg.com%2Fvi%2FiTqfGJnp-PE%2Fhqdefault.jpg","Home Aranbsdgha", "Adolecente chato cheio de espinha")
        )
    }
}
