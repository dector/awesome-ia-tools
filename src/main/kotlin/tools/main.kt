package tools

import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths

fun main() {
    val path = Paths.get("data")

    verifyRepo(path)
    processRepo(path)
}

private fun verifyRepo(path: Path) {
    require(Files.exists(path))
}

private fun processRepo(path: Path) {
    TODO()
}
