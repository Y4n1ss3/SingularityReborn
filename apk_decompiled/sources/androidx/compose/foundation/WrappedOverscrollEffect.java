package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.unit.Velocity;
import defpackage.hm;
import defpackage.kp0;
import defpackage.ky;
import defpackage.my;
import defpackage.q10;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class WrappedOverscrollEffect implements OverscrollEffect {
    private final boolean attachNode;
    private final boolean eventHandlingEnabled;
    private final OverscrollEffect innerOverscrollEffect;
    private final DelegatableNode node;

    public WrappedOverscrollEffect(boolean z, boolean z2, OverscrollEffect overscrollEffect) {
        this.attachNode = z;
        this.eventHandlingEnabled = z2;
        this.innerOverscrollEffect = overscrollEffect;
        this.node = z ? overscrollEffect.getNode() : new Modifier.Node() { // from class: androidx.compose.foundation.WrappedOverscrollEffect$node$1
        };
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    /* renamed from: applyToFling-BMRW4eQ */
    public Object mo205applyToFlingBMRW4eQ(long j, my myVar, hm hmVar) {
        boolean z = this.eventHandlingEnabled;
        vn vnVar = vn.d;
        w01 w01Var = w01.a;
        if (z) {
            Object mo205applyToFlingBMRW4eQ = this.innerOverscrollEffect.mo205applyToFlingBMRW4eQ(j, myVar, hmVar);
            return mo205applyToFlingBMRW4eQ == vnVar ? mo205applyToFlingBMRW4eQ : w01Var;
        }
        Object invoke = myVar.invoke(Velocity.m7840boximpl(j), hmVar);
        return invoke == vnVar ? invoke : w01Var;
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    /* renamed from: applyToScroll-Rhakbz0 */
    public long mo206applyToScrollRhakbz0(long j, int i, ky kyVar) {
        return this.eventHandlingEnabled ? this.innerOverscrollEffect.mo206applyToScrollRhakbz0(j, i, kyVar) : ((Offset) kyVar.invoke(Offset.m4505boximpl(j))).m4526unboximpl();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WrappedOverscrollEffect)) {
            return false;
        }
        WrappedOverscrollEffect wrappedOverscrollEffect = (WrappedOverscrollEffect) obj;
        return this.attachNode == wrappedOverscrollEffect.attachNode && this.eventHandlingEnabled == wrappedOverscrollEffect.eventHandlingEnabled && q10.b(this.innerOverscrollEffect, wrappedOverscrollEffect.innerOverscrollEffect);
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public DelegatableNode getNode() {
        return this.node;
    }

    public int hashCode() {
        return this.innerOverscrollEffect.hashCode() + kp0.c(Boolean.hashCode(this.attachNode) * 31, 31, this.eventHandlingEnabled);
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public boolean isInProgress() {
        return this.innerOverscrollEffect.isInProgress();
    }
}
