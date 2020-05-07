/* This file was generated by SableCC (http://www.sablecc.org/). */

package scss.calculation.node;

import scss.calculation.analysis.*;

@SuppressWarnings("nls")
public final class ASimpleFunctionCall extends PFunctionCall
{
    private PCommaValue _commaValue_;

    public ASimpleFunctionCall()
    {
        // Constructor
    }

    public ASimpleFunctionCall(
        @SuppressWarnings("hiding") PCommaValue _commaValue_)
    {
        // Constructor
        setCommaValue(_commaValue_);

    }

    @Override
    public Object clone()
    {
        return new ASimpleFunctionCall(
            cloneNode(this._commaValue_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASimpleFunctionCall(this);
    }

    public PCommaValue getCommaValue()
    {
        return this._commaValue_;
    }

    public void setCommaValue(PCommaValue node)
    {
        if(this._commaValue_ != null)
        {
            this._commaValue_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._commaValue_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._commaValue_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._commaValue_ == child)
        {
            this._commaValue_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._commaValue_ == oldChild)
        {
            setCommaValue((PCommaValue) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
