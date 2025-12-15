def call() {
    echo "Deploying container from image..."
    sh "docker run -d --name simpleapp_container simple-app-img"
    echo "Container deployed: simpleapp_container"
}

