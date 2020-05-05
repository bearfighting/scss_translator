/* This file was generated by SableCC (http://www.sablecc.org/). */

package scss.node;

import java.util.*;
import scss.analysis.*;

@SuppressWarnings("nls")
public final class AIdentsEachValues extends PEachValues
{
    private PIdent _ident_;
    private final LinkedList<PCommaIdent> _commaIdent_ = new LinkedList<PCommaIdent>();

    public AIdentsEachValues()
    {
        // Constructor
    }

    public AIdentsEachValues(
        @SuppressWarnings("hiding") PIdent _ident_,
        @SuppressWarnings("hiding") List<?> _commaIdent_)
    {
        // Constructor
        setIdent(_ident_);

        setCommaIdent(_commaIdent_);

    }

    @Override
    public Object clone()
    {
        return new AIdentsEachValues(
            cloneNode(this._ident_),
            cloneList(this._commaIdent_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIdentsEachValues(this);
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

    public LinkedList<PCommaIdent> getCommaIdent()
    {
        return this._commaIdent_;
    }

    public void setCommaIdent(List<?> list)
    {
        for(PCommaIdent e : this._commaIdent_)
        {
            e.parent(null);
        }
        this._commaIdent_.clear();

        for(Object obj_e : list)
        {
            PCommaIdent e = (PCommaIdent) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._commaIdent_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._ident_)
            + toString(this._commaIdent_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._ident_ == child)
        {
            this._ident_ = null;
            return;
        }

        if(this._commaIdent_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._ident_ == oldChild)
        {
            setIdent((PIdent) newChild);
            return;
        }

        for(ListIterator<PCommaIdent> i = this._commaIdent_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PCommaIdent) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }
}
