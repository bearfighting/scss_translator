/* This file was generated by SableCC (http://www.sablecc.org/). */

package scss.node;

import java.util.*;
import scss.analysis.*;

@SuppressWarnings("nls")
public final class AEachStatement extends PStatement
{
    private TAtEach _atEach_;
    private TVariable _variable_;
    private final LinkedList<PCommaVariable> _commaVariable_ = new LinkedList<PCommaVariable>();
    private TIn _in_;
    private PEachValues _eachValues_;
    private PBlock _block_;

    public AEachStatement()
    {
        // Constructor
    }

    public AEachStatement(
        @SuppressWarnings("hiding") TAtEach _atEach_,
        @SuppressWarnings("hiding") TVariable _variable_,
        @SuppressWarnings("hiding") List<?> _commaVariable_,
        @SuppressWarnings("hiding") TIn _in_,
        @SuppressWarnings("hiding") PEachValues _eachValues_,
        @SuppressWarnings("hiding") PBlock _block_)
    {
        // Constructor
        setAtEach(_atEach_);

        setVariable(_variable_);

        setCommaVariable(_commaVariable_);

        setIn(_in_);

        setEachValues(_eachValues_);

        setBlock(_block_);

    }

    @Override
    public Object clone()
    {
        return new AEachStatement(
            cloneNode(this._atEach_),
            cloneNode(this._variable_),
            cloneList(this._commaVariable_),
            cloneNode(this._in_),
            cloneNode(this._eachValues_),
            cloneNode(this._block_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEachStatement(this);
    }

    public TAtEach getAtEach()
    {
        return this._atEach_;
    }

    public void setAtEach(TAtEach node)
    {
        if(this._atEach_ != null)
        {
            this._atEach_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._atEach_ = node;
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

    public LinkedList<PCommaVariable> getCommaVariable()
    {
        return this._commaVariable_;
    }

    public void setCommaVariable(List<?> list)
    {
        for(PCommaVariable e : this._commaVariable_)
        {
            e.parent(null);
        }
        this._commaVariable_.clear();

        for(Object obj_e : list)
        {
            PCommaVariable e = (PCommaVariable) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._commaVariable_.add(e);
        }
    }

    public TIn getIn()
    {
        return this._in_;
    }

    public void setIn(TIn node)
    {
        if(this._in_ != null)
        {
            this._in_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._in_ = node;
    }

    public PEachValues getEachValues()
    {
        return this._eachValues_;
    }

    public void setEachValues(PEachValues node)
    {
        if(this._eachValues_ != null)
        {
            this._eachValues_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._eachValues_ = node;
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
            + toString(this._atEach_)
            + toString(this._variable_)
            + toString(this._commaVariable_)
            + toString(this._in_)
            + toString(this._eachValues_)
            + toString(this._block_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._atEach_ == child)
        {
            this._atEach_ = null;
            return;
        }

        if(this._variable_ == child)
        {
            this._variable_ = null;
            return;
        }

        if(this._commaVariable_.remove(child))
        {
            return;
        }

        if(this._in_ == child)
        {
            this._in_ = null;
            return;
        }

        if(this._eachValues_ == child)
        {
            this._eachValues_ = null;
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
        if(this._atEach_ == oldChild)
        {
            setAtEach((TAtEach) newChild);
            return;
        }

        if(this._variable_ == oldChild)
        {
            setVariable((TVariable) newChild);
            return;
        }

        for(ListIterator<PCommaVariable> i = this._commaVariable_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PCommaVariable) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._in_ == oldChild)
        {
            setIn((TIn) newChild);
            return;
        }

        if(this._eachValues_ == oldChild)
        {
            setEachValues((PEachValues) newChild);
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