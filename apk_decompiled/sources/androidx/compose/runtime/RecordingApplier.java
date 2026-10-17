package androidx.compose.runtime;

import androidx.compose.runtime.internal.RememberEventDispatcher;
import defpackage.dq;
import defpackage.ma0;
import defpackage.my;
import defpackage.p01;
import defpackage.xa0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RecordingApplier<N> implements Applier<N> {
    public static final int APPLY = 7;
    public static final int CLEAR = 4;
    public static final int DOWN = 1;
    public static final int INSERT_BOTTOM_UP = 5;
    public static final int INSERT_TOP_DOWN = 6;
    public static final int MOVE = 3;
    public static final int RECOMPOSE_PENDING = 9;
    public static final int REMOVE = 2;
    public static final int REUSE = 8;
    public static final int UP = 0;
    private N current;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private final ma0 operations = new ma0();
    private final xa0 instances = new xa0();

    public RecordingApplier(N n) {
        this.current = n;
    }

    @Override // androidx.compose.runtime.Applier
    public void apply(my myVar, Object obj) {
        this.operations.e(7);
        this.instances.g(myVar);
        this.instances.g(obj);
    }

    @Override // androidx.compose.runtime.Applier
    public void clear() {
        this.operations.e(4);
    }

    @Override // androidx.compose.runtime.Applier
    public void down(N n) {
        this.operations.e(1);
        this.instances.g(n);
    }

    @Override // androidx.compose.runtime.Applier
    public N getCurrent() {
        return this.current;
    }

    @Override // androidx.compose.runtime.Applier
    public void insertBottomUp(int i, N n) {
        this.operations.e(5);
        this.operations.e(i);
        this.instances.g(n);
    }

    @Override // androidx.compose.runtime.Applier
    public void insertTopDown(int i, N n) {
        this.operations.e(6);
        this.operations.e(i);
        this.instances.g(n);
    }

    public final void markRecomposePending() {
        this.operations.e(9);
    }

    @Override // androidx.compose.runtime.Applier
    public void move(int i, int i2, int i3) {
        this.operations.e(3);
        this.operations.e(i);
        this.operations.e(i2);
        this.operations.e(i3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void playTo(Applier<N> applier, RememberEventDispatcher rememberEventDispatcher) {
        Exception exc;
        int i;
        int i2;
        ma0 ma0Var = this.operations;
        int i3 = ma0Var.b;
        xa0 xa0Var = this.instances;
        xa0 xa0Var2 = new xa0();
        applier.onBeginChanges();
        int i4 = 0;
        int i5 = 0;
        while (i4 < i3) {
            int i6 = i4 + 1;
            try {
                try {
                    switch (ma0Var.b(i4)) {
                        case 0:
                            applier.up();
                            i4 = i6;
                        case 1:
                            int i7 = i5 + 1;
                            applier.down(xa0Var.b(i5));
                            i5 = i7;
                            i4 = i6;
                        case 2:
                            int i8 = i4 + 2;
                            i4 += 3;
                            applier.remove(ma0Var.b(i6), ma0Var.b(i8));
                        case 3:
                            int i9 = i4 + 2;
                            try {
                                i = i4 + 3;
                            } catch (Exception e) {
                                exc = e;
                                i4 = i9;
                            }
                            try {
                                i4 += 4;
                                applier.move(ma0Var.b(i6), ma0Var.b(i9), ma0Var.b(i));
                            } catch (Exception e2) {
                                exc = e2;
                                i4 = i;
                                throw new ComposePausableCompositionException(xa0Var, xa0Var2, ma0Var, i4 - 1, exc);
                            }
                        case 4:
                            applier.clear();
                            i4 = i6;
                        case 5:
                            i4 += 2;
                            i2 = i5 + 1;
                            applier.insertBottomUp(ma0Var.b(i6), xa0Var.b(i5));
                            i5 = i2;
                        case 6:
                            i4 += 2;
                            try {
                                i2 = i5 + 1;
                                applier.insertTopDown(ma0Var.b(i6), xa0Var.b(i5));
                                i5 = i2;
                            } catch (Exception e3) {
                                exc = e3;
                                throw new ComposePausableCompositionException(xa0Var, xa0Var2, ma0Var, i4 - 1, exc);
                            }
                        case 7:
                            int i10 = i5 + 1;
                            Object b = xa0Var.b(i5);
                            b.getClass();
                            p01.f(2, b);
                            i5 += 2;
                            applier.apply((my) b, xa0Var.b(i10));
                            i4 = i6;
                        case 8:
                            Object current = applier.getCurrent();
                            if (current instanceof ComposeNodeLifecycleCallback) {
                                rememberEventDispatcher.dispatchOnDeactivateIfNecessary((ComposeNodeLifecycleCallback) current);
                            }
                            xa0Var2.g(current);
                            applier.reuse();
                            i4 = i6;
                        default:
                            i4 = i6;
                    }
                } catch (Exception e4) {
                    exc = e4;
                    i4 = i6;
                }
            } catch (Throwable th) {
                applier.onEndChanges();
                throw th;
            }
        }
        if (i5 != xa0Var.b) {
            ComposerKt.composeImmediateRuntimeError("Applier operation size mismatch");
        }
        xa0Var.j();
        ma0Var.b = 0;
        applier.onEndChanges();
    }

    @Override // androidx.compose.runtime.Applier
    public void remove(int i, int i2) {
        this.operations.e(2);
        this.operations.e(i);
        this.operations.e(i2);
    }

    @Override // androidx.compose.runtime.Applier
    public void reuse() {
        this.operations.e(8);
    }

    public void setCurrent(N n) {
        this.current = n;
    }

    @Override // androidx.compose.runtime.Applier
    public void up() {
        this.operations.e(0);
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        private Companion() {
        }
    }
}
