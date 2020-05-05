/* This file was generated by SableCC (http://www.sablecc.org/). */

package scss.node;

import scss.analysis.*;

@SuppressWarnings("nls")
public final class AWhileStatement extends PStatement
{
    private TAtWhile _atWhile_;
    private PConditions _conditions_;
    private PBlock _block_;

    public AWhileStatement()
    {
        // Constructor
    }

    public AWhileStatement(
        @SuppressWarnings("hiding") TAtWhile _atWhile_,
        @SuppressWarnings("hiding") PConditions _conditions_,
        @SuppressWarnings("hiding") PBlock _block_)
    {
        // Constructor
        setAtWhile(_atWhile_);

        setConditions(_conditions_);

        setBlock(_block_);

    }

    @Override
    public Object clone()
    {
        return new AWhileStatement(
            cloneNode(this._atWhile_),
            cloneNode(this._conditions_),
            cloneNode(this._block_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAWhileStatement(this);
    }

    public TAtWhile getAtWhile()
    {
        return this._atWhile_;
    }

    public void setAtWhile(TAtWhile node)
    {
        if(this._atWhile_ != null)
        {
            this._atWhile_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._atWhile_ = node;
    }

    public PConditions getConditions()
    {
        return this._conditions_;
    }

    public void setConditions(PConditions node)
    {
        if(this._conditions_ != null)
        {
            this._conditions_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._conditions_ = node;
    }

    public PBlock getBlock()
    {
        return this._block_;
    }

    public void setBlock(PBlock node)
    {
        if(this._block_ != null)
        {
            this._block_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._block_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._atWhile_)
            + toString(this._conditions_)
            + toString(this._block_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._atWhile_ == child)
        {
            this._atWhile_ = null;
            return;
        }

        if(this._conditions_ == child)
        {
            this._conditions_ = null;
            return;
        }

        if(this._block_ == child)
        {
            this._block_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._atWhile_ == oldChild)
        {
            setAtWhile((TAtWhile) newChild);
            return;
        }

        if(this._conditions_ == oldChild)
        {
            setConditions((PConditions) newChild);
            return;
        }

        if(this._block_ == oldChild)
        {
            setBlock((PBlock) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
