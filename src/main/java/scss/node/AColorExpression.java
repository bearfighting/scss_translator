/* This file was generated by SableCC (http://www.sablecc.org/). */

package scss.node;

import scss.analysis.*;

@SuppressWarnings("nls")
public final class AColorExpression extends PExpression
{
    private TColor _color_;

    public AColorExpression()
    {
        // Constructor
    }

    public AColorExpression(
        @SuppressWarnings("hiding") TColor _color_)
    {
        // Constructor
        setColor(_color_);

    }

    @Override
    public Object clone()
    {
        return new AColorExpression(
            cloneNode(this._color_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAColorExpression(this);
    }

    public TColor getColor()
    {
        return this._color_;
    }

    public void setColor(TColor node)
    {
        if(this._color_ != null)
        {
            this._color_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._color_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._color_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._color_ == child)
        {
            this._color_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._color_ == oldChild)
        {
            setColor((TColor) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
