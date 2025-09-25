pipeline {
    agent any
    environment {
                PATH = "/usr/local/bin:${env.PATH}"

                // Define Docker Hub credentials ID
                DOCKERHUB_CREDENTIALS_ID = 'Docker_Miro_Hub'
                // Define Docker Hub repository name
                DOCKERHUB_REPO = 'miro193/temperatureconverter'
                // Define Docker image tag
                DOCKER_IMAGE_TAG = 'latest'
            }
    tools {
        maven 'Maven 3.9.11'
        }
    stages {
        stage ('checking') {
            steps {
                git branch: 'main', url: 'https://github.com/Miro193/TemperatureConverter.git'
                }
            }
        stage ('build') {
            steps {
                sh 'mvn clean package'
                }
            }
        stage('Test') {
            steps {
                 sh 'mvn test'
                 }
            }
        stage('Code Coverage') {
            steps {
                  sh 'mvn jacoco:report'
                  }
            }
        stage('Publish Test Results') {
            steps {
                  junit '**/target/surefire-reports/*.xml'
                  }
            }
        stage('Publish Coverage Report') {
            steps {
                  jacoco()
                  }
            }
            stage('Build Docker Image') {
                  steps {
                      sh 'docker build -t $DOCKERHUB_REPO:$DOCKER_IMAGE_TAG .'
                      }
                 }

            stage('Push Docker Image to Docker Hub') {
                 steps {
                      withCredentials([usernamePassword(credentialsId: "${DOCKERHUB_CREDENTIALS_ID}", usernameVariable: 'DOCKER_USER', passwordVariable: 'DOCKER_PASS')]) {
                           sh '''
                             echo $DOCKER_PASS | docker login -u $DOCKER_USER --password-stdin
                             docker push $DOCKERHUB_REPO:$DOCKER_IMAGE_TAG
                           '''
                           }
                      }
                 }
            }
        }