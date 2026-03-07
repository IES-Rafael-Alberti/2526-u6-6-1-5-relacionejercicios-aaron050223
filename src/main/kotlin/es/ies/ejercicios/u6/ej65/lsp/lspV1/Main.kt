package es.ies.ejercicios.u6.ej65.lsp.lspV1

import es.ies.ejercicios.u6.ej65.lsp.RepositorioPersonasV0
import es.ies.ejercicios.u6.ej65.lsp.RepositorioSoloLecturaV0
import es.ies.ejercicios.u6.ej65.lsp.cliente

fun main() {
    println("[LSP:v1] Repositorio normal (ok)")
    cliente(RepositorioCompleto())

    println("\n[LSP:v1] Repositorio solo lectura (rompe sustitución)")
    try {
        cliente(RepositorioSoloLecturaV0())
    } catch (e: Exception) {
        println("ERROR: ${e::class.simpleName}: ${e.message}")
    }
}