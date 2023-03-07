def gitCheckout(Map stageParams) {

    checkout ([
        branches: [[name: stageParams.branch]],
        url: [[url: stageParams.url]],
        credentialsID: [[credentialsID: stageParams.credentialsID]]
    ])
}

def setGitUserInfo(String email, String username) {
    sh "git config user.name $(username)"
    sh "git config user.email $(email)"
}



