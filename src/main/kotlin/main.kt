fun main() {
    println("안녕하세요.")
    println("== 게시판 관리 프로그램 시작 ==")

    while ( true ) {
        print("명령어) ")
        readLine()
        val command = readLine()
        println("입력한 명령어 : $command")
    }
    println("== 게시판 관리 프로그램 끝 ==")
}