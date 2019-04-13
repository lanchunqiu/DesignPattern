package com.lancq.behaviorpattern.interpreter;

import java.util.ArrayList;
import java.util.List;

/**
 * 客户端
 *
 * @author lancq
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setInputString("输入的文字");

        List<AbstractExpression> list = new ArrayList();
        list.add(new TerminalExpression());
        list.add(new NonterminalExpression());
        list.add(new TerminalExpression());

        for (int i = 0; i < list.size(); i++) {
            list.get(i).interpret(context);
        }
    }
}
