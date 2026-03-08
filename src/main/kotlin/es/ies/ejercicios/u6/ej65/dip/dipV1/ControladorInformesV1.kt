package es.ies.ejercicios.u6.ej65.dip.dipV1

import es.ies.ejercicios.u6.ej64.*

class ControladorInformesV1(private val generador: PlantillaInforme) {

    fun imprimirListado(titulo: String, items: List<Resumible>) {
        val salida = generador.generar(titulo, items)
        println(salida)
    }
}