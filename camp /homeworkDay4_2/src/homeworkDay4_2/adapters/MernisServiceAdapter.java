package homeworkDay4_2.adapters;

import homeworkDay4_2.abstracts.PlayerCheckService;
import homeworkDay4_2.entities.Player;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;
 
public class MernisServiceAdapter implements PlayerCheckService {

	@Override
	public boolean checkIfRealPerson(Player player) {

		KPSPublicSoapProxy client = new KPSPublicSoapProxy();


		try {

			return client.TCKimlikNoDogrula(Long.parseLong(player.getNationaltyId()),
					player.getFirstName(), player.getLastName(), player.getDateofBirth().getYear());

		} catch (Exception e) {

			System.out.println("Not a valid player");
		}
		return false;
	}

}
