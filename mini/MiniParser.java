// Output created by jacc on Thu Feb 07 10:55:52 PST 2013

package mini;

import compiler.*;
import java.io.*;

class MiniParser extends Phase implements MiniTokens {
    private int yyss = 100;
    private int yytok;
    private int yysp = 0;
    private int[] yyst;
    protected int yyerrno = (-1);
    private Object[] yysv;
    private Object yyrv;

    public boolean parse() {
        int yyn = 0;
        yysp = 0;
        yyst = new int[yyss];
        yysv = new Object[yyss];
        yytok = (lexer.getToken()
                 );
    loop:
        for (;;) {
            switch (yyn) {
                case 0:
                    yyst[yysp] = 0;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 158:
                    yyn = yys0();
                    continue;

                case 1:
                    yyst[yysp] = 1;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 159:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = 316;
                            continue;
                    }
                    yyn = 319;
                    continue;

                case 2:
                    yyst[yysp] = 2;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 160:
                    yyn = yys2();
                    continue;

                case 3:
                    yyst[yysp] = 3;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 161:
                    yyn = yys3();
                    continue;

                case 4:
                    yyst[yysp] = 4;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 162:
                    switch (yytok) {
                        case IDENT:
                            yyn = 10;
                            continue;
                        case '[':
                            yyn = 11;
                            continue;
                    }
                    yyn = 319;
                    continue;

                case 5:
                    yyst[yysp] = 5;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 163:
                    switch (yytok) {
                        case '&':
                        case IDENT:
                        case '[':
                            yyn = yyr15();
                            continue;
                    }
                    yyn = 319;
                    continue;

                case 6:
                    yyst[yysp] = 6;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 164:
                    switch (yytok) {
                        case '&':
                        case IDENT:
                        case '[':
                            yyn = yyr16();
                            continue;
                    }
                    yyn = 319;
                    continue;

                case 7:
                    yyst[yysp] = 7;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 165:
                    switch (yytok) {
                        case BOOLEAN:
                            yyn = 5;
                            continue;
                        case DOUBLE:
                            yyn = 6;
                            continue;
                        case INT:
                            yyn = 8;
                            continue;
                        case VOID:
                            yyn = 13;
                            continue;
                    }
                    yyn = 319;
                    continue;

                case 8:
                    yyst[yysp] = 8;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 166:
                    switch (yytok) {
                        case '&':
                        case IDENT:
                        case '[':
                            yyn = yyr14();
                            continue;
                    }
                    yyn = 319;
                    continue;

                case 9:
                    yyst[yysp] = 9;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 167:
                    switch (yytok) {
                        case IDENT:
                            yyn = 14;
                            continue;
                    }
                    yyn = 319;
                    continue;

                case 10:
                    yyst[yysp] = 10;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 168:
                    switch (yytok) {
                        case '(':
                            yyn = 15;
                            continue;
                    }
                    yyn = 319;
                    continue;

                case 11:
                    yyst[yysp] = 11;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 169:
                    switch (yytok) {
                        case ']':
                            yyn = 16;
                            continue;
                    }
                    yyn = 319;
                    continue;

                case 12:
                    yyst[yysp] = 12;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 170:
                    switch (yytok) {
                        case '[':
                            yyn = 11;
                            continue;
                        case IDENT:
                            yyn = 17;
                            continue;
                    }
                    yyn = 319;
                    continue;

                case 13:
                    yyst[yysp] = 13;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 171:
                    switch (yytok) {
                        case IDENT:
                            yyn = 18;
                            continue;
                    }
                    yyn = 319;
                    continue;

                case 14:
                    yyst[yysp] = 14;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 172:
                    switch (yytok) {
                        case '(':
                            yyn = 19;
                            continue;
                    }
                    yyn = 319;
                    continue;

                case 15:
                    yyst[yysp] = 15;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 173:
                    switch (yytok) {
                        case BOOLEAN:
                            yyn = 5;
                            continue;
                        case DOUBLE:
                            yyn = 6;
                            continue;
                        case INT:
                            yyn = 8;
                            continue;
                        case ')':
                            yyn = yyr8();
                            continue;
                    }
                    yyn = 319;
                    continue;

                case 16:
                    yyst[yysp] = 16;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 174:
                    switch (yytok) {
                        case '&':
                        case IDENT:
                        case '[':
                            yyn = yyr17();
                            continue;
                    }
                    yyn = 319;
                    continue;

                case 17:
                    yyst[yysp] = 17;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 175:
                    switch (yytok) {
                        case '(':
                            yyn = 24;
                            continue;
                    }
                    yyn = 319;
                    continue;

                case 18:
                    yyst[yysp] = 18;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 176:
                    switch (yytok) {
                        case '(':
                            yyn = 25;
                            continue;
                    }
                    yyn = 319;
                    continue;

                case 19:
                    yyst[yysp] = 19;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 177:
                    switch (yytok) {
                        case BOOLEAN:
                            yyn = 5;
                            continue;
                        case DOUBLE:
                            yyn = 6;
                            continue;
                        case INT:
                            yyn = 8;
                            continue;
                        case ')':
                            yyn = yyr8();
                            continue;
                    }
                    yyn = 319;
                    continue;

                case 20:
                    yyst[yysp] = 20;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 178:
                    switch (yytok) {
                        case ',':
                            yyn = 27;
                            continue;
                        case ')':
                            yyn = yyr11();
                            continue;
                    }
                    yyn = 319;
                    continue;

                case 21:
                    yyst[yysp] = 21;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 179:
                    switch (yytok) {
                        case ')':
                            yyn = 28;
                            continue;
                    }
                    yyn = 319;
                    continue;

                case 22:
                    yyst[yysp] = 22;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 180:
                    switch (yytok) {
                        case ')':
                            yyn = yyr9();
                            continue;
                    }
                    yyn = 319;
                    continue;

                case 23:
                    yyst[yysp] = 23;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 181:
                    switch (yytok) {
                        case '[':
                            yyn = 11;
                            continue;
                        case IDENT:
                            yyn = 29;
                            continue;
                        case '&':
                            yyn = 30;
                            continue;
                    }
                    yyn = 319;
                    continue;

                case 24:
                    yyst[yysp] = 24;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 182:
                    switch (yytok) {
                        case BOOLEAN:
                            yyn = 5;
                            continue;
                        case DOUBLE:
                            yyn = 6;
                            continue;
                        case INT:
                            yyn = 8;
                            continue;
                        case ')':
                            yyn = yyr8();
                            continue;
                    }
                    yyn = 319;
                    continue;

                case 25:
                    yyst[yysp] = 25;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 183:
                    switch (yytok) {
                        case BOOLEAN:
                            yyn = 5;
                            continue;
                        case DOUBLE:
                            yyn = 6;
                            continue;
                        case INT:
                            yyn = 8;
                            continue;
                        case ')':
                            yyn = yyr8();
                            continue;
                    }
                    yyn = 319;
                    continue;

                case 26:
                    yyst[yysp] = 26;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 184:
                    switch (yytok) {
                        case ')':
                            yyn = 33;
                            continue;
                    }
                    yyn = 319;
                    continue;

                case 27:
                    yyst[yysp] = 27;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 185:
                    switch (yytok) {
                        case BOOLEAN:
                            yyn = 5;
                            continue;
                        case DOUBLE:
                            yyn = 6;
                            continue;
                        case INT:
                            yyn = 8;
                            continue;
                    }
                    yyn = 319;
                    continue;

                case 28:
                    yyst[yysp] = 28;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 186:
                    switch (yytok) {
                        case '{':
                            yyn = 35;
                            continue;
                    }
                    yyn = 319;
                    continue;

                case 29:
                    yyst[yysp] = 29;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 187:
                    switch (yytok) {
                        case ')':
                        case ',':
                            yyn = yyr12();
                            continue;
                    }
                    yyn = 319;
                    continue;

                case 30:
                    yyst[yysp] = 30;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 188:
                    switch (yytok) {
                        case IDENT:
                            yyn = 36;
                            continue;
                    }
                    yyn = 319;
                    continue;

                case 31:
                    yyst[yysp] = 31;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 189:
                    switch (yytok) {
                        case ')':
                            yyn = 37;
                            continue;
                    }
                    yyn = 319;
                    continue;

                case 32:
                    yyst[yysp] = 32;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 190:
                    switch (yytok) {
                        case ')':
                            yyn = 38;
                            continue;
                    }
                    yyn = 319;
                    continue;

                case 33:
                    yyst[yysp] = 33;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 191:
                    switch (yytok) {
                        case '{':
                            yyn = 39;
                            continue;
                    }
                    yyn = 319;
                    continue;

                case 34:
                    yyst[yysp] = 34;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 192:
                    switch (yytok) {
                        case ')':
                            yyn = yyr10();
                            continue;
                    }
                    yyn = 319;
                    continue;

                case 35:
                    yyst[yysp] = 35;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 193:
                    yyn = yys35();
                    continue;

                case 36:
                    yyst[yysp] = 36;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 194:
                    switch (yytok) {
                        case ')':
                        case ',':
                            yyn = yyr13();
                            continue;
                    }
                    yyn = 319;
                    continue;

                case 37:
                    yyst[yysp] = 37;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 195:
                    switch (yytok) {
                        case ';':
                            yyn = 41;
                            continue;
                    }
                    yyn = 319;
                    continue;

                case 38:
                    yyst[yysp] = 38;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 196:
                    switch (yytok) {
                        case ';':
                            yyn = 42;
                            continue;
                    }
                    yyn = 319;
                    continue;

                case 39:
                    yyst[yysp] = 39;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 197:
                    yyn = yys39();
                    continue;

                case 40:
                    yyst[yysp] = 40;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 198:
                    yyn = yys40();
                    continue;

                case 41:
                    yyst[yysp] = 41;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 199:
                    yyn = yys41();
                    continue;

                case 42:
                    yyst[yysp] = 42;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 200:
                    yyn = yys42();
                    continue;

                case 43:
                    yyst[yysp] = 43;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 201:
                    yyn = yys43();
                    continue;

                case 44:
                    yyst[yysp] = 44;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 202:
                    yyn = yys44();
                    continue;

                case 45:
                    yyst[yysp] = 45;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 203:
                    yyn = yys45();
                    continue;

                case 46:
                    yyst[yysp] = 46;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 204:
                    switch (yytok) {
                        case '[':
                            yyn = 11;
                            continue;
                        case IDENT:
                            yyn = 85;
                            continue;
                    }
                    yyn = 319;
                    continue;

                case 47:
                    yyst[yysp] = 47;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 205:
                    switch (yytok) {
                        case ',':
                            yyn = 86;
                            continue;
                        case ';':
                            yyn = 87;
                            continue;
                    }
                    yyn = 319;
                    continue;

                case 48:
                    yyst[yysp] = 48;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 206:
                    switch (yytok) {
                        case ';':
                            yyn = 88;
                            continue;
                    }
                    yyn = 319;
                    continue;

                case 49:
                    yyst[yysp] = 49;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 207:
                    switch (yytok) {
                        case ';':
                            yyn = 89;
                            continue;
                    }
                    yyn = 319;
                    continue;

                case 50:
                    yyst[yysp] = 50;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 208:
                    switch (yytok) {
                        case '(':
                            yyn = 90;
                            continue;
                    }
                    yyn = 319;
                    continue;

                case 51:
                    yyst[yysp] = 51;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 209:
                    yyn = yys51();
                    continue;

                case 52:
                    yyst[yysp] = 52;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 210:
                    switch (yytok) {
                        case '(':
                            yyn = 94;
                            continue;
                    }
                    yyn = 319;
                    continue;

                case 53:
                    yyst[yysp] = 53;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 211:
                    yyn = yys53();
                    continue;

                case 54:
                    yyst[yysp] = 54;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 212:
                    switch (yytok) {
                        case BOOLEAN:
                            yyn = 5;
                            continue;
                        case DOUBLE:
                            yyn = 6;
                            continue;
                        case INT:
                            yyn = 8;
                            continue;
                    }
                    yyn = 319;
                    continue;

                case 55:
                    yyst[yysp] = 55;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 213:
                    yyn = yys55();
                    continue;

                case 56:
                    yyst[yysp] = 56;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 214:
                    yyn = yys56();
                    continue;

                case 57:
                    yyst[yysp] = 57;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 215:
                    switch (yytok) {
                        case '(':
                            yyn = 94;
                            continue;
                    }
                    yyn = 319;
                    continue;

                case 58:
                    yyst[yysp] = 58;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 216:
                    yyn = yys58();
                    continue;

                case 59:
                    yyst[yysp] = 59;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 217:
                    yyn = yys59();
                    continue;

                case 60:
                    yyst[yysp] = 60;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 218:
                    yyn = yys60();
                    continue;

                case 61:
                    yyst[yysp] = 61;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 219:
                    yyn = yys61();
                    continue;

                case 62:
                    yyst[yysp] = 62;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 220:
                    yyn = yys62();
                    continue;

                case 63:
                    yyst[yysp] = 63;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 221:
                    yyn = yys63();
                    continue;

                case 64:
                    yyst[yysp] = 64;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 222:
                    yyn = yys64();
                    continue;

                case 65:
                    yyst[yysp] = 65;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 223:
                    yyn = yys65();
                    continue;

                case 66:
                    yyst[yysp] = 66;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 224:
                    yyn = yys66();
                    continue;

                case 67:
                    yyst[yysp] = 67;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 225:
                    yyn = yys67();
                    continue;

                case 68:
                    yyst[yysp] = 68;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 226:
                    yyn = yys68();
                    continue;

                case 69:
                    yyst[yysp] = 69;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 227:
                    yyn = yys69();
                    continue;

                case 70:
                    yyst[yysp] = 70;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 228:
                    yyn = yys70();
                    continue;

                case 71:
                    yyst[yysp] = 71;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 229:
                    yyn = yys71();
                    continue;

                case 72:
                    yyst[yysp] = 72;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 230:
                    yyn = yys72();
                    continue;

                case 73:
                    yyst[yysp] = 73;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 231:
                    yyn = yys73();
                    continue;

                case 74:
                    yyst[yysp] = 74;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 232:
                    yyn = yys74();
                    continue;

                case 75:
                    yyst[yysp] = 75;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 233:
                    yyn = yys75();
                    continue;

                case 76:
                    yyst[yysp] = 76;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 234:
                    yyn = yys76();
                    continue;

                case 77:
                    yyst[yysp] = 77;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 235:
                    yyn = yys77();
                    continue;

                case 78:
                    yyst[yysp] = 78;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 236:
                    yyn = yys78();
                    continue;

                case 79:
                    yyst[yysp] = 79;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 237:
                    yyn = yys79();
                    continue;

                case 80:
                    yyst[yysp] = 80;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 238:
                    yyn = yys80();
                    continue;

                case 81:
                    yyst[yysp] = 81;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 239:
                    yyn = yys81();
                    continue;

                case 82:
                    yyst[yysp] = 82;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 240:
                    yyn = yys82();
                    continue;

                case 83:
                    yyst[yysp] = 83;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 241:
                    yyn = yys83();
                    continue;

                case 84:
                    yyst[yysp] = 84;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 242:
                    switch (yytok) {
                        case ';':
                        case ',':
                            yyn = yyr38();
                            continue;
                    }
                    yyn = 319;
                    continue;

                case 85:
                    yyst[yysp] = 85;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 243:
                    switch (yytok) {
                        case '=':
                            yyn = 122;
                            continue;
                        case ';':
                        case ',':
                            yyn = yyr41();
                            continue;
                    }
                    yyn = 319;
                    continue;

                case 86:
                    yyst[yysp] = 86;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 244:
                    switch (yytok) {
                        case IDENT:
                            yyn = 85;
                            continue;
                    }
                    yyn = 319;
                    continue;

                case 87:
                    yyst[yysp] = 87;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 245:
                    yyn = yys87();
                    continue;

                case 88:
                    yyst[yysp] = 88;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 246:
                    yyn = yys88();
                    continue;

                case 89:
                    yyst[yysp] = 89;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 247:
                    yyn = yys89();
                    continue;

                case 90:
                    yyst[yysp] = 90;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 248:
                    yyn = yys90();
                    continue;

                case 91:
                    yyst[yysp] = 91;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 249:
                    yyn = yys91();
                    continue;

                case 92:
                    yyst[yysp] = 92;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 250:
                    yyn = yys92();
                    continue;

                case 93:
                    yyst[yysp] = 93;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 251:
                    yyn = yys93();
                    continue;

                case 94:
                    yyst[yysp] = 94;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 252:
                    yyn = yys94();
                    continue;

                case 95:
                    yyst[yysp] = 95;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 253:
                    switch (yytok) {
                        case '[':
                            yyn = 133;
                            continue;
                    }
                    yyn = 319;
                    continue;

                case 96:
                    yyst[yysp] = 96;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 254:
                    yyn = yys96();
                    continue;

                case 97:
                    yyst[yysp] = 97;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 255:
                    yyn = yys97();
                    continue;

                case 98:
                    yyst[yysp] = 98;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 256:
                    yyn = yys98();
                    continue;

                case 99:
                    yyst[yysp] = 99;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 257:
                    yyn = yys99();
                    continue;

                case 100:
                    yyst[yysp] = 100;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 258:
                    yyn = yys100();
                    continue;

                case 101:
                    yyst[yysp] = 101;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 259:
                    yyn = yys101();
                    continue;

                case 102:
                    yyst[yysp] = 102;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 260:
                    yyn = yys102();
                    continue;

                case 103:
                    yyst[yysp] = 103;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 261:
                    yyn = yys103();
                    continue;

                case 104:
                    yyst[yysp] = 104;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 262:
                    yyn = yys104();
                    continue;

                case 105:
                    yyst[yysp] = 105;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 263:
                    yyn = yys105();
                    continue;

                case 106:
                    yyst[yysp] = 106;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 264:
                    yyn = yys106();
                    continue;

                case 107:
                    yyst[yysp] = 107;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 265:
                    yyn = yys107();
                    continue;

                case 108:
                    yyst[yysp] = 108;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 266:
                    yyn = yys108();
                    continue;

                case 109:
                    yyst[yysp] = 109;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 267:
                    yyn = yys109();
                    continue;

                case 110:
                    yyst[yysp] = 110;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 268:
                    yyn = yys110();
                    continue;

                case 111:
                    yyst[yysp] = 111;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 269:
                    yyn = yys111();
                    continue;

                case 112:
                    yyst[yysp] = 112;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 270:
                    yyn = yys112();
                    continue;

                case 113:
                    yyst[yysp] = 113;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 271:
                    yyn = yys113();
                    continue;

                case 114:
                    yyst[yysp] = 114;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 272:
                    yyn = yys114();
                    continue;

                case 115:
                    yyst[yysp] = 115;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 273:
                    yyn = yys115();
                    continue;

                case 116:
                    yyst[yysp] = 116;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 274:
                    yyn = yys116();
                    continue;

                case 117:
                    yyst[yysp] = 117;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 275:
                    yyn = yys117();
                    continue;

                case 118:
                    yyst[yysp] = 118;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 276:
                    yyn = yys118();
                    continue;

                case 119:
                    yyst[yysp] = 119;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 277:
                    yyn = yys119();
                    continue;

                case 120:
                    yyst[yysp] = 120;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 278:
                    yyn = yys120();
                    continue;

                case 121:
                    yyst[yysp] = 121;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 279:
                    yyn = yys121();
                    continue;

                case 122:
                    yyst[yysp] = 122;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 280:
                    yyn = yys122();
                    continue;

                case 123:
                    yyst[yysp] = 123;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 281:
                    switch (yytok) {
                        case ';':
                        case ',':
                            yyn = yyr39();
                            continue;
                    }
                    yyn = 319;
                    continue;

                case 124:
                    yyst[yysp] = 124;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 282:
                    yyn = yys124();
                    continue;

                case 125:
                    yyst[yysp] = 125;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 283:
                    switch (yytok) {
                        case ';':
                            yyn = 141;
                            continue;
                    }
                    yyn = 319;
                    continue;

                case 126:
                    yyst[yysp] = 126;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 284:
                    switch (yytok) {
                        case ',':
                            yyn = 86;
                            continue;
                        case ';':
                            yyn = yyr35();
                            continue;
                    }
                    yyn = 319;
                    continue;

                case 127:
                    yyst[yysp] = 127;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 285:
                    switch (yytok) {
                        case ')':
                            yyn = yyr71();
                            continue;
                    }
                    yyn = 319;
                    continue;

                case 128:
                    yyst[yysp] = 128;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 286:
                    yyn = yys128();
                    continue;

                case 129:
                    yyst[yysp] = 129;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 287:
                    switch (yytok) {
                        case ')':
                            yyn = 143;
                            continue;
                    }
                    yyn = 319;
                    continue;

                case 130:
                    yyst[yysp] = 130;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 288:
                    yyn = yys130();
                    continue;

                case 131:
                    yyst[yysp] = 131;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 289:
                    yyn = yys131();
                    continue;

                case 132:
                    yyst[yysp] = 132;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 290:
                    yyn = yys132();
                    continue;

                case 133:
                    yyst[yysp] = 133;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 291:
                    yyn = yys133();
                    continue;

                case 134:
                    yyst[yysp] = 134;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 292:
                    yyn = yys134();
                    continue;

                case 135:
                    yyst[yysp] = 135;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 293:
                    yyn = yys135();
                    continue;

                case 136:
                    yyst[yysp] = 136;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 294:
                    yyn = yys136();
                    continue;

                case 137:
                    yyst[yysp] = 137;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 295:
                    yyn = yys137();
                    continue;

                case 138:
                    yyst[yysp] = 138;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 296:
                    yyn = yys138();
                    continue;

                case 139:
                    yyst[yysp] = 139;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 297:
                    yyn = yys139();
                    continue;

                case 140:
                    yyst[yysp] = 140;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 298:
                    yyn = yys140();
                    continue;

                case 141:
                    yyst[yysp] = 141;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 299:
                    yyn = yys141();
                    continue;

                case 142:
                    yyst[yysp] = 142;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 300:
                    yyn = yys142();
                    continue;

                case 143:
                    yyst[yysp] = 143;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 301:
                    yyn = yys143();
                    continue;

                case 144:
                    yyst[yysp] = 144;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 302:
                    yyn = yys144();
                    continue;

                case 145:
                    yyst[yysp] = 145;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 303:
                    yyn = yys145();
                    continue;

                case 146:
                    yyst[yysp] = 146;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 304:
                    yyn = yys146();
                    continue;

                case 147:
                    yyst[yysp] = 147;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 305:
                    yyn = yys147();
                    continue;

                case 148:
                    yyst[yysp] = 148;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 306:
                    yyn = yys148();
                    continue;

                case 149:
                    yyst[yysp] = 149;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 307:
                    switch (yytok) {
                        case ';':
                            yyn = 154;
                            continue;
                    }
                    yyn = 319;
                    continue;

                case 150:
                    yyst[yysp] = 150;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 308:
                    switch (yytok) {
                        case ')':
                            yyn = yyr72();
                            continue;
                    }
                    yyn = 319;
                    continue;

                case 151:
                    yyst[yysp] = 151;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 309:
                    yyn = yys151();
                    continue;

                case 152:
                    yyst[yysp] = 152;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 310:
                    yyn = yys152();
                    continue;

                case 153:
                    yyst[yysp] = 153;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 311:
                    yyn = yys153();
                    continue;

                case 154:
                    yyst[yysp] = 154;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 312:
                    yyn = yys154();
                    continue;

                case 155:
                    yyst[yysp] = 155;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 313:
                    switch (yytok) {
                        case ')':
                            yyn = 156;
                            continue;
                    }
                    yyn = 319;
                    continue;

                case 156:
                    yyst[yysp] = 156;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 314:
                    yyn = yys156();
                    continue;

                case 157:
                    yyst[yysp] = 157;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 315:
                    yyn = yys157();
                    continue;

                case 316:
                    return true;
                case 317:
                    yyerror("stack overflow");
                case 318:
                    return false;
                case 319:
                    yyerror("syntax error");
                    return false;
            }
        }
    }

    protected void yyexpand() {
        int[] newyyst = new int[2*yyst.length];
        Object[] newyysv = new Object[2*yyst.length];
        for (int i=0; i<yyst.length; i++) {
            newyyst[i] = yyst[i];
            newyysv[i] = yysv[i];
        }
        yyst = newyyst;
        yysv = newyysv;
    }

    private int yys0() {
        switch (yytok) {
            case EXTERN:
            case INT:
            case ENDINPUT:
            case VOID:
            case DOUBLE:
            case BOOLEAN:
                return yyr3();
        }
        return 319;
    }

    private int yys2() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case DOUBLE:
                return 6;
            case EXTERN:
                return 7;
            case INT:
                return 8;
            case VOID:
                return 9;
            case ENDINPUT:
                return yyr1();
        }
        return 319;
    }

    private int yys3() {
        switch (yytok) {
            case EXTERN:
            case INT:
            case ENDINPUT:
            case VOID:
            case DOUBLE:
            case BOOLEAN:
                return yyr2();
        }
        return 319;
    }

    private int yys35() {
        switch (yytok) {
            case '+':
            case '(':
            case '!':
            case INTLIT:
            case WHILE:
            case INT:
            case CONTINUE:
            case '}':
            case IF:
            case '{':
            case RETURN:
            case IDENT:
            case PRINT:
            case NEW:
            case ';':
            case '-':
            case FOR:
            case DOUBLE:
            case '~':
            case BREAK:
            case BOOLEAN:
                return yyr19();
        }
        return 319;
    }

    private int yys39() {
        switch (yytok) {
            case '+':
            case '(':
            case '!':
            case INTLIT:
            case WHILE:
            case INT:
            case CONTINUE:
            case '}':
            case IF:
            case '{':
            case RETURN:
            case IDENT:
            case PRINT:
            case NEW:
            case ';':
            case '-':
            case FOR:
            case DOUBLE:
            case '~':
            case BREAK:
            case BOOLEAN:
                return yyr19();
        }
        return 319;
    }

    private int yys40() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case DOUBLE:
                return 6;
            case INT:
                return 8;
            case BREAK:
                return 48;
            case CONTINUE:
                return 49;
            case FOR:
                return 50;
            case IDENT:
                return 51;
            case IF:
                return 52;
            case INTLIT:
                return 53;
            case NEW:
                return 54;
            case PRINT:
                return 55;
            case RETURN:
                return 56;
            case WHILE:
                return 57;
            case '!':
                return 58;
            case '(':
                return 59;
            case '+':
                return 60;
            case '-':
                return 61;
            case ';':
                return 62;
            case '{':
                return 63;
            case '}':
                return 64;
            case '~':
                return 65;
        }
        return 319;
    }

    private int yys41() {
        switch (yytok) {
            case EXTERN:
            case INT:
            case ENDINPUT:
            case VOID:
            case DOUBLE:
            case BOOLEAN:
                return yyr6();
        }
        return 319;
    }

    private int yys42() {
        switch (yytok) {
            case EXTERN:
            case INT:
            case ENDINPUT:
            case VOID:
            case DOUBLE:
            case BOOLEAN:
                return yyr7();
        }
        return 319;
    }

    private int yys43() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case DOUBLE:
                return 6;
            case INT:
                return 8;
            case BREAK:
                return 48;
            case CONTINUE:
                return 49;
            case FOR:
                return 50;
            case IDENT:
                return 51;
            case IF:
                return 52;
            case INTLIT:
                return 53;
            case NEW:
                return 54;
            case PRINT:
                return 55;
            case RETURN:
                return 56;
            case WHILE:
                return 57;
            case '!':
                return 58;
            case '(':
                return 59;
            case '+':
                return 60;
            case '-':
                return 61;
            case ';':
                return 62;
            case '{':
                return 63;
            case '~':
                return 65;
            case '}':
                return 66;
        }
        return 319;
    }

    private int yys44() {
        switch (yytok) {
            case EQL:
                return 67;
            case GTE:
                return 68;
            case LAND:
                return 69;
            case LOR:
                return 70;
            case LTE:
                return 71;
            case NEQ:
                return 72;
            case '&':
                return 73;
            case '*':
                return 74;
            case '+':
                return 75;
            case '-':
                return 76;
            case '/':
                return 77;
            case ';':
                return 78;
            case '<':
                return 79;
            case '>':
                return 80;
            case '[':
                return 81;
            case '^':
                return 82;
            case '|':
                return 83;
        }
        return 319;
    }

    private int yys45() {
        switch (yytok) {
            case '+':
            case '(':
            case '!':
            case INTLIT:
            case WHILE:
            case INT:
            case CONTINUE:
            case '}':
            case IF:
            case '{':
            case RETURN:
            case IDENT:
            case PRINT:
            case NEW:
            case ';':
            case '-':
            case FOR:
            case DOUBLE:
            case '~':
            case BREAK:
            case BOOLEAN:
                return yyr18();
        }
        return 319;
    }

    private int yys51() {
        switch (yytok) {
            case '(':
                return 91;
            case '=':
                return 92;
            case '*':
            case LOR:
            case ')':
            case '+':
            case LAND:
            case '&':
            case EQL:
            case '|':
            case '^':
            case ']':
            case '[':
            case '>':
            case '<':
            case GTE:
            case ';':
            case '/':
            case NEQ:
            case '-':
            case ',':
            case LTE:
                return yyr67();
        }
        return 319;
    }

    private int yys53() {
        switch (yytok) {
            case '*':
            case LOR:
            case ')':
            case '+':
            case LAND:
            case '&':
            case EQL:
            case '|':
            case '^':
            case ']':
            case '[':
            case '>':
            case '<':
            case GTE:
            case ';':
            case '/':
            case NEQ:
            case '-':
            case ',':
            case LTE:
                return yyr68();
        }
        return 319;
    }

    private int yys55() {
        switch (yytok) {
            case IDENT:
                return 51;
            case INTLIT:
                return 53;
            case NEW:
                return 54;
            case '!':
                return 58;
            case '(':
                return 59;
            case '+':
                return 60;
            case '-':
                return 61;
            case '~':
                return 65;
        }
        return 319;
    }

    private int yys56() {
        switch (yytok) {
            case IDENT:
                return 51;
            case INTLIT:
                return 53;
            case NEW:
                return 54;
            case '!':
                return 58;
            case '(':
                return 59;
            case '+':
                return 60;
            case '-':
                return 61;
            case '~':
                return 65;
            case ';':
                return 98;
        }
        return 319;
    }

    private int yys58() {
        switch (yytok) {
            case IDENT:
                return 51;
            case INTLIT:
                return 53;
            case NEW:
                return 54;
            case '!':
                return 58;
            case '(':
                return 59;
            case '+':
                return 60;
            case '-':
                return 61;
            case '~':
                return 65;
        }
        return 319;
    }

    private int yys59() {
        switch (yytok) {
            case IDENT:
                return 51;
            case INTLIT:
                return 53;
            case NEW:
                return 54;
            case '!':
                return 58;
            case '(':
                return 59;
            case '+':
                return 60;
            case '-':
                return 61;
            case '~':
                return 65;
        }
        return 319;
    }

    private int yys60() {
        switch (yytok) {
            case IDENT:
                return 51;
            case INTLIT:
                return 53;
            case NEW:
                return 54;
            case '!':
                return 58;
            case '(':
                return 59;
            case '+':
                return 60;
            case '-':
                return 61;
            case '~':
                return 65;
        }
        return 319;
    }

    private int yys61() {
        switch (yytok) {
            case IDENT:
                return 51;
            case INTLIT:
                return 53;
            case NEW:
                return 54;
            case '!':
                return 58;
            case '(':
                return 59;
            case '+':
                return 60;
            case '-':
                return 61;
            case '~':
                return 65;
        }
        return 319;
    }

    private int yys62() {
        switch (yytok) {
            case '+':
            case '(':
            case '!':
            case INTLIT:
            case WHILE:
            case INT:
            case CONTINUE:
            case '}':
            case IF:
            case '{':
            case RETURN:
            case IDENT:
            case ELSE:
            case PRINT:
            case NEW:
            case ';':
            case '-':
            case FOR:
            case DOUBLE:
            case '~':
            case BREAK:
            case BOOLEAN:
                return yyr20();
        }
        return 319;
    }

    private int yys63() {
        switch (yytok) {
            case '+':
            case '(':
            case '!':
            case INTLIT:
            case WHILE:
            case INT:
            case CONTINUE:
            case '}':
            case IF:
            case '{':
            case RETURN:
            case IDENT:
            case PRINT:
            case NEW:
            case ';':
            case '-':
            case FOR:
            case DOUBLE:
            case '~':
            case BREAK:
            case BOOLEAN:
                return yyr19();
        }
        return 319;
    }

    private int yys64() {
        switch (yytok) {
            case EXTERN:
            case INT:
            case ENDINPUT:
            case VOID:
            case DOUBLE:
            case BOOLEAN:
                return yyr4();
        }
        return 319;
    }

    private int yys65() {
        switch (yytok) {
            case IDENT:
                return 51;
            case INTLIT:
                return 53;
            case NEW:
                return 54;
            case '!':
                return 58;
            case '(':
                return 59;
            case '+':
                return 60;
            case '-':
                return 61;
            case '~':
                return 65;
        }
        return 319;
    }

    private int yys66() {
        switch (yytok) {
            case EXTERN:
            case INT:
            case ENDINPUT:
            case VOID:
            case DOUBLE:
            case BOOLEAN:
                return yyr5();
        }
        return 319;
    }

    private int yys67() {
        switch (yytok) {
            case IDENT:
                return 51;
            case INTLIT:
                return 53;
            case NEW:
                return 54;
            case '!':
                return 58;
            case '(':
                return 59;
            case '+':
                return 60;
            case '-':
                return 61;
            case '~':
                return 65;
        }
        return 319;
    }

    private int yys68() {
        switch (yytok) {
            case IDENT:
                return 51;
            case INTLIT:
                return 53;
            case NEW:
                return 54;
            case '!':
                return 58;
            case '(':
                return 59;
            case '+':
                return 60;
            case '-':
                return 61;
            case '~':
                return 65;
        }
        return 319;
    }

    private int yys69() {
        switch (yytok) {
            case IDENT:
                return 51;
            case INTLIT:
                return 53;
            case NEW:
                return 54;
            case '!':
                return 58;
            case '(':
                return 59;
            case '+':
                return 60;
            case '-':
                return 61;
            case '~':
                return 65;
        }
        return 319;
    }

    private int yys70() {
        switch (yytok) {
            case IDENT:
                return 51;
            case INTLIT:
                return 53;
            case NEW:
                return 54;
            case '!':
                return 58;
            case '(':
                return 59;
            case '+':
                return 60;
            case '-':
                return 61;
            case '~':
                return 65;
        }
        return 319;
    }

    private int yys71() {
        switch (yytok) {
            case IDENT:
                return 51;
            case INTLIT:
                return 53;
            case NEW:
                return 54;
            case '!':
                return 58;
            case '(':
                return 59;
            case '+':
                return 60;
            case '-':
                return 61;
            case '~':
                return 65;
        }
        return 319;
    }

    private int yys72() {
        switch (yytok) {
            case IDENT:
                return 51;
            case INTLIT:
                return 53;
            case NEW:
                return 54;
            case '!':
                return 58;
            case '(':
                return 59;
            case '+':
                return 60;
            case '-':
                return 61;
            case '~':
                return 65;
        }
        return 319;
    }

    private int yys73() {
        switch (yytok) {
            case IDENT:
                return 51;
            case INTLIT:
                return 53;
            case NEW:
                return 54;
            case '!':
                return 58;
            case '(':
                return 59;
            case '+':
                return 60;
            case '-':
                return 61;
            case '~':
                return 65;
        }
        return 319;
    }

    private int yys74() {
        switch (yytok) {
            case IDENT:
                return 51;
            case INTLIT:
                return 53;
            case NEW:
                return 54;
            case '!':
                return 58;
            case '(':
                return 59;
            case '+':
                return 60;
            case '-':
                return 61;
            case '~':
                return 65;
        }
        return 319;
    }

    private int yys75() {
        switch (yytok) {
            case IDENT:
                return 51;
            case INTLIT:
                return 53;
            case NEW:
                return 54;
            case '!':
                return 58;
            case '(':
                return 59;
            case '+':
                return 60;
            case '-':
                return 61;
            case '~':
                return 65;
        }
        return 319;
    }

    private int yys76() {
        switch (yytok) {
            case IDENT:
                return 51;
            case INTLIT:
                return 53;
            case NEW:
                return 54;
            case '!':
                return 58;
            case '(':
                return 59;
            case '+':
                return 60;
            case '-':
                return 61;
            case '~':
                return 65;
        }
        return 319;
    }

    private int yys77() {
        switch (yytok) {
            case IDENT:
                return 51;
            case INTLIT:
                return 53;
            case NEW:
                return 54;
            case '!':
                return 58;
            case '(':
                return 59;
            case '+':
                return 60;
            case '-':
                return 61;
            case '~':
                return 65;
        }
        return 319;
    }

    private int yys78() {
        switch (yytok) {
            case '+':
            case '(':
            case '!':
            case INTLIT:
            case WHILE:
            case INT:
            case CONTINUE:
            case '}':
            case IF:
            case '{':
            case RETURN:
            case IDENT:
            case ELSE:
            case PRINT:
            case NEW:
            case ';':
            case '-':
            case FOR:
            case DOUBLE:
            case '~':
            case BREAK:
            case BOOLEAN:
                return yyr22();
        }
        return 319;
    }

    private int yys79() {
        switch (yytok) {
            case IDENT:
                return 51;
            case INTLIT:
                return 53;
            case NEW:
                return 54;
            case '!':
                return 58;
            case '(':
                return 59;
            case '+':
                return 60;
            case '-':
                return 61;
            case '~':
                return 65;
        }
        return 319;
    }

    private int yys80() {
        switch (yytok) {
            case IDENT:
                return 51;
            case INTLIT:
                return 53;
            case NEW:
                return 54;
            case '!':
                return 58;
            case '(':
                return 59;
            case '+':
                return 60;
            case '-':
                return 61;
            case '~':
                return 65;
        }
        return 319;
    }

    private int yys81() {
        switch (yytok) {
            case IDENT:
                return 51;
            case INTLIT:
                return 53;
            case NEW:
                return 54;
            case '!':
                return 58;
            case '(':
                return 59;
            case '+':
                return 60;
            case '-':
                return 61;
            case '~':
                return 65;
        }
        return 319;
    }

    private int yys82() {
        switch (yytok) {
            case IDENT:
                return 51;
            case INTLIT:
                return 53;
            case NEW:
                return 54;
            case '!':
                return 58;
            case '(':
                return 59;
            case '+':
                return 60;
            case '-':
                return 61;
            case '~':
                return 65;
        }
        return 319;
    }

    private int yys83() {
        switch (yytok) {
            case IDENT:
                return 51;
            case INTLIT:
                return 53;
            case NEW:
                return 54;
            case '!':
                return 58;
            case '(':
                return 59;
            case '+':
                return 60;
            case '-':
                return 61;
            case '~':
                return 65;
        }
        return 319;
    }

    private int yys87() {
        switch (yytok) {
            case '+':
            case '(':
            case '!':
            case INTLIT:
            case WHILE:
            case INT:
            case CONTINUE:
            case '}':
            case IF:
            case '{':
            case RETURN:
            case IDENT:
            case ELSE:
            case PRINT:
            case NEW:
            case ';':
            case '-':
            case FOR:
            case DOUBLE:
            case '~':
            case BREAK:
            case BOOLEAN:
                return yyr21();
        }
        return 319;
    }

    private int yys88() {
        switch (yytok) {
            case '+':
            case '(':
            case '!':
            case INTLIT:
            case WHILE:
            case INT:
            case CONTINUE:
            case '}':
            case IF:
            case '{':
            case RETURN:
            case IDENT:
            case ELSE:
            case PRINT:
            case NEW:
            case ';':
            case '-':
            case FOR:
            case DOUBLE:
            case '~':
            case BREAK:
            case BOOLEAN:
                return yyr31();
        }
        return 319;
    }

    private int yys89() {
        switch (yytok) {
            case '+':
            case '(':
            case '!':
            case INTLIT:
            case WHILE:
            case INT:
            case CONTINUE:
            case '}':
            case IF:
            case '{':
            case RETURN:
            case IDENT:
            case ELSE:
            case PRINT:
            case NEW:
            case ';':
            case '-':
            case FOR:
            case DOUBLE:
            case '~':
            case BREAK:
            case BOOLEAN:
                return yyr32();
        }
        return 319;
    }

    private int yys90() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case DOUBLE:
                return 6;
            case INT:
                return 8;
            case IDENT:
                return 51;
            case INTLIT:
                return 53;
            case NEW:
                return 54;
            case '!':
                return 58;
            case '(':
                return 59;
            case '+':
                return 60;
            case '-':
                return 61;
            case '~':
                return 65;
            case ';':
                return yyr37();
        }
        return 319;
    }

    private int yys91() {
        switch (yytok) {
            case IDENT:
                return 51;
            case INTLIT:
                return 53;
            case NEW:
                return 54;
            case '!':
                return 58;
            case '(':
                return 59;
            case '+':
                return 60;
            case '-':
                return 61;
            case '~':
                return 65;
            case ')':
                return yyr70();
        }
        return 319;
    }

    private int yys92() {
        switch (yytok) {
            case IDENT:
                return 51;
            case INTLIT:
                return 53;
            case NEW:
                return 54;
            case '!':
                return 58;
            case '(':
                return 59;
            case '+':
                return 60;
            case '-':
                return 61;
            case '~':
                return 65;
        }
        return 319;
    }

    private int yys93() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case DOUBLE:
                return 6;
            case INT:
                return 8;
            case BREAK:
                return 48;
            case CONTINUE:
                return 49;
            case FOR:
                return 50;
            case IDENT:
                return 51;
            case IF:
                return 52;
            case INTLIT:
                return 53;
            case NEW:
                return 54;
            case PRINT:
                return 55;
            case RETURN:
                return 56;
            case WHILE:
                return 57;
            case '!':
                return 58;
            case '(':
                return 59;
            case '+':
                return 60;
            case '-':
                return 61;
            case ';':
                return 62;
            case '{':
                return 63;
            case '~':
                return 65;
        }
        return 319;
    }

    private int yys94() {
        switch (yytok) {
            case IDENT:
                return 51;
            case INTLIT:
                return 53;
            case NEW:
                return 54;
            case '!':
                return 58;
            case '(':
                return 59;
            case '+':
                return 60;
            case '-':
                return 61;
            case '~':
                return 65;
        }
        return 319;
    }

    private int yys96() {
        switch (yytok) {
            case EQL:
                return 67;
            case GTE:
                return 68;
            case LAND:
                return 69;
            case LOR:
                return 70;
            case LTE:
                return 71;
            case NEQ:
                return 72;
            case '&':
                return 73;
            case '*':
                return 74;
            case '+':
                return 75;
            case '-':
                return 76;
            case '/':
                return 77;
            case '<':
                return 79;
            case '>':
                return 80;
            case '[':
                return 81;
            case '^':
                return 82;
            case '|':
                return 83;
            case ';':
                return 134;
        }
        return 319;
    }

    private int yys97() {
        switch (yytok) {
            case EQL:
                return 67;
            case GTE:
                return 68;
            case LAND:
                return 69;
            case LOR:
                return 70;
            case LTE:
                return 71;
            case NEQ:
                return 72;
            case '&':
                return 73;
            case '*':
                return 74;
            case '+':
                return 75;
            case '-':
                return 76;
            case '/':
                return 77;
            case '<':
                return 79;
            case '>':
                return 80;
            case '[':
                return 81;
            case '^':
                return 82;
            case '|':
                return 83;
            case ';':
                return 135;
        }
        return 319;
    }

    private int yys98() {
        switch (yytok) {
            case '+':
            case '(':
            case '!':
            case INTLIT:
            case WHILE:
            case INT:
            case CONTINUE:
            case '}':
            case IF:
            case '{':
            case RETURN:
            case IDENT:
            case ELSE:
            case PRINT:
            case NEW:
            case ';':
            case '-':
            case FOR:
            case DOUBLE:
            case '~':
            case BREAK:
            case BOOLEAN:
                return yyr28();
        }
        return 319;
    }

    private int yys99() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case DOUBLE:
                return 6;
            case INT:
                return 8;
            case BREAK:
                return 48;
            case CONTINUE:
                return 49;
            case FOR:
                return 50;
            case IDENT:
                return 51;
            case IF:
                return 52;
            case INTLIT:
                return 53;
            case NEW:
                return 54;
            case PRINT:
                return 55;
            case RETURN:
                return 56;
            case WHILE:
                return 57;
            case '!':
                return 58;
            case '(':
                return 59;
            case '+':
                return 60;
            case '-':
                return 61;
            case ';':
                return 62;
            case '{':
                return 63;
            case '~':
                return 65;
        }
        return 319;
    }

    private int yys100() {
        switch (yytok) {
            case '[':
                return 81;
            case '+':
            case '*':
            case LOR:
            case ')':
            case LAND:
            case '&':
            case EQL:
            case '|':
            case '^':
            case ']':
            case '>':
            case '<':
            case GTE:
            case ';':
            case '/':
            case NEQ:
            case '-':
            case ',':
            case LTE:
                return yyr45();
        }
        return 319;
    }

    private int yys101() {
        switch (yytok) {
            case EQL:
                return 67;
            case GTE:
                return 68;
            case LAND:
                return 69;
            case LOR:
                return 70;
            case LTE:
                return 71;
            case NEQ:
                return 72;
            case '&':
                return 73;
            case '*':
                return 74;
            case '+':
                return 75;
            case '-':
                return 76;
            case '/':
                return 77;
            case '<':
                return 79;
            case '>':
                return 80;
            case '[':
                return 81;
            case '^':
                return 82;
            case '|':
                return 83;
            case ')':
                return 137;
        }
        return 319;
    }

    private int yys102() {
        switch (yytok) {
            case '[':
                return 81;
            case '+':
            case '*':
            case LOR:
            case ')':
            case LAND:
            case '&':
            case EQL:
            case '|':
            case '^':
            case ']':
            case '>':
            case '<':
            case GTE:
            case ';':
            case '/':
            case NEQ:
            case '-':
            case ',':
            case LTE:
                return yyr44();
        }
        return 319;
    }

    private int yys103() {
        switch (yytok) {
            case '[':
                return 81;
            case '+':
            case '*':
            case LOR:
            case ')':
            case LAND:
            case '&':
            case EQL:
            case '|':
            case '^':
            case ']':
            case '>':
            case '<':
            case GTE:
            case ';':
            case '/':
            case NEQ:
            case '-':
            case ',':
            case LTE:
                return yyr43();
        }
        return 319;
    }

    private int yys104() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case DOUBLE:
                return 6;
            case INT:
                return 8;
            case BREAK:
                return 48;
            case CONTINUE:
                return 49;
            case FOR:
                return 50;
            case IDENT:
                return 51;
            case IF:
                return 52;
            case INTLIT:
                return 53;
            case NEW:
                return 54;
            case PRINT:
                return 55;
            case RETURN:
                return 56;
            case WHILE:
                return 57;
            case '!':
                return 58;
            case '(':
                return 59;
            case '+':
                return 60;
            case '-':
                return 61;
            case ';':
                return 62;
            case '{':
                return 63;
            case '~':
                return 65;
            case '}':
                return 138;
        }
        return 319;
    }

    private int yys105() {
        switch (yytok) {
            case '[':
                return 81;
            case '+':
            case '*':
            case LOR:
            case ')':
            case LAND:
            case '&':
            case EQL:
            case '|':
            case '^':
            case ']':
            case '>':
            case '<':
            case GTE:
            case ';':
            case '/':
            case NEQ:
            case '-':
            case ',':
            case LTE:
                return yyr46();
        }
        return 319;
    }

    private int yys106() {
        switch (yytok) {
            case GTE:
                return 68;
            case LTE:
                return 71;
            case '*':
                return 74;
            case '+':
                return 75;
            case '-':
                return 76;
            case '/':
                return 77;
            case '<':
                return 79;
            case '>':
                return 80;
            case '[':
                return 81;
            case LOR:
            case ')':
            case LAND:
            case '&':
            case EQL:
            case '|':
            case '^':
            case ']':
            case ';':
            case NEQ:
            case ',':
                return yyr56();
        }
        return 319;
    }

    private int yys107() {
        switch (yytok) {
            case '*':
                return 74;
            case '+':
                return 75;
            case '-':
                return 76;
            case '/':
                return 77;
            case '[':
                return 81;
            case LOR:
            case ')':
            case LAND:
            case '&':
            case EQL:
            case '|':
            case '^':
            case ']':
            case '>':
            case '<':
            case GTE:
            case ';':
            case NEQ:
            case ',':
            case LTE:
                return yyr54();
        }
        return 319;
    }

    private int yys108() {
        switch (yytok) {
            case EQL:
                return 67;
            case GTE:
                return 68;
            case LTE:
                return 71;
            case NEQ:
                return 72;
            case '&':
                return 73;
            case '*':
                return 74;
            case '+':
                return 75;
            case '-':
                return 76;
            case '/':
                return 77;
            case '<':
                return 79;
            case '>':
                return 80;
            case '[':
                return 81;
            case '^':
                return 82;
            case '|':
                return 83;
            case LOR:
            case ')':
            case LAND:
            case ']':
            case ';':
            case ',':
                return yyr60();
        }
        return 319;
    }

    private int yys109() {
        switch (yytok) {
            case EQL:
                return 67;
            case GTE:
                return 68;
            case LAND:
                return 69;
            case LTE:
                return 71;
            case NEQ:
                return 72;
            case '&':
                return 73;
            case '*':
                return 74;
            case '+':
                return 75;
            case '-':
                return 76;
            case '/':
                return 77;
            case '<':
                return 79;
            case '>':
                return 80;
            case '[':
                return 81;
            case '^':
                return 82;
            case '|':
                return 83;
            case LOR:
            case ')':
            case ']':
            case ';':
            case ',':
                return yyr61();
        }
        return 319;
    }

    private int yys110() {
        switch (yytok) {
            case '*':
                return 74;
            case '+':
                return 75;
            case '-':
                return 76;
            case '/':
                return 77;
            case '[':
                return 81;
            case LOR:
            case ')':
            case LAND:
            case '&':
            case EQL:
            case '|':
            case '^':
            case ']':
            case '>':
            case '<':
            case GTE:
            case ';':
            case NEQ:
            case ',':
            case LTE:
                return yyr53();
        }
        return 319;
    }

    private int yys111() {
        switch (yytok) {
            case GTE:
                return 68;
            case LTE:
                return 71;
            case '*':
                return 74;
            case '+':
                return 75;
            case '-':
                return 76;
            case '/':
                return 77;
            case '<':
                return 79;
            case '>':
                return 80;
            case '[':
                return 81;
            case LOR:
            case ')':
            case LAND:
            case '&':
            case EQL:
            case '|':
            case '^':
            case ']':
            case ';':
            case NEQ:
            case ',':
                return yyr55();
        }
        return 319;
    }

    private int yys112() {
        switch (yytok) {
            case EQL:
                return 67;
            case GTE:
                return 68;
            case LTE:
                return 71;
            case NEQ:
                return 72;
            case '*':
                return 74;
            case '+':
                return 75;
            case '-':
                return 76;
            case '/':
                return 77;
            case '<':
                return 79;
            case '>':
                return 80;
            case '[':
                return 81;
            case LOR:
            case ')':
            case LAND:
            case '&':
            case '|':
            case '^':
            case ']':
            case ';':
            case ',':
                return yyr57();
        }
        return 319;
    }

    private int yys113() {
        switch (yytok) {
            case '[':
                return 81;
            case '+':
            case '*':
            case LOR:
            case ')':
            case LAND:
            case '&':
            case EQL:
            case '|':
            case '^':
            case ']':
            case '>':
            case '<':
            case GTE:
            case ';':
            case '/':
            case NEQ:
            case '-':
            case ',':
            case LTE:
                return yyr49();
        }
        return 319;
    }

    private int yys114() {
        switch (yytok) {
            case '*':
                return 74;
            case '/':
                return 77;
            case '[':
                return 81;
            case '+':
            case LOR:
            case ')':
            case LAND:
            case '&':
            case EQL:
            case '|':
            case '^':
            case ']':
            case '>':
            case '<':
            case GTE:
            case ';':
            case NEQ:
            case '-':
            case ',':
            case LTE:
                return yyr47();
        }
        return 319;
    }

    private int yys115() {
        switch (yytok) {
            case '*':
                return 74;
            case '/':
                return 77;
            case '[':
                return 81;
            case '+':
            case LOR:
            case ')':
            case LAND:
            case '&':
            case EQL:
            case '|':
            case '^':
            case ']':
            case '>':
            case '<':
            case GTE:
            case ';':
            case NEQ:
            case '-':
            case ',':
            case LTE:
                return yyr48();
        }
        return 319;
    }

    private int yys116() {
        switch (yytok) {
            case '[':
                return 81;
            case '+':
            case '*':
            case LOR:
            case ')':
            case LAND:
            case '&':
            case EQL:
            case '|':
            case '^':
            case ']':
            case '>':
            case '<':
            case GTE:
            case ';':
            case '/':
            case NEQ:
            case '-':
            case ',':
            case LTE:
                return yyr50();
        }
        return 319;
    }

    private int yys117() {
        switch (yytok) {
            case '*':
                return 74;
            case '+':
                return 75;
            case '-':
                return 76;
            case '/':
                return 77;
            case '[':
                return 81;
            case LOR:
            case ')':
            case LAND:
            case '&':
            case EQL:
            case '|':
            case '^':
            case ']':
            case '>':
            case '<':
            case GTE:
            case ';':
            case NEQ:
            case ',':
            case LTE:
                return yyr51();
        }
        return 319;
    }

    private int yys118() {
        switch (yytok) {
            case '*':
                return 74;
            case '+':
                return 75;
            case '-':
                return 76;
            case '/':
                return 77;
            case '[':
                return 81;
            case LOR:
            case ')':
            case LAND:
            case '&':
            case EQL:
            case '|':
            case '^':
            case ']':
            case '>':
            case '<':
            case GTE:
            case ';':
            case NEQ:
            case ',':
            case LTE:
                return yyr52();
        }
        return 319;
    }

    private int yys119() {
        switch (yytok) {
            case EQL:
                return 67;
            case GTE:
                return 68;
            case LAND:
                return 69;
            case LOR:
                return 70;
            case LTE:
                return 71;
            case NEQ:
                return 72;
            case '&':
                return 73;
            case '*':
                return 74;
            case '+':
                return 75;
            case '-':
                return 76;
            case '/':
                return 77;
            case '<':
                return 79;
            case '>':
                return 80;
            case '[':
                return 81;
            case '^':
                return 82;
            case '|':
                return 83;
            case ']':
                return 139;
        }
        return 319;
    }

    private int yys120() {
        switch (yytok) {
            case EQL:
                return 67;
            case GTE:
                return 68;
            case LTE:
                return 71;
            case NEQ:
                return 72;
            case '&':
                return 73;
            case '*':
                return 74;
            case '+':
                return 75;
            case '-':
                return 76;
            case '/':
                return 77;
            case '<':
                return 79;
            case '>':
                return 80;
            case '[':
                return 81;
            case LOR:
            case ')':
            case LAND:
            case '|':
            case '^':
            case ']':
            case ';':
            case ',':
                return yyr59();
        }
        return 319;
    }

    private int yys121() {
        switch (yytok) {
            case EQL:
                return 67;
            case GTE:
                return 68;
            case LTE:
                return 71;
            case NEQ:
                return 72;
            case '&':
                return 73;
            case '*':
                return 74;
            case '+':
                return 75;
            case '-':
                return 76;
            case '/':
                return 77;
            case '<':
                return 79;
            case '>':
                return 80;
            case '[':
                return 81;
            case '^':
                return 82;
            case LOR:
            case ')':
            case LAND:
            case '|':
            case ']':
            case ';':
            case ',':
                return yyr58();
        }
        return 319;
    }

    private int yys122() {
        switch (yytok) {
            case IDENT:
                return 51;
            case INTLIT:
                return 53;
            case NEW:
                return 54;
            case '!':
                return 58;
            case '(':
                return 59;
            case '+':
                return 60;
            case '-':
                return 61;
            case '~':
                return 65;
        }
        return 319;
    }

    private int yys124() {
        switch (yytok) {
            case EQL:
                return 67;
            case GTE:
                return 68;
            case LAND:
                return 69;
            case LOR:
                return 70;
            case LTE:
                return 71;
            case NEQ:
                return 72;
            case '&':
                return 73;
            case '*':
                return 74;
            case '+':
                return 75;
            case '-':
                return 76;
            case '/':
                return 77;
            case '<':
                return 79;
            case '>':
                return 80;
            case '[':
                return 81;
            case '^':
                return 82;
            case '|':
                return 83;
            case ';':
                return yyr36();
        }
        return 319;
    }

    private int yys128() {
        switch (yytok) {
            case EQL:
                return 67;
            case GTE:
                return 68;
            case LAND:
                return 69;
            case LOR:
                return 70;
            case LTE:
                return 71;
            case NEQ:
                return 72;
            case '&':
                return 73;
            case '*':
                return 74;
            case '+':
                return 75;
            case '-':
                return 76;
            case '/':
                return 77;
            case '<':
                return 79;
            case '>':
                return 80;
            case '[':
                return 81;
            case '^':
                return 82;
            case '|':
                return 83;
            case ',':
                return 142;
            case ')':
                return yyr73();
        }
        return 319;
    }

    private int yys130() {
        switch (yytok) {
            case EQL:
                return 67;
            case GTE:
                return 68;
            case LAND:
                return 69;
            case LOR:
                return 70;
            case LTE:
                return 71;
            case NEQ:
                return 72;
            case '&':
                return 73;
            case '*':
                return 74;
            case '+':
                return 75;
            case '-':
                return 76;
            case '/':
                return 77;
            case '<':
                return 79;
            case '>':
                return 80;
            case '[':
                return 81;
            case '^':
                return 82;
            case '|':
                return 83;
            case ')':
            case ']':
            case ';':
            case ',':
                return yyr63();
        }
        return 319;
    }

    private int yys131() {
        switch (yytok) {
            case ELSE:
                return 144;
            case '+':
            case '(':
            case '!':
            case INTLIT:
            case WHILE:
            case INT:
            case CONTINUE:
            case '}':
            case IF:
            case '{':
            case RETURN:
            case IDENT:
            case PRINT:
            case NEW:
            case ';':
            case '-':
            case FOR:
            case DOUBLE:
            case '~':
            case BREAK:
            case BOOLEAN:
                return yyr25();
        }
        return 319;
    }

    private int yys132() {
        switch (yytok) {
            case EQL:
                return 67;
            case GTE:
                return 68;
            case LAND:
                return 69;
            case LOR:
                return 70;
            case LTE:
                return 71;
            case NEQ:
                return 72;
            case '&':
                return 73;
            case '*':
                return 74;
            case '+':
                return 75;
            case '-':
                return 76;
            case '/':
                return 77;
            case '<':
                return 79;
            case '>':
                return 80;
            case '[':
                return 81;
            case '^':
                return 82;
            case '|':
                return 83;
            case ')':
                return 145;
        }
        return 319;
    }

    private int yys133() {
        switch (yytok) {
            case ']':
                return 16;
            case IDENT:
                return 51;
            case INTLIT:
                return 53;
            case NEW:
                return 54;
            case '!':
                return 58;
            case '(':
                return 59;
            case '+':
                return 60;
            case '-':
                return 61;
            case '~':
                return 65;
        }
        return 319;
    }

    private int yys134() {
        switch (yytok) {
            case '+':
            case '(':
            case '!':
            case INTLIT:
            case WHILE:
            case INT:
            case CONTINUE:
            case '}':
            case IF:
            case '{':
            case RETURN:
            case IDENT:
            case ELSE:
            case PRINT:
            case NEW:
            case ';':
            case '-':
            case FOR:
            case DOUBLE:
            case '~':
            case BREAK:
            case BOOLEAN:
                return yyr26();
        }
        return 319;
    }

    private int yys135() {
        switch (yytok) {
            case '+':
            case '(':
            case '!':
            case INTLIT:
            case WHILE:
            case INT:
            case CONTINUE:
            case '}':
            case IF:
            case '{':
            case RETURN:
            case IDENT:
            case ELSE:
            case PRINT:
            case NEW:
            case ';':
            case '-':
            case FOR:
            case DOUBLE:
            case '~':
            case BREAK:
            case BOOLEAN:
                return yyr29();
        }
        return 319;
    }

    private int yys136() {
        switch (yytok) {
            case '+':
            case '(':
            case '!':
            case INTLIT:
            case WHILE:
            case INT:
            case CONTINUE:
            case '}':
            case IF:
            case '{':
            case RETURN:
            case IDENT:
            case ELSE:
            case PRINT:
            case NEW:
            case ';':
            case '-':
            case FOR:
            case DOUBLE:
            case '~':
            case BREAK:
            case BOOLEAN:
                return yyr23();
        }
        return 319;
    }

    private int yys137() {
        switch (yytok) {
            case '*':
            case LOR:
            case ')':
            case '+':
            case LAND:
            case '&':
            case EQL:
            case '|':
            case '^':
            case ']':
            case '[':
            case '>':
            case '<':
            case GTE:
            case ';':
            case '/':
            case NEQ:
            case '-':
            case ',':
            case LTE:
                return yyr69();
        }
        return 319;
    }

    private int yys138() {
        switch (yytok) {
            case '+':
            case '(':
            case '!':
            case INTLIT:
            case WHILE:
            case INT:
            case CONTINUE:
            case '}':
            case IF:
            case '{':
            case RETURN:
            case IDENT:
            case ELSE:
            case PRINT:
            case NEW:
            case ';':
            case '-':
            case FOR:
            case DOUBLE:
            case '~':
            case BREAK:
            case BOOLEAN:
                return yyr27();
        }
        return 319;
    }

    private int yys139() {
        switch (yytok) {
            case '=':
                return 147;
            case '*':
            case LOR:
            case ')':
            case '+':
            case LAND:
            case '&':
            case EQL:
            case '|':
            case '^':
            case ']':
            case '[':
            case '>':
            case '<':
            case GTE:
            case ';':
            case '/':
            case NEQ:
            case '-':
            case ',':
            case LTE:
                return yyr65();
        }
        return 319;
    }

    private int yys140() {
        switch (yytok) {
            case EQL:
                return 67;
            case GTE:
                return 68;
            case LAND:
                return 69;
            case LOR:
                return 70;
            case LTE:
                return 71;
            case NEQ:
                return 72;
            case '&':
                return 73;
            case '*':
                return 74;
            case '+':
                return 75;
            case '-':
                return 76;
            case '/':
                return 77;
            case '<':
                return 79;
            case '>':
                return 80;
            case '[':
                return 81;
            case '^':
                return 82;
            case '|':
                return 83;
            case ';':
            case ',':
                return yyr40();
        }
        return 319;
    }

    private int yys141() {
        switch (yytok) {
            case IDENT:
                return 51;
            case INTLIT:
                return 53;
            case NEW:
                return 54;
            case '!':
                return 58;
            case '(':
                return 59;
            case '+':
                return 60;
            case '-':
                return 61;
            case '~':
                return 65;
            case ';':
                return yyr34();
        }
        return 319;
    }

    private int yys142() {
        switch (yytok) {
            case IDENT:
                return 51;
            case INTLIT:
                return 53;
            case NEW:
                return 54;
            case '!':
                return 58;
            case '(':
                return 59;
            case '+':
                return 60;
            case '-':
                return 61;
            case '~':
                return 65;
        }
        return 319;
    }

    private int yys143() {
        switch (yytok) {
            case '*':
            case LOR:
            case ')':
            case '+':
            case LAND:
            case '&':
            case EQL:
            case '|':
            case '^':
            case ']':
            case '[':
            case '>':
            case '<':
            case GTE:
            case ';':
            case '/':
            case NEQ:
            case '-':
            case ',':
            case LTE:
                return yyr62();
        }
        return 319;
    }

    private int yys144() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case DOUBLE:
                return 6;
            case INT:
                return 8;
            case BREAK:
                return 48;
            case CONTINUE:
                return 49;
            case FOR:
                return 50;
            case IDENT:
                return 51;
            case IF:
                return 52;
            case INTLIT:
                return 53;
            case NEW:
                return 54;
            case PRINT:
                return 55;
            case RETURN:
                return 56;
            case WHILE:
                return 57;
            case '!':
                return 58;
            case '(':
                return 59;
            case '+':
                return 60;
            case '-':
                return 61;
            case ';':
                return 62;
            case '{':
                return 63;
            case '~':
                return 65;
        }
        return 319;
    }

    private int yys145() {
        switch (yytok) {
            case '+':
            case '(':
            case '!':
            case INTLIT:
            case WHILE:
            case INT:
            case CONTINUE:
            case '~':
            case IF:
            case '{':
            case RETURN:
            case IDENT:
            case PRINT:
            case NEW:
            case ';':
            case '-':
            case FOR:
            case DOUBLE:
            case BREAK:
            case BOOLEAN:
                return yyr42();
        }
        return 319;
    }

    private int yys146() {
        switch (yytok) {
            case EQL:
                return 67;
            case GTE:
                return 68;
            case LAND:
                return 69;
            case LOR:
                return 70;
            case LTE:
                return 71;
            case NEQ:
                return 72;
            case '&':
                return 73;
            case '*':
                return 74;
            case '+':
                return 75;
            case '-':
                return 76;
            case '/':
                return 77;
            case '<':
                return 79;
            case '>':
                return 80;
            case '[':
                return 81;
            case '^':
                return 82;
            case '|':
                return 83;
            case ']':
                return 152;
        }
        return 319;
    }

    private int yys147() {
        switch (yytok) {
            case IDENT:
                return 51;
            case INTLIT:
                return 53;
            case NEW:
                return 54;
            case '!':
                return 58;
            case '(':
                return 59;
            case '+':
                return 60;
            case '-':
                return 61;
            case '~':
                return 65;
        }
        return 319;
    }

    private int yys148() {
        switch (yytok) {
            case EQL:
                return 67;
            case GTE:
                return 68;
            case LAND:
                return 69;
            case LOR:
                return 70;
            case LTE:
                return 71;
            case NEQ:
                return 72;
            case '&':
                return 73;
            case '*':
                return 74;
            case '+':
                return 75;
            case '-':
                return 76;
            case '/':
                return 77;
            case '<':
                return 79;
            case '>':
                return 80;
            case '[':
                return 81;
            case '^':
                return 82;
            case '|':
                return 83;
            case ')':
            case ';':
                return yyr33();
        }
        return 319;
    }

    private int yys151() {
        switch (yytok) {
            case '+':
            case '(':
            case '!':
            case INTLIT:
            case WHILE:
            case INT:
            case CONTINUE:
            case '}':
            case IF:
            case '{':
            case RETURN:
            case IDENT:
            case ELSE:
            case PRINT:
            case NEW:
            case ';':
            case '-':
            case FOR:
            case DOUBLE:
            case '~':
            case BREAK:
            case BOOLEAN:
                return yyr24();
        }
        return 319;
    }

    private int yys152() {
        switch (yytok) {
            case '*':
            case LOR:
            case ')':
            case '+':
            case LAND:
            case '&':
            case EQL:
            case '|':
            case '^':
            case ']':
            case '[':
            case '>':
            case '<':
            case GTE:
            case ';':
            case '/':
            case NEQ:
            case '-':
            case ',':
            case LTE:
                return yyr66();
        }
        return 319;
    }

    private int yys153() {
        switch (yytok) {
            case EQL:
                return 67;
            case GTE:
                return 68;
            case LAND:
                return 69;
            case LOR:
                return 70;
            case LTE:
                return 71;
            case NEQ:
                return 72;
            case '&':
                return 73;
            case '*':
                return 74;
            case '+':
                return 75;
            case '-':
                return 76;
            case '/':
                return 77;
            case '<':
                return 79;
            case '>':
                return 80;
            case '[':
                return 81;
            case '^':
                return 82;
            case '|':
                return 83;
            case ')':
            case ']':
            case ';':
            case ',':
                return yyr64();
        }
        return 319;
    }

    private int yys154() {
        switch (yytok) {
            case IDENT:
                return 51;
            case INTLIT:
                return 53;
            case NEW:
                return 54;
            case '!':
                return 58;
            case '(':
                return 59;
            case '+':
                return 60;
            case '-':
                return 61;
            case '~':
                return 65;
            case ')':
                return yyr34();
        }
        return 319;
    }

    private int yys156() {
        switch (yytok) {
            case BOOLEAN:
                return 5;
            case DOUBLE:
                return 6;
            case INT:
                return 8;
            case BREAK:
                return 48;
            case CONTINUE:
                return 49;
            case FOR:
                return 50;
            case IDENT:
                return 51;
            case IF:
                return 52;
            case INTLIT:
                return 53;
            case NEW:
                return 54;
            case PRINT:
                return 55;
            case RETURN:
                return 56;
            case WHILE:
                return 57;
            case '!':
                return 58;
            case '(':
                return 59;
            case '+':
                return 60;
            case '-':
                return 61;
            case ';':
                return 62;
            case '{':
                return 63;
            case '~':
                return 65;
        }
        return 319;
    }

    private int yys157() {
        switch (yytok) {
            case '+':
            case '(':
            case '!':
            case INTLIT:
            case WHILE:
            case INT:
            case CONTINUE:
            case '}':
            case IF:
            case '{':
            case RETURN:
            case IDENT:
            case ELSE:
            case PRINT:
            case NEW:
            case ';':
            case '-':
            case FOR:
            case DOUBLE:
            case '~':
            case BREAK:
            case BOOLEAN:
                return yyr30();
        }
        return 319;
    }

    private int yyr1() { // program : fundefs
        { program = ((Fundefs)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return 1;
    }

    private int yyr72() { // args1 : expr ',' args1
        { yyrv = new Args(((Expr)yysv[yysp-3]), ((Args)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypargs1();
    }

    private int yyr73() { // args1 : expr
        { yyrv = new Args(((Expr)yysv[yysp-1]), null); }
        yysv[yysp-=1] = yyrv;
        return yypargs1();
    }

    private int yypargs1() {
        switch (yyst[yysp-1]) {
            case 91: return 127;
            default: return 150;
        }
    }

    private int yyr43() { // expr : '-' expr
        { yyrv = new UMinus(((Expr)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypexpr();
    }

    private int yyr44() { // expr : '+' expr
        { yyrv = new UPlus(((Expr)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypexpr();
    }

    private int yyr45() { // expr : '!' expr
        { yyrv = new LNot(((Expr)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypexpr();
    }

    private int yyr46() { // expr : '~' expr
        { yyrv = new BNot(((Expr)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypexpr();
    }

    private int yyr47() { // expr : expr '+' expr
        { yyrv = new Add(((Expr)yysv[yysp-3]), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr48() { // expr : expr '-' expr
        { yyrv = new Sub(((Expr)yysv[yysp-3]), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr49() { // expr : expr '*' expr
        { yyrv = new Mul(((Expr)yysv[yysp-3]), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr50() { // expr : expr '/' expr
        { yyrv = new Div(((Expr)yysv[yysp-3]), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr51() { // expr : expr '<' expr
        { yyrv = new Lt(((Expr)yysv[yysp-3]), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr52() { // expr : expr '>' expr
        { yyrv = new Gt(((Expr)yysv[yysp-3]), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr53() { // expr : expr LTE expr
        { yyrv = new Lte(((Expr)yysv[yysp-3]), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr54() { // expr : expr GTE expr
        { yyrv = new Gte(((Expr)yysv[yysp-3]), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr55() { // expr : expr NEQ expr
        { yyrv = new Neq(((Expr)yysv[yysp-3]), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr56() { // expr : expr EQL expr
        { yyrv = new Eql(((Expr)yysv[yysp-3]), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr57() { // expr : expr '&' expr
        { yyrv = new BAnd(((Expr)yysv[yysp-3]), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr58() { // expr : expr '|' expr
        { yyrv = new BOr(((Expr)yysv[yysp-3]), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr59() { // expr : expr '^' expr
        { yyrv = new BXor(((Expr)yysv[yysp-3]), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr60() { // expr : expr LAND expr
        { yyrv = new LAnd(((Expr)yysv[yysp-3]), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr61() { // expr : expr LOR expr
        { yyrv = new LOr(((Expr)yysv[yysp-3]), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr62() { // expr : IDENT '(' args ')'
        { yyrv = new Call(((Id)yysv[yysp-4]), ((Args)yysv[yysp-2])); }
        yysv[yysp-=4] = yyrv;
        return yypexpr();
    }

    private int yyr63() { // expr : IDENT '=' expr
        { yyrv = new Assign(((Id)yysv[yysp-3]), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr64() { // expr : expr '[' expr ']' '=' expr
        { yyrv = new ArrayAssign(((Expr)yysv[yysp-6]), ((Expr)yysv[yysp-4]), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=6] = yyrv;
        return yypexpr();
    }

    private int yyr65() { // expr : expr '[' expr ']'
        { yyrv = new ArrayAccess(((Expr)yysv[yysp-4]), ((Expr)yysv[yysp-2])); }
        yysv[yysp-=4] = yyrv;
        return yypexpr();
    }

    private int yyr66() { // expr : NEW type '[' expr ']'
        { yyrv = new NewArray(((Type)yysv[yysp-4]), ((Expr)yysv[yysp-2])); }
        yysv[yysp-=5] = yyrv;
        return yypexpr();
    }

    private int yyr67() { // expr : IDENT
        { yyrv = ((Id)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return yypexpr();
    }

    private int yyr68() { // expr : INTLIT
        { yyrv = ((IntLit)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return yypexpr();
    }

    private int yyr69() { // expr : '(' expr ')'
        { yyrv = ((Expr)yysv[yysp-2]); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yypexpr() {
        switch (yyst[yysp-1]) {
            case 154: return 148;
            case 147: return 153;
            case 142: return 128;
            case 141: return 148;
            case 133: return 146;
            case 122: return 140;
            case 94: return 132;
            case 92: return 130;
            case 91: return 128;
            case 90: return 124;
            case 83: return 121;
            case 82: return 120;
            case 81: return 119;
            case 80: return 118;
            case 79: return 117;
            case 77: return 116;
            case 76: return 115;
            case 75: return 114;
            case 74: return 113;
            case 73: return 112;
            case 72: return 111;
            case 71: return 110;
            case 70: return 109;
            case 69: return 108;
            case 68: return 107;
            case 67: return 106;
            case 65: return 105;
            case 61: return 103;
            case 60: return 102;
            case 59: return 101;
            case 58: return 100;
            case 56: return 97;
            case 55: return 96;
            default: return 44;
        }
    }

    private int yyr12() { // formal : type IDENT
        { yyrv = new Formal(((Type)yysv[yysp-2]), ((Id)yysv[yysp-1]), false); }
        yysv[yysp-=2] = yyrv;
        return 20;
    }

    private int yyr13() { // formal : type '&' IDENT
        { yyrv = new Formal(((Type)yysv[yysp-3]), ((Id)yysv[yysp-1]), true);  }
        yysv[yysp-=3] = yyrv;
        return 20;
    }

    private int yyr8() { // formals : /* empty */
        { yyrv = null; }
        yysv[yysp-=0] = yyrv;
        return yypformals();
    }

    private int yyr9() { // formals : formals1
        { yyrv = ((Formals)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return yypformals();
    }

    private int yypformals() {
        switch (yyst[yysp-1]) {
            case 24: return 31;
            case 19: return 26;
            case 15: return 21;
            default: return 32;
        }
    }

    private int yyr10() { // formals1 : formal ',' formals1
        { yyrv = new Formals(((Formal)yysv[yysp-3]), ((Formals)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypformals1();
    }

    private int yyr11() { // formals1 : formal
        { yyrv = new Formals(((Formal)yysv[yysp-1]), null); }
        yysv[yysp-=1] = yyrv;
        return yypformals1();
    }

    private int yypformals1() {
        switch (yyst[yysp-1]) {
            case 27: return 34;
            default: return 22;
        }
    }

    private int yyr4() { // fundef : type IDENT '(' formals ')' '{' stmts '}'
        { yyrv = new Fundef(((Type)yysv[yysp-8]), ((Id)yysv[yysp-7]), ((Formals)yysv[yysp-5]), ((Stmts)yysv[yysp-2])); }
        yysv[yysp-=8] = yyrv;
        return 3;
    }

    private int yyr5() { // fundef : VOID IDENT '(' formals ')' '{' stmts '}'
        { yyrv = new Fundef(null, ((Id)yysv[yysp-7]), ((Formals)yysv[yysp-5]), ((Stmts)yysv[yysp-2])); }
        yysv[yysp-=8] = yyrv;
        return 3;
    }

    private int yyr6() { // fundef : EXTERN type IDENT '(' formals ')' ';'
        { yyrv = new Fundef(((Type)yysv[yysp-6]), ((Id)yysv[yysp-5]), ((Formals)yysv[yysp-3]), null); }
        yysv[yysp-=7] = yyrv;
        return 3;
    }

    private int yyr7() { // fundef : EXTERN VOID IDENT '(' formals ')' ';'
        { yyrv = new Fundef(null, ((Id)yysv[yysp-5]), ((Formals)yysv[yysp-3]), null); }
        yysv[yysp-=7] = yyrv;
        return 3;
    }

    private int yyr2() { // fundefs : fundefs fundef
        { yyrv = new Fundefs(((Fundef)yysv[yysp-1]), ((Fundefs)yysv[yysp-2])); }
        yysv[yysp-=2] = yyrv;
        return 2;
    }

    private int yyr3() { // fundefs : /* empty */
        { yyrv = null; }
        yysv[yysp-=0] = yyrv;
        return 2;
    }

    private int yyr35() { // init : varDecl
        { yyrv = new VarDeclInit(((VarDecl)yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        return 125;
    }

    private int yyr36() { // init : expr
        { yyrv = new ExprInit(((Expr)yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        return 125;
    }

    private int yyr37() { // init : /* empty */
        { yyrv = new NoInit(); }
        yysv[yysp-=0] = yyrv;
        return 125;
    }

    private int yyr33() { // optExpr : expr
        { yyrv = ((Expr)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return yypoptExpr();
    }

    private int yyr34() { // optExpr : /* empty */
        { yyrv = null; }
        yysv[yysp-=0] = yyrv;
        return yypoptExpr();
    }

    private int yypoptExpr() {
        switch (yyst[yysp-1]) {
            case 141: return 149;
            default: return 155;
        }
    }

    private int yyr70() { // args : /* empty */
        { yyrv = null; }
        yysv[yysp-=0] = yyrv;
        return 129;
    }

    private int yyr71() { // args : args1
        { yyrv = ((Args)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return 129;
    }

    private int yyr20() { // stmt : ';'
        { yyrv = new Empty(); }
        yysv[yysp-=1] = yyrv;
        return yypstmt();
    }

    private int yyr21() { // stmt : varDecl ';'
        { yyrv = ((VarDecl)yysv[yysp-2]); }
        yysv[yysp-=2] = yyrv;
        return yypstmt();
    }

    private int yyr22() { // stmt : expr ';'
        { yyrv = new ExprStmt(((Expr)yysv[yysp-2])); }
        yysv[yysp-=2] = yyrv;
        return yypstmt();
    }

    private int yyr23() { // stmt : WHILE test stmt
        { yyrv = new While(((Expr)yysv[yysp-2]), ((Stmt)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypstmt();
    }

    private int yyr24() { // stmt : IF test stmt ELSE stmt
        { yyrv = new If(((Expr)yysv[yysp-4]), ((Stmt)yysv[yysp-3]), ((Stmt)yysv[yysp-1])); }
        yysv[yysp-=5] = yyrv;
        return yypstmt();
    }

    private int yyr25() { // stmt : IF test stmt
        { yyrv = new If(((Expr)yysv[yysp-2]), ((Stmt)yysv[yysp-1]), new Empty()); }
        yysv[yysp-=3] = yyrv;
        return yypstmt();
    }

    private int yyr26() { // stmt : PRINT expr ';'
        { yyrv = new Print(((Expr)yysv[yysp-2])); }
        yysv[yysp-=3] = yyrv;
        return yypstmt();
    }

    private int yyr27() { // stmt : '{' stmts '}'
        { yyrv = new Block(((Stmts)yysv[yysp-2])); }
        yysv[yysp-=3] = yyrv;
        return yypstmt();
    }

    private int yyr28() { // stmt : RETURN ';'
        { yyrv = new Return(); }
        yysv[yysp-=2] = yyrv;
        return yypstmt();
    }

    private int yyr29() { // stmt : RETURN expr ';'
        { yyrv = new Return(((Expr)yysv[yysp-2])); }
        yysv[yysp-=3] = yyrv;
        return yypstmt();
    }

    private int yyr30() { // stmt : FOR '(' init ';' optExpr ';' optExpr ')' stmt
        { yyrv = new For(((ForInit)yysv[yysp-7]), ((Expr)yysv[yysp-5]), ((Expr)yysv[yysp-3]), ((Stmt)yysv[yysp-1])); }
        yysv[yysp-=9] = yyrv;
        return yypstmt();
    }

    private int yyr31() { // stmt : BREAK ';'
        { yyrv = new Break(); }
        yysv[yysp-=2] = yyrv;
        return yypstmt();
    }

    private int yyr32() { // stmt : CONTINUE ';'
        { yyrv = new Continue(); }
        yysv[yysp-=2] = yyrv;
        return yypstmt();
    }

    private int yypstmt() {
        switch (yyst[yysp-1]) {
            case 156: return 157;
            case 144: return 151;
            case 99: return 136;
            case 93: return 131;
            default: return 45;
        }
    }

    private int yyr18() { // stmts : stmts stmt
        { yyrv = ((Stmts)yysv[yysp-2]).addStmt(((Stmt)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypstmts();
    }

    private int yyr19() { // stmts : /* empty */
        { yyrv = new Stmts(); }
        yysv[yysp-=0] = yyrv;
        return yypstmts();
    }

    private int yypstmts() {
        switch (yyst[yysp-1]) {
            case 39: return 43;
            case 35: return 40;
            default: return 104;
        }
    }

    private int yyr42() { // test : '(' expr ')'
        { yyrv = ((Expr)yysv[yysp-2]); }
        yysv[yysp-=3] = yyrv;
        switch (yyst[yysp-1]) {
            case 52: return 93;
            default: return 99;
        }
    }

    private int yyr14() { // type : INT
        { yyrv = new IntType(); }
        yysv[yysp-=1] = yyrv;
        return yyptype();
    }

    private int yyr15() { // type : BOOLEAN
        { yyrv = new BooleanType(); }
        yysv[yysp-=1] = yyrv;
        return yyptype();
    }

    private int yyr16() { // type : DOUBLE
        { yyrv = new DoubleType(); }
        yysv[yysp-=1] = yyrv;
        return yyptype();
    }

    private int yyr17() { // type : type '[' ']'
        { yyrv = new ArrayType(((Type)yysv[yysp-3])); }
        yysv[yysp-=3] = yyrv;
        return yyptype();
    }

    private int yyptype() {
        switch (yyst[yysp-1]) {
            case 54: return 95;
            case 27: return 23;
            case 25: return 23;
            case 24: return 23;
            case 19: return 23;
            case 15: return 23;
            case 7: return 12;
            case 2: return 4;
            default: return 46;
        }
    }

    private int yyr38() { // varDecl : type varIntro
        { yyrv = new VarDecl(((Type)yysv[yysp-2]), ((VarIntro)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypvarDecl();
    }

    private int yyr39() { // varDecl : varDecl ',' varIntro
        { yyrv = ((VarDecl)yysv[yysp-3]).addIntro(((VarIntro)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypvarDecl();
    }

    private int yypvarDecl() {
        switch (yyst[yysp-1]) {
            case 90: return 126;
            default: return 47;
        }
    }

    private int yyr40() { // varIntro : IDENT '=' expr
        { yyrv = new InitVarIntro(((Id)yysv[yysp-3]), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypvarIntro();
    }

    private int yyr41() { // varIntro : IDENT
        { yyrv = new VarIntro(((Id)yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        return yypvarIntro();
    }

    private int yypvarIntro() {
        switch (yyst[yysp-1]) {
            case 46: return 84;
            default: return 123;
        }
    }

    protected String[] yyerrmsgs = {
    };


    private MiniLexer lexer;
    private Fundefs   program;

    public MiniParser(Handler handler, MiniLexer lexer) {
      super(handler);
      this.lexer = lexer;
      lexer.nextToken();
      parse();
    }

    public Fundefs getProgram() {
      return program;
    }

    private void yyerror(String msg) {
      report(new Failure(msg));
    }


}
