package androidx.compose.ui.graphics.vector;

import defpackage.f30;
import defpackage.my;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VectorComposeKt$Group$2$8 extends f30 implements my {
    public static final VectorComposeKt$Group$2$8 INSTANCE = new VectorComposeKt$Group$2$8();

    public VectorComposeKt$Group$2$8() {
        super(2);
    }

    @Override // defpackage.my
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((GroupComponent) obj, ((Number) obj2).floatValue());
        return w01.a;
    }

    public final void invoke(GroupComponent groupComponent, float f) {
        groupComponent.setTranslationY(f);
    }
}
