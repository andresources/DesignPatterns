package us.patient.app.visitordesignpatten.java

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import us.patient.app.factorydesignpattern.R

class VisitorActivity : AppCompatActivity() {
    //https://integu.net/visitor-pattern/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_visitor)
    }
    fun clickme(view: View) {
        printAreaOfShare(Circle(10),"Circle")
        printAreaOfShare(Triangle(15),"Triangle")
        printAreaOfShare(Square(12),"Square")
    }
    fun printAreaOfShare(visitable: Visitable,share:String){
         var area =AreaOfShapes()
         var res=visitable.accept(area)
         visitable.display(area)
         Log.i("VD","area of ${share} : ${res}")
    }
}