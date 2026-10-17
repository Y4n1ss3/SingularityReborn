package androidx.compose.ui.platform;

import androidx.compose.ui.layout.RulerScope;
import androidx.compose.ui.layout.WindowInsetsRulers_androidKt;
import androidx.compose.ui.platform.AndroidComposeView;
import defpackage.f30;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidComposeView$RootModifierNode$rulerLambda$1 extends f30 implements ky {
    final /* synthetic */ AndroidComposeView.RootModifierNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$RootModifierNode$rulerLambda$1(AndroidComposeView.RootModifierNode rootModifierNode) {
        super(1);
        this.this$0 = rootModifierNode;
    }

    public final void invoke(RulerScope rulerScope) {
        AndroidComposeView.RootModifierNode rootModifierNode = this.this$0;
        rootModifierNode.setPreviousGeneration(rootModifierNode.getGeneration().getIntValue());
        if (this.this$0.getPreviousGeneration() <= 0 || !ComposeView_androidKt.getAreWindowInsetsRulersEnabled()) {
            return;
        }
        WindowInsetsRulers_androidKt.provideWindowInsetsRulers(rulerScope, this.this$0);
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((RulerScope) obj);
        return w01.a;
    }
}
