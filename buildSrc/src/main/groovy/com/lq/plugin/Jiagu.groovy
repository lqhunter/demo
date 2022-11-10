package com.lq.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class Jiagu implements Plugin<Project> {

    @Override
    void apply(Project project) {
        JiaguExt ext = project.getExtensions().create('jiagu', JiaguExt)
        project.afterEvaluate {
            print("xxx${ext.userName}")
        }
    }
}