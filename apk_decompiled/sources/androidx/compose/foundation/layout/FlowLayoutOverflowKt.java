package androidx.compose.foundation.layout;

import defpackage.g30;
import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FlowLayoutOverflowKt {
    public static final g30 lazyInt(String str, iy iyVar) {
        return new LazyImpl(iyVar, str);
    }

    public static /* synthetic */ g30 lazyInt$default(String str, iy iyVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "Lazy item is not yet initialized";
        }
        return lazyInt(str, iyVar);
    }
}
