package train.vehicule;

public class Voiture extends Vehicule
{
	private int nbPlaces;

	public Voiture (double poidsAVide, int nbRoues, int nbPlaces)
	{
		super(poidsAVide,nbRoues);
		this.nbPlaces = nbPlaces;
	}

	public double getPoidsEnChargeMaxi()
	{
		return poidsAVide + (0.082) * nbPlaces;
	}

	public String toString()
	{
		return String.format ( "%-25s", "[Voiture " + nbPlaces + " places  " ) + super.toString() + " ]";
	}
}