package es.ies.ejercicios.u6.ej62.v1

import es.ies.ejercicios.u6.ej62.v0.ReportFormatV0

abstract class Generator {
    abstract fun generate(title: String, lines: List<String>): String
}