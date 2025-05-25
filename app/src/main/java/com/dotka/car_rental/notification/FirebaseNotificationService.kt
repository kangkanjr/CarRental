package com.dotka.car_rental.notification

/**
 * Firebase Cloud Messaging (FCM) implementation.
 */
class FirebaseNotificationService : NotificationService {
    override fun notifyRentalCompany(customerName: String, licensePlate: String, speed: Int) {
        println("[Firebase Alert] Speed exceeded by $customerName (Vehicle: $licensePlate) - Speed: $speed km/h")
    }

    override fun warnDriver(customerName: String, speed: Int) {
        println("[Driver Warning] $customerName, slow down! Current speed: $speed km/h")
    }
}