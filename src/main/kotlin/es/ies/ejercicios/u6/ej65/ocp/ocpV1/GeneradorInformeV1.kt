package es.ies.ejercicios.u6.ej65.ocp.ocpV1

import es.ies.ejercicios.u6.ej64.Resumible

class GeneradorInformeV1(private val generadorFormato: Generador) {
    fun generarInforme(titulo: String, items: List<Resumible>): String {
        return generadorFormato.generar(titulo, items)
    }
}