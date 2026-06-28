pipeline {

    agent any

    stages {

        stage('Execute TestNG Suite') {

            steps {

                echo "Selected Suite is: ${params.SUITE}"

                bat "mvn clean test -DsuiteXmlFile=testng/${params.SUITE}.xml"

            }

        }

    }

    post {

        always {

            mail(
                    to: 'kkrajeev999@gmail.com',

                    subject: "Automation Execution | ${currentBuild.currentResult} | Build #${env.BUILD_NUMBER}",

                    body: """

===================================================

            AUTOMATION EXECUTION REPORT

===================================================

Project          : ${env.JOB_NAME}

Build Number     : ${env.BUILD_NUMBER}

Execution Suite  : ${params.SUITE}

Build Status     : ${currentBuild.currentResult}

Build URL

${env.BUILD_URL}

===================================================

Regards,

QA Automation Team

===================================================

"""
            )
        }}}