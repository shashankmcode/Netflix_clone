def call() {
  
    withCredentials([string(credentialsId: 'TMDB_V3_API_KEY', variable: 'TMDB_V3_API_KEY')]) {
    
    sh """
      docker rmi -f netflix
      docker build --build-arg TMDB_V3_API_KEY=\$TMDB_V3_API_KEY -t netflix .
      
    """
}
}
