/* This file was generated by SableCC (http://www.sablecc.org/). */

package scss.calculation.analysis;

import java.util.*;
import scss.calculation.node.*;

public class ReversedDepthFirstAdapter extends AnalysisAdapter
{
    public void inStart(Start node)
    {
        defaultIn(node);
    }

    public void outStart(Start node)
    {
        defaultOut(node);
    }

    public void defaultIn(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    public void defaultOut(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    @Override
    public void caseStart(Start node)
    {
        inStart(node);
        node.getEOF().apply(this);
        node.getPStylesheet().apply(this);
        outStart(node);
    }

    public void inAStylesheet(AStylesheet node)
    {
        defaultIn(node);
    }

    public void outAStylesheet(AStylesheet node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStylesheet(AStylesheet node)
    {
        inAStylesheet(node);
        {
            List<PStatement> copy = new ArrayList<PStatement>(node.getStatement());
            Collections.reverse(copy);
            for(PStatement e : copy)
            {
                e.apply(this);
            }
        }
        outAStylesheet(node);
    }

    public void inAAssigmentStatement(AAssigmentStatement node)
    {
        defaultIn(node);
    }

    public void outAAssigmentStatement(AAssigmentStatement node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAssigmentStatement(AAssigmentStatement node)
    {
        inAAssigmentStatement(node);
        {
            List<PCommaIdentifier> copy = new ArrayList<PCommaIdentifier>(node.getCommaIdentifier());
            Collections.reverse(copy);
            for(PCommaIdentifier e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        if(node.getColon() != null)
        {
            node.getColon().apply(this);
        }
        if(node.getVariable() != null)
        {
            node.getVariable().apply(this);
        }
        outAAssigmentStatement(node);
    }

    public void inACommaIdentifier(ACommaIdentifier node)
    {
        defaultIn(node);
    }

    public void outACommaIdentifier(ACommaIdentifier node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACommaIdentifier(ACommaIdentifier node)
    {
        inACommaIdentifier(node);
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        if(node.getComma() != null)
        {
            node.getComma().apply(this);
        }
        outACommaIdentifier(node);
    }

    public void inAVariable(AVariable node)
    {
        defaultIn(node);
    }

    public void outAVariable(AVariable node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVariable(AVariable node)
    {
        inAVariable(node);
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        if(node.getDollar() != null)
        {
            node.getDollar().apply(this);
        }
        outAVariable(node);
    }
}
