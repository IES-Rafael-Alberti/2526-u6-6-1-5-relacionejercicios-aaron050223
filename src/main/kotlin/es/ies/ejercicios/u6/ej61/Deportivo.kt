package es.ies.ejercicios.u6.ej61

class Deportivo(marca: String, motor: Motor): Vehiculo(marca, motor) {
    override fun conducir() {
        println("Conduciendo el $marca rápidamente...")
    }
}