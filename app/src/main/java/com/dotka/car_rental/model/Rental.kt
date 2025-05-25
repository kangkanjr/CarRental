package com.dotka.car_rental.model

/**
 * Represents an ongoing car rental with customer, vehicle, and active status.
 */
data class Rental(
    val rentalId: String,
    val customer: Customer,
    val vehicle: Vehicle,
    var isActive: Boolean = true
) {
    fun endRental() {
        isActive = false
    }
}