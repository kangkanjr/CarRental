package com.dotka.car_rental.model

/**
 * Represents a car rental customer with a unique ID, name, and assigned speed limit.
 */
data class Customer(
    val id: String,
    val name: String,
    var maxSpeedLimit: Int // mutable for setting max speed limits
)