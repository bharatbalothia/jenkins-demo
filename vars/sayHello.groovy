def call(String name = 'human') {
    node {
        echo "Hello, ${name}."
    }
}