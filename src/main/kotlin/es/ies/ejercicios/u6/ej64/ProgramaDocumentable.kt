package es.ies.ejercicios.u6.ej64

// Este fichero contiene ejemplos de:
// - herencia (6.1)
// - clase abstracta e interfaces (6.2)
// - constructores e init en herencia (6.3)
//
// Tu tarea (6.4) es:
// - Entender el código y su relación entre clases e interfaces.
// - Mejorar la documentación KDoc donde sea necesario.
// - Añadir comentarios solo cuando aporten valor.
// - Eliminar comentarios innecesarios o redundantes.

/**
 * Representa un elemento que puede generar un resumen en texto.
 */
interface Resumible {
    /**
     * @return Una cadena de texto que resume el objeto.
     */
    fun resumen(): String
}

/**
 * Genera un informe en distintos formatos.
 *
 * Relación con el resto del ejercicio:
 * - [Persona] y [Alumno] implementan [Resumible] y se pueden incluir como elementos del informe.
 *
 * Nota: el método [generar] está bloqueado (no es `open`) para forzar un flujo común
 * y permitir que las subclases solo personalicen las partes variables.
 */
abstract class PlantillaInforme : Resumible {
    /**
     * Crea un informe.
     * @param titulo El título del informe.
     * @param items Lista de elementos que implementan [Resumible].
     * @return El contenido del informe como [String].
     */
    fun generar(titulo: String, items: List<Resumible>): String {
        // Crea el StringBuilder
        val sb = StringBuilder()

        sb.appendLine(cabecera(titulo))

        for (item in items) {
            sb.appendLine(formatearItem(item))
        }

        sb.appendLine(pie())
        return sb.toString() // devolver el string
    }

    protected open fun cabecera(titulo: String): String = titulo

    protected abstract fun formatearItem(item: Resumible): String

    protected open fun pie(): String = "-- fin --"

    override fun resumen(): String = "PlantillaInforme"
}

/**
 * Implementación de informe en formato Markdown.
 */
class InformeMarkdown : PlantillaInforme() {
    override fun cabecera(titulo: String): String = "# $titulo"

    override fun formatearItem(item: Resumible): String = "- ${item.resumen()}"
}

/**
 * Implementación de informe en formato CSV.
 * Cambia las "," por ";" en los resúmenes de los items para que funcione el formato.
 */
class InformeCsv : PlantillaInforme() {
    override fun cabecera(titulo: String): String = "titulo,$titulo\nitem"

    override fun formatearItem(item: Resumible): String = item.resumen().replace(",", ";")
}

/**
 * Representa a alguien identificado por su nombre y edad.
 * @property nombre Nombre completo de la persona.
 * @property edad Edad en años. Si se usa el constructor secundario la edad es 0 por defecto.
 */
open class Persona(
    val nombre: String,
    val edad: Int,
) : Resumible {
    init {
        println("[Persona:init] nombre=$nombre edad=$edad")
    }

    /**
     * Constructor para cuando la edad no es conocida.
     */
    constructor(nombre: String) : this(nombre, edad = 0) {
        println("[Persona:secondary] constructor(nombre)")
    }

    override fun resumen(): String = "$nombre ($edad)"
}

/**
 * Especialización de [Persona] que añade el curso del alumno.
 * @property curso El curso en el que está inscrito el alumno.
 */
class Alumno : Persona {
    val curso: String

    /**
     * Constructor principal.
     * @param nombre Nombre del alumno.
     * @param edad Edad del alumno.
     * @param curso Curso que cursa el alumno.
     */
    constructor(nombre: String, edad: Int, curso: String) : super(nombre, edad) {
        // Asignar curso
        this.curso = curso
        println("[Alumno:secondary] nombre=$nombre edad=$edad curso=$curso")
    }

    /**
     * Constructor para cuando la edad no es conocida.
     */
    constructor(nombre: String, curso: String) : this(nombre, edad = 0, curso = curso) {
        println("[Alumno:secondary] constructor(nombre, curso)")
    }

    override fun resumen(): String = "Alumno: ${super.resumen()} curso=$curso"
}

/**
 * Gestiona una colección de personas asegurando unicidad mediante la normalización de nombres.
 */
class RegistroPersonas {
    private val personasPorNombre = mutableMapOf<String, Persona>()

    /**
     * Añade una persona al registro. Si el nombre ya existe, el registro anterior será sobrescrito.
     */
    fun registrar(persona: Persona) {
        val clave = normalizarNombre(persona.nombre)
        personasPorNombre[clave] = persona
    }

    /**
     * Busca una persona por su nombre.
     * @return La [Persona] encontrada o `null` si no existe en el registro.
     */
    fun buscar(nombre: String): Persona? = personasPorNombre[normalizarNombre(nombre)]

    /**
     * Convierte a minúsculas y elimina espacios sobrantes.
     */
    private fun normalizarNombre(nombre: String): String {
        return nombre.trim().lowercase()
    }
}
