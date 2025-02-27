package org.lessons.lesson1.conditions;

public class SwitchCase {

    public static void main(String[] args) {
        String login = "John123";

        // checking by value
        switch(login) {
            case "John123":
                System.out.println("Логин совпал с John123");
                break;
            case "Dima777":
                System.out.println("Логин совпал с Dima777");
                break;
            case "Alice007":
                System.out.println("Логин совпал с Alice007");
                break;
            default:
                System.out.println("Логин совпал ни с чем не совпал");
        }

        // pattern-matching
        Object obj = "test";

        switch(obj) {
            case String objS:
                System.out.println("obj имеет тип String");
                break;
            case Integer objInt:
                System.out.println("obj имеет тип Integer");
                break;
            case Boolean objBool:
                System.out.println("obj имеет тип Boolean");
                break;
            default:
                System.out.println("Ни один из кейсов не отработал");
        }
    }
}
