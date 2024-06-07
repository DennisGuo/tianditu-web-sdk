plugins {
    id("java-library")
}

group = "cn.ghx.tianditu"
version = "1.0.0"

repositories {
    mavenLocal()
    maven(url = "https://mirrors.huaweicloud.com/repository/maven/")
}

dependencies {

    implementation("com.squareup.okhttp3:okhttp:4.12.0")
    implementation("com.google.code.gson:gson:2.11.0")
    implementation("org.slf4j:slf4j-simple:2.0.13")


    compileOnly("org.projectlombok:lombok:1.18.32")
    annotationProcessor("org.projectlombok:lombok:1.18.32")

    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}