package energyreceived;

import energies.BondEnergies;

public class ComputeEnergy {
    private String[] sA;
    private double reactantE;
    private BondEnergies bE;
    public ComputeEnergy(String[] strA) {
        sA=strA;
        reactantE = 0;
        bE = new BondEnergies();
    }
    public double getEnergy() {
        for (String bond : sA) {
            double dE = bE.getBond(bond);
            reactantE+=dE;
        }
        return reactantE;
    }
}
