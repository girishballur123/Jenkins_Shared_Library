// vars/constants.groovy
import groovy.transform.Field

@Field String AWS_ACCOUNT_ID = '816069160812'
@Field String AWS_DEFAULT_REGION = 'ap-south-1'
@Field String IMAGE_REPO_NAME = 'sample-webapp'
@Field String GIT_REPO_URL = 'https://github.com/Sumukha97/sample-webapp.git'

// Jenkins Credential IDs
@Field String GIT_CREDENTIALS_ID = 'jenkinsfile1'
@Field String ECR_CREDENTIALS_ID = 'aws-credentials'

def call() {
    return this
}
