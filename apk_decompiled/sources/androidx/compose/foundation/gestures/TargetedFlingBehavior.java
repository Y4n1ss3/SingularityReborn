package androidx.compose.foundation.gestures;

import defpackage.hm;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface TargetedFlingBehavior extends FlingBehavior {
    static /* synthetic */ Object performFling$suspendImpl(TargetedFlingBehavior targetedFlingBehavior, ScrollScope scrollScope, float f, hm hmVar) {
        ky kyVar;
        kyVar = TargetedFlingBehaviorKt.NoOnReport;
        return targetedFlingBehavior.performFling(scrollScope, f, kyVar, hmVar);
    }

    @Override // androidx.compose.foundation.gestures.FlingBehavior
    default Object performFling(ScrollScope scrollScope, float f, hm hmVar) {
        return performFling$suspendImpl(this, scrollScope, f, hmVar);
    }

    Object performFling(ScrollScope scrollScope, float f, ky kyVar, hm hmVar);
}
