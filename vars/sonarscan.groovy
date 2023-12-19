def call(){
    withSonarQubeEnv(credentialsId: 'sonar-api') {
    sh 'sonar-scanner'
}
}