package sample

class HealthOutOfRangeException :
    RuntimeException("Health is out of range (${Spaceship.MIN_HEALTH},${Spaceship.MAX_HEALTH})")
