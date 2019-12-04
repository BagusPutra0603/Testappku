package com.example.bagusputra.testkotlinku

import android.support.v7.app.AppCompatActivity
import android.R.layout.simple_list_item_1
import android.content.Intent
import android.widget.ArrayAdapter
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
import com.mancj.materialsearchbar.MaterialSearchBar
import kotlinx.android.synthetic.main.activity_testlistview.*

class TestlistviewActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_testlistview)

//        val searchBar = findViewById(R.id.searchBar) as MaterialSearchBar
//        searchBar.setHint("Search..")
//        searchBar.setSpeechMode(true)
//
//
//        val namaku = listOf("aaaa", "sakjsj", "jahkskjashkjd", "ahshjasjhkdjh")
//
//        list_itemku.adapter = ArrayAdapter(this, simple_list_item_1, namaku)
//
//        searchBar.addTextChangeListener(object : TextWatcher {
//            override fun beforeTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {
//
//            }
//
//            override fun onTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {
//                //SEARCH FILTER
//                ArrayAdapter.getFilter().filter(charSequence)
//            }
//
//            override fun afterTextChanged(editable: Editable) {
//
//            }
//        })
//
//
//
//
//        list_itemku.setOnItemClickListener { parent, view, position, id ->
//            Toast.makeText(this, "Anda memilih: ${namaku[position]}", Toast.LENGTH_LONG).show()
//
//            if (position == 0) {
//                val intent = Intent(this, MapsActivity::class.java)
//                startActivity(intent)
//            }
//            if (position == 1) {
//            val intent = Intent(this, NextActivity::class.java)
//            startActivity(intent)
//        }
//
//        }


        //REFERENCE MATERIALSEARCHBAR AND LISTVIEW
        val lv = findViewById(R.id.list_itemku) as ListView
        val searchBar = findViewById(R.id.searchBar) as MaterialSearchBar
        searchBar.setHint("Search..")
        searchBar.setSpeechMode(true)

        var provinsi = arrayOf("Sumatera", "Jawa", "Kalimantan", "Sulawesi", "NusaTenggara", "Papua")

        //ADAPTER
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, provinsi)
        lv.setAdapter(adapter)

        //SEARCHBAR TEXT CHANGE LISTENER
        searchBar.addTextChangeListener(object : TextWatcher {
            override fun beforeTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {

            }

            override fun onTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {
                //SEARCH FILTER
                adapter.getFilter().filter(charSequence)
            }

            override fun afterTextChanged(editable: Editable) {

            }
        })

        //LISTVIEW ITEM CLICKED
        lv.setOnItemClickListener(object : AdapterView.OnItemClickListener {
            override fun onItemClick(adapterView: AdapterView<*>, view: View, i: Int, l: Long) {
//                Toast.makeText(this@TestlistviewActivity, adapter.getItem(i)!!.toString(), Toast.LENGTH_SHORT).show()

                if (adapter.getItem(i)!!.toString() == "Sumatera") {
//                    Toast.makeText(this@TestlistviewActivity, "OK Betul", Toast.LENGTH_SHORT).show()

                    val intent = Intent(this@TestlistviewActivity, NextActivity::class.java)
                    startActivity(intent)
                }


                if (adapter.getItem(i)!!.toString() == "Jawa") {


                    val intent = Intent(this@TestlistviewActivity, JawaActivity::class.java)
                    startActivity(intent)
                }

                if (adapter.getItem(i)!!.toString() == "Kalimantan") {


                    val intent = Intent(this@TestlistviewActivity, KalimantanActivity::class.java)
                    startActivity(intent)
                }

                if (adapter.getItem(i)!!.toString() == "Sulawesi") {


                    val intent = Intent(this@TestlistviewActivity, SulawesiActivity::class.java)
                    startActivity(intent)
                }

                if (adapter.getItem(i)!!.toString() == "NusaTenggara") {


                    val intent = Intent(this@TestlistviewActivity, NusaActivity::class.java)
                    startActivity(intent)
                }


                if (adapter.getItem(i)!!.toString() == "Papua") {


                    val intent = Intent(this@TestlistviewActivity, PapuaActivity::class.java)
                    startActivity(intent)
                }

            }
        })


//        lv.setOnItemClickListener { parent, view, position, id ->
//            Toast.makeText(this, "Anda memilih: ${galaxies[position]}", Toast.LENGTH_LONG).show()
//
//
//            if (position == 1) {
//                val intent = Intent(this, NextActivity::class.java)
//                startActivity(intent)
//            }
//
//        }

        //end

    }
}
