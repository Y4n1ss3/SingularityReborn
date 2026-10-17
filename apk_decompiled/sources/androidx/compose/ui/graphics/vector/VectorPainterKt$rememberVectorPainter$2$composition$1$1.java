package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import defpackage.f30;
import defpackage.my;
import defpackage.oy;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VectorPainterKt$rememberVectorPainter$2$composition$1$1 extends f30 implements my {
    final /* synthetic */ oy $content;
    final /* synthetic */ long $viewport;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VectorPainterKt$rememberVectorPainter$2$composition$1$1(oy oyVar, long j) {
        super(2);
        this.$content = oyVar;
        this.$viewport = j;
    }

    public final void invoke(Composer composer, int i) {
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1749374910, i, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter.<anonymous>.<anonymous>.<anonymous> (VectorPainter.kt:154)");
        }
        this.$content.invoke(Float.valueOf(Float.intBitsToFloat((int) (this.$viewport >> 32))), Float.valueOf(Float.intBitsToFloat((int) (this.$viewport & 4294967295L))), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Override // defpackage.my
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return w01.a;
    }
}
