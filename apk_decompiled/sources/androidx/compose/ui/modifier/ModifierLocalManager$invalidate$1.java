package androidx.compose.ui.modifier;

import defpackage.f30;
import defpackage.iy;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ModifierLocalManager$invalidate$1 extends f30 implements iy {
    final /* synthetic */ ModifierLocalManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModifierLocalManager$invalidate$1(ModifierLocalManager modifierLocalManager) {
        super(0);
        this.this$0 = modifierLocalManager;
    }

    @Override // defpackage.iy
    public /* bridge */ /* synthetic */ Object invoke() {
        m6392invoke();
        return w01.a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m6392invoke() {
        this.this$0.triggerUpdates();
    }
}
