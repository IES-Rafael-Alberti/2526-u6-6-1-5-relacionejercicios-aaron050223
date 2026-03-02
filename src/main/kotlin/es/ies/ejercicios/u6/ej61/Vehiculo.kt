package es.ies.ejercicios.u6.ej61

open class Vehiculo(val marca: String, motor: Motor): Motor by motor {
    open fun conducir() {
        println("Conduciendo normal...")
    }
}
