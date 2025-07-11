pipeline {
    agent any

    tools {
        jdk 'jdk18' // Matches the name from Global Tool Configuration
        maven 'Maven 3.8.5' // Optional: only if Maven is configured in Jenkins
    }

    stages {
        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Archive JAR') {
            steps {
                archiveArtifacts artifacts: '**/target/*.jar', allowEmptyArchive: true
            }
        }
    }
}
