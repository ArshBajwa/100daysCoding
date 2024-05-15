class ParkingSystem {
    private static int cntbig=0;
    private static int cntmedium=0;
    private static int cntsmall=0;
    
        public ParkingSystem(int big, int medium, int small) {
               if(big!=0){
                  cntbig=big;
               }
               if(medium!=0){
                   cntmedium=medium;
               }
               if(small!=0){
                    cntsmall=small;
               }
        }
        
        public boolean addCar(int carType) {
            if(carType==1&&cntbig!=0){
                cntbig--;
                 return true;
            }
            else if(carType==2&&cntmedium!=0){
                  cntmedium--;
                  return true;
            }
            else if(carType==3&&cntsmall!=0){
                  cntsmall--;
                  return true;
            }
            return false;
            
        }
    }
    