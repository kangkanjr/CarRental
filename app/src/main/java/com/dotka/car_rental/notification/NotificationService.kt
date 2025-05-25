package com.dotka.car_rental.notification

/**
 * Contract for sending notifications to rental company and driver.
 */
interface NotificationService {
    fun notifyRentalCompany(customerName: String, licensePlate: String, speed: Int)
    fun warnDriver(customerName: String, speed: Int)
}