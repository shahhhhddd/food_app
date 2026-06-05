package com.example.foodapp.data.repository

import com.example.foodapp.data.model.Meal
import com.example.foodapp.data.remote.FoodApiService

class FoodRepository(private val apiService: FoodApiService) {
    suspend fun getMeals(): List<Meal> {
        return apiService.getMeals().meals
    }

    suspend fun getMealsByCategory(category: String): List<Meal> {
        return apiService.getMealsByCategory(category).meals
    }
}
