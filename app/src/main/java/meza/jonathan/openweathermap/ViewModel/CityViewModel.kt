package meza.jonathan.openweathermap.ViewModel

import androidx.lifecycle.ViewModel
import meza.jonathan.openweathermap.Repository.CityRepository
import meza.jonathan.openweathermap.Server.ApiClient
import meza.jonathan.openweathermap.Server.ApiServices
import retrofit2.create

class CityViewModel(val repository: CityRepository) : ViewModel() {
    constructor():this(CityRepository(ApiClient().getClient().create(ApiServices::class.java)))

    fun loadCity(q:String, limit:Int) =
        repository.getCities(q, limit)
}