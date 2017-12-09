package hbase;
import java.io.IOException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.Get;
import org.apache.hadoop.hbase.client.HTable;
//import org.apache.hadoop.hbase.client.ResultScanner;
import org.apache.hadoop.hbase.client.Result;
//import org.apache.hadoop.hbase.client.Scan;
import org.apache.hadoop.hbase.util.Bytes;

public class RetriveData {
	public static void main(String[] args) throws IOException, Exception{
		   
	      // Instantiating Configuration class
	      Configuration config = HBaseConfiguration.create();

	      // Instantiating HTable class
	      @SuppressWarnings({ "deprecation", "resource" })
		HTable table = new HTable(config, "emp");

	      // Instantiating Get class
	      Get g = new Get(Bytes.toBytes("1"));

	      // Reading the data
	      Result result = table.get(g);

	      // Reading values from Result class object
	      byte [] value = result.getValue(Bytes.toBytes("personal"),Bytes.toBytes("name"));

	      byte [] value1 = result.getValue(Bytes.toBytes("personal"),Bytes.toBytes("city"));

	      // Printing the values
	      String name = Bytes.toString(value);
	      String city = Bytes.toString(value1);
	      
	      System.out.println("name: " + name + " city: " + city);
	   }
	}


