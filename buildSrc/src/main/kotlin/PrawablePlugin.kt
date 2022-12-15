import org.gradle.api.Plugin
import org.gradle.api.Project
import java.io.File
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.StandardOpenOption

class PrawablePlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            tasks.register("create") {
                // Copy resource to debug
                copy {
                    from("${rootDir.path}\\image\\resource\\src\\main\\res\\drawable")
                    into("${rootDir.path}\\image\\debug\\src\\main\\res\\drawable")
                }

                // Copy resource to release
                copy {
                    from("${rootDir.path}\\image\\resource\\src\\main\\res\\drawable")
                    into("${rootDir.path}\\image\\release\\src\\main\\assets")
                }

                generate(rootDir.path)
            }
        }
    }

    private fun generate(dir: String) {
        val images = File("$dir\\image\\resource\\src\\main\\res\\drawable")
        val path = "$dir\\image\\config\\src\\main\\kotlin\\DrawableConfig.kt"
        
        val file = File(path)

        if (!file.exists()) {
            file.createNewFile()
        } else {
            file.delete()
            file.createNewFile()
        }

        val outputStream = file.outputStream()
        val writer = outputStream.writer()

        writer.write("package com.mafia.prawable.image.config\n\n")
        writer.write("enum class DrawableConfig(val prefix: String) {\n")

        for (image in images.list()!!) {
            val (name, prefix) = image.split(".")
            writer.write("\t$name(\"$prefix\"),\n")
        }
        writer.write("}")
        writer.close()
    }
}