/* This file was generated by SableCC (http://www.sablecc.org/). */

package scss.analysis;

import scss.node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseStart(Start node);
    void caseAStylesheet(AStylesheet node);
    void caseARulesetStatement(ARulesetStatement node);
    void caseAMixinStatement(AMixinStatement node);
    void caseAFunctionStatement(AFunctionStatement node);
    void caseAVariableStatement(AVariableStatement node);
    void caseAIncludeSimpleStatement(AIncludeSimpleStatement node);
    void caseAIfStatement(AIfStatement node);
    void caseAForStatement(AForStatement node);
    void caseAWhileStatement(AWhileStatement node);
    void caseAEachStatement(AEachStatement node);
    void caseAIdentsEachValues(AIdentsEachValues node);
    void caseAListEachValues(AListEachValues node);
    void caseAMapEachValues(AMapEachValues node);
    void caseACommaIdent(ACommaIdent node);
    void caseAListValues(AListValues node);
    void caseACommaExpression(ACommaExpression node);
    void caseAMapValues(AMapValues node);
    void caseACommaKeyValue(ACommaKeyValue node);
    void caseAKeyValue(AKeyValue node);
    void caseACommaVariable(ACommaVariable node);
    void caseASimpleIdentifierValue(ASimpleIdentifierValue node);
    void caseAColonIdentifierValue(AColonIdentifierValue node);
    void caseAElseIfStatement(AElseIfStatement node);
    void caseAElseStatement(AElseStatement node);
    void caseAParams(AParams node);
    void caseAWithCommaParam(AWithCommaParam node);
    void caseASimpleParam(ASimpleParam node);
    void caseAParamOptionalValue(AParamOptionalValue node);
    void caseABlock(ABlock node);
    void caseAPropertyContentInBlock(APropertyContentInBlock node);
    void caseAStatementContentInBlock(AStatementContentInBlock node);
    void caseASelectors(ASelectors node);
    void caseAGtPrefixElement(AGtPrefixElement node);
    void caseAPlusPrefixElement(APlusPrefixElement node);
    void caseATilPrefixElement(ATilPrefixElement node);
    void caseACommaPrefixElement(ACommaPrefixElement node);
    void caseASimplePrefixElement(ASimplePrefixElement node);
    void caseAHashElement(AHashElement node);
    void caseADotElement(ADotElement node);
    void caseASimpleElement(ASimpleElement node);
    void caseAIdentSimpleElement(AIdentSimpleElement node);
    void caseAAndSimpleElement(AAndSimpleElement node);
    void caseAStarSimpleElement(AStarSimpleElement node);
    void caseAEqAttrib(AEqAttrib node);
    void caseAPipeEqAttrib(APipeEqAttrib node);
    void caseATildEqAttrib(ATildEqAttrib node);
    void caseAProperty(AProperty node);
    void caseASimpleIdent(ASimpleIdent node);
    void caseAInterpolationIdent(AInterpolationIdent node);
    void caseAFunctionCallFunctionCall(AFunctionCallFunctionCall node);
    void caseAValues(AValues node);
    void caseACommaConditions(ACommaConditions node);
    void caseAFunctionBody(AFunctionBody node);
    void caseAFunctionReturn(AFunctionReturn node);
    void caseAArithFunctionStatement(AArithFunctionStatement node);
    void caseAOtherStatementFunctionStatement(AOtherStatementFunctionStatement node);
    void caseAAndConditions(AAndConditions node);
    void caseASimpleConditions(ASimpleConditions node);
    void caseAOrCondition(AOrCondition node);
    void caseASimpleCondition(ASimpleCondition node);
    void caseAEqComparison(AEqComparison node);
    void caseANeqComparison(ANeqComparison node);
    void caseALtComparison(ALtComparison node);
    void caseAGtComparison(AGtComparison node);
    void caseASimpleComparison(ASimpleComparison node);
    void caseAMinusArith(AMinusArith node);
    void caseAPlusArith(APlusArith node);
    void caseASimpleArith(ASimpleArith node);
    void caseATimesFactor(ATimesFactor node);
    void caseADivFactor(ADivFactor node);
    void caseASimpleFactor(ASimpleFactor node);
    void caseANumberExpression(ANumberExpression node);
    void caseANumberUnitExpression(ANumberUnitExpression node);
    void caseAColorExpression(AColorExpression node);
    void caseAStringExpression(AStringExpression node);
    void caseANullExpression(ANullExpression node);
    void caseAUrlExpression(AUrlExpression node);
    void caseAVariableNameExpression(AVariableNameExpression node);
    void caseAFunctionCallExpression(AFunctionCallExpression node);
    void caseACommandStatementExpression(ACommandStatementExpression node);

    void caseTNull(TNull node);
    void caseTIn(TIn node);
    void caseTDefault(TDefault node);
    void caseTUnit(TUnit node);
    void caseTEllipsis(TEllipsis node);
    void caseTLparen(TLparen node);
    void caseTRparen(TRparen node);
    void caseTBlockstart(TBlockstart node);
    void caseTBlockend(TBlockend node);
    void caseTLbrack(TLbrack node);
    void caseTRbrack(TRbrack node);
    void caseTGt(TGt node);
    void caseTTil(TTil node);
    void caseTLt(TLt node);
    void caseTColon(TColon node);
    void caseTSemi(TSemi node);
    void caseTComma(TComma node);
    void caseTDot(TDot node);
    void caseTDollar(TDollar node);
    void caseTAt(TAt node);
    void caseTAnd(TAnd node);
    void caseTDoubleAnd(TDoubleAnd node);
    void caseTOr(TOr node);
    void caseTHash(THash node);
    void caseTColoncolon(TColoncolon node);
    void caseTPlus(TPlus node);
    void caseTStar(TStar node);
    void caseTTimes(TTimes node);
    void caseTDiv(TDiv node);
    void caseTMinus(TMinus node);
    void caseTPerc(TPerc node);
    void caseTEqeq(TEqeq node);
    void caseTNoteq(TNoteq node);
    void caseTEq(TEq node);
    void caseTPipeEq(TPipeEq node);
    void caseTTildEq(TTildEq node);
    void caseTMixin(TMixin node);
    void caseTFunction(TFunction node);
    void caseTAtElse(TAtElse node);
    void caseTIf(TIf node);
    void caseTAtIf(TAtIf node);
    void caseTAtFor(TAtFor node);
    void caseTAtWhile(TAtWhile node);
    void caseTAtEach(TAtEach node);
    void caseTInclude(TInclude node);
    void caseTImport(TImport node);
    void caseTReturn(TReturn node);
    void caseTFrom(TFrom node);
    void caseTThrough(TThrough node);
    void caseTPoundDefault(TPoundDefault node);
    void caseTVariable(TVariable node);
    void caseTIdentifier(TIdentifier node);
    void caseTStringLiteral(TStringLiteral node);
    void caseTNumberLiteral(TNumberLiteral node);
    void caseTColor(TColor node);
    void caseTUrl(TUrl node);
    void caseTBlank(TBlank node);
    void caseTComment(TComment node);
    void caseEOF(EOF node);
    void caseInvalidToken(InvalidToken node);
}
