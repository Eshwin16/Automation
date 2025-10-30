pipeline {
    agent any

   

    parameters {
        string(name: 'CUCUMBER_TAGS', defaultValue: '@tag1', description: 'Tags to run')
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/YUVARAJSEKAR12/Jenkin_Cucumber.git'
            }
        }

        stage('Run Cucumber Tests') {
            steps {
                bat "mvn clean test -Dcucumber.filter.tags=${params.CUCUMBER_TAGS}"
            }
        }
    }

    post {
        always {
            junit '**/target/surefire-reports/*.xml'
        }
    }
}
