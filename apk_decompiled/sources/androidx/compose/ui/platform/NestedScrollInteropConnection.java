package androidx.compose.ui.platform;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Velocity;
import defpackage.ac;
import defpackage.hm;
import defpackage.oc0;
import defpackage.p11;
import defpackage.pc0;
import defpackage.u11;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class NestedScrollInteropConnection implements NestedScrollConnection {
    public static final int $stable = 8;
    private final int[] consumedScrollCache;
    private final float minFlingVelocity;
    private final oc0 nestedScrollChildHelper;
    private final View view;

    public NestedScrollInteropConnection(View view, float f) {
        this.view = view;
        this.minFlingVelocity = f;
        oc0 oc0Var = new oc0(view);
        if (oc0Var.d) {
            int i = u11.a;
            p11.h(view);
        }
        oc0Var.d = true;
        this.nestedScrollChildHelper = oc0Var;
        this.consumedScrollCache = new int[2];
        int i2 = u11.a;
        p11.f(view, true);
    }

    private final void stopNestedScrolls() {
        if (this.nestedScrollChildHelper.a(0) != null) {
            this.nestedScrollChildHelper.c(0);
        }
        if (this.nestedScrollChildHelper.a(1) != null) {
            this.nestedScrollChildHelper.c(1);
        }
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY */
    public Object mo533onPostFlingRZ2iAVY(long j, long j2, hm hmVar) {
        stopNestedScrolls();
        return Velocity.m7840boximpl(Velocity.Companion.m7860getZero9UxMQ8M());
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo534onPostScrollDzOQY0M(long j, long j2, int i) {
        int m6790getScrollAxesk4lQ0M;
        int m6793toViewTypeGyEprt8;
        int m6793toViewTypeGyEprt82;
        long m6792toOffsetmoWRBKg;
        ViewParent a;
        oc0 oc0Var = this.nestedScrollChildHelper;
        m6790getScrollAxesk4lQ0M = NestedScrollInteropConnectionKt.m6790getScrollAxesk4lQ0M(j2);
        m6793toViewTypeGyEprt8 = NestedScrollInteropConnectionKt.m6793toViewTypeGyEprt8(i);
        if (!oc0Var.b(m6790getScrollAxesk4lQ0M, m6793toViewTypeGyEprt8)) {
            return Offset.Companion.m4532getZeroF1C5BW0();
        }
        ac.Y(this.consumedScrollCache, 0, 0, 6);
        int composeToViewOffset = NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (j2 >> 32)));
        int composeToViewOffset2 = NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (j2 & 4294967295L)));
        oc0 oc0Var2 = this.nestedScrollChildHelper;
        int composeToViewOffset3 = NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (j >> 32)));
        int composeToViewOffset4 = NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (4294967295L & j)));
        m6793toViewTypeGyEprt82 = NestedScrollInteropConnectionKt.m6793toViewTypeGyEprt8(i);
        int[] iArr = this.consumedScrollCache;
        View view = oc0Var2.c;
        if (oc0Var2.d && (a = oc0Var2.a(m6793toViewTypeGyEprt82)) != null && (composeToViewOffset3 != 0 || composeToViewOffset4 != 0 || composeToViewOffset != 0 || composeToViewOffset2 != 0)) {
            if (iArr == null) {
                iArr = oc0Var2.e;
                if (iArr == null) {
                    iArr = new int[2];
                    oc0Var2.e = iArr;
                }
                iArr[0] = 0;
                iArr[1] = 0;
            }
            int[] iArr2 = iArr;
            View view2 = oc0Var2.c;
            if (a instanceof pc0) {
                ((pc0) a).onNestedScroll(view2, composeToViewOffset3, composeToViewOffset4, composeToViewOffset, composeToViewOffset2, m6793toViewTypeGyEprt82, iArr2);
            } else {
                iArr2[0] = iArr2[0] + composeToViewOffset;
                iArr2[1] = iArr2[1] + composeToViewOffset2;
                if (a instanceof pc0) {
                    ((pc0) a).onNestedScroll(view2, composeToViewOffset3, composeToViewOffset4, composeToViewOffset, composeToViewOffset2, m6793toViewTypeGyEprt82);
                } else if (m6793toViewTypeGyEprt82 == 0) {
                    try {
                        a.onNestedScroll(view2, composeToViewOffset3, composeToViewOffset4, composeToViewOffset, composeToViewOffset2);
                    } catch (AbstractMethodError e) {
                        Log.e("ViewParentCompat", "ViewParent " + a + " does not implement interface method onNestedScroll", e);
                    }
                }
            }
        }
        m6792toOffsetmoWRBKg = NestedScrollInteropConnectionKt.m6792toOffsetmoWRBKg(composeToViewOffset, composeToViewOffset2, this.consumedScrollCache, j2);
        return m6792toOffsetmoWRBKg;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0040  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreFling-QWom1Mo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo837onPreFlingQWom1Mo(long j, hm hmVar) {
        float viewVelocity;
        float viewVelocity2;
        boolean z;
        float viewVelocity3;
        float viewVelocity4;
        ViewParent a;
        ViewParent a2;
        oc0 oc0Var = this.nestedScrollChildHelper;
        viewVelocity = NestedScrollInteropConnectionKt.toViewVelocity(Velocity.m7849getXimpl(j));
        viewVelocity2 = NestedScrollInteropConnectionKt.toViewVelocity(Velocity.m7850getYimpl(j));
        boolean z2 = false;
        if (oc0Var.d && (a2 = oc0Var.a(0)) != null) {
            try {
                z = a2.onNestedPreFling(oc0Var.c, viewVelocity, viewVelocity2);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + a2 + " does not implement interface method onNestedPreFling", e);
            }
            if (!z) {
                oc0 oc0Var2 = this.nestedScrollChildHelper;
                viewVelocity3 = NestedScrollInteropConnectionKt.toViewVelocity(Velocity.m7849getXimpl(j));
                viewVelocity4 = NestedScrollInteropConnectionKt.toViewVelocity(Velocity.m7850getYimpl(j));
                if (oc0Var2.d && (a = oc0Var2.a(0)) != null) {
                    try {
                        z2 = a.onNestedFling(oc0Var2.c, viewVelocity3, viewVelocity4, true);
                    } catch (AbstractMethodError e2) {
                        Log.e("ViewParentCompat", "ViewParent " + a + " does not implement interface method onNestedFling", e2);
                    }
                }
                if (!z2) {
                    j = Velocity.Companion.m7860getZero9UxMQ8M();
                }
            }
            return Velocity.m7840boximpl(j);
        }
        z = false;
        if (!z) {
        }
        return Velocity.m7840boximpl(j);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public long mo838onPreScrollOzD1aCk(long j, int i) {
        int m6790getScrollAxesk4lQ0M;
        int m6793toViewTypeGyEprt8;
        int m6793toViewTypeGyEprt82;
        long m6792toOffsetmoWRBKg;
        ViewParent a;
        oc0 oc0Var = this.nestedScrollChildHelper;
        m6790getScrollAxesk4lQ0M = NestedScrollInteropConnectionKt.m6790getScrollAxesk4lQ0M(j);
        m6793toViewTypeGyEprt8 = NestedScrollInteropConnectionKt.m6793toViewTypeGyEprt8(i);
        if (!oc0Var.b(m6790getScrollAxesk4lQ0M, m6793toViewTypeGyEprt8)) {
            return Offset.Companion.m4532getZeroF1C5BW0();
        }
        ac.Y(this.consumedScrollCache, 0, 0, 6);
        int composeToViewOffset = NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (j >> 32)));
        int composeToViewOffset2 = NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (4294967295L & j)));
        oc0 oc0Var2 = this.nestedScrollChildHelper;
        int[] iArr = this.consumedScrollCache;
        m6793toViewTypeGyEprt82 = NestedScrollInteropConnectionKt.m6793toViewTypeGyEprt8(i);
        View view = oc0Var2.c;
        if (oc0Var2.d && (a = oc0Var2.a(m6793toViewTypeGyEprt82)) != null && (composeToViewOffset != 0 || composeToViewOffset2 != 0)) {
            if (iArr == null && (iArr = oc0Var2.e) == null) {
                iArr = new int[2];
                oc0Var2.e = iArr;
            }
            int[] iArr2 = iArr;
            iArr2[0] = 0;
            iArr2[1] = 0;
            View view2 = oc0Var2.c;
            if (a instanceof pc0) {
                ((pc0) a).onNestedPreScroll(view2, composeToViewOffset, composeToViewOffset2, iArr2, m6793toViewTypeGyEprt82);
            } else if (m6793toViewTypeGyEprt82 == 0) {
                try {
                    a.onNestedPreScroll(view2, composeToViewOffset, composeToViewOffset2, iArr2);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + a + " does not implement interface method onNestedPreScroll", e);
                }
            }
            if (iArr2[0] == 0) {
                int i2 = iArr2[1];
            }
        }
        m6792toOffsetmoWRBKg = NestedScrollInteropConnectionKt.m6792toOffsetmoWRBKg(composeToViewOffset, composeToViewOffset2, this.consumedScrollCache, j);
        return m6792toOffsetmoWRBKg;
    }
}
