package androidx.compose.foundation.relocation;

import androidx.compose.ui.geometry.Rect;
import defpackage.hm;
import defpackage.lu0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface BringIntoViewRequester {
    static /* synthetic */ Object bringIntoView$default(BringIntoViewRequester bringIntoViewRequester, Rect rect, hm hmVar, int i, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: bringIntoView");
            return null;
        }
        if ((i & 1) != 0) {
            rect = null;
        }
        return bringIntoViewRequester.bringIntoView(rect, hmVar);
    }

    Object bringIntoView(Rect rect, hm hmVar);
}
