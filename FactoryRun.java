
public class FactoryRun {
	
	public static void main(String[] args) {
		
		
		SiteUI ui1 = FactoryUI.makeUI("UIAccount");
		//ui.display();
		
		SiteUI ui2 = FactoryUI.makeUI("UIBuySmart");
		//ui.display();
		
		SiteUI ui3 = FactoryUI.makeUI("UICart");
		//ui.display();
		
		SiteUI ui4 = FactoryUI.makeUI("UICheckOut");
		//ui.display();
		
		SiteUI ui5 = FactoryUI.makeUI("UICreateAccount");
		//ui.display();
		
		SiteUI ui6 = FactoryUI.makeUI("UIItem");
		//ui.display();
		
		SiteUI ui7 = FactoryUI.makeUI("UILogin");
		
		
	}

}
