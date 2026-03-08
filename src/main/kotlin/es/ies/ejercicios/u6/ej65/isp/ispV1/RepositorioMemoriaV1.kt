package es.ies.ejercicios.u6.ej65.isp.ispV1

import es.ies.ejercicios.u6.ej64.Persona
import kotlin.collections.set

class RepositorioMemoriaV1: RepositorioPersonasGuardar, RepositorioPersonasBuscar, RepositorioPersonasExportarCsv, RepositorioPersonasBorrarTodo {
    private val map = mutableMapOf<String, Persona>()

    override fun guardar(persona: Persona) {
        map[persona.nombre] = persona
    }

    override fun buscar(nombre: String): Persona? = map[nombre]

    override fun exportarCsv(): String =
        buildString {
            appendLine("nombre,edad")
            for (p in map.values) appendLine("${p.nombre},${p.edad}")
        }

    override fun borrarTodo() {
        map.clear()
    }
}