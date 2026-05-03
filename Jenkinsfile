pipeline {
    agent any

    stages {
        stage('Clone') {
            steps {
                git 'https://github.com/julianageorge/Testing_Assignment.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
    }
}