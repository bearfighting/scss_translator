/* This file was generated by SableCC (http://www.sablecc.org/). */

package scss.calculation.node;

import java.util.*;
import scss.calculation.analysis.*;

@SuppressWarnings("nls")
public final class AIncludeStatement extends PStatement
{
    private TInclude _include_;
    private PCommaValue _name_;
    private TLPar _lPar_;
    private PFunctionCall _first_;
    private final LinkedList<PFunctionCall> _rest_ = new LinkedList<PFunctionCall>();
    private TRPar _rPar_;
    private TSemicolon _semicolon_;

    public AIncludeStatement()
    {
        // Constructor
    }

    public AIncludeStatement(
        @SuppressWarnings("hiding") TInclude _include_,
        @SuppressWarnings("hiding") PCommaValue _name_,
        @SuppressWarnings("hiding") TLPar _lPar_,
        @SuppressWarnings("hiding") PFunctionCall _first_,
        @SuppressWarnings("hiding") List<?> _rest_,
        @SuppressWarnings("hiding") TRPar _rPar_,
        @SuppressWarnings("hiding") TSemicolon _semicolon_)
    {
        // Constructor
        setInclude(_include_);

        setName(_name_);

        setLPar(_lPar_);

        setFirst(_first_);

        setRest(_rest_);

        setRPar(_rPar_);

        setSemicolon(_semicolon_);

    }

    @Override
    public Object clone()
    {
        return new AIncludeStatement(
            cloneNode(this._include_),
            cloneNode(this._name_),
            cloneNode(this._lPar_),
            cloneNode(this._first_),
            cloneList(this._rest_),
            cloneNode(this._rPar_),
            cloneNode(this._semicolon_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIncludeStatement(this);
    }

    public TInclude getInclude()
    {
        return this._include_;
    }

    public void setInclude(TInclude node)
    {
        if(this._include_ != null)
        {
            this._include_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._include_ = node;
    }

    public PCommaValue getName()
    {
        return this._name_;
    }

    public void setName(PCommaValue node)
    {
        if(this._name_ != null)
        {
            this._name_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._name_ = node;
    }

    public TLPar getLPar()
    {
        return this._lPar_;
    }

    public void setLPar(TLPar node)
    {
        if(this._lPar_ != null)
        {
            this._lPar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lPar_ = node;
    }

    public PFunctionCall getFirst()
    {
        return this._first_;
    }

    public void setFirst(PFunctionCall node)
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

    public LinkedList<PFunctionCall> getRest()
    {
        return this._rest_;
    }

    public void setRest(List<?> list)
    {
        for(PFunctionCall e : this._rest_)
        {
            e.parent(null);
        }
        this._rest_.clear();

        for(Object obj_e : list)
        {
            PFunctionCall e = (PFunctionCall) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._rest_.add(e);
        }
    }

    public TRPar getRPar()
    {
        return this._rPar_;
    }

    public void setRPar(TRPar node)
    {
        if(this._rPar_ != null)
        {
            this._rPar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rPar_ = node;
    }

    public TSemicolon getSemicolon()
    {
        return this._semicolon_;
    }

    public void setSemicolon(TSemicolon node)
    {
        if(this._semicolon_ != null)
        {
            this._semicolon_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._semicolon_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._include_)
            + toString(this._name_)
            + toString(this._lPar_)
            + toString(this._first_)
            + toString(this._rest_)
            + toString(this._rPar_)
            + toString(this._semicolon_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._include_ == child)
        {
            this._include_ = null;
            return;
        }

        if(this._name_ == child)
        {
            this._name_ = null;
            return;
        }

        if(this._lPar_ == child)
        {
            this._lPar_ = null;
            return;
        }

        if(this._first_ == child)
        {
            this._first_ = null;
            return;
        }

        if(this._rest_.remove(child))
        {
            return;
        }

        if(this._rPar_ == child)
        {
            this._rPar_ = null;
            return;
        }

        if(this._semicolon_ == child)
        {
            this._semicolon_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._include_ == oldChild)
        {
            setInclude((TInclude) newChild);
            return;
        }

        if(this._name_ == oldChild)
        {
            setName((PCommaValue) newChild);
            return;
        }

        if(this._lPar_ == oldChild)
        {
            setLPar((TLPar) newChild);
            return;
        }

        if(this._first_ == oldChild)
        {
            setFirst((PFunctionCall) newChild);
            return;
        }

        for(ListIterator<PFunctionCall> i = this._rest_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PFunctionCall) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._rPar_ == oldChild)
        {
            setRPar((TRPar) newChild);
            return;
        }

        if(this._semicolon_ == oldChild)
        {
            setSemicolon((TSemicolon) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
