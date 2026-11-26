pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                bat 'mvn -version'
                bat 'mvn clean package'
            }
        }

        stage('Verify') {
            steps {
                echo 'Student Registration project build completed successfully!'
            }
        }
    }
}
