/* This file was generated by SableCC (http://www.sablecc.org/). */

package scss.node;

import scss.analysis.*;

@SuppressWarnings("nls")
public final class ADotElement extends PElement
{
    private TDot _dot_;
    private PElement _element_;

    public ADotElement()
    {
        // Constructor
    }

    public ADotElement(
        @SuppressWarnings("hiding") TDot _dot_,
        @SuppressWarnings("hiding") PElement _element_)
    {
        // Constructor
        setDot(_dot_);

        setElement(_element_);

    }

    @Override
    public Object clone()
    {
        return new ADotElement(
            cloneNode(this._dot_),
            cloneNode(this._element_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADotElement(this);
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

    public PElement getElement()
    {
        return this._element_;
    }

    public void setElement(PElement node)
    {
        if(this._element_ != null)
        {
            this._element_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._element_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._dot_)
            + toString(this._element_);
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

        if(this._element_ == child)
        {
            this._element_ = null;
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

        if(this._element_ == oldChild)
        {
            setElement((PElement) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
