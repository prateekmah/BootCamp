import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by LENOVO on 7/27/15.
 */
public class ParkingTest {

    @org.junit.Test
    public void ParkingTest() throws Exception {


        Car car=new Car(1000);
        Car car1=new Car(1005);

    ParkingLot p=new ParkingLot();
       int token= p.park(car);
        int token1=p.park(car1);

        assertEquals(1,token);
        assertEquals(2,token1);





    }






    @org.junit.Test(expected = ParkingFullException.class)
    public void testparkWithException() throws Exception
    {

        Car car=new Car(1000);
        Car car1=new Car(1005);
        ParkingLot parkingLot=new ParkingLot();

        parkingLot.park(car);
        parkingLot.park(car1);
        assertEquals(3,parkingLot.park(new Car(1002)));
    }


    @org.junit.Test(expected = ParkingDuplicacyException.class)
    public void testparkDuplicacy() throws Exception
    {

        Car car=new Car(1000);


        ParkingLot parkingLot=new ParkingLot();

        parkingLot.park(car);


        assertEquals(1,parkingLot.park(car));
    }


    @org.junit.Test(expected = CarNotFoundException.class)
    public void RetrieveCar() throws Exception {

        Car car=new Car(1000);
        Car car1=new Car(1005);

        ParkingLot p=new ParkingLot();
        int token= p.park(car);
        int token1=p.park(car1);

        assertEquals(1, token);
        assertEquals(2, token1);



       Car c=p.retrieve(3);









    }



}