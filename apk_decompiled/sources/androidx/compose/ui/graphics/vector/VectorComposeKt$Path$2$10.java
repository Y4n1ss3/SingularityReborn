package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.StrokeCap;
import defpackage.f30;
import defpackage.my;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VectorComposeKt$Path$2$10 extends f30 implements my {
    public static final VectorComposeKt$Path$2$10 INSTANCE = new VectorComposeKt$Path$2$10();

    public VectorComposeKt$Path$2$10() {
        super(2);
    }

    @Override // defpackage.my
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        m5507invokeCSYIeUk((PathComponent) obj, ((StrokeCap) obj2).m5134unboximpl());
        return w01.a;
    }

    /* renamed from: invoke-CSYIeUk, reason: not valid java name */
    public final void m5507invokeCSYIeUk(PathComponent pathComponent, int i) {
        pathComponent.m5500setStrokeLineCapBeK7IIE(i);
    }
}
