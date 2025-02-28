//    interface Movable {
//        public void move(int deltaX, int deltaY);
//    }
//
//    abstract class Figure implements Movable{
//        protected int x, y;
//
//        public int getX() {
//            return x;
//        }
//
//        public void setX(int x) {
//            this.x = x;
//        }
//
//        public int getY() {
//            return y;
//        }
//
//        public void setY(int y) {
//            this.y = y;
//        }
//
//        public void move(int deltaX, int deltaY) {
//            this.x += deltaX;
//            this.y += deltaY;
//        }
//
//        public abstract int calcArea();
//    }
//
//    class Rectangle extends Figure {
//        private int width, height;
//
//        public Rectangle(int width, int height) {
//            this.width = width;
//            this.height = height;
//        }
//
//        public Rectangle(int width) {
//            this.width = width;
//        }
//
//        @Override
//        public int calcArea() {
//            return this.width * this.height;
//        }
//
//        @Override
//        public String toString() {
//            return "Rectangle{" +
//                    "width=" + this.width +
//                    ", height=" + this.height +
//                    ", Area = " + this.calcArea() +
//                    '}';
//        }
//    }
//
//public class Abstraction {
//    public static void main(String[] args) {
//        Rectangle r = new Rectangle(20, 30);
//        System.out.println(r);
//    }
//}
