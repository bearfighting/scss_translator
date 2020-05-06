/* This file was generated by SableCC (http://www.sablecc.org/). */

package scss.calculation.node;

import scss.calculation.analysis.*;

@SuppressWarnings("nls")
public final class InvalidToken extends Token
{
    public InvalidToken(String text)
    {
        setText(text);
    }

    public InvalidToken(String text, int line, int pos)
    {
        setText(text);
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
        return new InvalidToken(getText(), getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseInvalidToken(this);
    }
}
