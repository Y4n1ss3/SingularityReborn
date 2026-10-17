package defpackage;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.text.selection.SelectableInfo;
import androidx.compose.foundation.text.selection.SelectionLayoutKt;
import androidx.compose.ui.node.TraversableNode;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class ri implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ fi0 e;

    public /* synthetic */ ri(fi0 fi0Var, int i) {
        this.d = i;
        this.e = fi0Var;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        boolean hasScrollableContainer$lambda$0;
        w01 isCollapsed$lambda$0;
        int i = this.d;
        fi0 fi0Var = this.e;
        switch (i) {
            case 0:
                hasScrollableContainer$lambda$0 = ClickableKt.hasScrollableContainer$lambda$0(fi0Var, (TraversableNode) obj);
                return Boolean.valueOf(hasScrollableContainer$lambda$0);
            default:
                isCollapsed$lambda$0 = SelectionLayoutKt.isCollapsed$lambda$0(fi0Var, (SelectableInfo) obj);
                return isCollapsed$lambda$0;
        }
    }
}
