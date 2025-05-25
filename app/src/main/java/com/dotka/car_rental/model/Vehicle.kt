package com.dotka.car_rental.model

/**
 * Represents a vehicle with current speed tracking.
 */
data class Vehicle(
    val licensePlate: String,
    var currentSpeed: Int = 0 // mutable for speed updates
)