package defpackage;

import androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1;
import androidx.compose.material3.NavigationItemKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.text.TextStyle;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class ru implements iy {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ ru(MutableState mutableState, String str, ky kyVar, boolean z) {
        this.f = mutableState;
        this.g = str;
        this.h = kyVar;
        this.e = z;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        w01 menuAnchor_2Hz36ac$lambda$1;
        TextStyle AnimatedNavigationItem_DQd_Gtc$lambda$26$lambda$18$lambda$17;
        switch (this.d) {
            case 0:
                menuAnchor_2Hz36ac$lambda$1 = ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1.menuAnchor_2Hz36ac$lambda$1((MutableState) this.f, (String) this.g, (ky) this.h, this.e);
                return menuAnchor_2Hz36ac$lambda$1;
            default:
                AnimatedNavigationItem_DQd_Gtc$lambda$26$lambda$18$lambda$17 = NavigationItemKt.AnimatedNavigationItem_DQd_Gtc$lambda$26$lambda$18$lambda$17(this.e, (TextStyle) this.f, (TextStyle) this.g, (State) this.h);
                return AnimatedNavigationItem_DQd_Gtc$lambda$26$lambda$18$lambda$17;
        }
    }

    public /* synthetic */ ru(boolean z, TextStyle textStyle, TextStyle textStyle2, State state) {
        this.e = z;
        this.f = textStyle;
        this.g = textStyle2;
        this.h = state;
    }
}
