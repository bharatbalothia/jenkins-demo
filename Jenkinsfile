
library identifier: 'bharat-lib', retriever: modernSCM([$class: 'GitSCMSource', credentialsId: '', remote: 'https://github.com/bharatbalothia/jenkins-shared-lib.git', traits: [gitBranchDiscovery()]])

pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
            }
        }
        stage('Test') {            
            steps {
                sayHello 'Bharat Balothia: this is a normal variable call.'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}