package androidx.compose.runtime;

import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ThrowingApplierStub implements Applier<Object> {
    public static final int $stable = 0;
    public static final ThrowingApplierStub INSTANCE = new ThrowingApplierStub();

    private ThrowingApplierStub() {
    }

    private final void throwIllegalOperationException() {
        ComposerKt.composeImmediateRuntimeError("ChangeList cannot call the Applier when executing pending changes outside of the applier phase.");
    }

    @Override // androidx.compose.runtime.Applier
    public void clear() {
        throwIllegalOperationException();
    }

    @Override // androidx.compose.runtime.Applier
    public void down(Object obj) {
        throwIllegalOperationException();
    }

    @Override // androidx.compose.runtime.Applier
    public Object getCurrent() {
        throwIllegalOperationException();
        return w01.a;
    }

    @Override // androidx.compose.runtime.Applier
    public void insertBottomUp(int i, Object obj) {
        throwIllegalOperationException();
    }

    @Override // androidx.compose.runtime.Applier
    public void insertTopDown(int i, Object obj) {
        throwIllegalOperationException();
    }

    @Override // androidx.compose.runtime.Applier
    public void move(int i, int i2, int i3) {
        throwIllegalOperationException();
    }

    @Override // androidx.compose.runtime.Applier
    public void remove(int i, int i2) {
        throwIllegalOperationException();
    }

    @Override // androidx.compose.runtime.Applier
    public void up() {
        throwIllegalOperationException();
    }
}
