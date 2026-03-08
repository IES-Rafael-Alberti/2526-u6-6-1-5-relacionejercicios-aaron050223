package es.ies.ejercicios.u6.ej65.isp.ispV1

import es.ies.ejercicios.u6.ej64.Persona
import es.ies.ejercicios.u6.ej65.isp.RepositorioPersonasCompletoV0

class BuscadorPersonasV1(private val repo: RepositorioPersonasBuscar) {
    fun buscar(nombre: String): Persona? = repo.buscar(nombre)
}