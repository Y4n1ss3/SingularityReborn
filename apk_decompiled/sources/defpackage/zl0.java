package defpackage;

import androidx.compose.material3.SearchBarDefaults;
import androidx.compose.material3.SearchBarKt;
import androidx.compose.material3.SearchBarState;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class zl0 implements iy {
    public final /* synthetic */ int d;
    public final /* synthetic */ un e;
    public final /* synthetic */ SearchBarState f;

    public /* synthetic */ zl0(un unVar, SearchBarState searchBarState) {
        this.d = 0;
        this.f = searchBarState;
        this.e = unVar;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        w01 InputField$lambda$17$lambda$16;
        w01 DockedSearchBarLayout_nbWgWpA$lambda$51$lambda$50;
        w01 ExpandedFullScreenSearchBar__UtchM0$lambda$8$lambda$7;
        w01 ExpandedDockedSearchBar_qKj4JfE$lambda$13$lambda$12;
        switch (this.d) {
            case 0:
                InputField$lambda$17$lambda$16 = SearchBarDefaults.InputField$lambda$17$lambda$16(this.f, this.e);
                return InputField$lambda$17$lambda$16;
            case 1:
                DockedSearchBarLayout_nbWgWpA$lambda$51$lambda$50 = SearchBarKt.DockedSearchBarLayout_nbWgWpA$lambda$51$lambda$50(this.e, this.f);
                return DockedSearchBarLayout_nbWgWpA$lambda$51$lambda$50;
            case 2:
                ExpandedFullScreenSearchBar__UtchM0$lambda$8$lambda$7 = SearchBarKt.ExpandedFullScreenSearchBar__UtchM0$lambda$8$lambda$7(this.e, this.f);
                return ExpandedFullScreenSearchBar__UtchM0$lambda$8$lambda$7;
            default:
                ExpandedDockedSearchBar_qKj4JfE$lambda$13$lambda$12 = SearchBarKt.ExpandedDockedSearchBar_qKj4JfE$lambda$13$lambda$12(this.e, this.f);
                return ExpandedDockedSearchBar_qKj4JfE$lambda$13$lambda$12;
        }
    }

    public /* synthetic */ zl0(un unVar, SearchBarState searchBarState, int i) {
        this.d = i;
        this.e = unVar;
        this.f = searchBarState;
    }
}
