//Adaptee Concrete class 
class OmronWeightMachineImpl implements OmronWeightMachine
{
    public double WeightInPound = 0;
    
    public OmronWeightMachineImpl(double w)
    {
        this.WeightInPound = w;
    }  

    public double getWeightInPound()
    {
        return WeightInPound;
    }
}

