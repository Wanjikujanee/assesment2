fun main() {
    var x=currentAccount(6,"jane",500)
//var p=product(arrayOf("jane",110,200,"groceries"))
   // deposit()
  //  withdraw()


    var names="Akirachix"
    var y=names[0].toString() +names[2] + names[4] + names[6] + names[8]
    println(y)

}
class currentAccount(var number:Int,var name:String,var balance:Int)
fun deposit(amount:Double){
var balance=0.0
    if (amount is Double)
        balance+=amount
    println(balance)

    }
fun withdraw(amount: Double){
    var balance=0.0
    if (amount is Double)
        balance-=amount
    println(balance)


        }
fun details(){



class SavingAccount(number:Int,balance:Int){

}
data class product(var name:String,var weight:Double,var price:Int,var category:String)
fun product(mixedArray:Array<Any>){
    var product=0
  //  product.forEach{multiply->
       // product*=multiply
    }

}












