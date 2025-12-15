def call() {
    echo "Deploying container from image..."
    sh "docker run -d --name simpleapp_container simpleapp:latest"
    echo "Container deployed: simpleapp_container"
}

