package com.sameerasw.overcast.weather.island

import com.sameerasw.overcast.weather.widget.WidgetWeather
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

internal object WeatherIslandState {
    private val _weather = MutableStateFlow<WidgetWeather?>(null)
    val weather: StateFlow<WidgetWeather?> = _weather

    fun set(weather: WidgetWeather?) {
        _weather.value = weather
    }
}
