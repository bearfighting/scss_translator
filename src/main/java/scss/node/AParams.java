/* This file was generated by SableCC (http://www.sablecc.org/). */

package scss.node;

import java.util.*;
import scss.analysis.*;

@SuppressWarnings("nls")
public final class AParams extends PParams
{
    private TLparen _lparen_;
    private PParam _first_;
    private final LinkedList<PParam> _rest_ = new LinkedList<PParam>();
    private TRparen _rparen_;
    private TEllipsis _ellipsis_;

    public AParams()
    {
        // Constructor
    }

    public AParams(
        @SuppressWarnings("hiding") TLparen _lparen_,
        @SuppressWarnings("hiding") PParam _first_,
        @SuppressWarnings("hiding") List<?> _rest_,
        @SuppressWarnings("hiding") TRparen _rparen_,
        @SuppressWarnings("hiding") TEllipsis _ellipsis_)
    {
        // Constructor
        setLparen(_lparen_);

        setFirst(_first_);

        setRest(_rest_);

        setRparen(_rparen_);

        setEllipsis(_ellipsis_);

    }

    @Override
    public Object clone()
    {
        return new AParams(
            cloneNode(this._lparen_),
            cloneNode(this._first_),
            cloneList(this._rest_),
            cloneNode(this._rparen_),
            cloneNode(this._ellipsis_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAParams(this);
    }

    public TLparen getLparen()
    {
        return this._lparen_;
    }

    public void setLparen(TLparen node)
    {
        if(this._lparen_ != null)
        {
            this._lparen_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lparen_ = node;
    }

    public PParam getFirst()
    {
        return this._first_;
    }

    public void setFirst(PParam node)
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

    public LinkedList<PParam> getRest()
    {
        return this._rest_;
    }

    public void setRest(List<?> list)
    {
        for(PParam e : this._rest_)
        {
            e.parent(null);
        }
        this._rest_.clear();

        for(Object obj_e : list)
        {
            PParam e = (PParam) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._rest_.add(e);
        }
    }

    public TRparen getRparen()
    {
        return this._rparen_;
    }

    public void setRparen(TRparen node)
    {
        if(this._rparen_ != null)
        {
            this._rparen_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rparen_ = node;
    }

    public TEllipsis getEllipsis()
    {
        return this._ellipsis_;
    }

    public void setEllipsis(TEllipsis node)
    {
        if(this._ellipsis_ != null)
        {
            this._ellipsis_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._ellipsis_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._lparen_)
            + toString(this._first_)
            + toString(this._rest_)
            + toString(this._rparen_)
            + toString(this._ellipsis_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._lparen_ == child)
        {
            this._lparen_ = null;
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

        if(this._rparen_ == child)
        {
            this._rparen_ = null;
            return;
        }

        if(this._ellipsis_ == child)
        {
            this._ellipsis_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._lparen_ == oldChild)
        {
            setLparen((TLparen) newChild);
            return;
        }

        if(this._first_ == oldChild)
        {
            setFirst((PParam) newChild);
            return;
        }

        for(ListIterator<PParam> i = this._rest_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PParam) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._rparen_ == oldChild)
        {
            setRparen((TRparen) newChild);
            return;
        }

        if(this._ellipsis_ == oldChild)
        {
            setEllipsis((TEllipsis) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}