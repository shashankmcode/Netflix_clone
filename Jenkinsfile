@Library('library') _
pipeline {
    agent any
    

    stages {
        
        stage('Connect') {
            
            steps {
                
                    git branch: 'main',
                        credentialsId: 'yourCredentialsId', // Add your credentials ID
                        url: 'https://github.com/shashankmcode/Netflix_clone.git'
                
            }
        }
        stage('Build') {
            
            steps {
                
                    buildimage()
                
            }
        }
        stage('sonar') {
            
            steps {
                
                  sonarscan()
                
            }
        }
    }
}