//Adapter Concrete Class
public class WeightMachineAdapterImpl implements WeightMachineAdapter
{
    OmronWeightMachineImpl om;

    public WeightMachineAdapterImpl(OmronWeightMachineImpl obj)
    {
        this.om = obj;
    }  

    public double getWeightInKg()
    {
        double weight;
        weight = om.getWeightInPound();
        //As 1 pound has ~0.45 KG
        return weight*0.45;
    }  
}

