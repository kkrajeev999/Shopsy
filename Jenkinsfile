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
                    subject: "Jenkins Test Build #${env.BUILD_NUMBER}",
                    body: """Build Completed

Job : ${env.JOB_NAME}

Status : ${currentBuild.currentResult}

URL : ${env.BUILD_URL}
"""
            )

        }

    }

}