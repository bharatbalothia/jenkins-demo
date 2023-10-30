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
                echo 'Testing..'
                // script {
                //     def rootDir = pwd()
                //     println("Current Directory: " + rootDir)
                //     def log = load "${rootDir}/vars/Utils.groovy"
                //     log.readPrint()
                //     // log.info 'Starting'
                //     // log.warning 'Nothing to do!'

                // }

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