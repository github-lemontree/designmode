package one_singleton;

/**
 * 利用枚举完成单例模式
 */
public enum Singleton04 {
	INSTANCE;

	public void doSomething() {
		System.out.println("doSomething ...");
	}

	public static void main(String[] args) {
		Singleton04.INSTANCE.doSomething();
	}
}
