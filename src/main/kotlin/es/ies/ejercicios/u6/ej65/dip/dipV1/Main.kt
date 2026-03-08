package es.ies.ejercicios.u6.ej65.dip.dipV1

import es.ies.ejercicios.u6.ej64.*

fun main() {
    val listaPersonas = listOf(
        Persona("Ana", 20),
        Persona("Luis", 19),
        Alumno("Sofía", 22, "2º DAM")
    )

    val controladorCsv = ControladorInformesV1(InformeCsv())
    println("CSV...")
    controladorCsv.imprimirListado("Listado Alumnos", listaPersonas)

    val controladorMarkdown = ControladorInformesV1(InformeMarkdown())
    println("\nMarkdown...")
    controladorMarkdown.imprimirListado("Listado Alumnos", listaPersonas)
}
