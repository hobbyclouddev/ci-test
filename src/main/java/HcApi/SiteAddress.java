package HcApi;

public class SiteAddress {
	
	private static String BaseAddress = "http://hobbycloud.cloudapp.net";
	//private static String BaseAddress = "http://localhost/hc";
	
	public static class Login 
	{
		public static String LoginUrl = BaseAddress + "/Login";
		public static String GetTimeUrl = BaseAddress + "/download/UTCTime";
		public static String RegistrationUrl = BaseAddress + "/registration";
	}

	public static class Dashboard
	{
		public static String GetAll = BaseAddress + "/dashboards/GetAll";
		public static String Create = BaseAddress + "/dashboards/Create";
		public static String Delete = BaseAddress + "/dashboards/delete";
		public static String GetDashboard = BaseAddress + "/dashboards/Get";
	}


	public static class Device
	{
		public static String GetDevice = BaseAddress + "/devices/Get";
		public static String GetAll = BaseAddress + "/devices/GetAll";
		public static String Delete = BaseAddress + "/devices/delete";
		public static String Create = BaseAddress + "/devices/Create";

		public static String UpdateHwmapping = BaseAddress + "/devices/UpdateHwmapping";
		public static String SetToolChipId = BaseAddress + "/devices/SetToolChipId";
		public static String GetAllConnectedControl = BaseAddress + "/devices/GetAllConnectedControl";
		public static String GetHwMapping = BaseAddress + "/devices/gethwmapping"; //+deviceId

	}

	public static class Notification
	{
		public static String GetAll = BaseAddress + "/notifications/GetAll";
		public static String Create = BaseAddress + "/notifications/Create";
		public static String Delete = BaseAddress + "/notifications/delete";
		public static String Update = BaseAddress + "/notifications/update";
	}

}
