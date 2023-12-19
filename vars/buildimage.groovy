def call() {
  
    withCredentials([string(credentialsId: 'TMDB_V3_API_KEY', variable: 'TMDB_V3_API_KEY')]) {
    
    sh """
      docker build --build-arg TMDB_V3_API_KEY=${TMDB_V3_API_KEY} -t netflix .
      docker run -d --name netflix -p 8081:80 netflix
    """
}
}
