# Car Rental Speed Monitor - Android App

[![Download README](https://img.shields.io/badge/Download-README.md-blue?style=flat-square)](https://raw.githubusercontent.com/kangkanjr/CarRental/main/README.md)

A minimal Android app that detects speeding vehicles in rental fleets and sends alerts.

## Features
- 🚗 Real-time speed monitoring
- 🔔 Firebase notification system
- ⚡ Simple one-activity implementation
- 📱 Ready for UI expansion

## Core Components
| File | Purpose |
|------|---------|
| `MainActivity.kt` | Entry point with demo scenario |
| `SpeedMonitor.kt` | Speed validation logic |
| `FirebaseNotificationService.kt` | Alert delivery system |

## Usage
1. The app automatically runs a test scenario on launch:
   ```kotlin
   val customer = Customer("C01", "John", 120)
   val vehicle = Vehicle("ABC123").apply { currentSpeed = 130 }
   val rental = Rental("R01", customer, vehicle)
   SpeedMonitor(FirebaseNotificationService()).checkSpeed(rental)
