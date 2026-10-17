package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import defpackage.iy;
import defpackage.ky;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class MutableVectorWithMutationTracking<T> {
    public static final int $stable = MutableVector.$stable;
    private final iy onVectorMutated;
    private final MutableVector<T> vector;

    public MutableVectorWithMutationTracking(MutableVector<T> mutableVector, iy iyVar) {
        this.vector = mutableVector;
        this.onVectorMutated = iyVar;
    }

    public final void add(int i, T t) {
        this.vector.add(i, t);
        this.onVectorMutated.invoke();
    }

    public final List<T> asList() {
        return getVector().asMutableList();
    }

    public final void clear() {
        this.vector.clear();
        this.onVectorMutated.invoke();
    }

    public final void forEach(ky kyVar) {
        MutableVector<T> vector = getVector();
        T[] tArr = vector.content;
        int size = vector.getSize();
        for (int i = 0; i < size; i++) {
            kyVar.invoke(tArr[i]);
        }
    }

    public final T get(int i) {
        return getVector().content[i];
    }

    public final iy getOnVectorMutated() {
        return this.onVectorMutated;
    }

    public final int getSize() {
        return getVector().getSize();
    }

    public final MutableVector<T> getVector() {
        return this.vector;
    }

    public final T removeAt(int i) {
        T removeAt = this.vector.removeAt(i);
        this.onVectorMutated.invoke();
        return removeAt;
    }
}
