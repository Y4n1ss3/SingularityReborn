package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import defpackage.f30;
import defpackage.my;
import defpackage.w01;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VectorPainterKt$RenderVectorGroup$1 extends f30 implements my {
    final /* synthetic */ Map<String, VectorConfig> $configs;
    final /* synthetic */ VectorNode $vectorNode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VectorPainterKt$RenderVectorGroup$1(VectorNode vectorNode, Map<String, ? extends VectorConfig> map) {
        super(2);
        this.$vectorNode = vectorNode;
        this.$configs = map;
    }

    public final void invoke(Composer composer, int i) {
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1450046638, i, -1, "androidx.compose.ui.graphics.vector.RenderVectorGroup.<anonymous> (VectorPainter.kt:463)");
        }
        VectorPainterKt.RenderVectorGroup((VectorGroup) this.$vectorNode, this.$configs, composer, 0, 0);
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
