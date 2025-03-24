/**
 * Set up and control an elementary cellular automaton.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version  2016.02.29
 */
public class AutomatonController
{
    // The automaton.
    // Question 25: The reset method typically restores the automaton to its initial state.
    // Question 26: In the java.util.Arrays class, the methods that take a parameter of type int[] are: the Arrays.fill(int[]array, int val) and Arrays.fill(int[] array, int fromIndex, int val)
    // Question 27: a- yes, the automaton will behave differently by creating more complex patterns as the cells evolve over time (the patterns may be more dynamic) b- yes, the automaton's behaviour is deterministic, Mmeaning that giving the same initial state and set of rules, the automaton will always produce the same pattern (but theu will change because of the different starting condition)
    // Question 30: We can store previous values in memory instead of using the nextState Array
    private Automaton auto;
    
    /**
     * Create an AutomatonController.
     * @param numberOfCells The number of cells in the automaton.
     */
    public AutomatonController(int numberOfCells)
    {
        auto = new Automaton(numberOfCells);
        auto.print();
    }
    
    /**
     * Create an AutomatonController with
     * a default number of cells.
     */
    public AutomatonController()
    {
        this(50);
    }
    
    /**
     * Run the automaton for the given number of steps.
     * @param numSteps The number of steps.
     */
    public void run(int numSteps)
    {
        for(int step = 1; step <= numSteps; step++) {
            step();
        }
    }
    
    /**
     * Run the automaton for a single step.
     */
    public void step()
    {
        auto.update();
        auto.print();
    }
    
    /**
     * Reset the automaton.
     */
    public void reset()
    {
        auto.reset();
        auto.print();
    }
}
