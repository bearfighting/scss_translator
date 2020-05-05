/* This file was generated by SableCC (http://www.sablecc.org/). */

package scss.node;

import scss.analysis.*;

@SuppressWarnings("nls")
public final class ASimpleCondition extends PCondition
{
    private PComparison _expression_;

    public ASimpleCondition()
    {
        // Constructor
    }

    public ASimpleCondition(
        @SuppressWarnings("hiding") PComparison _expression_)
    {
        // Constructor
        setExpression(_expression_);

    }

    @Override
    public Object clone()
    {
        return new ASimpleCondition(
            cloneNode(this._expression_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASimpleCondition(this);
    }

    public PComparison getExpression()
    {
        return this._expression_;
    }

    public void setExpression(PComparison node)
    {
        if(this._expression_ != null)
        {
            this._expression_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expression_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._expression_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._expression_ == child)
        {
            this._expression_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._expression_ == oldChild)
        {
            setExpression((PComparison) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
