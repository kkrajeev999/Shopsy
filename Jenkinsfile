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
                    to: 'kkrajeev999@gmail.com',
                    subject: "Automation Execution Completed - ${currentBuild.currentResult}",
                    mimeType: 'text/html',
                    body: """
                <html>
                <body>

                <h2>Automation Execution Completed</h2>

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

                </body>
                </html>
                """
            )

        }

    }

}