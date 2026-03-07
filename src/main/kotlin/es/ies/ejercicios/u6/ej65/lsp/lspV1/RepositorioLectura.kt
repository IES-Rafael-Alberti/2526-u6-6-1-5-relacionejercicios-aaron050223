package es.ies.ejercicios.u6.ej65.lsp.lspV1

import es.ies.ejercicios.u6.ej64.Persona
import es.ies.ejercicios.u6.ej65.lsp.RepositorioPersonasV0

class RepositorioLectura: IRepositorioPersonasGuardar {
    override fun guardar(persona: Persona) {
        throw UnsupportedOperationException("Repositorio en modo solo lectura")
    }
}