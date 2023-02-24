# LibCool


## 关于集成：
- **在项目的根目录的`build.gradle`添加：**
```
allprojects {
    repositories {
        // central仓和jcenter仓的聚合仓
        maven { url 'https://maven.aliyun.com/repository/public' }
        // https://repo1.maven.org/maven2/
        maven { url 'https://maven.aliyun.com/repository/central' }
        // http://jcenter.bintray.com/
        maven { url 'https://maven.aliyun.com/repository/jcenter' }
        // https://maven.google.com/
        maven { url 'https://maven.aliyun.com/repository/google' }
        // https://plugins.gradle.org/m2/
        maven { url 'https://maven.aliyun.com/repository/gradle-plugin' }
        // http://repo.spring.io/libs-milestone/
        maven { url 'https://maven.aliyun.com/repository/spring' }
        // http://repo.spring.io/plugins-release/
        maven { url 'https://maven.aliyun.com/repository/spring-plugin' }
        // https://repo.grails.org/grails/core
        maven { url 'https://maven.aliyun.com/repository/grails-core' }
        // https://repository.apache.org/snapshots/
        maven { url 'https://maven.aliyun.com/repository/apache-snapshots' }

        maven { url 'https://jitpack.io' }
        maven { url 'https://maven.google.com' }
        maven { url 'https://dl.google.com/dl/android/maven2/' }
        mavenCentral()
        google()
    }
}
```
- **在应用模块的`build.gradle`添加：**
```
dependencies {
    implementation 'io.github.yfcyfc123234:lib-cool:1.0.0'
}
```
