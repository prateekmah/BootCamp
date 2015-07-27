import java.util.HashMap;
import java.util.Map;

/**
 * Created by LENOVO on 7/27/15.
 */
public class ParkingLot {



    int token=1;

    private Map<Integer,Car> parkingspace=new HashMap<Integer,Car>();
    private int CAPACITY=3;
    private ParkingLotOwner parkingLotOwner;

public ParkingLot()
{

}


    public ParkingLot(ParkingLotOwner p)
    {
parkingLotOwner=p;
    }
    public ParkingLot(int capacity)
    {
        this.CAPACITY=capacity;
    }

    public int park(Car car)
    {
/*

if(parkingspace.size()==CAPACITY)
{
    throw new ParkingFullException();
}
*/

        if(parkingspace.containsValue(car))
        {
            throw new ParkingDuplicacyException();
        }

        parkingspace.put(token,car);
        if(parkingspace.size()==CAPACITY)
        {
parkingLotOwner.onFull();

        }

        return token++;
    }

    public Car retrieve(int token)
    {
        if(parkingspace.get(token)== null)
        {
            throw new CarNotFoundException("car not parked");
        }
if(parkingspace.size()==CAPACITY)
{
parkingLotOwner.spacepresent();
}
        Car c=parkingspace.remove(token);
       return c;

    }
}
