


//Dynamic xml

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

}