package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class q01 {
    public static final zk0 a;
    public static final s60 b;

    static {
        cq.c("TypefaceCompat static init");
        zk0 zk0Var = new zk0(8);
        new ConcurrentHashMap();
        a = zk0Var;
        b = new s60(16);
        Trace.endSection();
    }

    public static Typeface a(Context context, fy[] fyVarArr, int i) {
        cq.c("TypefaceCompat.createFromFontInfo");
        try {
            a.getClass();
            Typeface typeface = null;
            try {
                FontFamily f = zk0.f(fyVarArr, context.getContentResolver());
                if (f != null) {
                    typeface = new Typeface.CustomFallbackBuilder(f).setStyle(zk0.e(f, i).getStyle()).build();
                }
            } catch (Exception e) {
                Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            }
            return typeface;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if (r2.equals(r5) == false) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0240  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface b(Context context, zx zxVar, Resources resources, int i, String str, int i2, int i3, ej0 ej0Var, boolean z) {
        Typeface typeface;
        FontFamily.Builder builder;
        Typeface typeface2;
        List unmodifiableList;
        Typeface typeface3 = null;
        int i4 = 0;
        if (zxVar instanceof dy) {
            dy dyVar = (dy) zxVar;
            String str2 = dyVar.e;
            if (str2 != null && !str2.isEmpty()) {
                typeface2 = Typeface.create(str2, 0);
                Typeface create = Typeface.create(Typeface.DEFAULT, 0);
                if (typeface2 != null) {
                }
            }
            typeface2 = null;
            if (typeface2 != null) {
                if (ej0Var != null) {
                    ej0Var.callbackSuccessAsync(typeface2, null);
                }
                return typeface2;
            }
            int i5 = 1;
            Object[] objArr = !z ? ej0Var != null : dyVar.d != 0;
            int i6 = z ? dyVar.c : -1;
            Handler handler = ej0.getHandler(null);
            p7 p7Var = new p7();
            p7Var.d = ej0Var;
            sx sxVar = dyVar.b;
            sx sxVar2 = dyVar.a;
            if (sxVar != null) {
                Object[] objArr2 = {sxVar2, sxVar};
                ArrayList arrayList = new ArrayList(2);
                for (int i7 = 0; i7 < 2; i7++) {
                    Object obj = objArr2[i7];
                    Objects.requireNonNull(obj);
                    arrayList.add(obj);
                }
                unmodifiableList = Collections.unmodifiableList(arrayList);
            } else {
                ArrayList arrayList2 = new ArrayList(1);
                Object obj2 = new Object[]{sxVar2}[0];
                Objects.requireNonNull(obj2);
                arrayList2.add(obj2);
                unmodifiableList = Collections.unmodifiableList(arrayList2);
            }
            vi0 vi0Var = new vi0(handler);
            bg bgVar = new bg(p7Var, vi0Var);
            if (objArr != true) {
                String a2 = yx.a(unmodifiableList, i3);
                Typeface typeface4 = (Typeface) yx.a.a(a2);
                if (typeface4 != null) {
                    vi0Var.execute(new z3(i5, p7Var, typeface4));
                    typeface3 = typeface4;
                } else {
                    wx wxVar = new wx(bgVar, i4);
                    synchronized (yx.c) {
                        try {
                            bq0 bq0Var = yx.d;
                            ArrayList arrayList3 = (ArrayList) bq0Var.get(a2);
                            if (arrayList3 != null) {
                                arrayList3.add(wxVar);
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                arrayList4.add(wxVar);
                                bq0Var.put(a2, arrayList4);
                                vx vxVar = new vx(a2, context, unmodifiableList, i3, 1);
                                ThreadPoolExecutor threadPoolExecutor = yx.b;
                                wx wxVar2 = new wx(a2, i5);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                wi0 wi0Var = new wi0();
                                wi0Var.d = vxVar;
                                wi0Var.e = wxVar2;
                                wi0Var.f = handler2;
                                threadPoolExecutor.execute(wi0Var);
                            }
                        } finally {
                        }
                    }
                }
            } else {
                if (unmodifiableList.size() > 1) {
                    o.m("Fallbacks with blocking fetches are not supported for performance reasons");
                    return null;
                }
                sx sxVar3 = (sx) unmodifiableList.get(0);
                s60 s60Var = yx.a;
                ArrayList arrayList5 = new ArrayList(1);
                Object obj3 = new Object[]{sxVar3}[0];
                Objects.requireNonNull(obj3);
                arrayList5.add(obj3);
                String a3 = yx.a(Collections.unmodifiableList(arrayList5), i3);
                Typeface typeface5 = (Typeface) yx.a.a(a3);
                if (typeface5 != null) {
                    vi0Var.execute(new z3(i5, p7Var, typeface5));
                    typeface3 = typeface5;
                } else if (i6 == -1) {
                    ArrayList arrayList6 = new ArrayList(1);
                    Object obj4 = new Object[]{sxVar3}[0];
                    Objects.requireNonNull(obj4);
                    arrayList6.add(obj4);
                    xx b2 = yx.b(a3, context, Collections.unmodifiableList(arrayList6), i3);
                    bgVar.c(b2);
                    typeface3 = b2.a;
                } else {
                    try {
                        try {
                            try {
                                try {
                                    xx xxVar = (xx) yx.b.submit(new vx(a3, context, sxVar3, i3, 0)).get(i6, TimeUnit.MILLISECONDS);
                                    bgVar.c(xxVar);
                                    typeface3 = xxVar.a;
                                } catch (TimeoutException unused) {
                                    throw new InterruptedException("timeout");
                                }
                            } catch (InterruptedException e) {
                                throw e;
                            }
                        } catch (ExecutionException e2) {
                            throw new RuntimeException(e2);
                        }
                    } catch (InterruptedException unused2) {
                        ((vi0) bgVar.b).execute(new ag((p7) bgVar.a, -3));
                    }
                }
            }
        } else {
            ay ayVar = (ay) zxVar;
            a.getClass();
            try {
                cy[] cyVarArr = ayVar.a;
                int length = cyVarArr.length;
                builder = null;
                while (i4 < length) {
                    cy cyVar = cyVarArr[i4];
                    try {
                        try {
                            Font build = new Font.Builder(resources, cyVar.e).setWeight(cyVar.a).setSlant(cyVar.b ? 1 : 0).setTtcIndex(cyVar.d).setFontVariationSettings(cyVar.c).build();
                            if (builder == null) {
                                builder = new FontFamily.Builder(build);
                            } else {
                                builder.addFont(build);
                            }
                        } catch (IOException unused3) {
                        }
                        i4++;
                    } catch (Exception e3) {
                        e = e3;
                        Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
                        typeface = null;
                        if (ej0Var != null) {
                        }
                        typeface3 = typeface;
                        if (typeface3 != null) {
                        }
                        return typeface3;
                    }
                }
            } catch (Exception e4) {
                e = e4;
            }
            if (builder != null) {
                FontFamily build2 = builder.build();
                typeface = new Typeface.CustomFallbackBuilder(build2).setStyle(zk0.e(build2, i3).getStyle()).build();
                if (ej0Var != null) {
                    if (typeface != null) {
                        ej0Var.callbackSuccessAsync(typeface, null);
                    } else {
                        ej0Var.callbackFailAsync(-3, null);
                    }
                }
                typeface3 = typeface;
            }
            typeface = null;
            if (ej0Var != null) {
            }
            typeface3 = typeface;
        }
        if (typeface3 != null) {
            b.b(d(resources, i, str, i2, i3), typeface3);
        }
        return typeface3;
    }

    public static Typeface c(Resources resources, int i, String str, int i2, int i3) {
        Typeface typeface;
        a.getClass();
        try {
            Font build = new Font.Builder(resources, i).build();
            typeface = new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            typeface = null;
        }
        if (typeface != null) {
            b.b(d(resources, i, str, i2, i3), typeface);
        }
        return typeface;
    }

    public static String d(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }
}
