package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.layout.adapter.extensions.MulticastConsumer;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public class vu extends tu {
    public final WindowLayoutComponent a;
    public final ql b;
    public final ReentrantLock c = new ReentrantLock();
    public final LinkedHashMap d = new LinkedHashMap();
    public final LinkedHashMap e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();

    public vu(WindowLayoutComponent windowLayoutComponent, ql qlVar) {
        this.a = windowLayoutComponent;
        this.b = qlVar;
    }

    @Override // defpackage.tu, defpackage.m21
    public void a(Context context, hg0 hg0Var, p21 p21Var) {
        LinkedHashMap linkedHashMap = this.d;
        context.getClass();
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            MulticastConsumer multicastConsumer = (MulticastConsumer) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.e;
            if (multicastConsumer != null) {
                multicastConsumer.a(p21Var);
                linkedHashMap2.put(p21Var, context);
            } else {
                MulticastConsumer multicastConsumer2 = new MulticastConsumer(context);
                linkedHashMap.put(context, multicastConsumer2);
                linkedHashMap2.put(p21Var, context);
                multicastConsumer2.a(p21Var);
                if (!(context instanceof Activity)) {
                    multicastConsumer2.accept(new WindowLayoutInfo(ut.d));
                    reentrantLock.unlock();
                    return;
                } else {
                    this.f.put(multicastConsumer2, this.b.a(this.a, ki0.a(WindowLayoutInfo.class), (Activity) context, new uu(1, multicastConsumer2, MulticastConsumer.class, "accept", "accept(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", 0)));
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // defpackage.tu, defpackage.m21
    public void b(p21 p21Var) {
        LinkedHashMap linkedHashMap = this.d;
        LinkedHashMap linkedHashMap2 = this.e;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            Context context = (Context) linkedHashMap2.get(p21Var);
            if (context == null) {
                return;
            }
            MulticastConsumer multicastConsumer = (MulticastConsumer) linkedHashMap.get(context);
            if (multicastConsumer == null) {
                return;
            }
            LinkedHashSet linkedHashSet = multicastConsumer.d;
            ReentrantLock reentrantLock2 = multicastConsumer.b;
            reentrantLock2.lock();
            try {
                linkedHashSet.remove(p21Var);
                reentrantLock2.unlock();
                linkedHashMap2.remove(p21Var);
                if (linkedHashSet.isEmpty()) {
                    linkedHashMap.remove(context);
                    pl plVar = (pl) this.f.remove(multicastConsumer);
                    if (plVar != null) {
                        plVar.a.invoke(plVar.b, plVar.c);
                    }
                }
            } catch (Throwable th) {
                reentrantLock2.unlock();
                throw th;
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
