package es.ies.ejercicios.u6.ej65.srp.srpV1

import es.ies.ejercicios.u6.ej64.Persona
import es.ies.ejercicios.u6.ej64.RegistroPersonas
import es.ies.ejercicios.u6.ej64.Resumible
import kotlin.collections.forEach

class ProcesadorRegistro(
    private val registro: RegistroPersonas
) {
    fun registrarDesdeLista(items: List<Resumible>) {
        items.forEach {
            if (it is Persona) registro.registrar(it)
        }
    }
}