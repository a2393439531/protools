package pro.tools.constant;


/**
 * 常量相关工具
 * 包含
 * 数据单位的常量
 * 常见的正则表达式
 *
 * @author SeanDragon
 */
public final class UnitConst {

    private UnitConst() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    /******************** 存储相关常量 ********************/
    /**
     * KB与Byte的倍数
     */
    public static final int KB = 1024;
    /**
     * MB与Byte的倍数
     */
    public static final int MB = 1048576;
    /**
     * GB与Byte的倍数
     */
    public static final int GB = 1073741824;
    /**
     * 秒与毫秒的倍数
     */
    public static final int SEC = 1000;
    /**
     * 分与毫秒的倍数
     */
    public static final int MIN = 60000;

    /******************** 时间相关常量 ********************/
    /**
     * 时与毫秒的倍数
     */
    public static final int HOUR = 3600000;
    /**
     * 天与毫秒的倍数
     */
    public static final int DAY = 86400000;

    public enum MemoryUnit {
        BYTE,
        KB,
        MB,
        GB
    }

    public enum TimeUnit {
        MSEC,
        SEC,
        MIN,
        HOUR,
        DAY
    }
}