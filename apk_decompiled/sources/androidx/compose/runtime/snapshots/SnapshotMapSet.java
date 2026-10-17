package androidx.compose.runtime.snapshots;

import defpackage.d41;
import defpackage.t20;
import java.util.Set;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
abstract class SnapshotMapSet<K, V, E> implements Set<E>, t20 {
    private final SnapshotStateMap<K, V> map;

    public SnapshotMapSet(SnapshotStateMap<K, V> snapshotStateMap) {
        this.map = snapshotStateMap;
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.map.clear();
    }

    public final SnapshotStateMap<K, V> getMap() {
        return this.map;
    }

    public int getSize() {
        return this.map.size();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.map.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return d41.J(this);
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) d41.K(this, tArr);
    }
}
