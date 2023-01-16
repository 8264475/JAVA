package interFace;
//The type Superman must
//型態:Superman, Lawyer, Accountant
public class Superman implements Lawyer, Accountant {
	//override
	public void 訴訟() {
		
	}
	
	//ctrl + 1:quick fix
	@Override
	public void 報稅() {
	}
	public static void main(String[] args) {
		
		Superman s = new Superman();
		s.訴訟();
		s.報稅();

	}



}
