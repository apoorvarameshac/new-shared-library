def call() {
    echo "==== Build Stage ===="

    sh 'echo Building the application...'

    sh 'docker build -t simple-app-img .'
    echo "Docker image simple-app-img built"
}

