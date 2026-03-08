package es.ies.ejercicios.u6.ej65.srp.srpV1

import es.ies.ejercicios.u6.ej64.PlantillaInforme
import es.ies.ejercicios.u6.ej64.Resumible

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