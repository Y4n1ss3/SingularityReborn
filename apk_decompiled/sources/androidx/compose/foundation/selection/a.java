package androidx.compose.foundation.selection;

import androidx.compose.ui.autofill.FillableData;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ SemanticsPropertyReceiver e;

    public /* synthetic */ a(int i, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        this.d = i;
        this.e = semanticsPropertyReceiver;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        boolean applyAdditionalSemantics$lambda$1;
        int i = this.d;
        SemanticsPropertyReceiver semanticsPropertyReceiver = this.e;
        FillableData fillableData = (FillableData) obj;
        switch (i) {
            case 0:
                applyAdditionalSemantics$lambda$1 = ToggleableNode.applyAdditionalSemantics$lambda$1(semanticsPropertyReceiver, fillableData);
                break;
            default:
                applyAdditionalSemantics$lambda$1 = TriStateToggleableNode.applyAdditionalSemantics$lambda$1(semanticsPropertyReceiver, fillableData);
                break;
        }
        return Boolean.valueOf(applyAdditionalSemantics$lambda$1);
    }
}
