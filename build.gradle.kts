plugins {
    kotlin("jvm") version "1.8.10"
    id("com.apollographql.apollo3") version "3.8.2"
}

allprojects {
    repositories {
//        mavenLocal()
        google()
        mavenCentral()
    }
}

dependencies {
    implementation("com.apollographql.apollo3", "apollo-runtime")
}

apollo {
    service("main") {
        packageName.set("com.example.generated")
        srcDir("src/main/graphql/main")
        introspection {
            endpointUrl.set("https://apollo-fullstack-tutorial.herokuapp.com/graphql")
            schemaFile.set(file("src/main/graphql/main/schema.graphqls"))
        }
    }
    service("resume") {
        packageName.set("com.example.resume.generated")
        srcDir("src/main/graphql/resume")
        introspection {
            endpointUrl.set("http://server.jraf.org:4000/")
            schemaFile.set(file("src/main/graphql/resume/schema.graphqls"))
        }
        codegenModels.set("responseBased")
    }
}
