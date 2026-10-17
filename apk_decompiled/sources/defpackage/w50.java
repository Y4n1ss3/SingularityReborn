package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class w50 {
    public static final Object f = new Object();
    public static w50 g;
    public final Object a;
    public final Map b;
    public final Map c;
    public final Object d;
    public final Object e;

    public w50(Context context) {
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new ArrayList();
        this.a = context;
        this.e = new u50(this, context.getMainLooper());
    }

    public static w50 a(Context context) {
        w50 w50Var;
        synchronized (f) {
            try {
                w50Var = g;
                if (w50Var == null) {
                    w50Var = new w50(context.getApplicationContext());
                    g = w50Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return w50Var;
    }

    public w50(Map map, Map map2, Map map3, Map map4, Map map5, boolean z) {
        this.a = map;
        this.b = map2;
        this.c = map3;
        this.d = map4;
        this.e = map5;
    }
}
