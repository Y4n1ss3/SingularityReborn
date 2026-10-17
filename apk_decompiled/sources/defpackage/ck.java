package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ck implements ViewTreeObserver.OnDrawListener, Runnable, Executor {
    public Runnable e;
    public final /* synthetic */ vu0 g;
    public final long d = SystemClock.uptimeMillis() + 10000;
    public boolean f = false;

    public ck(vu0 vu0Var) {
        this.g = vu0Var;
    }

    public final void a(View view) {
        if (this.f) {
            return;
        }
        this.f = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.e = runnable;
        View decorView = this.g.getWindow().getDecorView();
        if (!this.f) {
            decorView.postOnAnimation(new j(this, 3));
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        Runnable runnable = this.e;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.d) {
                this.f = false;
                this.g.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.e = null;
        hy hyVar = this.g.l;
        synchronized (hyVar.b) {
            z = hyVar.a;
        }
        if (z) {
            this.f = false;
            this.g.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.g.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
