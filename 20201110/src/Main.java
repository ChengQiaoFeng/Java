

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle A = new Rectangle();
        Circle B = new Circle();
        triangle C = new triangle();
        while (true) {

            System.out.println("请输入选择：");
            System.out.println("按1选择长方形:");
            System.out.println("按2选择圆形:");
            System.out.println("按3选择三角形:");
            System.out.println("按4退出选择:");


            String opr = sc.next();


            switch (opr) {
                case "1": {
                    System.out.println("输入长的值x：");
                    A.setX(sc.nextFloat());
                    System.out.println("输入宽的值y:");
                    A.setY(sc.nextFloat());
                    System.out.println("输入操作数：");
                    System.out.println("按*算面积！");
                    System.out.println("按+算周长！");
                    String rc = sc.next();
                    if (rc.equals("*")) {
                        System.out.println("输出面积:" + A.Area());

                    }
                    if (rc.equals("+")) {
                        System.out.println("输出周长:" + A.Perimeter());

                    }
                    break;
                }
                case "2": {
                    System.out.println("输入半径的值r：");
                    B.setX(sc.nextFloat());
                    System.out.println("输入操作数：");
                    System.out.println("按*算面积！");
                    System.out.println("按+算周长！");
                    String cr = sc.next();
                    if (cr.equals("*")) {
                        System.out.println("输出面积:" + B.Area());

                    }
                    if (cr.equals("+")) {
                        System.out.println("输出周长:" + B.Perimeter());

                    }
                    break;
                }
                case "3": {
                    System.out.println("输入边长的值x：");
                    C.setX(sc.nextDouble());
                    System.out.println("输入边长的值y:");
                    C.setY(sc.nextDouble());
                    System.out.println("输入边长的值Z:");
                    C.setZ(sc.nextDouble());
                    System.out.println("输入操作数：");
                    System.out.println("按*算面积！");
                    System.out.println("按+算周长！");
                    String ab = sc.next();
                    if (ab.equals("*")) {
                        System.out.println("输出面积:" + C.Area());
                    }
                    if (ab.equals("+")) {
                        System.out.println("输出周长:" + C.Perimeter());
                    }
                    break;
                }
                case "4": {
                    System.out.println("退出选择！");
                    System.exit(4);
                    break;
                }
                default:
                    System.out.println("输入有误，请重新输入！");
            }
        }
    }
}


