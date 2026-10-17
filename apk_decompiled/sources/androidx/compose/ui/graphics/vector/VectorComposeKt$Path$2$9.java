package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.StrokeJoin;
import defpackage.f30;
import defpackage.my;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VectorComposeKt$Path$2$9 extends f30 implements my {
    public static final VectorComposeKt$Path$2$9 INSTANCE = new VectorComposeKt$Path$2$9();

    public VectorComposeKt$Path$2$9() {
        super(2);
    }

    @Override // defpackage.my
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        m5509invokekLtJ_vA((PathComponent) obj, ((StrokeJoin) obj2).m5144unboximpl());
        return w01.a;
    }

    /* renamed from: invoke-kLtJ_vA, reason: not valid java name */
    public final void m5509invokekLtJ_vA(PathComponent pathComponent, int i) {
        pathComponent.m5501setStrokeLineJoinWw9F2mQ(i);
    }
}
