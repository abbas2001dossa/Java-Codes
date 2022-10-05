package proj;
public class MotorCar extends Car
{
    private int model ;

    MotorCar(){
        this.model=235;
    }

    public void  work()
    {
        System.out.println(" Value of model is :- " + this.model );

    }
}