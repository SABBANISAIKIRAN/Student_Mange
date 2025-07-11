pipeline {
    agent any

    tools {
        maven 'Maven 3.9.10'   // ✅ Must match the Maven tool name in Jenkins
    }

    environment {
        GIT_REPO = 'https://github.com/SABBANISAIKIRAN/Student_Mange.git'
    }

    stages {
        stage('Clone Repository') {
            steps {
                git branch: 'main', url: "${env.GIT_REPO}"
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Archive JAR') {
            steps {
                archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
            }
        }
    }
}
