package com.github.guozhaoxin.idepluginlearning.services

import com.github.guozhaoxin.idepluginlearning.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
