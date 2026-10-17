package androidx.compose.ui.platform;

import androidx.compose.ui.graphics.Canvas;
import defpackage.f30;
import defpackage.ky;
import defpackage.my;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class RenderNodeLayer$updateDisplayList$1$1 extends f30 implements ky {
    final /* synthetic */ my $drawBlock;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RenderNodeLayer$updateDisplayList$1$1(my myVar) {
        super(1);
        this.$drawBlock = myVar;
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Canvas) obj);
        return w01.a;
    }

    public final void invoke(Canvas canvas) {
        this.$drawBlock.invoke(canvas, null);
    }
}
