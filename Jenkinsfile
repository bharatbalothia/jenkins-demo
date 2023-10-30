pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
            }
        }
        stage('Test') {
            
            sayHello 'Bharat Balothia: this is a normal variable call.'

        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}