@Library('my-share-lib') _
def tools=new org.foo.Bar()


pipeline{
	agent none
	options{
		timestamps()
		skipDefaultCheckout()
		disableConcurrentBuilds()
		timeout(time:1,unit:"HOURS")
	}
	stages{
		stage("GetCode"){
			steps{
				timeout(time:5,unit:"MINUTES"){
					script{
						print("获取代码")
						tools.printMes("获取代码 ","red")
					}
				}
			}
		}

		stage("Build"){
			steps{
				timeout(time:20,unit:"MINUTES"){
					script{
						print("应用打包")
						tools.printMes("应用打包 ","green")
					}
				}
			}
		}

		stage("codeScan"){
			steps{
				timeout(time:30,unit:"MINUTES"){
					script{
						print("代码扫瞄")
						tools.printMes("代码扫瞄 ","blue")
					}
				}
			}
		}
	}

	post{
		always{
			script{
				print("always")
			}
		}

		success{
			script{
				currentBuild.description="\n 构建完成"
			}
		}
		failure{
			script{
				currentBuild.description="\n 构建失败"
			}
		}

		aborted{
			script{
				currentBuild.description="\n 构建取消"
			}
		}
	}
}