package meza.jonathan.openweathermap.Repository

import meza.jonathan.openweathermap.Server.ApiServices

class CityRepository(val api:ApiServices) {
    fun getCities(q:String, limit:Int) =
        api.getCitiesList(q, limit, "0317cb7600173872a3236b3a37f3d6ba")
}