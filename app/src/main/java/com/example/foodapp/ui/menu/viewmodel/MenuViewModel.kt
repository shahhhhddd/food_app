package com.example.foodapp.ui.menu.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.foodapp.data.model.Meal
import com.example.foodapp.data.remote.RetrofitInstance
import com.example.foodapp.data.repository.FoodRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class MenuViewModel : ViewModel() {
    private val repository = FoodRepository(RetrofitInstance.api)

    private val _meals = MutableStateFlow<List<Meal>>(emptyList())
    val meals: StateFlow<List<Meal>> = _meals

    private val _isLoading = MutableStateFlow(false)
    val isLoading: StateFlow<Boolean> = _isLoading

    init {
        fetchMeals()
    }

    fun fetchMeals(category: String? = null) {
        viewModelScope.launch {
            _isLoading.value = true
            try {
                if (category == null) {
                    _meals.value = repository.getMeals()
                } else {
                    _meals.value = repository.getMealsByCategory(category)
                }
            } catch (e: Exception) {

            } finally {
                _isLoading.value = false
            }
        }
    }
}
