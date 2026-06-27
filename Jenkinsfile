// Dynamic XML

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

            emailext(

                    subject: "Automation Execution | ${currentBuild.currentResult} | Build #${env.BUILD_NUMBER}",

                    mimeType: 'text/html',

                    body: """
                <html>

                <h2>Automation Execution Report</h2>

                <table border='1' cellpadding='5' cellspacing='0'>

                <tr>
                    <td><b>Project</b></td>
                    <td>${env.JOB_NAME}</td>
                </tr>

                <tr>
                    <td><b>Build Number</b></td>
                    <td>${env.BUILD_NUMBER}</td>
                </tr>

                <tr>
                    <td><b>Suite</b></td>
                    <td>${params.SUITE}</td>
                </tr>

                <tr>
                    <td><b>Status</b></td>
                    <td>${currentBuild.currentResult}</td>
                </tr>

                <tr>
                    <td><b>Build URL</b></td>
                    <td>${env.BUILD_URL}</td>
                </tr>

                </table>

                <br><br>

                Regards,<br>
                QA Automation Team

                </html>
                """,

                    to: "kkrajeev999@gmail.com",

                    attachmentsPattern: "test-output/**/*.html"

            )

        }

    }

}