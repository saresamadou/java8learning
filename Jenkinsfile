pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        build 'Build'
      }
    }
    stage('Test') {
      steps {
        build 'Test'
      }
    }
    stage('Deploy') {
      steps {
        build 'Deploy'
      }
    }
  }
}