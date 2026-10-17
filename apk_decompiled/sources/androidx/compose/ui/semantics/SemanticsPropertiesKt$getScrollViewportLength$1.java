package androidx.compose.ui.semantics;

import defpackage.f30;
import defpackage.iy;
import defpackage.ky;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class SemanticsPropertiesKt$getScrollViewportLength$1 extends f30 implements ky {
    final /* synthetic */ iy $action;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SemanticsPropertiesKt$getScrollViewportLength$1(iy iyVar) {
        super(1);
        this.$action = iyVar;
    }

    @Override // defpackage.ky
    public final Boolean invoke(List<Float> list) {
        boolean z;
        Float f = (Float) this.$action.invoke();
        if (f == null) {
            z = false;
        } else {
            list.add(f);
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
