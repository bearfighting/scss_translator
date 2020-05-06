/* This file was generated by SableCC (http://www.sablecc.org/). */

package scss.generator.parser;

import scss.generator.node.*;
import scss.generator.analysis.*;

class TokenIndex extends AnalysisAdapter
{
    int index;

    @Override
    public void caseTColon(@SuppressWarnings("unused") TColon node)
    {
        this.index = 0;
    }

    @Override
    public void caseTLBrace(@SuppressWarnings("unused") TLBrace node)
    {
        this.index = 1;
    }

    @Override
    public void caseTRBrace(@SuppressWarnings("unused") TRBrace node)
    {
        this.index = 2;
    }

    @Override
    public void caseTSemicolon(@SuppressWarnings("unused") TSemicolon node)
    {
        this.index = 3;
    }

    @Override
    public void caseTIdentifier(@SuppressWarnings("unused") TIdentifier node)
    {
        this.index = 4;
    }

    @Override
    public void caseEOF(@SuppressWarnings("unused") EOF node)
    {
        this.index = 5;
    }
}