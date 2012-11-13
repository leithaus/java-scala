// -*- mode: Scala;-*- 
// Filename:    Life.scala 
// Authors:     lgm                                                    
// Creation:    Tue Nov 13 09:32:08 2012 
// Copyright:   Not supplied 
// Description: 
// ------------------------------------------------------------------------

package com.biosimilarity.life.outer
import com.biosimilarity.life.inner._

class Cell() extends Membrane {
  class MAPK() extends Kinase {
    override def name() : String = "MAPK"
  }
  class CellCytoplasm() extends Cytoplasm {
    override def signallingRegime( chain : List[Kinase] ) : Kinase = {
      new MAPK()
    }
  }
  class CellNucleus() extends Nucleus {
    class Adenine() extends NucleicAcid {
      override def name() : String = "A"
    }
    override def produce( chain : List[Kinase] ) : Kinase = {
      new MAPK()
    }
  }
}
