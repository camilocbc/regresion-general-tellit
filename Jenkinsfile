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
                        emailext attachLog: true, attachmentsPattern: '**/phoneNumbers.csv', body: 'holas test', subject: 'TEST', to: 'cristian.buitrago@aldeamo.com, linda.marquez@aldeamo.com'
                    }
                }

    }
    post {
        always {
            echo 'Building finished successfully'
                
        }
    }
}
