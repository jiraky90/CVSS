/**
 * CVSS v2 Java Data Structure 
 * Copyright (c) 2015 - Mattia Zago 
 * <a href="mailto:dev@zagomattia.it">dev@zagomattia.it</a>
 * 
 * NVD Common Vulnerability Scoring System Support v2
 * The Common Vulnerability Scoring System (CVSS) provides an open framework 
 * for communicating the characteristics and impacts of IT vulnerabilities. 
 * CVSS consists of 3 groups: Base, Temporal and Environmental. Each group 
 * produces a numeric score ranging from 0 to 10, and a Vector, a compressed 
 * textual representation that reflects the values used to derive the score. 
 * The Base group represents the intrinsic qualities of a vulnerability. The 
 * Temporal group reflects the characteristics of a vulnerability that change 
 * over time. The Environmental group represents the characteristics of a 
 * vulnerability that are unique to any user's environment. CVSS enables IT 
 * managers, vulnerability bulletin providers, security vendors, application 
 * vendors and researchers to all benefit by adopting this common language of 
 * scoring IT vulnerabilities.
 * 
 * ----------------------------------------------------------------------------
 *                               DISCLAIMER
 * ----------------------------------------------------------------------------
 * This Java library implements the structure of the CVSS v2 standard. All the 
 * relevant information and texts are taken from the NIST documentation 
 * (https://nvd.nist.gov/cvss.cfm) or the FIRST CVSS guide
 * (http://www.first.org/cvss/).
 *
 * ----------------------------------------------------------------------------
 *                                 LICENSE
 * ----------------------------------------------------------------------------
 * The following project is released under BSD 3-Clause License
 *
 * Copyright (c) 2015 - Mattia Zago 
 * <a href="mailto:dev@zagomattia.it">dev@zagomattia.it</a>
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without 
 * modification, are permitted provided that the following conditions are met:
 * 
 * 1. Redistributions of source code must retain the above copyright notice, 
 *    this list of conditions and the following disclaimer.
 * 
 * 2. Redistributions in binary form must reproduce the above copyright notice, 
 *    this list of conditions and the following disclaimer in the documentation 
 *    and/or other materials provided with the distribution.
 * 
 * 3. Neither the name of the copyright holder nor the names of its 
 *    contributors may be used to endorse or promote products derived from this 
 *    software without specific prior written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" 
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE 
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE 
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE 
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR 
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF 
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS 
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN 
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
 * POSSIBILITY OF SUCH DAMAGE.
 */
package it.zagomattia.cvss;

import it.zagomattia.cvss.base.A;
import it.zagomattia.cvss.base.AC;
import it.zagomattia.cvss.base.AU;
import it.zagomattia.cvss.base.AV;
import it.zagomattia.cvss.base.CVSSBase;
import it.zagomattia.cvss.base.C;
import it.zagomattia.cvss.base.I;
import it.zagomattia.cvss.environmental.AR;
import it.zagomattia.cvss.environmental.CDP;
import it.zagomattia.cvss.environmental.CR;
import it.zagomattia.cvss.environmental.CVSSEnvironmental;
import it.zagomattia.cvss.environmental.IR;
import it.zagomattia.cvss.environmental.TD;
import it.zagomattia.cvss.temporal.E;
import it.zagomattia.cvss.temporal.RC;
import it.zagomattia.cvss.temporal.RL;
import it.zagomattia.cvss.temporal.CVSSTemporal;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mattia Zago <a href="mailto:dev@zagomattia.it">dev@zagomattia.it</a>
 */
public class VectorParserTest {
    
    public VectorParserTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of parseBaseVector method, of class VectorParser.
     */
    @Test
    public void testParseBaseVector() {
        System.out.println("parseBaseVector");
        String base = "AV:A/AC:H/Au:M/C:C/I:N/A:N";
        CVSSBase expResult = new CVSSBase(AV.A, AC.H, AU.M, C.C, I.N, A.N);
        CVSSBase result = VectorParser.parseBaseVector(base);
        assertEquals(expResult, result);
        assertEquals(expResult.score(), result.score());
    }

    /**
     * Test of parseTemporalVector method, of class VectorParser.
     */
    @Test
    public void testParseTemporalVector() {
        System.out.println("parseTemporalVector");
        String temp = "AV:A/AC:H/Au:M/C:C/I:N/A:N/E:U/RL:OF/RC:UC";
        CVSSTemporal expResult = new CVSSTemporal(new CVSSBase(AV.A, AC.H, AU.M, C.C, I.N, A.N), E.U, RL.OF, RC.UC);
        CVSSTemporal result = VectorParser.parseTemporalVector(temp);
        assertEquals(expResult, result);
        assertEquals(expResult.score(), result.score());
    }

    /**
     * Test of parseEnvironmentalVector method, of class VectorParser.
     */
    @Test
    public void testParseEnvironmentalVector() {
        System.out.println("parseEnvironmentalVector");
        String env = "AV:A/AC:H/Au:M/C:C/I:N/A:N/E:U/RL:OF/RC:UC/CDP:ND/TD:ND/CR:L/IR:L/AR:L";
        CVSSEnvironmental expResult = new CVSSEnvironmental(new CVSSTemporal(new CVSSBase(AV.A, AC.H, AU.M, C.C, I.N, A.N), E.U, RL.OF, RC.UC), CDP.ND, TD.ND, CR.L, IR.L, AR.L);
        CVSSEnvironmental result = VectorParser.parseEnvironmentalVector(env);
        assertEquals(expResult, result);
        assertEquals(expResult.score(), result.score());
    }
    
    public void testParseAllVector() {
        System.out.println("Test all parser");
        
        CVSSBase b = new CVSSBase();
        CVSSTemporal t = new CVSSTemporal();
        CVSSEnvironmental e = new CVSSEnvironmental();
        
        throw new UnsupportedOperationException("TODO: generate all possible combinations and test it");
    
    }
    
}
