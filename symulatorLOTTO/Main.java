package symulatorLOTTO;

public class Main
{
    public static void main(String[] args)
    {
        /**
         * 
         * Simulate LOTTO lottery
         * 
         * 
         */
        try
        {
            Outcome.result(Outcome.comparison(Draw.randNumbers(), Numbers.playerNum()));
        }
        
        catch (NumberFormatException | ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }

        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    } 
}
