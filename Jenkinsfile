pipeline {
    agent any

    stages {

        stage('Clone') {
            steps {
                git 'https://github.com/julianageorge/String-Utility-Test.git'
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