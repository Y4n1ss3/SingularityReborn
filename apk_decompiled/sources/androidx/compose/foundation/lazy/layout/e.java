package androidx.compose.foundation.lazy.layout;

import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ LazyLayoutSemanticsModifierNode e;

    public /* synthetic */ e(LazyLayoutSemanticsModifierNode lazyLayoutSemanticsModifierNode, int i) {
        this.d = i;
        this.e = lazyLayoutSemanticsModifierNode;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        int indexForKeyMapping$lambda$0;
        boolean updateCachedSemanticsValues$lambda$2;
        int i = this.d;
        LazyLayoutSemanticsModifierNode lazyLayoutSemanticsModifierNode = this.e;
        switch (i) {
            case 0:
                indexForKeyMapping$lambda$0 = LazyLayoutSemanticsModifierNode.indexForKeyMapping$lambda$0(lazyLayoutSemanticsModifierNode, obj);
                return Integer.valueOf(indexForKeyMapping$lambda$0);
            default:
                updateCachedSemanticsValues$lambda$2 = LazyLayoutSemanticsModifierNode.updateCachedSemanticsValues$lambda$2(lazyLayoutSemanticsModifierNode, ((Integer) obj).intValue());
                return Boolean.valueOf(updateCachedSemanticsValues$lambda$2);
        }
    }
}
