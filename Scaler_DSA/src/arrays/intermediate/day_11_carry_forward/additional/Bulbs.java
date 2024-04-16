package arrays.intermediate.day_11_carry_forward.additional;

public class Bulbs {

    // E.g - [1,0,1,0,0]
    public int bulbs(int[] arr) {

        int count = 0,state = 0;

        for(int i = 0;i < arr.length;i++)
        {
            //check current status of bulb
            state = arr[i];

            if(count % 2 == 0)
            {
                //meaning either switch is not pressed yet or it has been pressed even num of times
                // so the state of bulb is same as original config.
                state = arr[i];

            }
            else{
                //switch is pressed in last pass so now we have to take the toggled state
                state = 1 - arr[i];
            }

            //Now after toggling the state which is coming from previous pass
            //check if state is 0. If its 0 we need to toggle again.
            if(state == 0)
                count++;

        }
        return count;
    }
}
