package org.example;

public class Main {
    public static void main(String[] args) {
        if(args.length == 0) {
            System.out.println("Please submit some arguments.");
        } else if(args[0] == "-h" || args[0] == "/h") {
            System.out.println("A simple calculator that accepts 3 arguments. 2 numbers between a mathematical " +
                    "operator. Use spaces to separate arguments.");
        } else if (args.length != 3) {
            System.out.println("Only submit 3 arguments.");
        } else if(!args[0].matches("\\d+(\\.\\d+)?") || !args[2].matches("\\d+(\\.\\d+)?")) {
            System.out.println("Only numbers are acceptable in the first and third argument.");
        } else {
            switch (args[1]) {
                case "+" -> {
                    int numberAdd1 = Integer.parseInt(args[0]);
                    int numberAdd2 = Integer.parseInt(args[2]);
                    System.out.println(numberAdd1 + numberAdd2);
                }
                case "-" -> {
                    int numberSub1 = Integer.parseInt(args[0]);
                    int numberSub2 = Integer.parseInt(args[2]);
                    System.out.println(numberSub1 - numberSub2);
                }
                case "*" -> {
                    int numberMul1 = Integer.parseInt(args[0]);
                    int numberMul2 = Integer.parseInt(args[2]);
                    System.out.println(numberMul1 * numberMul2);
                }
                case "/" -> {
                    int numberDiv1 = Integer.parseInt(args[0]);
                    int numberDiv2 = Integer.parseInt(args[2]);
                    System.out.println(numberDiv1 / numberDiv2);
                }
                default -> System.out.println("Unsupported mathematical operator. Please use one of the following:\n" +
                        "+, -, *, /");
            }
        }
    }
}