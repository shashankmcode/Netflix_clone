def call(){
    sh """
        trivy image netflix > result.txt
        cat result.txt
    """
}