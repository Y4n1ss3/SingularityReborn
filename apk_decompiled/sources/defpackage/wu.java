package defpackage;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public class wu extends vu {
    public final ReentrantLock g;
    public final LinkedHashMap h;
    public final LinkedHashMap i;

    public wu(WindowLayoutComponent windowLayoutComponent, ql qlVar) {
        super(windowLayoutComponent, qlVar);
        this.g = new ReentrantLock();
        this.h = new LinkedHashMap();
        this.i = new LinkedHashMap();
    }

    @Override // defpackage.vu, defpackage.tu, defpackage.m21
    public final void a(Context context, hg0 hg0Var, p21 p21Var) {
        LinkedHashMap linkedHashMap = this.h;
        context.getClass();
        ReentrantLock reentrantLock = this.g;
        reentrantLock.lock();
        try {
            ia0 ia0Var = (ia0) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.i;
            if (ia0Var != null) {
                ia0Var.a(p21Var);
                linkedHashMap2.put(p21Var, context);
            } else {
                ia0 ia0Var2 = new ia0(context);
                linkedHashMap.put(context, ia0Var2);
                linkedHashMap2.put(p21Var, context);
                ia0Var2.a(p21Var);
                this.a.addWindowLayoutInfoListener(context, ia0Var2);
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // defpackage.vu, defpackage.tu, defpackage.m21
    public final void b(p21 p21Var) {
        LinkedHashMap linkedHashMap = this.h;
        LinkedHashMap linkedHashMap2 = this.i;
        ReentrantLock reentrantLock = this.g;
        reentrantLock.lock();
        try {
            Context context = (Context) linkedHashMap2.get(p21Var);
            if (context == null) {
                return;
            }
            ia0 ia0Var = (ia0) linkedHashMap.get(context);
            if (ia0Var == null) {
                return;
            }
            ReentrantLock reentrantLock2 = ia0Var.b;
            reentrantLock2.lock();
            try {
                ia0Var.d.remove(p21Var);
                reentrantLock2.unlock();
                linkedHashMap2.remove(p21Var);
                if (ia0Var.d.isEmpty()) {
                    linkedHashMap.remove(context);
                    this.a.removeWindowLayoutInfoListener(ia0Var);
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
