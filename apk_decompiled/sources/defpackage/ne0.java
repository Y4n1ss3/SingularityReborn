package defpackage;

import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.material3.SearchBarDefaults;
import androidx.compose.material3.SearchBarState;
import androidx.compose.material3.SegmentedButtonKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class ne0 implements ky {
    public final /* synthetic */ int d = 2;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ ne0(State state, boolean z, Placeable placeable) {
        this.g = state;
        this.e = z;
        this.f = placeable;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 pagerSemantics$lambda$0;
        w01 InputField$lambda$9$lambda$8;
        w01 interactionZIndex$lambda$19$lambda$18;
        int i = this.d;
        Object obj2 = this.f;
        boolean z = this.e;
        Object obj3 = this.g;
        switch (i) {
            case 0:
                pagerSemantics$lambda$0 = PagerKt.pagerSemantics$lambda$0(z, (PagerState) obj3, (un) obj2, (SemanticsPropertyReceiver) obj);
                return pagerSemantics$lambda$0;
            case 1:
                InputField$lambda$9$lambda$8 = SearchBarDefaults.InputField$lambda$9$lambda$8(z, (un) obj2, (SearchBarState) obj3, (FocusState) obj);
                return InputField$lambda$9$lambda$8;
            default:
                interactionZIndex$lambda$19$lambda$18 = SegmentedButtonKt.interactionZIndex$lambda$19$lambda$18((State) obj3, z, (Placeable) obj2, (Placeable.PlacementScope) obj);
                return interactionZIndex$lambda$19$lambda$18;
        }
    }

    public /* synthetic */ ne0(boolean z, un unVar, SearchBarState searchBarState) {
        this.e = z;
        this.f = unVar;
        this.g = searchBarState;
    }

    public /* synthetic */ ne0(boolean z, PagerState pagerState, un unVar) {
        this.e = z;
        this.g = pagerState;
        this.f = unVar;
    }
}
