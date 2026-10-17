package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import defpackage.lu0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface TransformScope {

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class DefaultImpls {
    }

    /* renamed from: transformBy-d-4ec7I$default, reason: not valid java name */
    static /* synthetic */ void m570transformByd4ec7I$default(TransformScope transformScope, float f, long j, float f2, int i, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: transformBy-d-4ec7I");
            return;
        }
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            j = Offset.Companion.m4532getZeroF1C5BW0();
        }
        if ((i & 4) != 0) {
            f2 = 0.0f;
        }
        transformScope.mo408transformByd4ec7I(f, j, f2);
    }

    /* renamed from: transformBy-d-4ec7I */
    void mo408transformByd4ec7I(float f, long j, float f2);
}
