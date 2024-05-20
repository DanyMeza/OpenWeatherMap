package meza.jonathan.openweathermap.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import meza.jonathan.openweathermap.R
import meza.jonathan.openweathermap.databinding.ActivityCityListBinding
import meza.jonathan.openweathermap.databinding.CityViewholderBinding

class CityListActivity : AppCompatActivity() {
    lateinit var binding: ActivityCityListBinding
    private val cityAdapter by lazy {  }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCityListBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}