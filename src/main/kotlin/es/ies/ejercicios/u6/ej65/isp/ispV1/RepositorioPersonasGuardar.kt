package es.ies.ejercicios.u6.ej65.isp.ispV1

import es.ies.ejercicios.u6.ej64.Persona

interface RepositorioPersonasGuardar {
    fun guardar(persona: Persona)
}