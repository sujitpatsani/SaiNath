package test;

import java.awt.Dimension;

public class ReferenceVariablePass {
	
	void modify(Dimension dim){
		dim.height=20;
		System.out.println("After Height="+dim.height +"Length ="+dim.width);
		
	}

	public static void main(String[] args) {

		Dimension d= new Dimension(5,10);
		System.out.println("Height="+d.height +"Length ="+d.width);
		ReferenceVariablePass rp= new ReferenceVariablePass();
		rp.modify(d);
	}

}
