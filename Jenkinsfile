pipeline {
    agent any

    tools {
        maven 'Maven_3.9.10' // Use the Maven name from Jenkins global tool config
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
