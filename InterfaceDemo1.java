class InterfaceDemo1
{
    public static void main(String args[])
    {
        PPA pobj = new PPA();
        System.out.println("Value of PI is : "+Circle.PI);
        float fRet = 0.0f;

        fRet = pobj.Area(10.7f);
        System.out.println("Area is : "+fRet);
        fRet = pobj.Circumferance(10.7f);
        System.out.println("Circumferance is : "+fRet);
    }
}
interface Circle
{
    float PI = 3.14f;
    float Area (float Radius);
    float Circumferance(float Radius);
}
class PPA implements Circle
{
    public float Area (float Radius)
    {
        return PI * Radius * Radius ;
    }
    public float Circumferance(float Radius)
    {
        return 2 * PI * Radius ;
    }
}