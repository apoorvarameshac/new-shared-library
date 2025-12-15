def call() {
    echo "Deploying container from image..."
    sh "docker run -d --name simpleapp_container -p 8082:8081 simple-app-img"
    echo "Container deployed: simpleapp_container"
}

