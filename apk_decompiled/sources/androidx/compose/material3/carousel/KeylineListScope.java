package androidx.compose.material3.carousel;

import defpackage.lu0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface KeylineListScope {
    static /* synthetic */ void add$default(KeylineListScope keylineListScope, float f, boolean z, int i, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: add");
            return;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        keylineListScope.add(f, z);
    }

    void add(float f, boolean z);
}
