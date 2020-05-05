/* This file was generated by SableCC (http://www.sablecc.org/). */

package scss.node;

import scss.analysis.*;

@SuppressWarnings("nls")
public final class AForStatement extends PStatement
{
    private TAtFor _atFor_;
    private TVariable _variable_;
    private TFrom _from_;
    private TNumberLiteral _first_;
    private TThrough _through_;
    private TNumberLiteral _second_;
    private PBlock _block_;

    public AForStatement()
    {
        // Constructor
    }

    public AForStatement(
        @SuppressWarnings("hiding") TAtFor _atFor_,
        @SuppressWarnings("hiding") TVariable _variable_,
        @SuppressWarnings("hiding") TFrom _from_,
        @SuppressWarnings("hiding") TNumberLiteral _first_,
        @SuppressWarnings("hiding") TThrough _through_,
        @SuppressWarnings("hiding") TNumberLiteral _second_,
        @SuppressWarnings("hiding") PBlock _block_)
    {
        // Constructor
        setAtFor(_atFor_);

        setVariable(_variable_);

        setFrom(_from_);

        setFirst(_first_);

        setThrough(_through_);

        setSecond(_second_);

        setBlock(_block_);

    }

    @Override
    public Object clone()
    {
        return new AForStatement(
            cloneNode(this._atFor_),
            cloneNode(this._variable_),
            cloneNode(this._from_),
            cloneNode(this._first_),
            cloneNode(this._through_),
            cloneNode(this._second_),
            cloneNode(this._block_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAForStatement(this);
    }

    public TAtFor getAtFor()
    {
        return this._atFor_;
    }

    public void setAtFor(TAtFor node)
    {
        if(this._atFor_ != null)
        {
            this._atFor_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._atFor_ = node;
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

    public TFrom getFrom()
    {
        return this._from_;
    }

    public void setFrom(TFrom node)
    {
        if(this._from_ != null)
        {
            this._from_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._from_ = node;
    }

    public TNumberLiteral getFirst()
    {
        return this._first_;
    }

    public void setFirst(TNumberLiteral node)
    {
        if(this._first_ != null)
        {
            this._first_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._first_ = node;
    }

    public TThrough getThrough()
    {
        return this._through_;
    }

    public void setThrough(TThrough node)
    {
        if(this._through_ != null)
        {
            this._through_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._through_ = node;
    }

    public TNumberLiteral getSecond()
    {
        return this._second_;
    }

    public void setSecond(TNumberLiteral node)
    {
        if(this._second_ != null)
        {
            this._second_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._second_ = node;
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
            + toString(this._atFor_)
            + toString(this._variable_)
            + toString(this._from_)
            + toString(this._first_)
            + toString(this._through_)
            + toString(this._second_)
            + toString(this._block_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._atFor_ == child)
        {
            this._atFor_ = null;
            return;
        }

        if(this._variable_ == child)
        {
            this._variable_ = null;
            return;
        }

        if(this._from_ == child)
        {
            this._from_ = null;
            return;
        }

        if(this._first_ == child)
        {
            this._first_ = null;
            return;
        }

        if(this._through_ == child)
        {
            this._through_ = null;
            return;
        }

        if(this._second_ == child)
        {
            this._second_ = null;
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
        if(this._atFor_ == oldChild)
        {
            setAtFor((TAtFor) newChild);
            return;
        }

        if(this._variable_ == oldChild)
        {
            setVariable((TVariable) newChild);
            return;
        }

        if(this._from_ == oldChild)
        {
            setFrom((TFrom) newChild);
            return;
        }

        if(this._first_ == oldChild)
        {
            setFirst((TNumberLiteral) newChild);
            return;
        }

        if(this._through_ == oldChild)
        {
            setThrough((TThrough) newChild);
            return;
        }

        if(this._second_ == oldChild)
        {
            setSecond((TNumberLiteral) newChild);
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