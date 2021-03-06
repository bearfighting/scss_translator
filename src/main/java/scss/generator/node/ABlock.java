/* This file was generated by SableCC (http://www.sablecc.org/). */

package scss.generator.node;

import java.util.*;
import scss.generator.analysis.*;

@SuppressWarnings("nls")
public final class ABlock extends PBlock
{
    private TLBrace _lBrace_;
    private final LinkedList<PRuleset> _ruleset_ = new LinkedList<PRuleset>();
    private TRBrace _rBrace_;

    public ABlock()
    {
        // Constructor
    }

    public ABlock(
        @SuppressWarnings("hiding") TLBrace _lBrace_,
        @SuppressWarnings("hiding") List<?> _ruleset_,
        @SuppressWarnings("hiding") TRBrace _rBrace_)
    {
        // Constructor
        setLBrace(_lBrace_);

        setRuleset(_ruleset_);

        setRBrace(_rBrace_);

    }

    @Override
    public Object clone()
    {
        return new ABlock(
            cloneNode(this._lBrace_),
            cloneList(this._ruleset_),
            cloneNode(this._rBrace_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseABlock(this);
    }

    public TLBrace getLBrace()
    {
        return this._lBrace_;
    }

    public void setLBrace(TLBrace node)
    {
        if(this._lBrace_ != null)
        {
            this._lBrace_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lBrace_ = node;
    }

    public LinkedList<PRuleset> getRuleset()
    {
        return this._ruleset_;
    }

    public void setRuleset(List<?> list)
    {
        for(PRuleset e : this._ruleset_)
        {
            e.parent(null);
        }
        this._ruleset_.clear();

        for(Object obj_e : list)
        {
            PRuleset e = (PRuleset) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._ruleset_.add(e);
        }
    }

    public TRBrace getRBrace()
    {
        return this._rBrace_;
    }

    public void setRBrace(TRBrace node)
    {
        if(this._rBrace_ != null)
        {
            this._rBrace_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rBrace_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._lBrace_)
            + toString(this._ruleset_)
            + toString(this._rBrace_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._lBrace_ == child)
        {
            this._lBrace_ = null;
            return;
        }

        if(this._ruleset_.remove(child))
        {
            return;
        }

        if(this._rBrace_ == child)
        {
            this._rBrace_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._lBrace_ == oldChild)
        {
            setLBrace((TLBrace) newChild);
            return;
        }

        for(ListIterator<PRuleset> i = this._ruleset_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PRuleset) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._rBrace_ == oldChild)
        {
            setRBrace((TRBrace) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
