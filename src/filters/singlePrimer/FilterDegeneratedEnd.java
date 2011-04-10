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
package filters.singlePrimer;

import degeneration.BaseDeg;
import filters.validator.ValidatorSimple;
import sequences.dna.Primer;
/**
 * This class represents the condition that a primer have a degenerated base in the 3' position.
 * @author Javier Iserte <jiserte@unq.edu.ar>
 * @version 1.1.3
 */
public class FilterDegeneratedEnd extends FilterSinglePrimer {

	/**
	 * Validates that a primer is degenerated in the last position.
	 * 
	 * Returns true if the end is degenerated.
	 * 			false otherwise.
	 */
	public boolean filter(Primer p) {
		
		return BaseDeg.getDegValueFromChar(p.getSequence().charAt(p.getLength()-1))==1;
	}
	
	
}
