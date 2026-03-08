package es.ies.ejercicios.u6.ej65.lsp.lspV1

import es.ies.ejercicios.u6.ej64.Persona

interface IRepositorioPersonasBuscar {
    fun buscar(nombre: String): Persona?
}