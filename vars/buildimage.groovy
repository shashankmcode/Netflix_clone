def call() {
    withCredentials([string(credentialsId: 'movieapi', variable: 'sus')]) {
    
    sh """
      docker build --build-arg TMDB_V3_API_KEY=${sus} -t netflix .
      docker run -d --name netflix -p 8081:80 netflix
    """
}
}
