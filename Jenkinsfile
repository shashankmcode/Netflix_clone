@Library('library') _
pipeline {
    agent any
    environment {
        SCANNER_HOME=tool 'sonar-scanner'
    }

    stages {
        
        stage('Connect') {
            
            steps {
                
                    git branch: 'main',
                        credentialsId: 'yourCredentialsId', // Add your credentials ID
                        url: 'https://github.com/shashankmcode/Netflix_clone.git'
                
            }
        }
        //stage('Build') {
            
           // steps {
                
              //      buildimage()
                
           // }
       // }
        stage('sonar') {
            
            steps {
                
                  sonarscan()
                
            }
        }
        stage('sonar') {
            
            steps {
                
                  qualitygate()
                
            }
        }
    }
}