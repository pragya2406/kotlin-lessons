package com.pragya.learnkotlin.clsobj

open class Config(
    open val pool: Int
) {// by default every class extends `Any` class

    init {
        println(" Pool is $pool")
    }
    open fun doConfiguration(){

        println("inside Config class")
    }
}
class DbConfig(
     val pl: Int = 10
            //override val pool: Int = 10 // default value
    // overriding the pool variable, sets it back to zero, as in the parent class,
    // it doesn't have an int value
) : Config(pl){
    init{
        println("In Db - $pl")
    }

    override fun doConfiguration() {
        super.doConfiguration()
        println("inside Db Configuration")
        //code for db configuration
    }
}
class FileConfig:Config(23){
    override fun doConfiguration() {
        super.doConfiguration()
        println("inside file configuration")
        //code for file configuration
    }
}

//*multiple inheritance is not possible here. i.e a class having two parent classes

fun main() {
    val cfg1:Config =Config(56)
    //cfg1.doConfiguration()

    val cfg2 : DbConfig = DbConfig(89)
    //cfg2.doConfiguration()

    val cfg3 = FileConfig()
    //cfg3.doConfiguration()

    //val cfg4:Config=DbConfig() //-> similar to val i:Int = 10, where Config/int is the type. and DbConfig/10 is the obect
    //cfg4.doConfiguration()

    //val cfg5:Config= FileConfig()
//    cfg5.doConfiguration()

    //val cfg6: DbConfig = Config() //-> wont work
    //val cfg7: FileConfig = Config() //-> wont work
}