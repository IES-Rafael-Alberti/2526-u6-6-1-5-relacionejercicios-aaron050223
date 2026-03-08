package es.ies.ejercicios.u6.ej65.ocp.ocpV1

import es.ies.ejercicios.u6.ej64.Resumible

class GenerarMarkdown: Generador() {
    override fun generar(
        titulo: String,
        items: List<Resumible>,
    ): String {
        return buildString {
            appendLine("# $titulo")
            for (item in items) appendLine("- ${item.resumen()}")
        }
    }
}