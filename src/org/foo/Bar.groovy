package org.foo


def printMes(value,color){
    colors=[
            "red": "\033[40;31m>>>>>>>>>>>>>>>>>${value}<<<<<<<<<<<<<< \033[0m",
            "blue": "\033[47; ${value}  \033[0m",
            "green": "*[1;32m>>>>>>>>>>>>>>>>>${value}<<<<<<<<<<<<<< *[m",
            "green1": "\033[40;32m>>>>>>>>>>>>>>>>>${value}<<<<<<<<<<<<<< \033[0m"
    ]
    ansiColor('xterm') {
        println(colors[color])
    }
}