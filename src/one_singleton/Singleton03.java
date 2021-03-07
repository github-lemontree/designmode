package one_singleton;

/**
 * 静态匿名内部类
 */
public class Singleton03 {

	private static class Singleton03Holder {
		private static Singleton03 instance = new Singleton03();
	}

	public static Singleton03 getInstance() {
		return Singleton03Holder.instance;
	}
}
