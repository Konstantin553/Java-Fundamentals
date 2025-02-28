import org.w3c.dom.css.Rect;

public class Inheritance {

    static class Rectangle {
        protected int width, height;


        public Rectangle(int width, int height) {
            this.width = width;
            this.height = height;
        }

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public int calcArea(){
            return this.width * this.height;
        }

        @Override
        public String toString() {
            return "Rectangle{" +
                    "width=" + width +
                    ", height=" + height +
                    '}';
        }

        static class FilledRectangle extends Rectangle {
            protected String color;

            public FilledRectangle(int width, int height, String color) {
                super(width, height);
                if (color == null || color.equals(""))
                    throw new IllegalArgumentException("Color cannot be empty");
                this.color = color;
            }

            public String getColor() {
                return color;
            }

            public void setColor(String color) {
                this.color = color;
            }

            @Override
            public String toString() {
                return "FilledRectangle{" +
                        "color='" + color + '\'' +
                        ", width=" + width +
                        ", height=" + height +
                        '}';
            }
        }

        static class BorderedFilledRectangle extends FilledRectangle{
            private String borderColor;

            public BorderedFilledRectangle(int width, int height, String color, String borderColor) {
                super(width, height, color);
                this.borderColor = borderColor;
            }

            public String getBorderColor() {
                return borderColor;
            }

            public void setBorderColor(String borderColor) {
                this.borderColor = borderColor;
            }

            @Override
            public String toString() {
                return "BorderedFilledRectangle{" +
                        "borderColor='" + borderColor + '\'' +
                        ", color='" + color + '\'' +
                        ", width=" + width +
                        ", height=" + height +
                        '}';
            }
        }

    }


    public static void main(String[] args) {

        Rectangle rect = new Rectangle(3, 5);
        System.out.println(rect);

        Rectangle.FilledRectangle filledRect = new Rectangle.FilledRectangle(3, 5, "blue");
        System.out.println(filledRect);

        Rectangle.BorderedFilledRectangle bigRect = new Rectangle.BorderedFilledRectangle(3, 5, "blue", "lightBlue");
        System.out.println(bigRect);
        System.out.println("Area = " + bigRect.calcArea());

    }
}
