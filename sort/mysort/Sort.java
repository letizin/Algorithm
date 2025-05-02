package sort.mysort;

import java.util.Arrays;

public abstract class Sort<T> {
   int[] orgData;
   int[] sortedData;
   
   public abstract void sort();
   
   
   public void setData(int[] dataList) {
      this.orgData = dataList;
      this.sortedData = dataList.clone(); //deep copy 방식                                    
   }
   
   public String getOrgData() {
      return Arrays.toString(orgData);
   }
   
   public String getSortedData() {
      return Arrays.toString(sortedData);
   }

}