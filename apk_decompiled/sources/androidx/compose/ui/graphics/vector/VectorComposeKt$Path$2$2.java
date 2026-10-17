package androidx.compose.ui.graphics.vector;

import defpackage.f30;
import defpackage.my;
import defpackage.w01;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VectorComposeKt$Path$2$2 extends f30 implements my {
    public static final VectorComposeKt$Path$2$2 INSTANCE = new VectorComposeKt$Path$2$2();

    public VectorComposeKt$Path$2$2() {
        super(2);
    }

    @Override // defpackage.my
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((PathComponent) obj, (List<? extends PathNode>) obj2);
        return w01.a;
    }

    public final void invoke(PathComponent pathComponent, List<? extends PathNode> list) {
        pathComponent.setPathData(list);
    }
}
