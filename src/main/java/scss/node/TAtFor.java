/* This file was generated by SableCC (http://www.sablecc.org/). */

package scss.node;

import scss.analysis.*;

@SuppressWarnings("nls")
public final class TAtFor extends Token
{
    public TAtFor()
    {
        super.setText("@for");
    }

    public TAtFor(int line, int pos)
    {
        super.setText("@for");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TAtFor(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTAtFor(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TAtFor text.");
    }
}
