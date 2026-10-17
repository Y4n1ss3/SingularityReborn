package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawCacheModifier;
import defpackage.f30;
import defpackage.iy;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class BackwardsCompatNode$updateDrawCache$1 extends f30 implements iy {
    final /* synthetic */ Modifier.Element $element;
    final /* synthetic */ BackwardsCompatNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackwardsCompatNode$updateDrawCache$1(Modifier.Element element, BackwardsCompatNode backwardsCompatNode) {
        super(0);
        this.$element = element;
        this.this$0 = backwardsCompatNode;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m6395invoke() {
        ((DrawCacheModifier) this.$element).onBuildCache(this.this$0);
    }

    @Override // defpackage.iy
    public /* bridge */ /* synthetic */ Object invoke() {
        m6395invoke();
        return w01.a;
    }
}
