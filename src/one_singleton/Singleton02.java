package one_singleton;

/**
 * 双重检查
 * 主要是为了减小锁的力度，synchronized不在锁住整个方法
 */
public class Singleton02 {

	private static volatile Singleton02 instance;

	public static Singleton02 getInstance() {
		if (null == instance) {
			synchronized (instance) {
				if (instance == null) {
					instance = new Singleton02();
				}
			}
		}
		return instance;
	}
}
