def project_token = 'abcdefghijklmnopqrstuvwxyz0123456789ABCDEF'


node(){
  try{
    def buildNum = env.BUILD_NUMBER 
    def branchName= env.BRANCH_NAME
    
    print buildNum
    print branchName

    stage('Env - clone generator'){
      git "https://github.com/abouihia/generator.git"
    }

    stage('Env - run postgres'){
      sh "./generator.sh -p"
      sh "docker ps -a"
      
    }

  } finally {
    sh 'docker rm -f postgres'
    cleanWs()
  }
}



