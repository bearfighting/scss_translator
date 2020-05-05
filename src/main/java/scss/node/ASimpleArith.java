/* This file was generated by SableCC (http://www.sablecc.org/). */

package scss.node;

import scss.analysis.*;

@SuppressWarnings("nls")
public final class ASimpleArith extends PArith
{
    private PFactor _calculation_;

    public ASimpleArith()
    {
        // Constructor
    }

    public ASimpleArith(
        @SuppressWarnings("hiding") PFactor _calculation_)
    {
        // Constructor
        setCalculation(_calculation_);

    }

    @Override
    public Object clone()
    {
        return new ASimpleArith(
            cloneNode(this._calculation_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASimpleArith(this);
    }

    public PFactor getCalculation()
    {
        return this._calculation_;
    }

    public void setCalculation(PFactor node)
    {
        if(this._calculation_ != null)
        {
            this._calculation_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._calculation_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._calculation_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._calculation_ == child)
        {
            this._calculation_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._calculation_ == oldChild)
        {
            setCalculation((PFactor) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}