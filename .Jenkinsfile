pipeline
{
agent any

stages
{
stage('Build')
{
steps
{
    bat "mvn clean"
}

}
stage('deploy')
{
steps{
bat "echo 'deploying the code'"
}

}
stage('test')
{
steps{
    bat "mvn test"
}

}

stage('Unit Testing')
{
steps{
    bat "mvn compile"
}

}
stage('Release')
{
when{
branch "origin/master"
}
steps{
	bat "echo 'releasing the project'"
}

}



}

}