def call() {
    sh """
      docker build --build-arg TMDB_V3_API_KEY=${movieapi} -t netflix .
      docker run -d --name netflix -p 8081:80 netflix
    """
}
