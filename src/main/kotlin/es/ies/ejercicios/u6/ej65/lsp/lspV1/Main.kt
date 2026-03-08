package es.ies.ejercicios.u6.ej65.lsp.lspV1

import es.ies.ejercicios.u6.ej65.lsp.lspV1.*

fun main() {
    println("[LSP:v1] Repositorio normal (ok)")
    cliente(RepositorioCompleto())

//    println("\n[LSP:v1] Repositorio solo lectura (rompe sustitución)")
//    try {
//        cliente(RepositorioLectura())
//    } catch (e: Exception) {
//        println("ERROR: ${e::class.simpleName}: ${e.message}")
//    }
}