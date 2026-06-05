package com.example.foodapp.data.model

import com.google.gson.annotations.SerializedName

data class MealResponse(
    @SerializedName("meals")
    val meals: List<Meal>
)

data class Meal(
    @SerializedName("idMeal")
    val id: String,
    @SerializedName("strMeal")
    val name: String,
    @SerializedName("strCategory")
    val category: String?,
    @SerializedName("strArea")
    val area: String?,
    @SerializedName("strInstructions")
    val instructions: String?,
    @SerializedName("strMealThumb")
    val thumb: String?,
    @SerializedName("strTags")
    val tags: String?,
    @SerializedName("strYoutube")
    val youtube: String?
)
