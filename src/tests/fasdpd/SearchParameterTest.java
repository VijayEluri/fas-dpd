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
package tests.fasdpd;

import fasdpd.InvalidCommandLineException;
import fasdpd.SearchParameter;
import filters.validator.Validate_AND;
import junit.framework.TestCase;
/**
 * Test Case.
 * Unfinished.
 * @author "Javier Iserte <jiserte@unq.edu.ar>"
 * @version 1.1.1
 */

public class SearchParameterTest extends TestCase {
// TODO modify test to include new options!
	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testSearchParameter() {
		String[]  cl ="/Q:30 /FDEG /INFILE: \"c:\\javier\\archivo.txt\" /GCFILE:\"c:\\javier\\gc.txt\" /OUTFILE: \"c:\\javier\\archivo2.txt\"".split(" ");
		SearchParameter s = null;

		try { s = new SearchParameter();
			s.retrieveFromCommandLine(cl);
		} catch (InvalidCommandLineException e) {e.printStackTrace(); fail(); }
		
		assertEquals("\"c:\\javier\\archivo.txt\"", s.getInfile());
		assertEquals("\"c:\\javier\\archivo2.txt\"", s.getOutfile());
		assertEquals("\"c:\\javier\\gc.txt\"", s.getGCfile());
		assertEquals(1f,s.getNx());
		assertEquals(1f,s.getNy());
		assertEquals(0f,s.getpA());
		assertEquals(30,s.getQuantity());
		assertEquals(-1, s.getEndPoint());
		assertEquals(1, s.getStartPoint());
		assertFalse(s.isSearchPair());
		assertEquals(20,s.getLenMin());
		assertEquals(25,s.getLenMax());
		assertNull(s.getProfile());
		
		
		System.out.println(s.getFilter());// TODO implement toString in Filters and Validators.
		
		
		cl ="/PAIR /Q:30 /FDEG /LENMIN:18 /LENMAX:35 /INFILE: \"c:\\javier\\archivo.txt\" /GCFILE:\"c:\\javier\\gc.txt\" /OUTFILE: \"c:\\javier\\archivo2.txt\"".split(" ");
		
		try { s = new SearchParameter();
			s.retrieveFromCommandLine(cl);
			} catch (InvalidCommandLineException e) {
			e.printStackTrace();
			fail();
		}
		
		assertEquals("\"c:\\javier\\archivo.txt\"", s.getInfile());
		assertEquals("\"c:\\javier\\archivo2.txt\"", s.getOutfile());
		assertEquals("\"c:\\javier\\gc.txt\"", s.getGCfile());
		assertEquals(1f,s.getNx());
		assertEquals(1f,s.getNy());
		assertEquals(0f,s.getpA());
		assertEquals(30,s.getQuantity());
		assertEquals(-1, s.getEndPoint());
		assertEquals(1, s.getStartPoint());
		assertFalse(!s.isSearchPair());
		assertEquals(18,s.getLenMin());
		assertEquals(35,s.getLenMax());
		assertNull(s.getProfile());
		
	}

}
