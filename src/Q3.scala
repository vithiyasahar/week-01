object Q3 extends App {
  def onebookcost(x:Double):Double= (x - x*40/100)
  def shoppingcost(y:Int)=3 + (y-50)*0.75
  def totalcost(s:Double,r:Int):Double= onebookcost(s)*r + shoppingcost(r)
  println(onebookcost(24.95))
  println(shoppingcost(60))
  println(totalcost(24.95,60))



}
