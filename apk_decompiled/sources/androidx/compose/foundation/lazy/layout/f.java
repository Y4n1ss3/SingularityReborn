package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import defpackage.iy;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements iy {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ f(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        float updateCachedSemanticsValues$lambda$0;
        float updateCachedSemanticsValues$lambda$1;
        Float applySemantics$lambda$1;
        w01 updateAnimation$lambda$0$0;
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                updateCachedSemanticsValues$lambda$0 = LazyLayoutSemanticsModifierNode.updateCachedSemanticsValues$lambda$0((LazyLayoutSemanticsModifierNode) obj);
                return Float.valueOf(updateCachedSemanticsValues$lambda$0);
            case 1:
                updateCachedSemanticsValues$lambda$1 = LazyLayoutSemanticsModifierNode.updateCachedSemanticsValues$lambda$1((LazyLayoutSemanticsModifierNode) obj);
                return Float.valueOf(updateCachedSemanticsValues$lambda$1);
            case 2:
                applySemantics$lambda$1 = LazyLayoutSemanticsModifierNode.applySemantics$lambda$1((LazyLayoutSemanticsModifierNode) obj);
                return applySemantics$lambda$1;
            default:
                updateAnimation$lambda$0$0 = LazyLayoutItemAnimator.ItemInfo.updateAnimation$lambda$0$0((LazyLayoutItemAnimator) obj);
                return updateAnimation$lambda$0$0;
        }
    }
}
