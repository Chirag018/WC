
package FivetyOne;
//https://leetcode.com/problems/seat-reservation-manager/
import java.util.PriorityQueue;

public class seatManager {
 
    PriorityQueue<Integer> seat;
    int count;
    public seatManager(int n) {
        count=1;
        seat=new PriorityQueue<>();
    }
    
    public int reserve() {
        if(seat.size()==0)
            return count++;
        return seat.poll();
    }
    
    public void unreserve(int seatNumber) {
        seat.add(seatNumber);
    }
}

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */