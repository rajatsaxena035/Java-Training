class MaxValues
{
	public static void main(String args[])
	{
		Byte byteObj = new Byte(Byte.MAX_VALUE);
		Short shortObj = new Short(Short.MAX_VALUE);
		Integer intObj = new Integer(Integer.MAX_VALUE);
		Long longObj = new Long(Long.MAX_VALUE);
		Float floatObj = new Float(Float.MAX_VALUE);
		Double doubleObj = new Double(Double.MAX_VALUE);

		System.out.println(byteObj.byteValue());
		System.out.println(shortObj.shortValue());
		System.out.println(intObj.intValue());
		System.out.println(longObj.longValue());
		System.out.println(floatObj.floatValue());
		System.out.println(doubleObj.doubleValue());	
	}
}