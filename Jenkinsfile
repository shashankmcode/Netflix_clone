@Library('library') _
pipeline {
    agent any
    

    stages {
        
        stage('Build') {
            
            steps {
                
                    git branch: 'main',
                        credentialsId: 'yourCredentialsId', // Add your credentials ID
                        url: 'https://github.com/shashankmcode/Netflix_clone.git'
                
            }
        }
        stage('') {
            
            steps {
                
                    buildimage()
                
            }
        }
    }
}