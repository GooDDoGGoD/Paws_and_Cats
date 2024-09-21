plugins {
    id("java")
    id("org.springframework.boot") version "3.1.0"
    id("io.spring.dependency-management") version "1.1.0"
}

group = "ru.osipov.database"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":Data_Access"))
    implementation(project(":Data_Transfer"))
    implementation(project(":Service"))
    implementation(project(":Controller"))

    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-data-rest")

    runtimeOnly("org.postgresql:postgresql")

    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("org.mockito:mockito-core:3.9.0")
    testImplementation("org.hibernate.orm:hibernate-core:6.6.1.Final")
    testImplementation("com.h2database:h2:2.1.214")
//    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.test {
    useJUnitPlatform()
}