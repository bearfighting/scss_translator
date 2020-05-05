/* This file was generated by SableCC (http://www.sablecc.org/). */

package scss.node;

import scss.analysis.*;

@SuppressWarnings("nls")
public final class ACommaVariable extends PCommaVariable
{
    private TComma _comma_;
    private TVariable _variable_;

    public ACommaVariable()
    {
        // Constructor
    }

    public ACommaVariable(
        @SuppressWarnings("hiding") TComma _comma_,
        @SuppressWarnings("hiding") TVariable _variable_)
    {
        // Constructor
        setComma(_comma_);

        setVariable(_variable_);

    }

    @Override
    public Object clone()
    {
        return new ACommaVariable(
            cloneNode(this._comma_),
            cloneNode(this._variable_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseACommaVariable(this);
    }

    public TComma getComma()
    {
        return this._comma_;
    }

    public void setComma(TComma node)
    {
        if(this._comma_ != null)
        {
            this._comma_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comma_ = node;
    }

    public TVariable getVariable()
    {
        return this._variable_;
    }

    public void setVariable(TVariable node)
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
            + toString(this._comma_)
            + toString(this._variable_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._comma_ == child)
        {
            this._comma_ = null;
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
        if(this._comma_ == oldChild)
        {
            setComma((TComma) newChild);
            return;
        }

        if(this._variable_ == oldChild)
        {
            setVariable((TVariable) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}