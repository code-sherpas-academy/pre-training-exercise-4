package sample

class InvalidHealthParameterException(health: Int) :
    UnsupportedOperationException("Invalid health parameter: $health. Health must be greater than 0") {
}
