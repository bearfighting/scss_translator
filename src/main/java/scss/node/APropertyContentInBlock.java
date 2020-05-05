/* This file was generated by SableCC (http://www.sablecc.org/). */

package scss.node;

import scss.analysis.*;

@SuppressWarnings("nls")
public final class APropertyContentInBlock extends PContentInBlock
{
    private PProperty _property_;

    public APropertyContentInBlock()
    {
        // Constructor
    }

    public APropertyContentInBlock(
        @SuppressWarnings("hiding") PProperty _property_)
    {
        // Constructor
        setProperty(_property_);

    }

    @Override
    public Object clone()
    {
        return new APropertyContentInBlock(
            cloneNode(this._property_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPropertyContentInBlock(this);
    }

    public PProperty getProperty()
    {
        return this._property_;
    }

    public void setProperty(PProperty node)
    {
        if(this._property_ != null)
        {
            this._property_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._property_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._property_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._property_ == child)
        {
            this._property_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._property_ == oldChild)
        {
            setProperty((PProperty) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}