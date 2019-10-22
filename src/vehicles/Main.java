package vehicles;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static List<Vehicle> vehicleList = new ArrayList<>();

    private static void addVehicles(){
        for(int i = 0;i < 5;i++){
            vehicleList.add(new Airplane());
        }
        for(int i = 0;i < 4;i++){
            vehicleList.add(new Car());
        }
        for(int i = 0;i<3;i++){
            vehicleList.add(new Jetboard());
        }
        for(int i = 0;i<2;i++){
            vehicleList.add(new Amphibia());
        }
    }



    public static void main(String[] args){
        addVehicles();
        getMovementPossibilities();

    }

    private static void getMovementPossibilities() {
        for (Vehicle vehicle : vehicleList
        ) {
            System.out.println(vehicle.getClass().toString());
            vehicle.getEnviroment();


}
    }

    }
