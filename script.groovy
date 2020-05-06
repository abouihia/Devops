
node {
    try{
          stage('pull'){
              sh 'echo brahim BodyAttak'
          }
           stage('compile'){
              sh 'echo brahim BodyAttak'
          }
          stage('Test'){
              sh 'echo brahim BodyAttak'
          }
           stage('Sonar'){
              sh 'echo brahim BodyAttak'
          }
          stage('Sonar-quality'){
              sh 'echo brahim BodyAttak'
          }
    }finally{
       cleanWs() 
    }
}
