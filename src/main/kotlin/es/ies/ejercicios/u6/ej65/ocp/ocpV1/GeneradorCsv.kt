package es.ies.ejercicios.u6.ej65.ocp.ocpV1

import es.ies.ejercicios.u6.ej64.Resumible

class GeneradorCsv: Generador() {
    override fun generar(
        titulo: String,
        items: List<Resumible>,
    ): String {
        return buildString {
            appendLine("titulo,$titulo")
            appendLine("item")
            for (item in items) appendLine(item.resumen().replace(",", ";"))
        }
    }
}