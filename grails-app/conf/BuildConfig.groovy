grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"

grails.project.dependency.resolution = {
    // inherit Grails' default dependencies
    inherits("global") {}

    log "warn"

    repositories {
        grailsCentral()
        mavenCentral()
    }
    dependencies {
        compile 'org.gcontracts:gcontracts-core:1.2.9'
    }

    plugins {
        build(":tomcat:$grailsVersion",
              ":release:2.0.3",
              ":rest-client-builder:1.0.2") {

            export = false
        }
    }
}
