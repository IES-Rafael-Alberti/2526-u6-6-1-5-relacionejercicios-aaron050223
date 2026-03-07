package es.ies.ejercicios.u6.ej65.lsp

import es.ies.ejercicios.u6.ej64.Persona
import es.ies.ejercicios.u6.ej65.lsp.lspV1.RepositorioCompleto

fun cliente(repo: RepositorioCompleto) {
    repo.guardar(Persona("Ana", 20))
    println("Buscar Ana -> ${repo.buscar("Ana")?.resumen()}")
}