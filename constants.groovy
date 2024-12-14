// vars/constants.groovy
import groovy.transform.Field

@Field String gitUrl = "https://github.com/devops5014/sample-webapp.git"
@Field String token = "github-token"

def getGitUrl() {
    return gitUrl
}

def getToken() {
    return token
}
