/*pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                bat 'mvn clean test -DsuiteXmlFile=testng/Smoke.xml'
            }
        }
    }
}*/


//Dynamic xml

pipeline {

    agent any

    stages {

        stage('Print Suite') {

            steps {

                echo "Selected Suite is: ${params.SUITE}"

            }

        }

    }

}