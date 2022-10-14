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
                        emailext  body: '', subject: '', to: 'kmilocbc02@gmail.com'
                    }
                }

    }
    post {
        always {
            echo 'Building finished successfully'
                
        }
    }
}
