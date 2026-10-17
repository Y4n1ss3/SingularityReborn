package androidx.compose.animation;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import defpackage.f30;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SharedBoundsNode$draw$1 extends f30 implements ky {
    final /* synthetic */ Rect $bounds;
    final /* synthetic */ ContentDrawScope $this_draw;
    final /* synthetic */ SharedBoundsNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedBoundsNode$draw$1(Rect rect, SharedBoundsNode sharedBoundsNode, ContentDrawScope contentDrawScope) {
        super(1);
        this.$bounds = rect;
        this.this$0 = sharedBoundsNode;
        this.$this_draw = contentDrawScope;
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((DrawScope) obj);
        return w01.a;
    }

    public final void invoke(DrawScope drawScope) {
        this.$this_draw.drawContent();
    }
}
