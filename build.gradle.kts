plugins {
    id("java-library")
    id("maven-publish")
}

group = "cn.x-xi.sdk"
version = "1.0.0"

repositories {
    mavenLocal()
    maven(url = "https://mirrors.huaweicloud.com/repository/maven/")
}

dependencies {

    implementation("com.squareup.okhttp3:okhttp:4.12.0")
    implementation("com.google.code.gson:gson:2.11.0")
    implementation("com.fasterxml.jackson.dataformat:jackson-dataformat-xml:2.17.1")
    implementation("org.slf4j:slf4j-api:2.0.13")

    compileOnly("org.projectlombok:lombok:1.18.32")
    annotationProcessor("org.projectlombok:lombok:1.18.32")

    testImplementation("org.slf4j:slf4j-simple:2.0.13")
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}
java {
    withJavadocJar()
    withSourcesJar()
}
publishing {
    publications {
        create<MavenPublication>("library") {
            from(components["java"])
            pom {
                name = "tianditu-web-sdk"
                description = "Java SDK for Tianditu Web API"
                url = "https://github.com/DennisGuo/tianditu-web-sdk"
                licenses {
                    license {
                        name = "The Apache License, Version 2.0"
                        url = "http://www.apache.org/licenses/LICENSE-2.0.txt"
                    }
                }
                developers {
                    developer {
                        id = "ghx"
                        name = "ghx"
                        email = "839198837@qq.com"
                    }
                }
                scm {
                    connection = "scm:git:git://github.com/DennisGuo/tianditu-web-sdk.git"
                    developerConnection = "scm:git:ssh://github.com/DennisGuo/tianditu-web-sdk.git"
                    url = "https://github.com/DennisGuo/tianditu-web-sdk"
                }
            }
        }
    }
    repositories {
        maven {
            url = uri(layout.buildDirectory.dir("publishing-repository"))
        }
    }
}