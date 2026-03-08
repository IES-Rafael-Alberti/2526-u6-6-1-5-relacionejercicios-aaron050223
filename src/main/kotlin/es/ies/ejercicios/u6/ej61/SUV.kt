package es.ies.ejercicios.u6.ej61

class SUV(marca: String, motor: Motor): Vehiculo(marca, motor) {
    override fun conducir() {
        println("Conduciendo $marca cómodamente...")
    }
}