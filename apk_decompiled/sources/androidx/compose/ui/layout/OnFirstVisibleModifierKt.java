package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import defpackage.er;
import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class OnFirstVisibleModifierKt {
    @er
    public static final Modifier onFirstVisible(Modifier modifier, long j, float f, LayoutBoundsHolder layoutBoundsHolder, iy iyVar) {
        return modifier.then(new OnFirstVisibleElement(j, f, layoutBoundsHolder, iyVar));
    }

    public static /* synthetic */ Modifier onFirstVisible$default(Modifier modifier, long j, float f, LayoutBoundsHolder layoutBoundsHolder, iy iyVar, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i & 4) != 0) {
            layoutBoundsHolder = null;
        }
        return onFirstVisible(modifier, j2, f2, layoutBoundsHolder, iyVar);
    }
}
