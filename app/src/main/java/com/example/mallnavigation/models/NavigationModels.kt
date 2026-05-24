package com.example.mallnavigation.models

data class Shop(
    val id: String,
    val name: String,
    val floor: Int,
    val x: Double,
    val y: Double,
    val category: String
)

data class RouteRequest(
    val startX: Double,
    val startY: Double,
    val endX: Double,
    val endY: Double,
    val floor: Int
)

data class RouteResponse(
    val points: List<Point>,
    val distance: Double,
    val instructions: List<String>
)

data class Point(
    val x: Double,
    val y: Double,
    val floor: Int
)