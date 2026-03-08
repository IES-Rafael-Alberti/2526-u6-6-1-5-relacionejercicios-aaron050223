package es.ies.ejercicios.u6.ej62.v1

class ReportGeneratorV1(private val generator: Generator) {
    fun report(title: String, lines: List<String>): String {
        return generator.generate(title, lines)
    }
}