package com.github.sasensi.jetbrainsangularplugin.services

import com.intellij.openapi.project.Project
import com.github.sasensi.jetbrainsangularplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
