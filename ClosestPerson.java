public class ClosestPerson {
    public int findClosest(int x, int y, int z) {
        int one = Math.abs(z-x);
        int two = Math.abs(z-y);
        if(one < two){
            return 1;
        }else if (one > two){
            return 2;
        }else{
            return 0;
        }
    }
}

