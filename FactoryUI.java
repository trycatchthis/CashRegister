
public class FactoryUI {
	
	public static SiteUI makeUI(String BuySmartUI){
		
		if (BuySmartUI.contentEquals("UIAccount")){
			return new UIAccount();
		}
		else if (BuySmartUI.contentEquals("UIBuySmart")){
			return new UIBuySmart();
		}
		else if (BuySmartUI.contentEquals("UICart")){
			return new UICart();
		}
		else if (BuySmartUI.contentEquals("UICheckOut")){
			return new UICheckOut();
		}
		else if (BuySmartUI.contentEquals("UICreateAccount")){
			return new UICreateAccount();
		}
		else if (BuySmartUI.contentEquals("UIItem")){
			return new UIItem();
		}
		else if (BuySmartUI.contentEquals("UILogin")) {
			return new UILogin();
		}
		return null;
	}
}

