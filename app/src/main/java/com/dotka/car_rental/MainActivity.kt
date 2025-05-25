package com.dotka.car_rental

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dotka.car_rental.model.Customer
import com.dotka.car_rental.model.Rental
import com.dotka.car_rental.model.Vehicle
import com.dotka.car_rental.notification.FirebaseNotificationService
import com.dotka.car_rental.service.SpeedMonitor

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val customer = Customer("C01", "John", 120)
        val vehicle = Vehicle("ABC123").apply { currentSpeed = 130 }
        val rental = Rental("R01", customer, vehicle)

        // Monitor speed
        val speedMonitor = SpeedMonitor(FirebaseNotificationService())

        try {
            speedMonitor.checkSpeed(rental)
        } catch (e: Exception) {
            println("Alert: ${e.message}")
        }
    }
}