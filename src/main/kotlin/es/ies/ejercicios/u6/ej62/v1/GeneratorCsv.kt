package es.ies.ejercicios.u6.ej62.v1

class GeneratorCsv: Generator() {
    override fun generate(title: String, lines: List<String>): String {
        return buildString {
            appendLine("title,$title")
            appendLine("line")
            for (line in lines) appendLine(line)
        }
    }
}