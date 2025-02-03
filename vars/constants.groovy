// vars/constants.groovy
import groovy.transform.Field

@Field String AWS_ACCOUNT_ID = '816069160812'
@Field String AWS_DEFAULT_REGION = 'ap-south-1'
@Field String IMAGE_REPO_NAME = 'sample-webapp'
@Field String GIT_REPO_URL = 'https://github.com/Sumukha97/sample-webapp.git'

// Jenkins Credential IDs
@Field String GIT_CREDENTIALS_ID = 'jenkinsfile1'
@Field String ECR_CREDENTIALS_ID = 'aws ecr get-login-password --region ap-south-1 | docker login --username AWS --password-stdin 816069160812.dkr.ecr.ap-south-1.amazonaws.com'

def call() {
    return this
}
