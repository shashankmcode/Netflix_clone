def call() {
    sh """
      docker build -t netflix .
      docker run -d --name netflix -p 8081:80 netflix
    """
}
