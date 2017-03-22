package TemplatePattern;

/**
 * Created by boileryao on 2017/3/22.
 * Test of Template Pattern
 */
public class TemplateTestDrive {
    public static void main(String[] args) {
        new Coffee().make();
        System.out.println();
        new Tea().make();
    }
}
