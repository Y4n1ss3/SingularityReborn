package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.view.Window;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class wp0 implements m21 {
    public static volatile wp0 c;
    public static final ReentrantLock d = new ReentrantLock();
    public final su a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();

    public wp0(up0 up0Var) {
        this.a = up0Var;
        if (up0Var != null) {
            up0Var.d(new p7(this));
        }
    }

    @Override // defpackage.m21
    public final void a(Context context, hg0 hg0Var, p21 p21Var) {
        Object obj;
        WindowManager.LayoutParams attributes;
        context.getClass();
        r1 = null;
        IBinder iBinder = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        ut utVar = ut.d;
        if (activity == null) {
            p21Var.accept(new t31(utVar));
            return;
        }
        ReentrantLock reentrantLock = d;
        reentrantLock.lock();
        try {
            su suVar = this.a;
            if (suVar == null) {
                p21Var.accept(new t31(utVar));
                return;
            }
            CopyOnWriteArrayList copyOnWriteArrayList = this.b;
            boolean z = false;
            if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                Iterator it = copyOnWriteArrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((vp0) it.next()).a.equals(activity)) {
                        z = true;
                        break;
                    }
                }
            }
            vp0 vp0Var = new vp0(activity, hg0Var, p21Var);
            copyOnWriteArrayList.add(vp0Var);
            if (z) {
                Iterator it2 = copyOnWriteArrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it2.next();
                        if (activity.equals(((vp0) obj).a)) {
                            break;
                        }
                    }
                }
                vp0 vp0Var2 = (vp0) obj;
                t31 t31Var = vp0Var2 != null ? vp0Var2.c : null;
                if (t31Var != null) {
                    vp0Var.c = t31Var;
                    vp0Var.b.accept(t31Var);
                }
            } else {
                up0 up0Var = (up0) suVar;
                Window window = activity.getWindow();
                if (window != null && (attributes = window.getAttributes()) != null) {
                    iBinder = attributes.token;
                }
                if (iBinder != null) {
                    up0Var.c(iBinder, activity);
                } else {
                    activity.getWindow().getDecorView().addOnAttachStateChangeListener(new tp0(up0Var, activity));
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.m21
    public final void b(p21 p21Var) {
        synchronized (d) {
            try {
                if (this.a == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = this.b.iterator();
                it.getClass();
                while (it.hasNext()) {
                    vp0 vp0Var = (vp0) it.next();
                    if (vp0Var.b == p21Var) {
                        arrayList.add(vp0Var);
                    }
                }
                this.b.removeAll(arrayList);
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    Activity activity = ((vp0) obj).a;
                    CopyOnWriteArrayList copyOnWriteArrayList = this.b;
                    if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                        Iterator it2 = copyOnWriteArrayList.iterator();
                        while (it2.hasNext()) {
                            if (((vp0) it2.next()).a.equals(activity)) {
                                break;
                            }
                        }
                    }
                    su suVar = this.a;
                    if (suVar != null) {
                        ((up0) suVar).b(activity);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
