package androidx.compose.ui.graphics.vector;

import defpackage.f30;
import defpackage.my;
import defpackage.w01;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VectorComposeKt$Group$2$9 extends f30 implements my {
    public static final VectorComposeKt$Group$2$9 INSTANCE = new VectorComposeKt$Group$2$9();

    public VectorComposeKt$Group$2$9() {
        super(2);
    }

    @Override // defpackage.my
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((GroupComponent) obj, (List<? extends PathNode>) obj2);
        return w01.a;
    }

    public final void invoke(GroupComponent groupComponent, List<? extends PathNode> list) {
        groupComponent.setClipPathData(list);
    }
}
