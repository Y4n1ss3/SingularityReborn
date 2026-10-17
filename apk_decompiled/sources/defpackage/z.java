package defpackage;

import java.util.AbstractSet;
import java.util.Set;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract class z extends AbstractSet implements Set, t20 {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean add(Object obj);

    public abstract int getSize();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return getSize();
    }
}
