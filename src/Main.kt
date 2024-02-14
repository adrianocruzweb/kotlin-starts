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

/*open class Dog{
    open fun sayHello() {
        println("wow wow!")
    }
}

class Yorkshire: Dog(){
    override fun sayHello() {
        println("wif wif!")
    }
}*/

open class Tiger(val origin: String) {
    fun sayHello() {
        println("A tiger from $origin says: grrhhh!")
    }
}

class SiberianTiger : Tiger("Siberia")

fun main() {

    val tiger: Tiger = SiberianTiger()
    tiger.sayHello()

    /*val dog: Dog = Yorkshire()
    dog.sayHello()*/

    /*val fruitBag = listOf("bananas", "grapes", "apples", "pears" )

    val clothesBag = listOf("shirts","pants","jeans")

    val cart = listOf(fruitBag,clothesBag)

    val mapBag = cart.map{it}
    val flatMapBag = cart.flatMap { it }

    println(mapBag)
    println(flatMapBag)*/


    /*val numbers = listOf(1,-2,3,-4,5,-6)

    val anyNegative = numbers.any{it<0}

    val anyGT6 = numbers.any { it>6 }

    println(anyNegative)
    println(anyGT6)*/

    /*val doubled = numbers.map { x->x*2 }

    val tripled = numbers.map { it*3 }

    println(doubled)
    println(tripled)*/


    /*val positives = numbers.filter { x->x>0 }

    val negatives = numbers.filter { it<0 }

    println(numbers)
    println(positives)
    println(negatives)*/


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