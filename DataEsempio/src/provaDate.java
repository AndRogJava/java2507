import java.text.SimpleDateFormat;
import java.util.Date;

public class provaDate {

	public static void main(String[] args) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Date date = new Date();
		System.out.println(dateFormat.format(date)); //2013/10/15 16:16:39
 c x
	}

}
