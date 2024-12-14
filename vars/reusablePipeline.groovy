// vars/reusablePipeline.groovy

// This method accepts the Git URL and Git Token as parameters
def call(String gitUrl, String gitToken) {
    pipeline {
        agent any // This specifies that the pipeline can run on any available agent

        stages {
            stage('Checkout Code') {
                steps {
                    // Print the Git URL to verify it's being passed correctly
                    echo "Cloning repository: ${gitUrl}"

                    // Use the Git URL and Git Token to checkout the repository
                    checkout([
                            $class: 'GitSCM', // Git source code management
                            branches: [[name: '*/main']], // Specify the branch to checkout
                            userRemoteConfigs: [[
                                                        url: gitUrl, // Use the passed Git URL
                                                        credentialsId: gitToken // Use the passed Git Token (credentials ID)
                                                ]]
                    ])
                }
            }

            // Example build stage
            stage('Build') {
                steps {
                    sh 'mvn clean install'
                }
            }
        }
    }
}
