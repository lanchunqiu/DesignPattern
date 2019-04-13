package com.lancq.behaviorpattern.interpreter;

/**
 * 环境
 *
 * @author lancq
 */
public class Context {
    private String inputString;

    private String outputString;

    public String getInputString() {
        return inputString;
    }

    public void setInputString(String inputString) {
        this.inputString = inputString;
    }

    public String getOutputString() {
        return outputString;
    }

    public void setOutputString(String outputString) {
        this.outputString = outputString;
    }
}
