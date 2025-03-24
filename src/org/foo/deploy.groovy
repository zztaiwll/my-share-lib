package src.org.foo

def ansibleDeploy(host,func){
    sh "ansible ${func} ${host}"
}