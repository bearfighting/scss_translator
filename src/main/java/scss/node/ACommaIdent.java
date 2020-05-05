/* This file was generated by SableCC (http://www.sablecc.org/). */

package scss.node;

import scss.analysis.*;

@SuppressWarnings("nls")
public final class ACommaIdent extends PCommaIdent
{
    private TComma _comma_;
    private PIdent _ident_;

    public ACommaIdent()
    {
        // Constructor
    }

    public ACommaIdent(
        @SuppressWarnings("hiding") TComma _comma_,
        @SuppressWarnings("hiding") PIdent _ident_)
    {
        // Constructor
        setComma(_comma_);

        setIdent(_ident_);

    }

    @Override
    public Object clone()
    {
        return new ACommaIdent(
            cloneNode(this._comma_),
            cloneNode(this._ident_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseACommaIdent(this);
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

    public PIdent getIdent()
    {
        return this._ident_;
    }

    public void setIdent(PIdent node)
    {
        if(this._ident_ != null)
        {
            this._ident_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._ident_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._comma_)
            + toString(this._ident_);
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

        if(this._ident_ == child)
        {
            this._ident_ = null;
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

        if(this._ident_ == oldChild)
        {
            setIdent((PIdent) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
