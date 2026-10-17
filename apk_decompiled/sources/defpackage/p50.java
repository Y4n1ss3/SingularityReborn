package defpackage;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.ListItemColors;
import androidx.compose.material3.ListItemKt;
import androidx.compose.material3.SearchBarColors;
import androidx.compose.material3.SearchBarKt;
import androidx.compose.material3.SearchBarScrollBehavior;
import androidx.compose.material3.SearchBarState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class p50 implements my {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ my e;
    public final /* synthetic */ Modifier f;
    public final /* synthetic */ float g;
    public final /* synthetic */ float h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    public /* synthetic */ p50(my myVar, Modifier modifier, my myVar2, my myVar3, my myVar4, my myVar5, ListItemColors listItemColors, float f, float f2, int i, int i2) {
        this.e = myVar;
        this.f = modifier;
        this.k = myVar2;
        this.l = myVar3;
        this.m = myVar4;
        this.n = myVar5;
        this.o = listItemColors;
        this.g = f;
        this.h = f2;
        this.i = i;
        this.j = i2;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 ListItem_HXNGIdc$lambda$6;
        w01 TopSearchBar_qKj4JfE$lambda$5;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                ListItem_HXNGIdc$lambda$6 = ListItemKt.ListItem_HXNGIdc$lambda$6(this.e, this.f, (my) this.k, (my) this.l, (my) this.m, (my) this.n, (ListItemColors) this.o, this.g, this.h, this.i, this.j, (Composer) obj, intValue);
                return ListItem_HXNGIdc$lambda$6;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                TopSearchBar_qKj4JfE$lambda$5 = SearchBarKt.TopSearchBar_qKj4JfE$lambda$5((SearchBarState) this.k, this.e, this.f, (Shape) this.l, (SearchBarColors) this.m, this.g, this.h, (WindowInsets) this.n, (SearchBarScrollBehavior) this.o, this.i, this.j, (Composer) obj, intValue2);
                return TopSearchBar_qKj4JfE$lambda$5;
        }
    }

    public /* synthetic */ p50(SearchBarState searchBarState, my myVar, Modifier modifier, Shape shape, SearchBarColors searchBarColors, float f, float f2, WindowInsets windowInsets, SearchBarScrollBehavior searchBarScrollBehavior, int i, int i2) {
        this.k = searchBarState;
        this.e = myVar;
        this.f = modifier;
        this.l = shape;
        this.m = searchBarColors;
        this.g = f;
        this.h = f2;
        this.n = windowInsets;
        this.o = searchBarScrollBehavior;
        this.i = i;
        this.j = i2;
    }
}
