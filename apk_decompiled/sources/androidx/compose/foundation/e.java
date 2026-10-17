package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import defpackage.iy;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements iy {
    public final /* synthetic */ int d;
    public final /* synthetic */ Modifier.Node e;

    public /* synthetic */ e(int i, Modifier.Node node) {
        this.d = i;
        this.e = node;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        boolean applyAdditionalSemantics$lambda$0;
        Float invokeSuspend$lambda$0;
        w01 attachOverscrollNodeIfNeeded$lambda$0;
        int i = this.d;
        Modifier.Node node = this.e;
        switch (i) {
            case 0:
                applyAdditionalSemantics$lambda$0 = CombinedClickableNode.applyAdditionalSemantics$lambda$0((CombinedClickableNode) node);
                return Boolean.valueOf(applyAdditionalSemantics$lambda$0);
            case 1:
                invokeSuspend$lambda$0 = MarqueeModifierNode$runAnimation$2.invokeSuspend$lambda$0((MarqueeModifierNode) node);
                return invokeSuspend$lambda$0;
            default:
                attachOverscrollNodeIfNeeded$lambda$0 = ScrollableAreaNode.attachOverscrollNodeIfNeeded$lambda$0((ScrollableAreaNode) node);
                return attachOverscrollNodeIfNeeded$lambda$0;
        }
    }
}
