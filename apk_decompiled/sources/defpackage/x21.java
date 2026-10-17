package defpackage;

import android.os.Build;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class x21 extends WindowInsetsAnimation$Callback {
    public final r21 a;
    public List b;
    public ArrayList c;
    public final HashMap d;

    public x21(r21 r21Var) {
        super(r21Var.getDispatchMode());
        this.d = new HashMap();
        this.a = r21Var;
    }

    public final a31 a(WindowInsetsAnimation windowInsetsAnimation) {
        HashMap hashMap = this.d;
        a31 a31Var = (a31) hashMap.get(windowInsetsAnimation);
        if (a31Var == null) {
            a31Var = new a31(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                a31Var.a = new y21(windowInsetsAnimation);
            }
            hashMap.put(windowInsetsAnimation, a31Var);
        }
        return a31Var;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.onEnd(a(windowInsetsAnimation));
        this.d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.onPrepare(a(windowInsetsAnimation));
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        float fraction;
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.c = arrayList2;
            this.b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation j = r0.j(list.get(size));
            a31 a = a(j);
            fraction = j.getFraction();
            a.a.e(fraction);
            this.c.add(a);
        }
        return this.a.onProgress(p31.c(windowInsets, null), this.b).b();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        q21 onStart = this.a.onStart(a(windowInsetsAnimation), new q21(bounds));
        onStart.getClass();
        r0.m();
        return r0.h(onStart.a.d(), onStart.b.d());
    }
}
