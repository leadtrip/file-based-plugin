package wood.mike

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.provider.Property

class FilePlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        def extension = project.extensions.create('thefile', FilePluginExtension)
        project.task 'createFile', {
            doLast {
                def file = project.file(extension.fileName.getOrElse('test.txt' ))
                file.write extension.contents.getOrElse( "How's it going?" )
                println "File ${file} created"
            }
        }
    }
}

interface FilePluginExtension {
    Property<String> getFileName()
    Property<String> getContents()
}