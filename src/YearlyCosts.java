public class YearlyCosts
{
    public static void main(String[] args)
    {
        double mantenanceCost = 1000.00;
        double summerCost = 0;
        double winterCost = 0;
        double springCost = 0;
        double fallCost = 0;

        summerCost += mantenanceCost;
        System.out.println("The summer cost is: $" + summerCost);
        winterCost = summerCost + mantenanceCost;
        System.out.println("The winter cost is: $" + winterCost);
        springCost = winterCost + mantenanceCost;
        System.out.println("The spring cost is: $" + springCost);
        fallCost = springCost + mantenanceCost;
        System.out.println("The fall cost is: $" + fallCost);
    }
}
