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
                emailext  body: '', subject: '', to: 'cristiankmilo.cbc@gmail.com'
        }
    }
}
