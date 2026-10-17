package androidx.compose.ui.platform;

import android.os.Handler;
import android.view.View;
import androidx.compose.runtime.Recomposer;
import defpackage.d41;
import defpackage.fz;
import defpackage.iy;
import defpackage.o;
import defpackage.p01;
import defpackage.rr0;
import defpackage.rz;
import defpackage.sz;
import defpackage.z10;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class WindowRecomposerPolicy {
    public static final WindowRecomposerPolicy INSTANCE = new WindowRecomposerPolicy();
    private static final AtomicReference<WindowRecomposerFactory> factory = new AtomicReference<>(WindowRecomposerFactory.Companion.getLifecycleAware());
    public static final int $stable = 8;

    private WindowRecomposerPolicy() {
    }

    public final boolean compareAndSetFactory(WindowRecomposerFactory windowRecomposerFactory, WindowRecomposerFactory windowRecomposerFactory2) {
        AtomicReference<WindowRecomposerFactory> atomicReference = factory;
        while (!atomicReference.compareAndSet(windowRecomposerFactory, windowRecomposerFactory2)) {
            if (atomicReference.get() != windowRecomposerFactory) {
                return false;
            }
        }
        return true;
    }

    public final Recomposer createAndInstallWindowRecomposer$ui(View view) {
        Recomposer createRecomposer = factory.get().createRecomposer(view);
        WindowRecomposer_androidKt.setCompositionContext(view, createRecomposer);
        Handler handler = view.getHandler();
        int i = sz.a;
        rz rzVar = new rz(handler, "windowRecomposer cleanup", false);
        final rr0 t = p01.t(fz.d, rzVar.g, null, new WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1(createRecomposer, view, null), 2);
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.WindowRecomposerPolicy$createAndInstallWindowRecomposer$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view2) {
                view2.removeOnAttachStateChangeListener(this);
                z10.this.cancel(null);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view2) {
            }
        });
        return createRecomposer;
    }

    public final WindowRecomposerFactory getAndSetFactory(WindowRecomposerFactory windowRecomposerFactory) {
        return factory.getAndSet(windowRecomposerFactory);
    }

    public final void setFactory(WindowRecomposerFactory windowRecomposerFactory) {
        factory.set(windowRecomposerFactory);
    }

    public final <R> R withFactory(WindowRecomposerFactory windowRecomposerFactory, iy iyVar) {
        WindowRecomposerFactory andSetFactory = getAndSetFactory(windowRecomposerFactory);
        try {
            R r = (R) iyVar.invoke();
            if (compareAndSetFactory(windowRecomposerFactory, andSetFactory)) {
                return r;
            }
            o.f("WindowRecomposerFactory was set to unexpected value; cannot safely restore old state");
            return null;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (compareAndSetFactory(windowRecomposerFactory, andSetFactory)) {
                    throw th2;
                }
                d41.c(th, new IllegalStateException("WindowRecomposerFactory was set to unexpected value; cannot safely restore old state"));
                throw th;
            }
        }
    }
}
