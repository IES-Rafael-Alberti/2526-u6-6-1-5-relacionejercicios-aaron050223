package es.ies.ejercicios.u6.ej65.srp

import es.ies.ejercicios.u6.ej64.Alumno
import es.ies.ejercicios.u6.ej64.InformeCsv
import es.ies.ejercicios.u6.ej64.InformeMarkdown
import es.ies.ejercicios.u6.ej64.Persona
import es.ies.ejercicios.u6.ej64.RegistroPersonas
import es.ies.ejercicios.u6.ej64.Resumible
import es.ies.ejercicios.u6.ej65.srp.srpV1.*

fun main() {
    val datosPrueba: List<Resumible> = listOf(
        Persona(" Ana ", 20),
        Alumno("Luis", 19, "1DAM"),
        Persona("Marta", 18),
        InformeMarkdown(),
        InformeCsv()
    )

    val registro = RegistroPersonas()
    val procesador = ProcesadorRegistro(registro)
    val logger = Logger()
    val informe = InformeMarkdown()

    val app = InformeAppServiceV1(procesador, informe, logger)

    app.ejecutar(datosPrueba)
}
