package androidx.compose.ui.graphics.vector;

import defpackage.f30;
import defpackage.my;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VectorComposeKt$Path$2$12 extends f30 implements my {
    public static final VectorComposeKt$Path$2$12 INSTANCE = new VectorComposeKt$Path$2$12();

    public VectorComposeKt$Path$2$12() {
        super(2);
    }

    @Override // defpackage.my
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((PathComponent) obj, ((Number) obj2).floatValue());
        return w01.a;
    }

    public final void invoke(PathComponent pathComponent, float f) {
        pathComponent.setTrimPathStart(f);
    }
}
