package androidx.compose.runtime.snapshots;

import defpackage.iy;
import defpackage.o;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
abstract class StateMapMutableIterator<K, V> {
    private Map.Entry<? extends K, ? extends V> current;
    private final Iterator<Map.Entry<K, V>> iterator;
    private final SnapshotStateMap<K, V> map;
    private int modification;
    private Map.Entry<? extends K, ? extends V> next;

    /* JADX WARN: Multi-variable type inference failed */
    public StateMapMutableIterator(SnapshotStateMap<K, V> snapshotStateMap, Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        this.map = snapshotStateMap;
        this.iterator = it;
        this.modification = snapshotStateMap.getModification$runtime();
        advance();
    }

    public final void advance() {
        this.current = this.next;
        this.next = this.iterator.hasNext() ? this.iterator.next() : null;
    }

    public final Map.Entry<K, V> getCurrent() {
        return this.current;
    }

    public final Iterator<Map.Entry<K, V>> getIterator() {
        return this.iterator;
    }

    public final SnapshotStateMap<K, V> getMap() {
        return this.map;
    }

    public final int getModification() {
        return this.modification;
    }

    public final Map.Entry<K, V> getNext() {
        return this.next;
    }

    public final boolean hasNext() {
        return this.next != null;
    }

    public final <T> T modify(iy iyVar) {
        if (getMap().getModification$runtime() != this.modification) {
            o.a();
            return null;
        }
        T t = (T) iyVar.invoke();
        this.modification = getMap().getModification$runtime();
        return t;
    }

    public final void remove() {
        if (getMap().getModification$runtime() != this.modification) {
            o.a();
            return;
        }
        Map.Entry<? extends K, ? extends V> entry = this.current;
        if (entry == null) {
            throw new IllegalStateException();
        }
        this.map.remove(entry.getKey());
        this.current = null;
        this.modification = getMap().getModification$runtime();
    }

    public final void setCurrent(Map.Entry<? extends K, ? extends V> entry) {
        this.current = entry;
    }

    public final void setModification(int i) {
        this.modification = i;
    }

    public final void setNext(Map.Entry<? extends K, ? extends V> entry) {
        this.next = entry;
    }
}
