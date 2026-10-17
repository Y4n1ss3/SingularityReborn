package androidx.compose.ui.draw;

import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import defpackage.f30;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CacheDrawScope$onDrawBehind$1 extends f30 implements ky {
    final /* synthetic */ ky $block;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CacheDrawScope$onDrawBehind$1(ky kyVar) {
        super(1);
        this.$block = kyVar;
    }

    public final void invoke(ContentDrawScope contentDrawScope) {
        this.$block.invoke(contentDrawScope);
        contentDrawScope.drawContent();
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ContentDrawScope) obj);
        return w01.a;
    }
}
