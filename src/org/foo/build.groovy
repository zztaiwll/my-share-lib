package org.foo

def Build(buildType,buildShell){
    def buildTools=["mvn":"M2","ant":"ANT","gradle":"GRADLE"]
    println("当前选择的构建类型是${buildType}")
    buildHome=tool buildTools[buildType]
    println(buildHome)
    sh "${buildHome}/bin/${buildType} ${buildShell}"
}