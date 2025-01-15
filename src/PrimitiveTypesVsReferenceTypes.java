import java.awt.*;

public class PrimitiveTypesVsReferenceTypes {
    public static void main(String[] args) {
        VariablesExample.run();
        PointExample.run();
    }
    public class VariablesExample {
        public static void run() {
            // Integer types
            short shortValue = 32_767;
            int intValue = 2_147_483_647;
            long longValue = 9_223_372_036_854_775_807L;

            //System.out.println("short: " + shortValue);
            //System.out.println("int: " + intValue);
            //System.out.println("long: " + longValue);

            int maxage = 30;
            int age = maxage;
            System.out.println(age);
        }
    }
    public class PointExample {
        public static void run() {
            Point point1 = new Point(1, 1);
            Point point2 = point1;
            point1.x = 2;
            System.out.println("Point2: (" + point2.x + ", " + point2.y + ")");
            System.out.println(point2);
        }
    }
}

