package es.ies.ejercicios.u6.ej65.ocp.ocpV1

import es.ies.ejercicios.u6.ej64.Resumible

class GeneradorHtml: Generador() {
    override fun generar(
        titulo: String,
        items: List<Resumible>,
    ): String {
        return buildString {
            appendLine("<h1>$titulo</h1>")
            for (item in items) appendLine("<li> ${item.resumen()} </li>")
        }
    }
}