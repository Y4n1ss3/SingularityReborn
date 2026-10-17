package androidx.compose.ui.spatial;

import androidx.compose.ui.node.DrawModifierNodeKt;
import defpackage.f30;
import defpackage.iy;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class RectListDebuggerModifierNode$onAttach$1 extends f30 implements iy {
    final /* synthetic */ RectListDebuggerModifierNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RectListDebuggerModifierNode$onAttach$1(RectListDebuggerModifierNode rectListDebuggerModifierNode) {
        super(0);
        this.this$0 = rectListDebuggerModifierNode;
    }

    @Override // defpackage.iy
    public /* bridge */ /* synthetic */ Object invoke() {
        m6850invoke();
        return w01.a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m6850invoke() {
        DrawModifierNodeKt.invalidateDraw(this.this$0);
    }
}
