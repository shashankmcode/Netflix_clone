def call() {
    sh """
      docker build -t netflix .
      docker build --build-arg TMDB_V3_API_KEY=38794fd417f1e4d997f8297557a52bf0 -t netflix .
    """
}
