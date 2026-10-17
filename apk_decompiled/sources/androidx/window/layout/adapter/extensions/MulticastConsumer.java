package androidx.window.layout.adapter.extensions;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutInfo;
import defpackage.av;
import defpackage.nl;
import defpackage.p21;
import defpackage.t31;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class MulticastConsumer implements nl {
    public final Context a;
    public final ReentrantLock b;
    public t31 c;
    public final LinkedHashSet d;

    public MulticastConsumer(Context context) {
        context.getClass();
        this.a = context;
        this.b = new ReentrantLock();
        this.d = new LinkedHashSet();
    }

    public final void a(p21 p21Var) {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            t31 t31Var = this.c;
            if (t31Var != null) {
                p21Var.accept(t31Var);
            }
            this.d.add(p21Var);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // defpackage.nl
    public void accept(WindowLayoutInfo windowLayoutInfo) {
        windowLayoutInfo.getClass();
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            t31 c = av.c(this.a, windowLayoutInfo);
            this.c = c;
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((nl) it.next()).accept(c);
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
