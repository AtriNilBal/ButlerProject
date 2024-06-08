pipeline {
	agent any
	stages {
		stage('Unit Testing') {
			steps {
				bat "mvn compile"
			}
		}
		stage('Build') {
			steps {
				bat "mvn clean"
			}
		}
		stage('Deploy') {
			steps {
				echo 'Deploying the code'
			}
		}
		stage('Test') {
			steps {
				bat "mvn test"
			}
		}
		stage('Release') {
			steps{
				echo 'Releasing the project'
			}
		}
	}
}