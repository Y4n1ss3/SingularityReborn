package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import defpackage.c8;
import defpackage.cg0;
import defpackage.dg0;
import defpackage.o;
import defpackage.q40;
import defpackage.r00;
import defpackage.u40;
import defpackage.ut;
import defpackage.v40;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ProcessLifecycleInitializer implements r00 {
    @Override // defpackage.r00
    public final List a() {
        return ut.d;
    }

    @Override // defpackage.r00
    public final Object b(Context context) {
        context.getClass();
        c8 f = c8.f(context);
        f.getClass();
        if (!((HashSet) f.b).contains(ProcessLifecycleInitializer.class)) {
            o.f("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
            return null;
        }
        if (!v40.a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new u40());
        }
        dg0 dg0Var = dg0.k;
        dg0Var.getClass();
        dg0Var.h = new Handler();
        dg0Var.i.e(q40.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new cg0(dg0Var));
        return dg0Var;
    }
}
