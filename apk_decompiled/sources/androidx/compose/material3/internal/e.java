package androidx.compose.material3.internal;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ e(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        DisposableEffectResult BasicEdgeToEdgeDialog$lambda$9$lambda$8;
        w01 invoke$lambda$1$lambda$0;
        int i = this.d;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                BasicEdgeToEdgeDialog$lambda$9$lambda$8 = BasicEdgeToEdgeDialog_androidKt.BasicEdgeToEdgeDialog$lambda$9$lambda$8((DialogWrapper) obj2, (DisposableEffectScope) obj);
                return BasicEdgeToEdgeDialog$lambda$9$lambda$8;
            default:
                invoke$lambda$1$lambda$0 = BasicTooltipKt$TooltipPopup$2.invoke$lambda$1$lambda$0((String) obj2, (SemanticsPropertyReceiver) obj);
                return invoke$lambda$1$lambda$0;
        }
    }
}
