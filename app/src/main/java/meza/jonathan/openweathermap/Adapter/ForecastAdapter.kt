package meza.jonathan.openweathermap.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import meza.jonathan.openweathermap.databinding.ActivityMainBinding
import meza.jonathan.openweathermap.databinding.ForecastViewholderBinding
import meza.jonathan.openweathermap.model.ForecartResponseApi
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Objects

class ForecastAdapter : RecyclerView.Adapter<ForecastAdapter.ViewHolder>() {
    private lateinit var binding: ForecastViewholderBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ForecastAdapter.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        binding = ForecastViewholderBinding.inflate(inflater, parent, false)
        return ViewHolder()
    }

    override fun onBindViewHolder(holder: ForecastAdapter.ViewHolder, position: Int) {
        val binding = ForecastViewholderBinding.bind(holder.itemView)
        val date = SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(differ.currentList[position].dtTxt.toString())
        val calendar = Calendar.getInstance()
        calendar.time = date
        val dayOfWeekName = when(calendar.get(Calendar.DAY_OF_WEEK)) {
            1 -> "Dom"
            2 -> "Lun"
            3 -> "Mar"
            4 -> "Mie"
            5 -> "Jue"
            6 -> "Vie"
            7 -> "Sab"
            else -> "-"
        }
        binding.nameDayTxt.text = dayOfWeekName
    }

    inner class ViewHolder:RecyclerView.ViewHolder(binding.root)

    override fun getItemCount() = differ.currentList.size

    private val differCallback = object:DiffUtil.ItemCallback<ForecartResponseApi.data>() {
        override fun areItemsTheSame(
            oldItem: ForecartResponseApi.data,
            newItem: ForecartResponseApi.data
        ): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(
            oldItem: ForecartResponseApi.data,
            newItem: ForecartResponseApi.data
        ): Boolean {
            return oldItem == newItem
        }

    }
    val differ = AsyncListDiffer(this, differCallback)

}