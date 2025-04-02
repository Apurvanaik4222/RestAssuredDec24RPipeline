pipeline {
    agent any

    stages {
        stage('Git Checkout') {
            steps {
                git 'https://github.com/Apurvanaik4222/RestAssuredDec24RPipeline.git'
            }
        }

        stage('Build and Test') {
            steps {
                bat 'mvn clean test'
            }
        }

        stage('Sonar Analysis') {
            steps {
                bat 'mvn sonar:sonar -Dsonar.host.url=http://localhost:9000 -Dsonar.login=squ_75f720a62403db3d2d48bea5bc1138ed5a3ef134'
            }
        }
    }
}
