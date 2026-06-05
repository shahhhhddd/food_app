package com.example.foodapp.data.remote

import com.example.foodapp.data.model.MealResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface FoodApiService {
    @GET("search.php?s=")
    suspend fun getMeals(): MealResponse

    @GET("filter.php")
    suspend fun getMealsByCategory(@Query("c") category: String): MealResponse
}
