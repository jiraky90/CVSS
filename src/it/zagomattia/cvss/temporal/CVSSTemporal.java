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
package it.zagomattia.cvss.temporal;

import it.zagomattia.cvss.CVSSMetric;
import it.zagomattia.cvss.base.CVSSBase;

/**
 * The threat posed by a vulnerability may change over time. Three such 
 * factors that CVSS captures are: confirmation of the technical details of 
 * a vulnerability, the remediation status of the vulnerability, and the 
 * availability of exploit code or techniques. Since temporal metrics are 
 * optional they each include a metric value that has no effect on the score. 
 * This value is used when the user feels the particular metric does not apply 
 * and wishes to "skip over" it.
 * @author Mattia Zago <a href="mailto:dev@zagomattia.it">dev@zagomattia.it</a>
 */
public class CVSSTemporal implements CVSSMetric {

    private CVSSBase BaseScore;
    private E Exploitability;
    private RL RemediationLevel;
    private RC ReportConfidence;
    
    public CVSSTemporal() {
        this.BaseScore = new CVSSBase();
    }

    public CVSSTemporal(CVSSBase BaseScore, E Exploitability, RL RemediationLevel, RC ReportConfidence) {
        setBaseScore(BaseScore);
        setExploitability(Exploitability);
        setRemediationLevel(RemediationLevel);
        setReportConfidence(ReportConfidence);
    }
    
    @Override
    public Double score() {
        return  Math.round (
                    10 * // need to round to 1 decimal digit
                    getBaseScore().score() * 
                    getExploitability().getValue() * 
                    getRemediationLevel().getValue() * 
                    getReportConfidence().getValue()
                ) / 10d // need to round to 1 decimal digit
                ;
    }
    
    @Override
    public String toString() {
        return    "E:"+getExploitability()
                + "/RL:"+getRemediationLevel()
                + "/RC:"+getReportConfidence()
                + "";
    }
    
    @Override
    public String[] getVectors() {
        return new String[]{"E","RL","RC"};
    }
    
    @Override
    public String toStringFull() {
        return getBaseScore().toString()+"/"+toString();
    }
    
    @Override
    public boolean equals(Object target) {
        if( !(target instanceof CVSSTemporal)) return false;
        CVSSTemporal t = (CVSSTemporal)target;
        if(this.getBaseScore().equals(t.getBaseScore()))
            if(this.getExploitability().equals(t.getExploitability()))
                if(this.getRemediationLevel().equals(t.getRemediationLevel()))
                    if(this.getReportConfidence().equals(t.getReportConfidence()))
                        return true;
        
        return false;
    }
    
    
    public E getExploitability() {
        return Exploitability;
    }

    public final void setExploitability(E Exploitability) {
        this.Exploitability = Exploitability;
    }

    public RL getRemediationLevel() {
        return RemediationLevel;
    }

    public final void setRemediationLevel(RL RemediationLevel) {
        this.RemediationLevel = RemediationLevel;
    }

    public RC getReportConfidence() {
        return ReportConfidence;
    }

    public final void setReportConfidence(RC ReportConfidence) {
        this.ReportConfidence = ReportConfidence;
    }
    
    public CVSSBase getBaseScore() {
        return this.BaseScore;
    }
    
    public final void setBaseScore(CVSSBase BaseScore) {
        this.BaseScore = BaseScore;
    }
    
}