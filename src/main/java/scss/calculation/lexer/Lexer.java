/* This file was generated by SableCC (http://www.sablecc.org/). */

package scss.calculation.lexer;

import java.io.*;
import scss.calculation.node.*;

@SuppressWarnings("nls")
public class Lexer
{
    protected Token token;
    protected State state = State.INITIAL;

    private IPushbackReader in;
    private int line;
    private int pos;
    private boolean cr;
    private boolean eof;
    private final StringBuffer text = new StringBuffer();

    @SuppressWarnings("unused")
    protected void filter() throws LexerException, IOException
    {
        // Do nothing
    }

    public Lexer(@SuppressWarnings("hiding") final PushbackReader in)
    {
        this.in = new IPushbackReader() {

            private PushbackReader pushbackReader = in;
            
            @Override
            public void unread(int c) throws IOException {
                pushbackReader.unread(c);
            }
            
            @Override
            public int read() throws IOException {
                return pushbackReader.read();
            }
        };
    }
 
    public Lexer(@SuppressWarnings("hiding") IPushbackReader in)
    {
        this.in = in;
    }
 
    public Token peek() throws LexerException, IOException
    {
        while(this.token == null)
        {
            this.token = getToken();
            filter();
        }

        return this.token;
    }

    public Token next() throws LexerException, IOException
    {
        while(this.token == null)
        {
            this.token = getToken();
            filter();
        }

        Token result = this.token;
        this.token = null;
        return result;
    }

    protected Token getToken() throws IOException, LexerException
    {
        int dfa_state = 0;

        int start_pos = this.pos;
        int start_line = this.line;

        int accept_state = -1;
        int accept_token = -1;
        int accept_length = -1;
        int accept_pos = -1;
        int accept_line = -1;

        @SuppressWarnings("hiding") int[][][] gotoTable = Lexer.gotoTable[this.state.id()];
        @SuppressWarnings("hiding") int[] accept = Lexer.accept[this.state.id()];
        this.text.setLength(0);

        while(true)
        {
            int c = getChar();

            if(c != -1)
            {
                switch(c)
                {
                case 10:
                    if(this.cr)
                    {
                        this.cr = false;
                    }
                    else
                    {
                        this.line++;
                        this.pos = 0;
                    }
                    break;
                case 13:
                    this.line++;
                    this.pos = 0;
                    this.cr = true;
                    break;
                default:
                    this.pos++;
                    this.cr = false;
                    break;
                }

                this.text.append((char) c);

                do
                {
                    int oldState = (dfa_state < -1) ? (-2 -dfa_state) : dfa_state;

                    dfa_state = -1;

                    int[][] tmp1 =  gotoTable[oldState];
                    int low = 0;
                    int high = tmp1.length - 1;

                    while(low <= high)
                    {
                        // int middle = (low + high) / 2;
                        int middle = (low + high) >>> 1;
                        int[] tmp2 = tmp1[middle];

                        if(c < tmp2[0])
                        {
                            high = middle - 1;
                        }
                        else if(c > tmp2[1])
                        {
                            low = middle + 1;
                        }
                        else
                        {
                            dfa_state = tmp2[2];
                            break;
                        }
                    }
                }while(dfa_state < -1);
            }
            else
            {
                dfa_state = -1;
            }

            if(dfa_state >= 0)
            {
                if(accept[dfa_state] != -1)
                {
                    accept_state = dfa_state;
                    accept_token = accept[dfa_state];
                    accept_length = this.text.length();
                    accept_pos = this.pos;
                    accept_line = this.line;
                }
            }
            else
            {
                if(accept_state != -1)
                {
                    switch(accept_token)
                    {
                    case 0:
                        {
                            @SuppressWarnings("hiding") Token token = new0(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 1:
                        {
                            @SuppressWarnings("hiding") Token token = new1(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 2:
                        {
                            @SuppressWarnings("hiding") Token token = new2(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 3:
                        {
                            @SuppressWarnings("hiding") Token token = new3(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 4:
                        {
                            @SuppressWarnings("hiding") Token token = new4(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 5:
                        {
                            @SuppressWarnings("hiding") Token token = new5(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 6:
                        {
                            @SuppressWarnings("hiding") Token token = new6(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 7:
                        {
                            @SuppressWarnings("hiding") Token token = new7(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 8:
                        {
                            @SuppressWarnings("hiding") Token token = new8(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 9:
                        {
                            @SuppressWarnings("hiding") Token token = new9(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 10:
                        {
                            @SuppressWarnings("hiding") Token token = new10(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 11:
                        {
                            @SuppressWarnings("hiding") Token token = new11(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 12:
                        {
                            @SuppressWarnings("hiding") Token token = new12(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 13:
                        {
                            @SuppressWarnings("hiding") Token token = new13(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 14:
                        {
                            @SuppressWarnings("hiding") Token token = new14(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 15:
                        {
                            @SuppressWarnings("hiding") Token token = new15(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 16:
                        {
                            @SuppressWarnings("hiding") Token token = new16(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 17:
                        {
                            @SuppressWarnings("hiding") Token token = new17(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 18:
                        {
                            @SuppressWarnings("hiding") Token token = new18(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 19:
                        {
                            @SuppressWarnings("hiding") Token token = new19(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 20:
                        {
                            @SuppressWarnings("hiding") Token token = new20(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 21:
                        {
                            @SuppressWarnings("hiding") Token token = new21(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 22:
                        {
                            @SuppressWarnings("hiding") Token token = new22(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 23:
                        {
                            @SuppressWarnings("hiding") Token token = new23(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 24:
                        {
                            @SuppressWarnings("hiding") Token token = new24(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 25:
                        {
                            @SuppressWarnings("hiding") Token token = new25(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 26:
                        {
                            @SuppressWarnings("hiding") Token token = new26(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 27:
                        {
                            @SuppressWarnings("hiding") Token token = new27(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 28:
                        {
                            @SuppressWarnings("hiding") Token token = new28(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 29:
                        {
                            @SuppressWarnings("hiding") Token token = new29(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 30:
                        {
                            @SuppressWarnings("hiding") Token token = new30(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 31:
                        {
                            @SuppressWarnings("hiding") Token token = new31(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 32:
                        {
                            @SuppressWarnings("hiding") Token token = new32(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 33:
                        {
                            @SuppressWarnings("hiding") Token token = new33(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 34:
                        {
                            @SuppressWarnings("hiding") Token token = new34(
                                getText(accept_length),
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 35:
                        {
                            @SuppressWarnings("hiding") Token token = new35(
                                getText(accept_length),
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 36:
                        {
                            @SuppressWarnings("hiding") Token token = new36(
                                getText(accept_length),
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 37:
                        {
                            @SuppressWarnings("hiding") Token token = new37(
                                getText(accept_length),
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    }
                }
                else
                {
                    if(this.text.length() > 0)
                    {
                        throw new LexerException(
                            new InvalidToken(this.text.substring(0, 1), start_line + 1, start_pos + 1),
                            "[" + (start_line + 1) + "," + (start_pos + 1) + "]" +
                            " Unknown token: " + this.text);
                    }

                    @SuppressWarnings("hiding") EOF token = new EOF(
                        start_line + 1,
                        start_pos + 1);
                    return token;
                }
            }
        }
    }

    Token new0(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TDollar(line, pos); }
    Token new1(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TLBrace(line, pos); }
    Token new2(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TRBrace(line, pos); }
    Token new3(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TLPar(line, pos); }
    Token new4(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TRPar(line, pos); }
    Token new5(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TComma(line, pos); }
    Token new6(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TSemicolon(line, pos); }
    Token new7(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TAssign(line, pos); }
    Token new8(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TColon(line, pos); }
    Token new9(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TAnd(line, pos); }
    Token new10(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TOr(line, pos); }
    Token new11(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TEq(line, pos); }
    Token new12(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TNeq(line, pos); }
    Token new13(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TLt(line, pos); }
    Token new14(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TLteq(line, pos); }
    Token new15(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TGt(line, pos); }
    Token new16(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TGteq(line, pos); }
    Token new17(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TAdd(line, pos); }
    Token new18(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TSub(line, pos); }
    Token new19(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TMul(line, pos); }
    Token new20(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TDiv(line, pos); }
    Token new21(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TMod(line, pos); }
    Token new22(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TNot(line, pos); }
    Token new23(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TIf(line, pos); }
    Token new24(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TElse(line, pos); }
    Token new25(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TWhile(line, pos); }
    Token new26(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TPrint(line, pos); }
    Token new27(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TBoolean(line, pos); }
    Token new28(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TString(line, pos); }
    Token new29(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TInteger(line, pos); }
    Token new30(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TTrue(line, pos); }
    Token new31(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TFalse(line, pos); }
    Token new32(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TB2s(line, pos); }
    Token new33(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TI2s(line, pos); }
    Token new34(@SuppressWarnings("hiding") String text, @SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TIdentifier(text, line, pos); }
    Token new35(@SuppressWarnings("hiding") String text, @SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TStringLiteral(text, line, pos); }
    Token new36(@SuppressWarnings("hiding") String text, @SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TIntegerLiteral(text, line, pos); }
    Token new37(@SuppressWarnings("hiding") String text, @SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TBlank(text, line, pos); }

    private int getChar() throws IOException
    {
        if(this.eof)
        {
            return -1;
        }

        int result = this.in.read();

        if(result == -1)
        {
            this.eof = true;
        }

        return result;
    }

    private void pushBack(int acceptLength) throws IOException
    {
        int length = this.text.length();
        for(int i = length - 1; i >= acceptLength; i--)
        {
            this.eof = false;

            this.in.unread(this.text.charAt(i));
        }
    }

    protected void unread(@SuppressWarnings("hiding") Token token) throws IOException
    {
        @SuppressWarnings("hiding") String text = token.getText();
        int length = text.length();

        for(int i = length - 1; i >= 0; i--)
        {
            this.eof = false;

            this.in.unread(text.charAt(i));
        }

        this.pos = token.getPos() - 1;
        this.line = token.getLine() - 1;
    }

    private String getText(int acceptLength)
    {
        StringBuffer s = new StringBuffer(acceptLength);
        for(int i = 0; i < acceptLength; i++)
        {
            s.append(this.text.charAt(i));
        }

        return s.toString();
    }

    private static int[][][][] gotoTable;
/*  {
        { // INITIAL
            {{9, 9, 1}, {10, 10, 2}, {13, 13, 3}, {32, 32, 4}, {33, 33, 5}, {34, 34, 6}, {36, 36, 7}, {37, 37, 8}, {38, 38, 9}, {40, 40, 10}, {41, 41, 11}, {42, 42, 12}, {43, 43, 13}, {44, 44, 14}, {45, 45, 15}, {47, 47, 16}, {48, 57, 17}, {58, 58, 18}, {59, 59, 19}, {60, 60, 20}, {61, 61, 21}, {62, 62, 22}, {65, 90, 23}, {97, 97, 24}, {98, 98, 25}, {99, 100, 24}, {101, 101, 26}, {102, 102, 27}, {103, 104, 24}, {105, 105, 28}, {106, 111, 24}, {112, 112, 29}, {113, 114, 24}, {115, 115, 30}, {116, 116, 31}, {117, 118, 24}, {119, 119, 32}, {120, 122, 24}, {123, 123, 33}, {124, 124, 34}, {125, 125, 35}, },
            {{9, 32, -2}, },
            {{9, 32, -2}, },
            {{9, 32, -2}, },
            {{9, 32, -2}, },
            {{61, 61, 36}, },
            {{32, 33, 37}, {34, 34, 38}, {35, 126, 37}, },
            {{98, 98, 39}, {105, 105, 40}, },
            {},
            {{38, 38, 41}, },
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {{48, 57, 17}, },
            {},
            {},
            {{61, 61, 42}, },
            {{61, 61, 43}, },
            {{61, 61, 44}, },
            {{45, 45, 45}, {48, 57, 46}, {65, 90, 47}, {95, 95, 48}, {97, 122, 49}, },
            {{45, 122, -25}, },
            {{45, 95, -25}, {97, 110, 49}, {111, 111, 50}, {112, 122, 49}, },
            {{45, 95, -25}, {97, 107, 49}, {108, 108, 51}, {109, 122, 49}, },
            {{45, 95, -25}, {97, 97, 52}, {98, 122, 49}, },
            {{45, 95, -25}, {97, 101, 49}, {102, 102, 53}, {103, 109, 49}, {110, 110, 54}, {111, 122, 49}, },
            {{45, 95, -25}, {97, 113, 49}, {114, 114, 55}, {115, 122, 49}, },
            {{45, 95, -25}, {97, 115, 49}, {116, 116, 56}, {117, 122, 49}, },
            {{45, 113, -31}, {114, 114, 57}, {115, 122, 49}, },
            {{45, 95, -25}, {97, 103, 49}, {104, 104, 58}, {105, 122, 49}, },
            {},
            {{124, 124, 59}, },
            {},
            {},
            {{32, 126, -8}, },
            {{34, 34, 60}, },
            {{50, 50, 61}, },
            {{50, 50, 62}, },
            {},
            {},
            {},
            {},
            {{45, 122, -25}, },
            {{45, 122, -25}, },
            {{45, 122, -25}, },
            {{45, 122, -25}, },
            {{45, 122, -25}, },
            {{45, 110, -27}, {111, 111, 63}, {112, 122, 49}, },
            {{45, 95, -25}, {97, 114, 49}, {115, 115, 64}, {116, 122, 49}, },
            {{45, 107, -28}, {108, 108, 65}, {109, 122, 49}, },
            {{45, 122, -25}, },
            {{45, 115, -32}, {116, 116, 66}, {117, 122, 49}, },
            {{45, 95, -25}, {97, 104, 49}, {105, 105, 67}, {106, 122, 49}, },
            {{45, 113, -31}, {114, 114, 68}, {115, 122, 49}, },
            {{45, 95, -25}, {97, 116, 49}, {117, 117, 69}, {118, 122, 49}, },
            {{45, 104, -57}, {105, 105, 70}, {106, 122, 49}, },
            {},
            {{32, 126, -8}, },
            {{115, 115, 71}, },
            {{115, 115, 72}, },
            {{45, 107, -28}, {108, 108, 73}, {109, 122, 49}, },
            {{45, 95, -25}, {97, 100, 49}, {101, 101, 74}, {102, 122, 49}, },
            {{45, 114, -53}, {115, 115, 75}, {116, 122, 49}, },
            {{45, 100, -66}, {101, 101, 76}, {102, 122, 49}, },
            {{45, 95, -25}, {97, 109, 49}, {110, 110, 77}, {111, 122, 49}, },
            {{45, 104, -57}, {105, 105, 78}, {106, 122, 49}, },
            {{45, 100, -66}, {101, 101, 79}, {102, 122, 49}, },
            {{45, 107, -28}, {108, 108, 80}, {109, 122, 49}, },
            {},
            {},
            {{45, 100, -66}, {101, 101, 81}, {102, 122, 49}, },
            {{45, 122, -25}, },
            {{45, 100, -66}, {101, 101, 82}, {102, 122, 49}, },
            {{45, 95, -25}, {97, 102, 49}, {103, 103, 83}, {104, 122, 49}, },
            {{45, 115, -32}, {116, 116, 84}, {117, 122, 49}, },
            {{45, 109, -69}, {110, 110, 85}, {111, 122, 49}, },
            {{45, 122, -25}, },
            {{45, 100, -66}, {101, 101, 86}, {102, 122, 49}, },
            {{45, 95, -25}, {97, 97, 87}, {98, 122, 49}, },
            {{45, 122, -25}, },
            {{45, 100, -66}, {101, 101, 88}, {102, 122, 49}, },
            {{45, 122, -25}, },
            {{45, 102, -78}, {103, 103, 89}, {104, 122, 49}, },
            {{45, 122, -25}, },
            {{45, 109, -69}, {110, 110, 90}, {111, 122, 49}, },
            {{45, 113, -31}, {114, 114, 91}, {115, 122, 49}, },
            {{45, 122, -25}, },
            {{45, 122, -25}, },
            {{45, 122, -25}, },
        }
    };*/

    private static int[][] accept;
/*  {
        // INITIAL
        {-1, 37, 37, 37, 37, 22, -1, 0, 21, -1, 3, 4, 19, 17, 5, 18, 20, 36, 8, 6, 13, 7, 15, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 1, -1, 2, 12, -1, 35, -1, -1, 9, 14, 11, 16, 34, 34, 34, 34, 34, 34, 34, 34, 23, 34, 34, 34, 34, 34, 10, -1, -1, -1, 34, 34, 34, 34, 34, 34, 34, 34, 32, 33, 34, 24, 34, 34, 34, 34, 30, 34, 34, 31, 34, 26, 34, 25, 34, 34, 28, 27, 29, },

    };*/

    public static class State
    {
        public final static State INITIAL = new State(0);

        private int id;

        private State(@SuppressWarnings("hiding") int id)
        {
            this.id = id;
        }

        public int id()
        {
            return this.id;
        }
    }

    static 
    {
        try
        {
            DataInputStream s = new DataInputStream(
                new BufferedInputStream(
                Lexer.class.getResourceAsStream("lexer.dat")));

            // read gotoTable
            int length = s.readInt();
            gotoTable = new int[length][][][];
            for(int i = 0; i < gotoTable.length; i++)
            {
                length = s.readInt();
                gotoTable[i] = new int[length][][];
                for(int j = 0; j < gotoTable[i].length; j++)
                {
                    length = s.readInt();
                    gotoTable[i][j] = new int[length][3];
                    for(int k = 0; k < gotoTable[i][j].length; k++)
                    {
                        for(int l = 0; l < 3; l++)
                        {
                            gotoTable[i][j][k][l] = s.readInt();
                        }
                    }
                }
            }

            // read accept
            length = s.readInt();
            accept = new int[length][];
            for(int i = 0; i < accept.length; i++)
            {
                length = s.readInt();
                accept[i] = new int[length];
                for(int j = 0; j < accept[i].length; j++)
                {
                    accept[i][j] = s.readInt();
                }
            }

            s.close();
        }
        catch(Exception e)
        {
            throw new RuntimeException("The file \"lexer.dat\" is either missing or corrupted.");
        }
    }
}