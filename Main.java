import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        double x, y,step, count, begin, end, sum,C;
        sum = 0;
        count = 0;
        Scanner in = new Scanner(System.in);
        while (true)
        {
            System.out.print("Введите шаг: ");
            step = in.nextDouble();
            if (step == 0.0)
                System.out.println("шаг не может быть равен нулю");
            else
                break;
        }
        System.out.print("Введите начальную точку: ");
        begin = in.nextDouble();
        System.out.print("Введите конечную точку: ");
        end = in.nextDouble();
        if (begin>end)
        {
            C = begin;
            begin = end;
            end = C;
        }
        for (x = begin; x <= end; x += Math.abs(step))
        {
            y = x * Math.exp(x) + 2 * Math.sin(x) - Math.sqrt(Math.abs(Math.pow(x, 3) - Math.pow(x, 2)));
            System.out.println("y=" + y);
            if ((Math.round(Math.abs(y)) % 2 == 0))
            {
                count++;
                sum += y;
            }
        }
        System.out.println("ср.ариф.=" + sum / count);
    }
}
