package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import defpackage.at;
import defpackage.bt;
import defpackage.c8;
import defpackage.p7;
import defpackage.r00;
import defpackage.s40;
import defpackage.ux;
import defpackage.y40;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public class EmojiCompatInitializer implements r00 {
    @Override // defpackage.r00
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // defpackage.r00
    public final Object b(Context context) {
        Object obj;
        p7 p7Var = new p7();
        p7Var.d = context.getApplicationContext();
        ux uxVar = new ux(p7Var);
        uxVar.b = 1;
        if (at.k == null) {
            synchronized (at.j) {
                try {
                    if (at.k == null) {
                        at.k = new at(uxVar);
                    }
                } finally {
                }
            }
        }
        c8 f = c8.f(context);
        f.getClass();
        synchronized (c8.e) {
            try {
                obj = ((HashMap) f.a).get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = f.c(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        s40 lifecycle = ((y40) obj).getLifecycle();
        lifecycle.a(new bt(this, lifecycle));
        return Boolean.TRUE;
    }
}
