package es.ies.ejercicios.u6.ej62.v1

fun main() {
    val generatorMd = ReportGeneratorV1(GeneratorMarkdown())
    val generatorCsv = ReportGeneratorV1(GeneratorCsv())
    val lines = listOf("Primera línea", "Segunda línea", "Tercera línea")

    println("[v1] Generando CSV...")
    println(generatorCsv.report(title = "Informe", lines = lines))

    println("[v1] Generando Markdown...")
    println(generatorMd.report(title = "Informe", lines = lines))
}

