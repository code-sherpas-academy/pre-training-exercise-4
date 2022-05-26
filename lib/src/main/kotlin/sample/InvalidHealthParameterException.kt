package sample

class InvalidHealthParameterException(health: Int) :
    UnsupportedOperationException("Invalid health parameter: $health") {
}
