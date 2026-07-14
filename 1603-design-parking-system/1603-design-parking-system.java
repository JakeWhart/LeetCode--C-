class ParkingSystem {
   int bigp ;
   int mediump;
   int smallp;
    public ParkingSystem(int big, int medium, int small) {
        bigp = big;
        mediump = medium;
        smallp = small;
    }
    
    public boolean addCar(int carType) {
        if(carType == 1){
            if(bigp> 0){
                bigp--;
                return true;
            }
            else{
                return false;
            }
        }
       else if(carType == 2){
            if(mediump> 0){
                mediump--;
                return true;
            }
            else{
                return false;
            }
        }
        else if(carType == 3){
            if(smallp> 0){
                smallp--;
                return true;
            }
            else{
                return false;
            }
        }
    return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */