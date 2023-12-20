def call(){
    sh 'docker run -d --name netflix -p 8081:80 netflix'
}