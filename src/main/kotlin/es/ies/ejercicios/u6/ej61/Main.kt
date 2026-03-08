package es.ies.ejercicios.u6.ej61

fun main() {
    println("--- DEPORTIVO ---")
    val tesla = Deportivo("Tesla", MotorElectrico())
    tesla.arrancar()
    tesla.conducir()
    tesla.apagar()
    println("--- SUV ---")
    val jeep = SUV("Jeep", MotorCombustion())
    jeep.arrancar()
    jeep.conducir()
    jeep.apagar()
}