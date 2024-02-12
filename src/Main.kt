//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*val systemUsers: MutableList<Int> = mutableListOf(1,2,3)
val sudoers: List<Int> = systemUsers

fun addSystemUsers(newUser: Int) {
    systemUsers.add(newUser)
}

fun getSysSudoers(): List<Int> {
    return sudoers
}*/

/*val openIssues: MutableSet<String> = mutableSetOf("uniqueDescr1", "uniqueDescr2", "uniqueDescr3")

fun addIssue(uniqueDesc: String): Boolean {
   return openIssues.add(uniqueDesc)
}

fun getStatusLog(isAdded: Boolean): String {
    return if (isAdded) "Restered correctly." else "marked as duplicate and rejected."
}*/

/*const val POINT_X_PASS: Int = 15
val EZPassAccounts: MutableMap<Int, Int> = mutableMapOf(1 to 100, 2 to 100, 3 to 100)
val EZPassRapport: Map<Int, Int> = EZPassAccounts

fun updatePointsCredit(accountId: Int) {
    if(EZPassAccounts.containsKey(accountId)) {
        println("Updating account...")
        EZPassAccounts[accountId] = EZPassAccounts.getValue(accountId) + POINT_X_PASS
    } else {
        println("Error: Trying to update a non-existing account (id: $accountId)")
    }
}

fun accountsRepport() {
    println("EZ-Pass report:")
    EZPassRapport.forEach {
        k,v -> println("ID $k: credit $v")
    }
}*/

fun main() {
    val numbers = listOf(1,-2,3,-4,5,-6)

    val positives = numbers.filter { x->x>0 }

    val negatives = numbers.filter { it<0 }

    println(numbers)
    println(positives)
    println(negatives)


    /*accountsRepport()
    updatePointsCredit(1)
    updatePointsCredit(1)
    updatePointsCredit(5)
    accountsRepport()*/


    /*val aNewIssue: String = "uniqueDescr4"
    val anIssueAlreadyIn: String = "uniqueDescr2"

    println("Issue $aNewIssue ${getStatusLog(addIssue(aNewIssue))}")
    println("Issue $anIssueAlreadyIn ${getStatusLog(addIssue(anIssueAlreadyIn))}")
    */


    /*addSystemUsers(4)
    println("Tot sudoers: ${getSysSudoers().size}")
    getSysSudoers().forEach {
        i -> println("Some useful info on user $i")
    }*/

    /*val name = "Kotlin"
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    println("Hello, " + name + "!")

    for (i in 1..5) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        println("i = $i")
    }*/

}