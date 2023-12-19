def call() {
   def secrets= 'movieapi'
    withCredentials([string(credentialsId: 'secrets', variable: 'sus')]) {
    
    sh """
      docker build --build-arg TMDB_V3_API_KEY=${sus} -t netflix .
      docker run -d --name netflix -p 8081:80 netflix
    """
}
}
