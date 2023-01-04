package com.example.navgraphcontroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.example.navgraphcontroller.databinding.ActivityMainBinding
import com.example.time_test.APP


class MainActivity : AppCompatActivity() {

    lateinit var binding:ActivityMainBinding

   // lateinit var appBarConfig: AppBarConfiguration
   // lateinit var drawerLayout: DrawerLayout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)


        APP =this



/*      val navHostFragment = supportFragmentManager.findFragmentById (R.id.fragment) as NavHostFragment
        val navController=navHostFragment.navController
        drawerLayout=findViewById(R.id.navView)
        appBarConfig= AppBarConfiguration(navController.graph, drawerLayout)
        binding.navView.setupWithNavController(navController)*/


        // supportFragmentManager.beginTransaction().replace(R.id.fragment_container,FirstFragment()).commit()
    }
}