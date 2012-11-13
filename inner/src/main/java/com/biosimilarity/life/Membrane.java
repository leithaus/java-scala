// -*- mode: Java;-*- 
// Filename:    Membrane.java
// Authors:     lgm                                                    
// Creation:    Tue Nov 13 09:25:47 2012 
// Copyright:   Not supplied 
// Description: 
// ------------------------------------------------------------------------

package com.biosimilarity.life.inner;

import java.util.List;

public interface Membrane {    
    public interface Kinase {
	String name();
    }
    public interface Cytoplasm {
	Kinase signallingRegime( List<Kinase> chain );
    }
    public interface Nucleus {
	interface NucleicAcid {
	    String name();
	}
	Kinase produce( List<Kinase> chain ) ;
    }
}
