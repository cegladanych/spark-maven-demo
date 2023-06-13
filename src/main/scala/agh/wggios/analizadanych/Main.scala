package agh.wggios.analizadanych

import agh.wggios.analizadanych.datareader.DataReader

object Main extends SparkSessionProvider {
LoggingUtils.setupLogging()
  def main(args: Array[String]): Unit = {

    import spark.implicits._
    logInfo("odpalam")
    val df = new DataReader().read_csv(args(0))
    df.show()

  }
}
