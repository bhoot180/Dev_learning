package preferences;

import java.util.List;

/**
 * @author nmk263
 * 
 * Holds the preference values that apply to all preferences
 *
 */

public class Preference {
	
	private String preferenceDescription;

	private int preferenceID;

	private String preferenceType;
	
	private List<SelectedParam> selectedParams;
	
	private List<Parameter> parameters;

	/**
	 * @return the preferenceDescription
	 */
	public String getPreferenceDescription() {
		return preferenceDescription;
	}

	/**
	 * @param preferenceDescription the prefrenceDescription to set
	 */
	public void setPreferenceDescription(String prefrenceDescription) {
		this.preferenceDescription = prefrenceDescription;
	}

	/**
	 * @return the preferenceID
	 */
	public int getPreferenceID() {
		return preferenceID;
	}

	/**
	 * @param preferenceID the preferenceID to set
	 */
	public void setPreferenceID(int preferenceID) {
		this.preferenceID = preferenceID;
	}

	/**
	 * @return the preferenceType
	 */
	public String getPreferenceType() {
		return preferenceType;
	}

	/**
	 * @param preferenceType the prefrenceType to set
	 */
	public void setPreferenceType(String preferenceType) {
		this.preferenceType = preferenceType;
	}

	/**
	 * @return the selectedParams
	 */
	public List<SelectedParam> getSelectedParams() {
		return selectedParams;
	}

	/**
	 * @param selectedParams the selectedParams to set
	 */
	public void setSelectedParams(List<SelectedParam> selectedParams) {
		this.selectedParams = selectedParams;
	}

	/**
	 * @return the parameters
	 */
	public List<Parameter> getParameters() {
		return parameters;
	}

	/**
	 * @param parameters the parameters to set
	 */
	public void setParameters(List<Parameter> parameters) {
		this.parameters = parameters;
	}

}
