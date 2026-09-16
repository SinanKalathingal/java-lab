abstract class figure {
  double dim1;
  double dim2;

  figure(double a, double b) {
    dim1 = a;
    dim2 = b;
  }

  abstract double area();
}

class rectangle extends figure {
  rectangle(double a, double b) {
    super(a, b);
  }

  double area() {
    System.out.println("\ninside area for rectangle.");
    return dim1 * dim2;
  }
}

class triangle extends figure {
  triangle(double a, double b) {
    super(a, b);
  }

  double area() {
    System.out.println("\ninside area for triangle.");
    return dim1 * dim2 / 2;
  }
}

class AbstractDemo {
  public static void main(String args[]) {
    rectangle r = new rectangle(9, 5);
    triangle t = new triangle(10, 8);
    figure figref;
    figref = r;
    System.out.println("area is " + figref.area());
    figref = t;
    System.out.println("area is " + figref.area());
  }
}