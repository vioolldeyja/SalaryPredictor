/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salarypredictor.helpers;

/**
 *
 * @author kuba
 */
public enum MaritalStatus {
    MARRIEDCIVSPOUSE, DIVORCED, NEVERMARRIED, SEPARATED, WIDOWED, MARRIEDSPOUSEABSENT, MARRIEDAFSPOUSE;
    
    public static MaritalStatus fromString(String text) {
    if (text != null) {
      for (MaritalStatus b : MaritalStatus.values()) {
        if (text.equalsIgnoreCase(b.toString())) {
          return b;
        }
      }
    }
    return null;
  }
}

