@Library('library') _
pipeline {
    agent any
    environment {
        SCANNER_HOME=tool 'sonar-scanner'
        sus = credentials('movieapi')
    }

    stages {
        
        stage('Connect') {
            
            steps {
                
                    git branch: 'main',
                        credentialsId: 'yourCredentialsId', // Add your credentials ID
                        url: 'https://github.com/shashankmcode/Netflix_clone.git'
                
            }
        }
        stage('Build Docker image') {
            
            steps {
                
                    buildimage()
                
            }
        }
        stage('SonarStaticCode Analysis') {
            
            steps {
                
                  sonarscan()
                
            }
        }
        stage('SonarQuality gate Analysis') {
            
            steps {
                
                  qualitygate()
                
            }
        }
        stage('Trivy image scan') {
            
            steps {
                
                  trivy()
                
            }
        }
    }
}