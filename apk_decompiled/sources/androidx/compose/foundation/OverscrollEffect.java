package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNode;
import defpackage.er;
import defpackage.hm;
import defpackage.ky;
import defpackage.my;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface OverscrollEffect {
    /* renamed from: applyToFling-BMRW4eQ */
    Object mo205applyToFlingBMRW4eQ(long j, my myVar, hm hmVar);

    /* renamed from: applyToScroll-Rhakbz0 */
    long mo206applyToScrollRhakbz0(long j, int i, ky kyVar);

    default Modifier getEffectModifier() {
        return Modifier.Companion;
    }

    default DelegatableNode getNode() {
        return new Modifier.Node() { // from class: androidx.compose.foundation.OverscrollEffect$node$1
        };
    }

    boolean isInProgress();

    @er
    static /* synthetic */ void getEffectModifier$annotations() {
    }
}
