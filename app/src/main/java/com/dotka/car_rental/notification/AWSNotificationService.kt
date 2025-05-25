package com.dotka.car_rental.notification

/**
 * AWS SNS/Pinpoint implementation (simulated).
 */
class AWSNotificationService : NotificationService {
    override fun notifyRentalCompany(customerName: String, licensePlate: String, speed: Int) {
        println("[AWS SNS Alert] $customerName exceeded speed limit ($speed km/h) in vehicle $licensePlate")
    }

    override fun warnDriver(customerName: String, speed: Int) {
        println("[AWS Pinpoint] Warning: $customerName, you're speeding ($speed km/h)")
    }
}