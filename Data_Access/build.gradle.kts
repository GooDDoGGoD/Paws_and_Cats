plugins {
    id("java")
}

group = "ru.osipov.database"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.hibernate.orm:hibernate-core:6.6.1.Final")
    implementation("org.postgresql:postgresql:42.7.2")
    implementation("javax.persistence:javax.persistence-api:2.2")
}