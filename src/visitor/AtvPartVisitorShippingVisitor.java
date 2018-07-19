package visitor;

import java.util.List;

public class AtvPartVisitorShippingVisitor implements AtvPartVisitor {

	double shippingAmount=0;
	@Override
	public void visit(Fender fender) {
		shippingAmount+=15;
		System.out.println("Fender are being calculated");
	}

	@Override
	public void visit(Wheel wheel) {
		shippingAmount+=5;
		System.out.println("wheels are being calculated");
	}

	@Override
	public void visit(Oil oil) {
		shippingAmount+=10;
		System.out.println("OIl are being calculated");
 	}

	@Override
	public void visit(PartsOrder partsOrder) {
		
		List<AtvPart> parts =partsOrder.getParts();
		if(parts.size()>3)
		{
			shippingAmount-=5;
		}
		System.out.println("shipping amount is :"+shippingAmount);
	
	}

}
