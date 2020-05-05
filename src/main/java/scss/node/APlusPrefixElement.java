/* This file was generated by SableCC (http://www.sablecc.org/). */

package scss.node;

import scss.analysis.*;

@SuppressWarnings("nls")
public final class APlusPrefixElement extends PPrefixElement
{
    private TPlus _plus_;
    private PElement _element_;

    public APlusPrefixElement()
    {
        // Constructor
    }

    public APlusPrefixElement(
        @SuppressWarnings("hiding") TPlus _plus_,
        @SuppressWarnings("hiding") PElement _element_)
    {
        // Constructor
        setPlus(_plus_);

        setElement(_element_);

    }

    @Override
    public Object clone()
    {
        return new APlusPrefixElement(
            cloneNode(this._plus_),
            cloneNode(this._element_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPlusPrefixElement(this);
    }

    public TPlus getPlus()
    {
        return this._plus_;
    }

    public void setPlus(TPlus node)
    {
        if(this._plus_ != null)
        {
            this._plus_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._plus_ = node;
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
            + toString(this._plus_)
            + toString(this._element_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._plus_ == child)
        {
            this._plus_ = null;
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
        if(this._plus_ == oldChild)
        {
            setPlus((TPlus) newChild);
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