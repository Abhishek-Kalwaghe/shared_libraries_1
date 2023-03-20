def download(var_1)
{
  git "https://github.com/Abhishek-Kalwaghe/${var_1}"
}
def build
{
  sh "mvn package"
}
