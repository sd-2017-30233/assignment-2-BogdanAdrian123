package model;

public class CsvFactory implements ReportFactory {

	@Override
	public Report makecsv() {
		Csv csv= new Csv();
		csv.build();
		return  csv;
	}
}
