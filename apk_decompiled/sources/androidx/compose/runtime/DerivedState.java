package androidx.compose.runtime;

import defpackage.zc0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface DerivedState<T> extends State<T> {

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public interface Record<T> {
        T getCurrentValue();

        zc0 getDependencies();
    }

    Record<T> getCurrentRecord();

    SnapshotMutationPolicy<T> getPolicy();
}
