/**
 * This is JUnit that tests the lower method in StringHandling class.
 * This contains 79 testcases.
 * 
 * Please don't run this file.
 * You can add your own test cases to this file by just copy and 
 * paste the last three lines of the code (TestCase6).
 * 
 * @author Deepak Kumar
 */

import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;

public class TestJUnit {
	@Test
public void testCase1() {
  String str = "[()][{}()][](){}([{}(())([[{}]])][])[]([][])(){}{{}{[](){}}}()[]({})[{}{{}([{}][])}]";
  String res = "YES";
  Assert.assertEquals(res, Solution.isMatching(str));
}
@Test
public void testCase2() {
  String str = "[()][{}[{}[{}]]][]{}[]{}[]{{}({}(){({{}{}[([[]][[]])()]})({}{{}})})}";
  String res = "YES";
  Assert.assertEquals(res, Solution.isMatching(str));
}
@Test
public void testCase3() {
  String str = "(])[{{{][)[)])(]){(}))[{(})][[{)(}){[(]})[[{}(])}({)(}[[()}{}}]{}{}}()}{({}](]{{[}}(([{]";
  String res = "NO";
  Assert.assertEquals(res, Solution.isMatching(str));
}
@Test
public void testCase4() {
  String str = "){[]()})}}]{}[}}})}{]{](]](()][{))])(}]}))(}[}{{)}{[[}[]";
  String res = "NO";
  Assert.assertEquals(res, Solution.isMatching(str));
}
@Test
public void testCase5() {
  String str = "}(]}){";
  String res = "NO";
  Assert.assertEquals(res, Solution.isMatching(str));
}
@Test
public void testCase6() {
  String str = "((]()(]([({]}({[)){}}[}({[{])(]{()[]}}{)}}]]{({)[}{(";
  String res = "NO";
  Assert.assertEquals(res, Solution.isMatching(str));
}
@Test
public void testCase7() {
  String str = "{}{({{}})}[][{{}}]{}{}(){{}[]}{}([[][{}]]())";
  String res = "YES";
  Assert.assertEquals(res, Solution.isMatching(str));
}
@Test
public void testCase8() {
  String str = "(){}[()[][]]{}(())()[[([])][()]{}{}(({}[]()))()[()[{()}]][]]";
  String res = "YES";
  Assert.assertEquals(res, Solution.isMatching(str));
}
@Test
public void testCase9() {
  String str = "()([]({}[]){}){}{()}[]{}[]()(()([[]]()))()()()[]()(){{}}()({[{}][]}[[{{}({({({})})})}]])";
  String res = "YES";
  Assert.assertEquals(res, Solution.isMatching(str));
}
@Test
public void testCase10() {
  String str = "[]([{][][)(])}()([}[}(})}])}))]](}{}})[]({{}}))[])(}}[[{]{}]()[(][])}({]{}[[))[[}[}{(]})()){{(]]){][";
  String res = "NO";
  Assert.assertEquals(res, Solution.isMatching(str));
}
@Test
public void testCase11() {
  String str = "{()({}[[{}]]()(){[{{}{[[{}]{}((({[]}{}()[])))]((()()))}(()[[[]]])((()[[](({([])()}))[]]))}]})}";
  String res = "YES";
  Assert.assertEquals(res, Solution.isMatching(str));
}
@Test
public void testCase12() {
  String str = "()(){{}}[()()]{}{}";
  String res = "YES";
  Assert.assertEquals(res, Solution.isMatching(str));
}
@Test
public void testCase13() {
  String str = "{}()([[]])({}){({[][[][[()]]{{}[[]()]}]})}[](())((())[{{}}])";
  String res = "YES";
  Assert.assertEquals(res, Solution.isMatching(str));
}
@Test
public void testCase14() {
  String str = "{}(((){}){[]{{()()}}()})[]{{()}{(){()(){}}}}{()}({()(()({}{}()((()((([])){[][{()}{}]})))))})";
  String res = "YES";
  Assert.assertEquals(res, Solution.isMatching(str));
}
@Test
public void testCase15() {
  String str = "][[{)())))}[)}}}}[{){}()]([][]){{{{{[)}]]{([{)()][({}[){]({{";
  String res = "NO";
  Assert.assertEquals(res, Solution.isMatching(str));
}
@Test
public void testCase16() {
  String str = "{{}(";
  String res = "NO";
  Assert.assertEquals(res, Solution.isMatching(str));
}
@Test
public void testCase17() {
  String str = "{[{((({}{({({()})()})[]({()[[][][]]}){}}))){}}]}{}{({((){{}[][]{}[][]{}}[{}])(())}[][])}";
  String res = "YES";
  Assert.assertEquals(res, Solution.isMatching(str));
}
@Test
public void testCase18() {
  String str = "()[[][()[]][]()](([[[(){()[[]](([]))}]]]))";
  String res = "YES";
  Assert.assertEquals(res, Solution.isMatching(str));
}
@Test
public void testCase19() {
  String str = "()[]({}{})(()){{{}}()()}({[]()}())[](){}(({()}[{}[{({{}}){({}){({})((({()})))}}}]]))";
  String res = "YES";
  Assert.assertEquals(res, Solution.isMatching(str));
}
@Test
public void testCase20() {
  String str = "}[{){({}({)})]([}{[}}{[(([])[(}){[]])([]]}(]]]]{][";
  String res = "NO";
  Assert.assertEquals(res, Solution.isMatching(str));
}
@Test
public void testCase21() {
  String str = "[{]{[{(){[}{}(([(]}])(){[[}(]){(})))}}{{)}}{}][({(}))]}({)";
  String res = "NO";
  Assert.assertEquals(res, Solution.isMatching(str));
}
@Test
public void testCase22() {
  String str = ")})[(]{][[())]{[]{{}}[)[)}[]){}](}({](}}}[}{({()]]";
  String res = "NO";
  Assert.assertEquals(res, Solution.isMatching(str));
}
@Test
public void testCase23() {
  String str = "[[[({[]}({[][[[[][[{(()[][])}()[][]][]{}]]]]}))][(()){}]]]()[{}([]{}){}{{}}]";
  String res = "YES";
  Assert.assertEquals(res, Solution.isMatching(str));
}
@Test
public void testCase24() {
  String str = "({[]({[]})}())[][{}[{{(({{{([{}])}}}))}}]]";
  String res = "YES";
  Assert.assertEquals(res, Solution.isMatching(str));
}
@Test
public void testCase25() {
  String str = "([((()))()])[][][]{}()(([]))[]()[]((){}[]){}(){{}[]}[[{[]}]]";
  String res = "YES";
  Assert.assertEquals(res, Solution.isMatching(str));
}
@Test
public void testCase26() {
  String str = "[[(((({}{[]{}()}){}{{}}){({[]{[{}]{(){}(((){()}))}()}}[[]]()()[()])[[{}{}]()]}))]]{}[]{}({({{}})})";
  String res = "YES";
  Assert.assertEquals(res, Solution.isMatching(str));
}
@Test
public void testCase27() {
  String str = "(]{()}((";
  String res = "NO";
  Assert.assertEquals(res, Solution.isMatching(str));
}
@Test
public void testCase28() {
  String str = "[][(())[({{{()[]}}{[[][[][[[]{{{[()]{{{{}{[]}[][]}}}}}}]]]]}})]]";
  String res = "YES";
  Assert.assertEquals(res, Solution.isMatching(str));
}
@Test
public void testCase29() {
  String str = "}[})})}[)]{}{)";
  String res = "NO";
  Assert.assertEquals(res, Solution.isMatching(str));
}
@Test
public void testCase30() {
  String str = "({(}{})))}(}[)[}{)}}[)[{][{(}{{}]({}{[(})[{[({{[}{(]]})}";
  String res = "NO";
  Assert.assertEquals(res, Solution.isMatching(str));
}
@Test
public void testCase31() {
  String str = "]}})[]))]{][])[}(])]({[]}[]([)";
  String res = "NO";
  Assert.assertEquals(res, Solution.isMatching(str));
}
@Test
public void testCase32() {
  String str = "[{{}{[{{[}[[}([]";
  String res = "NO";
  Assert.assertEquals(res, Solution.isMatching(str));
}
@Test
public void testCase33() {
  String str = "[([]){}][({})({[(([])[][])][[{}{([{{}{(()){{{({}{{}}())}}[]}}()[()[{{{([](()){[[[]]]})}}}]]}])}]]})]";
  String res = "YES";
  Assert.assertEquals(res, Solution.isMatching(str));
}
@Test
public void testCase34() {
  String str = "]{}{(}))}](})[{]]()(]([}]([}][}{]{[])}{{{]([][()){{})[{({{{[}{}](]}}";
  String res = "NO";
  Assert.assertEquals(res, Solution.isMatching(str));
}
@Test
public void testCase35() {
  String str = "{[{}}){(}[][)(}[}][)({[[{]}[(()[}}){}{)([)]}(()))]{)(}}}][";
  String res = "NO";
  Assert.assertEquals(res, Solution.isMatching(str));
}
@Test
public void testCase36() {
  String str = "(]{}{(}}}[)[";
  String res = "NO";
  Assert.assertEquals(res, Solution.isMatching(str));
}
@Test
public void testCase37() {
  String str = "[]{}{[[]]}([{}]{}[]){{(())}}";
  String res = "YES";
  Assert.assertEquals(res, Solution.isMatching(str));
}
@Test
public void testCase38() {
  String str = "[)([{(][(){)[)}{)]]}}([((][[}}(]{}]]}]][(({{{))[[){}{]][))[]{]][)[{{}{()]){)])))){{{[(]}[}}{}]";
  String res = "NO";
  Assert.assertEquals(res, Solution.isMatching(str));
}
@Test
public void testCase39() {
  String str = "{({(){[[[][]{}[[([]{})]{}]][[]()()]]}})}[{}{{}}]";
  String res = "YES";
  Assert.assertEquals(res, Solution.isMatching(str));
}
@Test
public void testCase40() {
  String str = ")}][(})){))[{}[}";
  String res = "NO";
  Assert.assertEquals(res, Solution.isMatching(str));
}
@Test
public void testCase41() {
  String str = "{[]{({]}[}}[{([([)([){{}{(}}[]}}[[{[}[[()(])[}[]";
  String res = "NO";
  Assert.assertEquals(res, Solution.isMatching(str));
}
@Test
public void testCase42() {
  String str = "()()()[]";
  String res = "YES";
  Assert.assertEquals(res, Solution.isMatching(str));
}
@Test
public void testCase43() {
  String str = "((){}])][]][}{]{)]]}][{]}[)(])[}[({(";
  String res = "NO";
  Assert.assertEquals(res, Solution.isMatching(str));
}
@Test
public void testCase44() {
  String str = ")[((])(]]]]((]){{{{())]}]}(}{([}(({}]])[[{){[}]{{}})[){(";
  String res = "NO";
  Assert.assertEquals(res, Solution.isMatching(str));
}
@Test
public void testCase45() {
  String str = "}][[{[((}{[]){}}[[[)({[)}]]}(]]{[)[]}{}(){}}][{()]))})]][(((}}";
  String res = "NO";
  Assert.assertEquals(res, Solution.isMatching(str));
}
@Test
public void testCase46() {
  String str = "([]){}{{}{}}()([([{}{[[]()([(([]()))()[[]]])]}])])";
  String res = "YES";
  Assert.assertEquals(res, Solution.isMatching(str));
}
@Test
public void testCase47() {
  String str = "[()[[]{{[]}()([])}[]][][]][]()[]{}{}[][]{}{}[()(){}]";
  String res = "YES";
  Assert.assertEquals(res, Solution.isMatching(str));
}
@Test
public void testCase48() {
  String str = "{[{){]({(((({](]{([])([{{([])[}(){(]](]{[{[]}}())[){})}))[{})))[";
  String res = "NO";
  Assert.assertEquals(res, Solution.isMatching(str));
}
@Test
public void testCase49() {
  String str = "{}[()[]][]{}{}[[{{[[({})]()[[()]]]}}]]";
  String res = "YES";
  Assert.assertEquals(res, Solution.isMatching(str));
}
@Test
public void testCase50() {
  String str = "{[{}[][]]}[((()))][]({})[]{}{()}";
  String res = "YES";
  Assert.assertEquals(res, Solution.isMatching(str));
}
@Test
public void testCase51() {
  String str = "(){[{({})}]}";
  String res = "YES";
  Assert.assertEquals(res, Solution.isMatching(str));
}
@Test
public void testCase52() {
  String str = "([]])][{)]({)[]))}]())[}]))][}{(}}})){]}]{[)}(][})[[";
  String res = "NO";
  Assert.assertEquals(res, Solution.isMatching(str));
}
@Test
public void testCase53() {
  String str = "((({{}(([{}(())]))[()]{[[[]()]]}})))";
  String res = "YES";
  Assert.assertEquals(res, Solution.isMatching(str));
}
@Test
public void testCase54() {
  String str = "}()))}(}]]{{})}][{](]][{]{[[]]]}]]}([)({([))[[(]}])}[}(([{)[)]]([[](]}]}{]{{})[]){]}{])(";
  String res = "NO";
  Assert.assertEquals(res, Solution.isMatching(str));
}
@Test
public void testCase55() {
  String str = "{}{}{}{[[()]][]}";
  String res = "YES";
  Assert.assertEquals(res, Solution.isMatching(str));
}
@Test
public void testCase56() {
  String str = ")]}]({{})[[[{]{{{}}][))]{{";
  String res = "NO";
  Assert.assertEquals(res, Solution.isMatching(str));
}
@Test
public void testCase57() {
  String str = "))){({}])}])}}]{)()(}(]}([";
  String res = "NO";
  Assert.assertEquals(res, Solution.isMatching(str));
}
@Test
public void testCase58() {
  String str = "([[]][])[[]()][]()(([[]]{[()[]{[][{}]}[()]]{}{[]}}{{}()}(()[([][]{})[[{}][]]{}[]])))";
  String res = "YES";
  Assert.assertEquals(res, Solution.isMatching(str));
}
@Test
public void testCase59() {
  String str = "(]{[({}[){)))}]{[{}][({[({[]))}[}]}{()(([]{]()}})}[]{[)](((]]])([]}}]){)(([]]}[[}[";
  String res = "NO";
  Assert.assertEquals(res, Solution.isMatching(str));
}
@Test
public void testCase60() {
  String str = "([[]])({}(([(){{}[{}]}]){[{}]}))[][{}{}](){}";
  String res = "YES";
  Assert.assertEquals(res, Solution.isMatching(str));
}
@Test
public void testCase61() {
  String str = "[][][][][][([])][]{({()}[[()()]{([(){[]{}}{(())}{[](){}()({}())}[({}[[]()])][]])}])}";
  String res = "YES";
  Assert.assertEquals(res, Solution.isMatching(str));
}
@Test
public void testCase62() {
  String str = "}[{{(}})}}(((())()({]{([]((][(({)[({[]]}[])}]{][{{}]{)][}(])}}}))}}}";
  String res = "NO";
  Assert.assertEquals(res, Solution.isMatching(str));
}
@Test
public void testCase63() {
  String str = "[]({})()[]{}{}[]({}{})[]{([])()[()][{()({})[{}{[[()]{}[]][]}(({{[]{()()()}{}[]()}[]}){{}{}})]}]}";
  String res = "YES";
  Assert.assertEquals(res, Solution.isMatching(str));
}
@Test
public void testCase64() {
  String str = "{{(([{)]{}({][{](){({([[[][)}[)})(";
  String res = "NO";
  Assert.assertEquals(res, Solution.isMatching(str));
}
@Test
public void testCase65() {
  String str = "[{}]{[()({[{}]})]}";
  String res = "YES";
  Assert.assertEquals(res, Solution.isMatching(str));
}
@Test
public void testCase66() {
  String str = "[[{}]]";
  String res = "YES";
  Assert.assertEquals(res, Solution.isMatching(str));
}
@Test
public void testCase67() {
  String str = "]{{({[{]}[[)]]}{}))}{){({]]}{]([)({{[]){)]{}){){}()})(]]{{])(])[]}][[()()}";
  String res = "NO";
  Assert.assertEquals(res, Solution.isMatching(str));
}
@Test
public void testCase68() {
  String str = "{[([}[[{{(]]][}()())]{){(){)]]){})}]{][][(}[]())[}[)})})[][{[)[})()][]))}[[}";
  String res = "NO";
  Assert.assertEquals(res, Solution.isMatching(str));
}
@Test
public void testCase69() {
  String str = "]()])}[}}}{]]{)[}(}]]])])}{(}{([{]({)]}])(})[{}[)]])]}[]{{)){}{()}]}((}}{({])[}])[]}";
  String res = "NO";
  Assert.assertEquals(res, Solution.isMatching(str));
}
@Test
public void testCase70() {
  String str = "(]}[{}{{][}))){{{([)([[])([]{[";
  String res = "NO";
  Assert.assertEquals(res, Solution.isMatching(str));
}
@Test
public void testCase71() {
  String str = "{(()[]){}}(){[]}({{}(()())})([]){}{}(())()[()]{}()";
  String res = "YES";
  Assert.assertEquals(res, Solution.isMatching(str));
}
@Test
public void testCase72() {
  String str = "{{}[{}[{}[]]]}{}({{[]}})[[(){}][]]{}(([]{[][]()()}{{{()()}{[]}({}[]{()})}{()}[[]][()]}))";
  String res = "YES";
  Assert.assertEquals(res, Solution.isMatching(str));
}
@Test
public void testCase73() {
  String str = "{[][]}[{}[](){}]{{}{[][{}]}}";
  String res = "YES";
  Assert.assertEquals(res, Solution.isMatching(str));
}
@Test
public void testCase74() {
  String str = "()(){}(){((){}[])([[]]())}";
  String res = "YES";
  Assert.assertEquals(res, Solution.isMatching(str));
}
@Test
public void testCase75() {
  String str = "{}[[{[((}[(}[[]{{]([(}]][[";
  String res = "NO";
  Assert.assertEquals(res, Solution.isMatching(str));
}
@Test
public void testCase76() {
  String str = "{}[([{[{{}()}]{}}([[{}[]]({}{{()}[][][]})])])]";
  String res = "YES";
  Assert.assertEquals(res, Solution.isMatching(str));
}
@Test
public void testCase77() {
  String str = "{[](}([)(])[]]})()]){[({]}{{{)({}(][{{[}}(]{";
  String res = "NO";
  Assert.assertEquals(res, Solution.isMatching(str));
}
@Test
public void testCase78() {
  String str = "[][]{{}[](())}{}({[()]}())[][[][({}([{}]))]]";
  String res = "YES";
  Assert.assertEquals(res, Solution.isMatching(str));
}
@Test
public void testCase79() {
  String str = "((()))[]{[(()({[()({[]}{})]}))]}{[]}{{({}{})[{}{}]{()([()])[{()}()[[]{}()]{}{}[]()]}[[]{[]}([])]}}";
  String res = "YES";
  Assert.assertEquals(res, Solution.isMatching(str));
}

}

