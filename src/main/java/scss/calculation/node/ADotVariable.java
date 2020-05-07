/* This file was generated by SableCC (http://www.sablecc.org/). */

package scss.calculation.node;

import scss.calculation.analysis.*;

@SuppressWarnings("nls")
public final class ADotVariable extends PVariable
{
    private TDot _dot_;
    private PVariable _variable_;

    public ADotVariable()
    {
        // Constructor
    }

    public ADotVariable(
        @SuppressWarnings("hiding") TDot _dot_,
        @SuppressWarnings("hiding") PVariable _variable_)
    {
        // Constructor
        setDot(_dot_);

        setVariable(_variable_);

    }

    @Override
    public Object clone()
    {
        return new ADotVariable(
            cloneNode(this._dot_),
            cloneNode(this._variable_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADotVariable(this);
    }

    public TDot getDot()
    {
        return this._dot_;
    }

    public void setDot(TDot node)
    {
        if(this._dot_ != null)
        {
            this._dot_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._dot_ = node;
    }

    public PVariable getVariable()
    {
        return this._variable_;
    }

    public void setVariable(PVariable node)
    {
        if(this._variable_ != null)
        {
            this._variable_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._variable_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._dot_)
            + toString(this._variable_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._dot_ == child)
        {
            this._dot_ = null;
            return;
        }

        if(this._variable_ == child)
        {
            this._variable_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._dot_ == oldChild)
        {
            setDot((TDot) newChild);
            return;
        }

        if(this._variable_ == oldChild)
        {
            setVariable((PVariable) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
