def download(var_1)
{
  git "https://github.com/Abhishek-Kalwaghe/${var_1}"
}
def build()
{
  sh "mvn package"
}
def deploy(pipe_name,ip,context)
{
  sh "scp /var/lib/jenkins/workspace/${pipe_name}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${context}"

}
def testing(var)
{
  sh "java -jar /var/lib/jenkins/workspace/${var}/testing.jar"
}
