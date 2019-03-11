package com.lancq.structure_pattern.bridge.demo3;

/**
 * 院系类，Abstraction
 */
public abstract class Department {

    // 院系包含的课程
    protected Math mathCourse;

    public void setCourse(Math math){
        this.mathCourse = math;
    }
    //选择课程
    public abstract void select();
}
