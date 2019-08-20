package com.learning.self

object GameCandiadateCode {

  def main(args: Array[String]) {

    val numTestCasesTotal=2
    var numTestCasesCurrent=numTestCasesTotal
    val numVillanPlayers=Array(6,5)
    val maxEnergy=100000
    val maxStrength=1
    var energySingleVillanTestTotalTemp:Int=0
    var energySinglePlayerTestTotalTemp:Int=0
    val listVillanEnergy= Seq(Array(10,20,50,100,500,400),Array(10,20,30,40,50))
    val listPlayerEnergy=Seq(Array(30,20,60,70,90,490),Array(40,50,60,70,80))

      for (j <- 0 to (numTestCasesTotal-1) )
      {
        energySinglePlayerTestTotalTemp=0
        energySingleVillanTestTotalTemp=0
        for (i <-listPlayerEnergy(j))
          energySinglePlayerTestTotalTemp = energySinglePlayerTestTotalTemp + i


        for (i <-listVillanEnergy(j))
            energySingleVillanTestTotalTemp=energySingleVillanTestTotalTemp+i

        if(energySingleVillanTestTotalTemp<energySinglePlayerTestTotalTemp)
          println("WIN")
        else
          println("LOSE")

        numTestCasesCurrent=numTestCasesCurrent-1

      }




  }


}
