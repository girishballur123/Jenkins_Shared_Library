// vars/reusablePipeline.groovy
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
                            branches: [[name: '*/main']], // Replace with your branch name
                            userRemoteConfigs: [[
                                                        url: gitUrl,
                                                        credentialsId: 'github-token' // Replace with your credentials ID
                                                ]]
                    ])
                }
            }

            stage('Build') {
                steps {
                    sh 'mvn clean install'
                }
            }
        }
    }
}
