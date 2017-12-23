package kni.webstore.model;

import java.util.ArrayList;
import java.util.List;


import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Repository;

@Repository
public class Example {

//	Pole przechwytujace string z pola textowego
	@NotEmpty
	private String dataString = "";

//	Pole zawierajace informacje o Checkboxie
	private boolean checked;
	
//	Pole zawierajace informacje z RadioButton
	private String gender;
	
//	Wybrany element z listy
	private String dropDownSelect;
	
//	Wybrany element z listy indexow
	private int index;
	
	
//	Lista elementow z listy rozwijalnej
	private List<String> dropDownList = new ArrayList<>(3);
	
//	Wszystkie Opcje radiobutton w liscie
	private String[] genders = new String[2];
	
//	Tablica elementow, dla wybranego indexu
	private int[] tab = new int[10];

	
	public Example() {
		genders[0] = "Man";
		genders[1] = "Woman";

		dropDownList.add("Elem 1");
		dropDownList.add("Elem 2");
		dropDownList.add("Elem 3");

		int count = 1;

		for (int i = 0; i < tab.length; i++) {
			tab[i] = count;
			count++;
		}
	}

	public boolean stringEmpty() {
		if (dataString.equals(""))
			return true;
		else
			return false;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public int[] getTab() {
		return tab;
	}

	public void setTab(int[] tab) {
		this.tab = tab;
	}

	public String getDropDownSelect() {
		return dropDownSelect;
	}

	public void setDropDownSelect(String dropDownSelect) {
		this.dropDownSelect = dropDownSelect;
	}

	public String getGender() {
		return gender;
	}

	public List<String> getDropDownList() {
		return dropDownList;
	}

	public void setDropDownList(List<String> dropDownList) {
		this.dropDownList = dropDownList;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String[] getGenders() {
		return genders;
	}

	public void setGenders(String[] genders) {
		this.genders = genders;
	}

	public boolean isChecked() {
		return checked;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}

	public String getDataString() {
		return dataString;

	}

	public void setDataString(String dataString) {
		this.dataString = dataString;

	}

	public void print() {
		System.out.println("Zmienna: " + dataString);
	}
}
