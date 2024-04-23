package ex2;

public class LivretA extends CompteBancaire {

    public LivretA(String type, double solde, double tauxRemuneration) {
        super(type, solde, 0, tauxRemuneration);
    }
    @Override
    public void debiterMontant(double montant) {
        if (this.getSolde() >= montant) { // Vérifie si le solde est suffisant pour le retrait
            this.setSolde(this.getSolde() - montant);
        }
    }

    @Override
    public void appliquerRemuAnnuelle() {
        this.setSolde(this.getSolde() + this.getSolde() * this.getTauxRemuneration() / 100);
    }
}
