interface Shape {
    public abstract float Area();

    public abstract float Perimeter();
}

class Rectangle implements Shape {
    private float x;
    private float y;
    private float result;

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    @Override
    public float Area() {

        result = x * y;
        return result;
    }

    @Override
    public float Perimeter() {
        result = (x + y) * 2;
        return result;
    }
}

class Circle implements Shape {
    private float r;
    private float result;

    public float getX() {
        return r;
    }

    public void setX(float r) {
        this.r = r;
    }

    @Override
    public float Area() {
        result = (float) (r * r * Math.PI);
        return result;
    }

    @Override
    public float Perimeter() {
        result = (float) (2 * r * Math.PI);
        return result;
    }
}

class triangle implements Shape {
    private double x;
    private double y;
    private double z;
    private double result;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public float Area() {
        if (x + y < z || x + z < y || z + y < x) {
            System.out.println("输入错误，三角形不存在，请重新输入！");
            return (float) result;
        } else {
            result = Math.sqrt((x + y + z) / 2 * ((x + y + z) / 2 - x) * ((x + y + z) / 2 - y) * ((x + y + z) / 2 - z));
            return (float) result;
        }
    }

    @Override
    public float Perimeter() {
        if (x + y < z || x + z < y || z + y < x) {
            System.out.println("输入错误，三角形不存在，请重新输入！");
            return (float) result;

        } else {
            result = x + y + z;
            return (float) result;
        }

    }
}


