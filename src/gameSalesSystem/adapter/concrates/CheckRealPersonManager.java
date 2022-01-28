package gameSalesSystem.adapter.concrates;

import java.rmi.RemoteException;

import gameSalesSystem.adapter.abstracts.CheckRealPersonService;
import gameSalesSystem.entities.concrates.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class CheckRealPersonManager implements CheckRealPersonService{
	

	@SuppressWarnings("deprecation")
	@Override
	public boolean CheckIfRealPerson(User user) {
		
		KPSPublicSoapProxy kpsPublicSoapProxy=new KPSPublicSoapProxy();
		try {
			return kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(user.getIdentityNumber()),
					user.getFirstName().toUpperCase(),
					user.getLastName().toUpperCase(),
					user.getYearOfBirth().getYear());
		} catch (NumberFormatException | RemoteException e) {
			e.printStackTrace();
			return false;
		}
	}
	
}
