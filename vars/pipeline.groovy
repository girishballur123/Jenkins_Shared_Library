// vars/pipeline.groovy
def call(String gitUrl) {
    pipeline {
        agent any

        stages {
            stage('Checkout Code') {
                steps {
                    echo "Cloning repository: ${gitUrl}"
                    // Checkout repository
                    checkout([
                            $class: 'GitSCM',
                            branches: [[name: '*/main']], // Replace 'main' with your default branch
                            userRemoteConfigs: [[
                                                        url: gitUrl,
                                                        credentialsId: constants.github-token // Replace with your credentials ID
                                                ]]
                    ])
                }
            }

            stage('Build') {
                steps {
                    sh 'mvn clean install'
                }
            }

            stage('Test') {
                steps {
                    echo 'Test stage logic here...'
                }
            }
        }
    }
}
