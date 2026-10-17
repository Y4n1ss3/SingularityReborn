package androidx.compose.runtime;

import defpackage.my;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class OffsetApplier<N> implements Applier<N> {
    public static final int $stable = 8;
    private final Applier<N> applier;
    private int nesting;
    private final int offset;

    public OffsetApplier(Applier<N> applier, int i) {
        this.applier = applier;
        this.offset = i;
    }

    @Override // androidx.compose.runtime.Applier
    public void apply(my myVar, Object obj) {
        this.applier.apply(myVar, obj);
    }

    @Override // androidx.compose.runtime.Applier
    public void clear() {
        ComposerKt.composeImmediateRuntimeError("Clear is not valid on OffsetApplier");
    }

    @Override // androidx.compose.runtime.Applier
    public void down(N n) {
        this.nesting++;
        this.applier.down(n);
    }

    @Override // androidx.compose.runtime.Applier
    public N getCurrent() {
        return this.applier.getCurrent();
    }

    @Override // androidx.compose.runtime.Applier
    public void insertBottomUp(int i, N n) {
        this.applier.insertBottomUp(i + (this.nesting == 0 ? this.offset : 0), n);
    }

    @Override // androidx.compose.runtime.Applier
    public void insertTopDown(int i, N n) {
        this.applier.insertTopDown(i + (this.nesting == 0 ? this.offset : 0), n);
    }

    @Override // androidx.compose.runtime.Applier
    public void move(int i, int i2, int i3) {
        int i4 = this.nesting == 0 ? this.offset : 0;
        this.applier.move(i + i4, i2 + i4, i3);
    }

    @Override // androidx.compose.runtime.Applier
    public void remove(int i, int i2) {
        this.applier.remove(i + (this.nesting == 0 ? this.offset : 0), i2);
    }

    @Override // androidx.compose.runtime.Applier
    public void reuse() {
        this.applier.reuse();
    }

    @Override // androidx.compose.runtime.Applier
    public void up() {
        if (!(this.nesting > 0)) {
            ComposerKt.composeImmediateRuntimeError("OffsetApplier up called with no corresponding down");
        }
        this.nesting--;
        this.applier.up();
    }
}
