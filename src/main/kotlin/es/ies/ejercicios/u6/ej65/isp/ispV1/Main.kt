package es.ies.ejercicios.u6.ej65.isp.ispV1

import es.ies.ejercicios.u6.ej64.Persona

fun main() {
    val repo = RepositorioMemoriaV1()
    repo.guardar(Persona("Ana", 20))

    val buscador = BuscadorPersonasV1(repo)
    println("Buscar Ana -> ${buscador.buscar("Ana")?.resumen()}")
}