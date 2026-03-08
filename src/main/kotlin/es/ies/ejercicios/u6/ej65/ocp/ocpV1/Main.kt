package es.ies.ejercicios.u6.ej65.ocp.ocpV1

import es.ies.ejercicios.u6.ej64.InformeCsv
import es.ies.ejercicios.u6.ej64.InformeMarkdown
import es.ies.ejercicios.u6.ej64.Resumible

fun main() {
    val datosPrueba: List<Resumible> = listOf(
        InformeMarkdown(),
        InformeCsv()
    )
    val generador1 = GeneradorInformeV1(GeneradorHtml())
    println(generador1.generarInforme("Prueba 1", datosPrueba))
}