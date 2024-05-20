package meza.jonathan.openweathermap.ViewModel

import androidx.lifecycle.ViewModel
import meza.jonathan.openweathermap.Repository.WeatherRepository
import meza.jonathan.openweathermap.Server.ApiClient
import meza.jonathan.openweathermap.Server.ApiServices
import retrofit2.create

class WeatherViewModel(val repository: WeatherRepository):ViewModel() {

    constructor():this(WeatherRepository(ApiClient().getClient().create(ApiServices::class.java)))

    fun loadCurrentWeather(lat:Double, lng:Double, unit:String) =
        repository.getCurrentWeather(lat, lng, unit)

    fun loadForecastWeather(lat:Double, lng:Double, unit:String) =
        repository.getForecastWeather(lat, lng, unit)
}