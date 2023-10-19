package us.patient.app.singletonpattern

class MySingletonCls private constructor(){
    init { //Reflection API Proof
        instance?.let {
            throw RuntimeException("Already instantiate")
        }
    }
    companion object{
        @Volatile private var instance: MySingletonCls? = null
        //Volatile - makes sure that the changes made in one thread are immediately reflect in other thread
        public fun getInstance() : MySingletonCls =
           instance?: synchronized(MySingletonCls::class.java){ //Thread Safe,
               instance?: MySingletonCls().also {
                   instance = it //update instance variable from null to obj at first time.
               }
            }
    }
}

fun main(){
    println(MySingletonCls.getInstance().hashCode())
    println(MySingletonCls.getInstance().hashCode())
    println(MySingletonCls.getInstance().hashCode())
}