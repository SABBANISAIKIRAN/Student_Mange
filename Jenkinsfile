pipeline {
    agent any

    tools {
        maven 'Maven 3.9.10' // ✅ Use exact name from Global Tool Config
    }

    stages {
        stage('Clone Repository') {
            steps {
                git 'https://github.com/SABBANISAIKIRAN/Student_Mange.git'
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
                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            }
        }
    }
}
