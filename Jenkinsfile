pipeline {
    agent any

    tools {
        jdk 'JAVA_HOME' // Matches the name from Global Tool Configuration
        maven 'Maven 3.9.10' // Optional: only if Maven is configured in Jenkins
    }

    environment {
        // Replace with your actual email
        RECIPIENTS = 'sabbanisaikiran@1984.com'
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

    post {
        success {
            mail to: "${env.RECIPIENTS}",
                 subject: "SUCCESS: Jenkins Build #${env.BUILD_NUMBER}",
                 body: "Good job! The build was successful.\nCheck it here: ${env.BUILD_URL}"
        }
        failure {
            mail to: "${env.RECIPIENTS}",
                 subject: "FAILURE: Jenkins Build #${env.BUILD_NUMBER}",
                 body: "Something went wrong.\nCheck the build details: ${env.BUILD_URL}"
        }
    }
}
