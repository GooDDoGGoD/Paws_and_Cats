plugins {
    id("java")
}

group = "ru.osipov.database"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":Data_Access"))
    implementation(project(":Service"))

    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("org.mockito:mockito-core:3.9.0")
    testImplementation("org.hibernate.orm:hibernate-core:6.6.1.Final")
    testImplementation("com.h2database:h2:2.1.214")
}

tasks.test {
    useJUnitPlatform()
}