package energies;

import java.util.Map;
import java.util.HashMap;

public class BondEnergies {

    private static Map<String, Double> bond_energies;

    public static void main(String[] args) {
        standard_single_energy_bonds();
        standard_multiple_energy_bonds();
    }

    private static void standard_single_energy_bonds() {
        bond_energies.put("H-H", 104.2);
        bond_energies.put("C-C", 83.0);
        bond_energies.put("N-N", 138.4);
        bond_energies.put("O-O", 35.0);
        bond_energies.put("F-F", 36.6);
        bond_energies.put("Si-Si", 52.0);
        bond_energies.put("P-P", 50.0);
        bond_energies.put("S-S", 54.0);
        bond_energies.put("Cl-Cl", 58.0);
        bond_energies.put("Br-Br", 46.0);
        bond_energies.put("I-I", 36.0);
        bond_energies.put("H-C", 99.0);
        bond_energies.put("H-N", 93.0);
        bond_energies.put("H-O", 111.0);
        bond_energies.put("H-F", 135.0);
        bond_energies.put("H-Cl", 103.0);
        bond_energies.put("H-Br", 87.5);
        bond_energies.put("H-I", 71.0);
        bond_energies.put("H-B", 90.0);
        bond_energies.put("H-S", 81.0);
        bond_energies.put("H-Si", 75.0);
        bond_energies.put("H-P", 77.0);
        bond_energies.put("B-F", 150.0);
        bond_energies.put("B-O", 125.0);
        bond_energies.put("C-N", 73.0);
        bond_energies.put("N-CO", 86.0);
        bond_energies.put("C-O", 85.5);
        bond_energies.put("O-CO", 110.0);
        bond_energies.put("C-S", 65.0);
        bond_energies.put("C-F", 116.0);
        bond_energies.put("C-Cl", 81.0);
        bond_energies.put("C-Br", 68.0);
        bond_energies.put("C-I", 51.0);
        bond_energies.put("C-B", 90.0);
        bond_energies.put("C-Si", 76.0);
        bond_energies.put("C-P", 90.0);
        bond_energies.put("C-P", 90.0);
        bond_energies.put("N-O", 55.0);
        bond_energies.put("S-O", 87.0);
        bond_energies.put("Si-F", 135.0);
        bond_energies.put("Si-Cl", 90.0);
        bond_energies.put("Si-O", 110.0);
        bond_energies.put("P-Cl", 79.0);
        bond_energies.put("P-Br", 65.0);
        bond_energies.put("P-O", 90.0);
    }

    private static void standard_multiple_energy_bonds() {
        bond_energies.put("C=C", 146.0);
        bond_energies.put("N=N", 109.0);
        bond_energies.put("O=O", 119.0);
        bond_energies.put("C=N", 147.0);
        bond_energies.put("C=O", 258.0);
        bond_energies.put("N=O", 143.0);
        bond_energies.put("C=S", 138.0);
        bond_energies.put("P=O", 110.0);
        bond_energies.put("P=S", 70.0);
        bond_energies.put("C=C", 200.0);
        bond_energies.put("N=N", 226.0);
        bond_energies.put("C-N", 213.0);
    }

    public double getBond(String str) {
        return bond_energies.get(str);
    }

}
