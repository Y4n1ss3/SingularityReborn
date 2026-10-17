package androidx.compose.runtime;

import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface MutableState<T> extends State<T> {
    T component1();

    ky component2();

    @Override // androidx.compose.runtime.State
    T getValue();

    void setValue(T t);
}
