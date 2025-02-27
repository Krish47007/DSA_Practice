package company_wise.goldman_sachs.medium;

public class Robot_Bounded_In_Circle {

    public boolean isRobotBounded(String instructions) {

        char currDirection = 'N';
        int x = 0, y = 0;

        for (int i = 0;i < instructions.length();i++)
        {
            char incoming = instructions.charAt(i);

            if (incoming == 'G')
            {
                y += currDirection == 'N' ? 1 : 0;
                y += currDirection == 'S' ? -1 : 0;
                x += currDirection == 'E' ? 1 : 0;
                x += currDirection == 'W' ? -1 : 0;
            }
            else if (currDirection == 'N')
                currDirection = (incoming == 'L' ) ? 'W' : 'E';
            else if (currDirection == 'S')
                currDirection = (incoming == 'L' ) ? 'E' : 'W';
            else if (currDirection == 'E')
                currDirection = (incoming == 'L') ? 'N' : 'S';
            else
                currDirection = (incoming == 'L') ? 'S' : 'N';
        }

        if ( (x == 0 && y == 0) || currDirection != 'N')
            return true;

        return false;

    }
}
