/*
 * You may not change or alter any portion of this comment or credits
 * of supporting developers from this source code or any supporting source code
 * which is considered copyrighted (c) material of the original comment or credit authors.
 * This program is distributed WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * 
 * FAS-DPD project, including algorithms design, software implementation and experimental laboratory work, is being developed as a part of the Research Program:
 * 	"Microbiolog�a molecular b�sica y aplicaciones biotecnol�gicas"
 * 		(Basic Molecular Microbiology and biotechnological applications)
 * 
 * And is being conducted in:
 * 	LIGBCM: Laboratorio de Ingenier�a Gen�tica y Biolog�a Celular y Molecular.
 *		(Laboratory of Genetic Engineering and Cellular and Molecular Biology)
 *	Universidad Nacional de Quilmes.
 *		(National University Of Quilmes)
 *	Quilmes, Buenos Aires, Argentina.
 *
 * The complete team for this project is formed by:
 *	Lic.  Javier A. Iserte.
 *	Lic.  Betina I. Stephan.
 * 	ph.D. Sandra E. Go�i.
 * 	ph.D. P. Daniel Ghiringhelli.
 *	ph.D. Mario E. Lozano.
 *
 * Corresponding Authors:
 *	Javier A. Iserte. <jiserte@unq.edu.ar>
 *	Mario E. Lozano. <mlozano@unq.edu.ar>
 */
package filters.validator;

/**
 * This class represents the boolean operation AND to use with Validator Objects
 * 
 * @author "Javier Iserte <jiserte@unq.edu.ar>"
 * @version 1.1.1
 */
public class Validate_AND extends ValidatorBoolean {

	private Validator op1;
	private Validator op2;
	
	// COSNTRUCTOR
	/**
	 * Creates a new instance of Validate_AND.
	 * Two Validators are necessary.
	 */
	public Validate_AND(Validator op1, Validator op2) {
		super();
		this.op1 = op1;
		this.op2 = op2;
	}
	
	@Override
	/**
	 * This methods performs the boolean evaluation 'AND' of the two Validators. 
	 */
	public boolean validate(Validable p) {
		return (this.op1.validate(p) && this.op2.validate(p));
	}


}