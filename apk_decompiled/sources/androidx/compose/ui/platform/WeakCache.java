package androidx.compose.ui.platform;

import androidx.compose.runtime.collection.MutableVector;
import defpackage.bv;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class WeakCache<T> {
    public static final int $stable = 8;
    private final MutableVector<Reference<T>> values = new MutableVector<>(new Reference[16], 0);
    private final ReferenceQueue<T> referenceQueue = new ReferenceQueue<>();

    private final void clearWeakReferences() {
        Reference<? extends T> poll;
        do {
            poll = this.referenceQueue.poll();
            if (poll != null) {
                this.values.remove(poll);
            }
        } while (poll != null);
    }

    public final int getSize() {
        clearWeakReferences();
        return this.values.getSize();
    }

    public final T pop() {
        clearWeakReferences();
        while (this.values.getSize() != 0) {
            T t = (T) ((Reference) bv.d(this.values, 1)).get();
            if (t != null) {
                return t;
            }
        }
        return null;
    }

    public final void push(T t) {
        clearWeakReferences();
        this.values.add(new WeakReference(t, this.referenceQueue));
    }
}
