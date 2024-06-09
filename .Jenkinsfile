pipeline
{
agent any

stages
{
stage('Build')
{
steps
{
    mvn clean
}

}
stage('deploy')
{
steps{
echo 'deploying the code'
}

}
stage('test')
{
steps{
    mvn test
}

}

stage('Unit Testing')
{
steps{
    mvn compile
}

}
stage('Release')
{
when{
branch "origin/master"
}
steps{
echo 'releasing the project'
}

}



}

}