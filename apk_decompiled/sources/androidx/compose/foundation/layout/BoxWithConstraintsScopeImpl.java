package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import defpackage.dq;
import defpackage.q10;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BoxWithConstraintsScopeImpl implements BoxWithConstraintsScope, BoxScope {
    private final /* synthetic */ BoxScopeInstance $$delegate_0;
    private final long constraints;
    private final Density density;

    private BoxWithConstraintsScopeImpl(Density density, long j) {
        this.$$delegate_0 = BoxScopeInstance.INSTANCE;
        this.density = density;
        this.constraints = j;
    }

    private final Density component1() {
        return this.density;
    }

    /* renamed from: copy-0kLqBqw$default, reason: not valid java name */
    public static /* synthetic */ BoxWithConstraintsScopeImpl m675copy0kLqBqw$default(BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl, Density density, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            density = boxWithConstraintsScopeImpl.density;
        }
        if ((i & 2) != 0) {
            j = boxWithConstraintsScopeImpl.constraints;
        }
        return boxWithConstraintsScopeImpl.m677copy0kLqBqw(density, j);
    }

    @Override // androidx.compose.foundation.layout.BoxScope
    public Modifier align(Modifier modifier, Alignment alignment) {
        return this.$$delegate_0.align(modifier, alignment);
    }

    /* renamed from: component2-msEJaDk, reason: not valid java name */
    public final long m676component2msEJaDk() {
        return this.constraints;
    }

    /* renamed from: copy-0kLqBqw, reason: not valid java name */
    public final BoxWithConstraintsScopeImpl m677copy0kLqBqw(Density density, long j) {
        return new BoxWithConstraintsScopeImpl(density, j, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoxWithConstraintsScopeImpl)) {
            return false;
        }
        BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = (BoxWithConstraintsScopeImpl) obj;
        return q10.b(this.density, boxWithConstraintsScopeImpl.density) && Constraints.m7557equalsimpl0(this.constraints, boxWithConstraintsScopeImpl.constraints);
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* renamed from: getConstraints-msEJaDk */
    public long mo670getConstraintsmsEJaDk() {
        return this.constraints;
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* renamed from: getMaxHeight-D9Ej5fM */
    public float mo671getMaxHeightD9Ej5fM() {
        return Constraints.m7559getHasBoundedHeightimpl(mo670getConstraintsmsEJaDk()) ? this.density.mo364toDpu2uoSUM(Constraints.m7563getMaxHeightimpl(mo670getConstraintsmsEJaDk())) : Dp.Companion.m7630getInfinityD9Ej5fM();
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* renamed from: getMaxWidth-D9Ej5fM */
    public float mo672getMaxWidthD9Ej5fM() {
        return Constraints.m7560getHasBoundedWidthimpl(mo670getConstraintsmsEJaDk()) ? this.density.mo364toDpu2uoSUM(Constraints.m7564getMaxWidthimpl(mo670getConstraintsmsEJaDk())) : Dp.Companion.m7630getInfinityD9Ej5fM();
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* renamed from: getMinHeight-D9Ej5fM */
    public float mo673getMinHeightD9Ej5fM() {
        return this.density.mo364toDpu2uoSUM(Constraints.m7565getMinHeightimpl(mo670getConstraintsmsEJaDk()));
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* renamed from: getMinWidth-D9Ej5fM */
    public float mo674getMinWidthD9Ej5fM() {
        return this.density.mo364toDpu2uoSUM(Constraints.m7566getMinWidthimpl(mo670getConstraintsmsEJaDk()));
    }

    public int hashCode() {
        return Constraints.m7567hashCodeimpl(this.constraints) + (this.density.hashCode() * 31);
    }

    @Override // androidx.compose.foundation.layout.BoxScope
    public Modifier matchParentSize(Modifier modifier) {
        return this.$$delegate_0.matchParentSize(modifier);
    }

    public String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.density + ", constraints=" + ((Object) Constraints.m7569toStringimpl(this.constraints)) + ')';
    }

    public /* synthetic */ BoxWithConstraintsScopeImpl(Density density, long j, dq dqVar) {
        this(density, j);
    }
}
