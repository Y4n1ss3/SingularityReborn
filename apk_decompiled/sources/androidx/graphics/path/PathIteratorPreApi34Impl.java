package androidx.graphics.path;

import android.graphics.Path;
import dalvik.annotation.optimization.FastNative;
import defpackage.df0;
import defpackage.ef0;
import defpackage.ff0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class PathIteratorPreApi34Impl extends df0 {
    public final long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PathIteratorPreApi34Impl(Path path, int i, float f) {
        super(path, i, f);
        path.getClass();
        if (i == 0) {
            throw null;
        }
        if (i == 0) {
            throw null;
        }
        this.e = createInternalPathIterator(path, i - 1, f);
    }

    private final native long createInternalPathIterator(Path path, int i, float f);

    private final native void destroyInternalPathIterator(long j);

    @FastNative
    private final native boolean internalPathIteratorHasNext(long j);

    @FastNative
    private final native int internalPathIteratorNext(long j, float[] fArr, int i);

    @FastNative
    private final native int internalPathIteratorPeek(long j);

    @FastNative
    private final native int internalPathIteratorRawSize(long j);

    @FastNative
    private final native int internalPathIteratorSize(long j);

    @Override // defpackage.df0
    public final int a(boolean z) {
        long j = this.e;
        return (!z || this.b == 1) ? internalPathIteratorRawSize(j) : internalPathIteratorSize(j);
    }

    @Override // defpackage.df0
    public final boolean b() {
        return internalPathIteratorHasNext(this.e);
    }

    @Override // defpackage.df0
    public final ff0 c(float[] fArr, int i) {
        fArr.getClass();
        return ef0.a[internalPathIteratorNext(this.e, fArr, i)];
    }

    public final void finalize() {
        destroyInternalPathIterator(this.e);
    }
}
