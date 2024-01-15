def call() {
    withSonarQubeEnv('sonar-server') {
        sh ''' $SCANNER_HOME/bin/sonar-scanner -Dsonar.projectName=Youtube1 -Dsonar.projectKey=Youtube1 '''
    }
}
