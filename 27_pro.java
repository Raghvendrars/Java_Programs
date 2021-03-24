class Number_1<T>
{
	private T t;
	public Number_1(T t)
	{
		this.t=t;
	}
	public T get()
	{
		return this.t;
	}
}
class prog27
{
	public static void main(String args[])
	{
		Number_1<Integer> i=new Number_1<Integer>(15);
		System.out.println(i.get());
		Number_1<Float> f=new Number_1<Float>((float)10.10);
		System.out.println(f.get());
	}
}
		
