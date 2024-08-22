package construct_inheritance;

class Monitor
{
	protected void finalize()
	{
		System.out.println("garbage collection done ");
	}
}
