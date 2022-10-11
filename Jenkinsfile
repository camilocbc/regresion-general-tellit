pipeline {
    agent any
    tools{
        maven 'MAVEN'
    }
    stages {

        stage('Maven Compile') {
            steps {
                echo 'MAVEN COMPILE'
                   sh 'mvn clean'
            }
        }
        stage ('Send Message or View Report'){
                    steps {
                        script {
                            sh 'mvn test '
                        }
                    }
                }

    }
    post {
        always {
            echo 'Building finished successfully'
            emailext body: "${currentBuild.currentResult}: Job ${env.JOB_NAME} build ${env.BUILD_NUMBER}\n More info at: ${env.BUILD_URL}", recipientProviders: [buildUser()],
            from: 'info', attachmentsPattern: '**/Evidencia', replyTo: '', subject: "Jenkins Build ${currentBuild.currentResult}: Job ${env.JOB_NAME}", to: 'cristian.buitrago@aldeamo.com'
        }
    }
}
