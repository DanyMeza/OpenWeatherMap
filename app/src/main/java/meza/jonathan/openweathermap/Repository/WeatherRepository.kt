package meza.jonathan.openweathermap.Repository

import meza.jonathan.openweathermap.Server.ApiServices

class WeatherRepository(val api:ApiServices) {

    fun getCurrentWeather(lat:Double, lng:Double, unit:String) =
        api.getCurrentWeather(lat, lng, unit, "0317cb7600173872a3236b3a37f3d6ba")

    fun getForecastWeather(lat:Double, lng:Double, unit:String) =
        api.getForecastWeather(lat, lng, unit, "0317cb7600173872a3236b3a37f3d6ba")
}