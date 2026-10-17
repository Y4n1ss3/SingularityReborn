package androidx.compose.ui.input.pointer;

import androidx.compose.ui.Modifier;
import defpackage.f30;
import defpackage.iy;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class HitPathTracker$addHitPath$1 extends f30 implements iy {
    final /* synthetic */ Modifier.Node $pointerInputNode;
    final /* synthetic */ HitPathTracker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HitPathTracker$addHitPath$1(HitPathTracker hitPathTracker, Modifier.Node node) {
        super(0);
        this.this$0 = hitPathTracker;
        this.$pointerInputNode = node;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m6004invoke() {
        this.this$0.removePointerInputModifierNode(this.$pointerInputNode);
    }

    @Override // defpackage.iy
    public /* bridge */ /* synthetic */ Object invoke() {
        m6004invoke();
        return w01.a;
    }
}
