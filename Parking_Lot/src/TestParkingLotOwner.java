/**
 * Created by LENOVO on 7/27/15.
 */
public class TestParkingLotOwner extends ParkingLotOwner {
public boolean flag;

    @Override
    public void onFull() {

        flag=true;



    }

    public void spacepresent()
    {
        flag=false;
    }
}
