package com.dotka.car_rental.service

import com.dotka.car_rental.exception.SpeedExceededException
import com.dotka.car_rental.model.Rental
import com.dotka.car_rental.notification.NotificationService

/**
 * Monitors vehicle speed and triggers alerts if the limit is exceeded.
 */
class SpeedMonitor(private val notificationService: NotificationService) {

    /**
     * Checks if the current speed exceeds the customer's limit.
     * @throws SpeedExceededException if speed > limit
     */
    fun checkSpeed(rental: Rental) {
        val currentSpeed = rental.vehicle.currentSpeed
        val speedLimit = rental.customer.maxSpeedLimit

        if (currentSpeed > speedLimit) {
            // Notify rental company
            notificationService.notifyRentalCompany(
                rental.customer.name,
                rental.vehicle.licensePlate,
                currentSpeed
            )

            // Warn the driver
            notificationService.warnDriver(
                rental.customer.name,
                currentSpeed
            )

            throw SpeedExceededException(
                "Speed limit exceeded: $currentSpeed km/h (Limit: $speedLimit km/h)"
            )
        }
    }
}