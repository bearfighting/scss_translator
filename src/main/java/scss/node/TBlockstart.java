/* This file was generated by SableCC (http://www.sablecc.org/). */

package scss.node;

import scss.analysis.*;

@SuppressWarnings("nls")
public final class TBlockstart extends Token
{
    public TBlockstart()
    {
        super.setText("{");
    }

    public TBlockstart(int line, int pos)
    {
        super.setText("{");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TBlockstart(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTBlockstart(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TBlockstart text.");
    }
}