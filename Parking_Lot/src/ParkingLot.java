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

        parkingspace.put(token,car);
        return token++;
    }
}
