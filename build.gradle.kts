group = "io.taylor"
version = "1.0-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17 // 자바 버전 설정

plugins {
    id("org.springframework.boot") version "3.1.4" // Spring Boot 플러그인
    id("io.spring.dependency-management") version "1.1.3" // 의존성 관리
    kotlin("jvm") version "1.9.10" // Kotlin JVM 플러그인
    kotlin("plugin.spring") version "1.9.10" // Spring 관련 Kotlin 플러그인
}

repositories {
    mavenCentral() // 의존성 관리용 Maven 중앙 저장소
}

dependencies {
    // Spring Boot Starter
    implementation("org.springframework.boot:spring-boot-starter")

    // Spring Web (REST API)
    implementation("org.springframework.boot:spring-boot-starter-web")

    // Spring Data JPA (데이터베이스 연동)
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")

    // 데이터베이스 드라이버 (예: MySQL)
    runtimeOnly("com.mysql:mysql-connector-j")

    // Kotlin 지원 라이브러리
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    // Spring Boot DevTools (개발 편의성)
    developmentOnly("org.springframework.boot:spring-boot-devtools")

    // Testing 라이브러리
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict") // null-safety 설정
        jvmTarget = "17" // Kotlin 컴파일 대상 JVM 버전
    }
}

tasks.withType<Test> {
    useJUnitPlatform() // JUnit5 테스트 플랫폼 사용
}
