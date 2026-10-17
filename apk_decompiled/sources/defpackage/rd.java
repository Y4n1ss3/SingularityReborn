package defpackage;

import androidx.compose.foundation.text.selection.SelectionRegistrar;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class rd implements iy {
    public final /* synthetic */ int d;
    public final /* synthetic */ SelectionRegistrar e;

    public /* synthetic */ rd(SelectionRegistrar selectionRegistrar, int i) {
        this.d = i;
        this.e = selectionRegistrar;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        long nextSelectableId;
        int i = this.d;
        SelectionRegistrar selectionRegistrar = this.e;
        switch (i) {
            case 0:
                nextSelectableId = selectionRegistrar.nextSelectableId();
                break;
            default:
                nextSelectableId = selectionRegistrar.nextSelectableId();
                break;
        }
        return Long.valueOf(nextSelectableId);
    }
}
