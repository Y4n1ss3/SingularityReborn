package androidx.compose.runtime;

import defpackage.d41;
import defpackage.fg;
import defpackage.gg;
import defpackage.hm;
import defpackage.iy;
import defpackage.ky;
import defpackage.vn;
import defpackage.w01;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class Latch {
    public static final int $stable = 8;
    private final Object lock = new Object();
    private List<hm> awaiters = new ArrayList();
    private List<hm> spareList = new ArrayList();
    private boolean _isOpen = true;

    public final Object await(hm hmVar) {
        if (isOpen()) {
            return w01.a;
        }
        final gg ggVar = new gg(1, d41.C(hmVar));
        ggVar.u();
        synchronized (this.lock) {
            this.awaiters.add(ggVar);
        }
        ggVar.d(new ky() { // from class: androidx.compose.runtime.Latch$await$2$2
            public final void invoke(Throwable th) {
                Object obj = Latch.this.lock;
                Latch latch = Latch.this;
                fg fgVar = ggVar;
                synchronized (obj) {
                    latch.awaiters.remove(fgVar);
                }
            }

            @Override // defpackage.ky
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return w01.a;
            }
        });
        Object s = ggVar.s();
        return s == vn.d ? s : w01.a;
    }

    public final void closeLatch() {
        synchronized (this.lock) {
            this._isOpen = false;
        }
    }

    public final boolean isOpen() {
        boolean z;
        synchronized (this.lock) {
            z = this._isOpen;
        }
        return z;
    }

    public final void openLatch() {
        synchronized (this.lock) {
            try {
                if (isOpen()) {
                    return;
                }
                List<hm> list = this.awaiters;
                this.awaiters = this.spareList;
                this.spareList = list;
                this._isOpen = true;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    list.get(i).resumeWith(w01.a);
                }
                list.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final <R> R withClosed(iy iyVar) {
        closeLatch();
        try {
            return (R) iyVar.invoke();
        } finally {
            openLatch();
        }
    }
}
