package vehicles;

public abstract class Vehicle {
    Boolean air;
    Boolean ground;
    Boolean water;

    public void getEnviroment(){
        if(this.air){
            System.out.println("this vehicle can fly away");

        }
        if(this.ground){
            System.out.println( "this vehicle can move on the ground");

        }
        if(this.water){
            System.out.println("this vehicle can swim");

        }

    }
}
