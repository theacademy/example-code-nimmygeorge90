package FundforFuture

import scala.io.Source
/*This class is used to read the text files and I'm implement here to understand the banking concept
to a new user.*/
class Readingfiles {
 def fileread(){//Giving the source of the file
  val over_file = "C:\\Users\\nimmy\\OneDrive\\Desktop\\Fundforfuture\\Basic Understanding of UK banking.rtf"

  for(over <- Source.fromFile(over_file).getLines) { //looping each and every line
    println(over)
  }
  }

}
