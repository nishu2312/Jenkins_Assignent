pipeline {
    agent any
    tools {
        maven 'MAVEN_HOME'
    }
    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/nishu2312/Jenkins_Assignent.git', branch:'main'
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
    }
    post {
        success {
            junit '**/target/surefire-reports/*.xml'
        }
    }
}
