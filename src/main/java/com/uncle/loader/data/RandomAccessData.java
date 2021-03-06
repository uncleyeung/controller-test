package com.uncle.loader.data;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author 杨戬
 * @className RandomAccessData
 * @email uncle.yeung.bo@gmail.com
 * @date 2019/5/30 17:10
 */
public interface RandomAccessData {
    InputStream getInputStream(RandomAccessData.ResourceAccess var1) throws IOException;

    RandomAccessData getSubsection(long var1, long var3);

    long getSize();

    public static enum ResourceAccess {
        ONCE,
        PER_READ;

        private ResourceAccess() {
        }
    }
}
