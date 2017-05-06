package model;

public class Factory {
	public ReportFactory getFactory(String reportType){
	      if(reportType == null){
	         return null;
	      }		
	    	  if(reportType.equalsIgnoreCase("CSV")){
	         return new CsvFactory();
	      }	      
	      return null;
	   }
}
