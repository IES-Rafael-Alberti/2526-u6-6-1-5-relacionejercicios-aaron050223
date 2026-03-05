package es.ies.ejercicios.u6.ej65.srp

import es.ies.ejercicios.u6.ej64.Alumno
import es.ies.ejercicios.u6.ej64.InformeCsv
import es.ies.ejercicios.u6.ej64.InformeMarkdown
import es.ies.ejercicios.u6.ej64.Persona
import es.ies.ejercicios.u6.ej64.PlantillaInforme
import es.ies.ejercicios.u6.ej64.RegistroPersonas
import es.ies.ejercicios.u6.ej64.Resumible

/**
 * v0 (mejorable): demasiadas responsabilidades mezcladas:
 * - prepara datos
 * - normaliza y registra personas
 * - genera informe
 * - hace logs
 */

/**
 * VERSIÓN ORIGINAL (V0)
 */
class InformeAppServiceV0 {
    fun ejecutar() {
        println("[SRP:v0] Preparando datos...")
        val items: List<Resumible> = listOf(
            Persona(" Ana ", 20),
            Alumno("Luis", 19, "1DAM"),
            Persona("Marta", 18),
        )

        println("[SRP:v0] Registrando personas...")
        val registro = RegistroPersonas()
        for (item in items) {
            if (item is Persona) registro.registrar(item)
        }

        println("[SRP:v0] Generando informe Markdown...")
        val informe = InformeMarkdown()
        val salida = informe.generar("Listado", items)

        println("[SRP:v0] Resultado:")
        println(salida)

        println("[SRP:v0] Buscar 'ana' -> ${registro.buscar("ana")?.resumen()}")
    }
}


/**
 * VERSIÓN CORREGIDA (V1)
 */
class Logger {
    fun log(mensaje: String) {
        println(mensaje)
    }
}

class ProcesadorRegistro(
    private val registro: RegistroPersonas
) {
    fun registrarDesdeLista(items: List<Resumible>) {
        items.forEach {
            if (it is Persona) registro.registrar(it)
        }
    }
}

class InformeAppServiceV1(
    private val procesador: ProcesadorRegistro,
    private val informe: PlantillaInforme,
    private val logger: Logger
) {
    fun ejecutar(items: List<Resumible>) {
        logger.log("Iniciando...")

        procesador.registrarDesdeLista(items)

        val salida = informe.generar("Informe", items)

        logger.log(salida)
    }
}

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
