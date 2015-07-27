import java.util.HashMap;
import java.util.Map;

/**
 * Created by LENOVO on 7/27/15.
 */
public class ParkingLot {



    int token=1;

    private Map<Integer,Car> parkingspace=new HashMap<Integer,Car>();
    private int CAPACITY=2;

public ParkingLot()
{

}

    public ParkingLot(int capacity)
    {
        this.CAPACITY=capacity;
    }

    public int park(Car car)
    {

if(parkingspace.size()==CAPACITY)
{
    throw new ParkingFullException();
}

        if(parkingspace.containsValue(car))
        {
            throw new ParkingDuplicacyException();
        }

        parkingspace.put(token,car);
        return token++;
    }

    public Car retrieve(int token)
    {
        if(parkingspace.get(token)== null)
        {
            throw new CarNotFoundException("car not parked");
        }

        Car c=parkingspace.remove(token);
       return c;

    }
}
