package one_singleton;

/**
 * 饿汉模式
 * 类加载就会创建单例对象
 */
public class Singleton01 {

	private static Singleton01 INSTANCE = new Singleton01();

	public static Singleton01 getINSTANCE() {
		return INSTANCE;
	}
}
