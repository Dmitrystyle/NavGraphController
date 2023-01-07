package com.example.navgraphcontroller

import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.FragmentController
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.navgraphcontroller.databinding.ActivityMainBinding
import com.example.time_test.APP


class MainActivity : AppCompatActivity() {

    lateinit var binding:ActivityMainBinding
    private lateinit var navController: NavController

    private lateinit var appBarConfig: AppBarConfiguration
    lateinit var drawerLayout: DrawerLayout

    private lateinit var listener:NavController.OnDestinationChangedListener


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        navController = findNavController(R.id.fragment)
       // APP =this

        drawerLayout=findViewById(R.id.drawer_layout)
        binding.navigationView.setupWithNavController(navController)
        appBarConfig= AppBarConfiguration(navController.graph, drawerLayout)
        setupActionBarWithNavController(navController, appBarConfig)
        // supportFragmentManager.beginTransaction().replace(R.id.fragment_container,FirstFragment()).commit()
        // val navHostFragment = supportFragmentManager.findFragmentById (R.id.fragment) as NavHostFragment
        //   val navController=navHostFragment.navController

        listener=NavController.OnDestinationChangedListener{controller, destination, arguments ->
            if (   destination.id == R.id.firstFragment) {
                supportActionBar?.setBackgroundDrawable(ColorDrawable(getColor(R.color.design_default_color_primary_dark)))

            }
            else if (destination.id==R.id.secondFragment){
                supportActionBar?.setBackgroundDrawable(ColorDrawable(getColor(R.color.teal_200)))

            }
        }


    }
//_______________________перерисовывает фон по изменению состояния listener___________
    override fun onResume() {
        super.onResume()
        navController.addOnDestinationChangedListener(listener)
    }

    override fun onPause() {
        super.onPause()
        navController.removeOnDestinationChangedListener(listener)
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController=findNavController(R.id.fragment)
        return navController.navigateUp(appBarConfig)|| super.onSupportNavigateUp()
    }


}