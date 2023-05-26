public class Vector {
    private int x;
    private int y;
    private int z;


    public Vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Vector(int x) {
        this.x = x;
    }

    public Vector() {

    }

    /*
    Функция по нахождению длины вектора.
    Формула: length = sqrt(x^2 + y ^2 + z^2)
     */
    public double length() {
        return Math.sqrt((Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2)));
    }


    /*
        Функция по нахождению скалярного произведения двух векторов.
        Формула: scalarProduct = x1 * x2 + y1 * y2 + z1 * z2
        */
    public int scalarProduct(Vector v1) {
        return x * v1.x + y * v1.y + z * v1.z;
    }

    /*
            Функция по нахождению векторного произведения двух векторов.
            Формула: vectorProduct =
            */
    public Vector vectorProduct(Vector v1) {

        return new Vector(y * v1.z - z * v1.y, z * v1.x - x * v1.z, x * v1.y - y * v1.x);
    }

    /*
                Функция по нахождению cos углов между векторами.
                Формула: cos = скалярное произведение векторов / (длина вектора 1 * длина вектора 2)
                */
    public double cos(Vector v1) {
        return scalarProduct(v1) / (length() * v1.length());
    }

    /*
                    Функция по нахождению суммы векторов.
                    Формула: sum = x1 + x2, y1 + y2, z1 + z2
                    */
    public Vector sum(Vector v1) {
        return new Vector(x + v1.x, y + v1.y, z + v1.z);
    }

    /*
                        Функция по нахождению разности векторов.
                        Формула: dif = x1 - x2, y1 - y2, z1 - z2
                        */
    public Vector dif(Vector v1) {
        return new Vector(x - v1.x, y - v1.y, z - v1.z);
    }

    /*
                        Статическая функция по выводу векторов.

                        */
    public static void print(Vector v1) {

        System.out.printf("Vector: \n   x: %d \n   y: %d \n   z: %d \n", v1.x, v1.y, v1.z);
    }

    /*
                            Статическая функция по генерированию рандомных значений верторов.
                            Параметр dim - это размерность вектора (количество не нулевых значений вектора)
                            Значения рандомиться от 1 до 9;

                            */
    public static Vector randomVector(int dim) {

        if (dim == 1) {
            return new Vector((int) (Math.random() * 10));
        }

        if (dim == 2) {
            return new Vector((int) (Math.random() * 10), (int) (Math.random() * 10));
        }
        if (dim == 3) {
            return new Vector((int) (Math.random() * 10), (int) (Math.random() * 10), (int) (Math.random() * 10));
        }

        return new Vector();
    }

}