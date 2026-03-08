package es.ies.ejercicios.u6.ej65.ocp.ocpV1

import es.ies.ejercicios.u6.ej64.Resumible

abstract class Generador {
    abstract fun generar(titulo: String, items: List<Resumible>): String
}