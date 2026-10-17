package defpackage;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.SearchBarKt;
import androidx.compose.material3.internal.MutableWindowInsets;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class ml0 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ MutableWindowInsets e;
    public final /* synthetic */ WindowInsets f;

    public /* synthetic */ ml0(MutableWindowInsets mutableWindowInsets, WindowInsets windowInsets, int i) {
        this.d = i;
        this.e = mutableWindowInsets;
        this.f = windowInsets;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 Scaffold_TvnljyQ$lambda$2$lambda$1;
        w01 FullScreenSearchBarLayout_EQC0FA8$lambda$65$lambda$64;
        w01 SearchBarLayout$lambda$42$lambda$41;
        int i = this.d;
        WindowInsets windowInsets = this.f;
        MutableWindowInsets mutableWindowInsets = this.e;
        WindowInsets windowInsets2 = (WindowInsets) obj;
        switch (i) {
            case 0:
                Scaffold_TvnljyQ$lambda$2$lambda$1 = ScaffoldKt.Scaffold_TvnljyQ$lambda$2$lambda$1(mutableWindowInsets, windowInsets, windowInsets2);
                return Scaffold_TvnljyQ$lambda$2$lambda$1;
            case 1:
                FullScreenSearchBarLayout_EQC0FA8$lambda$65$lambda$64 = SearchBarKt.FullScreenSearchBarLayout_EQC0FA8$lambda$65$lambda$64(mutableWindowInsets, windowInsets, windowInsets2);
                return FullScreenSearchBarLayout_EQC0FA8$lambda$65$lambda$64;
            default:
                SearchBarLayout$lambda$42$lambda$41 = SearchBarKt.SearchBarLayout$lambda$42$lambda$41(mutableWindowInsets, windowInsets, windowInsets2);
                return SearchBarLayout$lambda$42$lambda$41;
        }
    }
}
