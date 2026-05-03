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
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
    }
}