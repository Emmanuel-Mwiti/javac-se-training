package com.systechafrica.part3.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class WorkingWithMaps {
  public static void main(String[] args) {

    List<String> manuNicknames = new ArrayList<>();
    manuNicknames.add("Kiogi");
    manuNicknames.add("Manu");
    manuNicknames.add("VC");

    List<String> johnNicknames = new ArrayList<>();
    johnNicknames.add("mhusika");
    johnNicknames.add("ntate");
    johnNicknames.add("yokana");

    Map<String, List<String>> nickNameMap = new HashMap<>();
    nickNameMap.put("Manu", manuNicknames);
    nickNameMap.put("john", johnNicknames);

    System.out.println(nickNameMap);
    Set<Entry<String, List<String>>> entrySet = nickNameMap.entrySet();
    Set<String> keySet = nickNameMap.keySet();
    Collection<List<String>> valueList = nickNameMap.values();
    // Set<Entry<String, List<String>>> entrySet2 = nickNameMap.entrySet();
    for (Entry<String, List<String>> record : entrySet) {
      System.out.println(record.getKey() + ":" + record.getValue());
    }

    for (String record : keySet) {
      System.out.println(record);
    }
    for (List<String> record : valueList) {
      System.out.println(record);
    }

  }
}
