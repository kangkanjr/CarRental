package com.dotka.car_rental.exception

/**
 * Thrown when a vehicle exceeds its assigned speed limit.
 */
class SpeedExceededException(message: String) : RuntimeException(message)