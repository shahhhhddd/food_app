package com.example.foodapp.data.remote

import com.example.foodapp.data.model.MealResponse
import retrofit2.http.GET

interface FoodApiService {
    @GET("search.php?s=")
    suspend fun getMeals(): MealResponse
}
