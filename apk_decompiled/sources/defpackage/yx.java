package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Trace;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class yx {
    public static final s60 a = new s60(16);
    public static final ThreadPoolExecutor b;
    public static final Object c;
    public static final bq0 d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new ui0());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
        c = new Object();
        d = new bq0();
    }

    public static String a(List list, int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((sx) list.get(i2)).e);
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004e A[Catch: all -> 0x00a1, TRY_LEAVE, TryCatch #1 {all -> 0x00a1, all -> 0x0071, NameNotFoundException -> 0x0097, blocks: (B:3:0x0007, B:5:0x000f, B:10:0x0018, B:11:0x001c, B:16:0x004e, B:19:0x0057, B:21:0x005d, B:24:0x006d, B:26:0x0082, B:29:0x008e, B:34:0x0072, B:35:0x0075, B:36:0x0076, B:38:0x002b, B:40:0x0033, B:43:0x0037, B:45:0x003b, B:47:0x0046, B:56:0x0097, B:23:0x0064), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057 A[Catch: all -> 0x00a1, TRY_ENTER, TryCatch #1 {all -> 0x00a1, all -> 0x0071, NameNotFoundException -> 0x0097, blocks: (B:3:0x0007, B:5:0x000f, B:10:0x0018, B:11:0x001c, B:16:0x004e, B:19:0x0057, B:21:0x005d, B:24:0x006d, B:26:0x0082, B:29:0x008e, B:34:0x0072, B:35:0x0075, B:36:0x0076, B:38:0x002b, B:40:0x0033, B:43:0x0037, B:45:0x003b, B:47:0x0046, B:56:0x0097, B:23:0x0064), top: B:2:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static xx b(String str, Context context, List list, int i) {
        Typeface typeface;
        int i2;
        Typeface a2;
        s60 s60Var = a;
        cq.c("getFontSync");
        try {
            typeface = (Typeface) s60Var.a(str);
        } catch (PackageManager.NameNotFoundException unused) {
            return new xx(-1);
        } finally {
        }
        if (typeface != null) {
            return new xx(typeface);
        }
        ey a3 = rx.a(context, list);
        List list2 = a3.b;
        int i3 = a3.a;
        if (i3 != 0) {
            if (i3 == 1) {
                i2 = -2;
                if (i2 == 0) {
                    return new xx(i2);
                }
                if (list2.size() > 1) {
                    zk0 zk0Var = q01.a;
                    cq.c("TypefaceCompat.createFromFontInfoWithFallback");
                    q01.a.getClass();
                    a2 = zk0.d(context, list2, i);
                    Trace.endSection();
                } else {
                    a2 = q01.a(context, (fy[]) list2.get(0), i);
                }
                if (a2 == null) {
                    return new xx(-3);
                }
                s60Var.b(str, a2);
                return new xx(a2);
            }
            i2 = -3;
            if (i2 == 0) {
            }
        } else {
            fy[] fyVarArr = (fy[]) list2.get(0);
            if (fyVarArr != null && fyVarArr.length != 0) {
                int length = fyVarArr.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        i2 = 0;
                        break;
                    }
                    int i5 = fyVarArr[i4].e;
                    if (i5 == 0) {
                        i4++;
                    } else if (i5 >= 0) {
                        i2 = i5;
                    }
                }
                if (i2 == 0) {
                }
            }
            i2 = 1;
            if (i2 == 0) {
            }
        }
    }
}
