package com.topjohnwu.superuser.internal;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
abstract class StreamGobbler<T> implements Callable<T> {
    private static final String TAG = "SHELLOUT";
    protected final InputStream in;
    protected final List<String> list;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static class ERR extends StreamGobbler<Void> {
        public ERR(InputStream inputStream, List<String> list) {
            super(inputStream, list);
        }

        @Override // java.util.concurrent.Callable
        public Void call() {
            process(false);
            return null;
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static class OUT extends StreamGobbler<Integer> {
        private static final int NO_RESULT_CODE = 1;

        public OUT(InputStream inputStream, List<String> list) {
            super(inputStream, list);
        }

        @Override // java.util.concurrent.Callable
        public Integer call() {
            int parseInt;
            String process = process(true);
            if (process == null) {
                parseInt = 1;
            } else {
                try {
                    parseInt = Integer.parseInt(process);
                } catch (NumberFormatException unused) {
                    return 1;
                }
            }
            return Integer.valueOf(parseInt);
        }
    }

    public StreamGobbler(InputStream inputStream, List<String> list) {
        this.in = inputStream;
        this.list = list;
    }

    private boolean outputAndCheck(String str) {
        if (str == null) {
            return false;
        }
        int length = str.length();
        int i = length - 36;
        boolean startsWith = str.startsWith(JobImpl.END_UUID, i);
        if (startsWith) {
            if (length == 36) {
                return false;
            }
            str = str.substring(0, i);
        }
        List<String> list = this.list;
        if (list != null) {
            list.add(str);
        }
        return !startsWith;
    }

    public String process(boolean z) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.in, StandardCharsets.UTF_8));
        while (outputAndCheck(bufferedReader.readLine())) {
        }
        if (z) {
            return bufferedReader.readLine();
        }
        return null;
    }
}
