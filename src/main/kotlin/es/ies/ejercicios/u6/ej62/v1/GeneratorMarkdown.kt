package es.ies.ejercicios.u6.ej62.v1

class GeneratorMarkdown: Generator() {
    override fun generate(title: String, lines: List<String>): String {
        return buildString {
            appendLine("# $title")
            for (line in lines) appendLine("- $line")
        }
    }
}