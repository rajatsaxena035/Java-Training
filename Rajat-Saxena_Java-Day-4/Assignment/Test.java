class Test
{
    int a;
    float b;

    void area(int x)
    {
        System.out.println("Age = " + x);
    }

    float perimeter(float y)
    {
       float perimeter = 2*b;
       return perimeter; 
    }

    public static void main(String[] args)
    {
        String s = "abc";
        Test t = new Test();
        t.area(3);
    }



}