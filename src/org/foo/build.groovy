package org.foo

def Build(buildType,buildShell){
    def buildTools=["mvn":"M2","ant":"ANT","gradle":"GRADLE","npm":"NODE"]
    println("当前选择的构建类型是${buildType}")
    buildHome=tool buildTools[buildType]
    if("${buildType}"=="npm"){
        sh "export NODE_HOME=${buildHome} && export PATH=\$NODE_HOME/bin:\$PATH &&${NODE_HOME}/bin/npm ${buildShell}"
    }else{
        println(buildHome)
        sh "${buildHome}/bin/${buildType} ${buildShell}"
    }
}