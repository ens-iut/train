import train.Train;

import train.vehicule.Vehicule;
import train.vehicule.Motrice;
import train.vehicule.Voiture;
import train.vehicule.Wagon;

public class TestTrain
{

	public static void main(String[] arg)
	{
		Train t1 = new Train();

		t1.ajouterVehicule ( new Motrice (  110, 12,   5) );
		t1.ajouterVehicule ( new Voiture ( 40.3,  8,  65) );
		t1.ajouterVehicule ( new Voiture ( 40.3,  8,  80) );
		t1.ajouterVehicule ( new Wagon   ( 25.5,  8, 250) );
		t1.ajouterVehicule ( new Motrice (  110, 12,   5) );   // ajout impossible

		System.out.println ( t1 );

		Train t2 = new Train();
		t2.ajouterVehicule ( new Voiture ( 40.3,  8,  65) );  // ajout impossible
		t2.ajouterVehicule ( new Wagon   ( 25.5,  8, 250) );  // ajout impossible

		System.out.println ( t2 );

	}
}