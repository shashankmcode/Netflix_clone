def call(){
    withSonarQubeEnv(credentialsId: 'sonar-api') {
    sh ''' $SCANNER_HOME/bin/sonar-scanner -Dsonar.projectName=Netflix \
                    -Dsonar.projectKey=Netflix '''
}
}