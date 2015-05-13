public class TestRobot
{
	public static void main(String[] args)
	{
		Asimo06 unit = new Asimo06(30, 150, 1000, 5);
		unit.CetakSpesifikasi();
		unit.Upgrade(20);
		unit.Upgrade(25);
	}
}

// Note: yang berwarna merah disesuaikan dengan class beserta nomor absen 
// (misal: Asimo05)
