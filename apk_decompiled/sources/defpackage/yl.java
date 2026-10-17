package defpackage;

import androidx.compose.foundation.contextmenu.ContextMenuUiKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.foundation.text.selection.SelectionContainerKt;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialThemeKt;
import androidx.compose.material3.Shapes;
import androidx.compose.material3.Typography;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.window.PopupPositionProvider;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class yl implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ yl(Modifier modifier, Selection selection, ky kyVar, my myVar, int i, int i2) {
        this.d = 5;
        this.e = modifier;
        this.h = selection;
        this.j = kyVar;
        this.i = myVar;
        this.f = i;
        this.g = i2;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 ContextMenuPopup$lambda$0;
        w01 Icon$lambda$13;
        w01 LazyLayout$lambda$0;
        w01 LazyLayout$lambda$2;
        w01 MaterialTheme$lambda$0;
        w01 SelectionContainer$lambda$11;
        int i = this.d;
        Object obj3 = this.j;
        Object obj4 = this.e;
        Object obj5 = this.i;
        Object obj6 = this.h;
        switch (i) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                ContextMenuPopup$lambda$0 = ContextMenuUiKt.ContextMenuPopup$lambda$0((PopupPositionProvider) obj6, (iy) obj5, (Modifier) obj4, (ky) obj3, this.f, this.g, (Composer) obj, intValue);
                return ContextMenuPopup$lambda$0;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                Icon$lambda$13 = IconKt.Icon$lambda$13((Painter) obj6, (ColorProducer) obj5, (String) obj3, (Modifier) obj4, this.f, this.g, (Composer) obj, intValue2);
                return Icon$lambda$13;
            case 2:
                int intValue3 = ((Integer) obj2).intValue();
                LazyLayout$lambda$0 = LazyLayoutKt.LazyLayout$lambda$0((iy) obj5, (Modifier) obj4, (LazyLayoutPrefetchState) obj6, (my) obj3, this.f, this.g, (Composer) obj, intValue3);
                return LazyLayout$lambda$0;
            case 3:
                int intValue4 = ((Integer) obj2).intValue();
                LazyLayout$lambda$2 = LazyLayoutKt.LazyLayout$lambda$2((iy) obj5, (Modifier) obj4, (LazyLayoutPrefetchState) obj6, (LazyLayoutMeasurePolicy) obj3, this.f, this.g, (Composer) obj, intValue4);
                return LazyLayout$lambda$2;
            case 4:
                int intValue5 = ((Integer) obj2).intValue();
                MaterialTheme$lambda$0 = MaterialThemeKt.MaterialTheme$lambda$0((ColorScheme) obj6, (Shapes) obj5, (Typography) obj4, (my) obj3, this.f, this.g, (Composer) obj, intValue5);
                return MaterialTheme$lambda$0;
            case 5:
                int intValue6 = ((Integer) obj2).intValue();
                SelectionContainer$lambda$11 = SelectionContainerKt.SelectionContainer$lambda$11((Modifier) obj4, (Selection) obj6, (ky) obj3, (my) obj5, this.f, this.g, (Composer) obj, intValue6);
                return SelectionContainer$lambda$11;
            default:
                ((Integer) obj2).getClass();
                o01.a((String) obj6, (String) obj5, (ny) obj4, (my) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f | 1), this.g);
                return w01.a;
        }
    }

    public /* synthetic */ yl(iy iyVar, Modifier modifier, LazyLayoutPrefetchState lazyLayoutPrefetchState, Object obj, int i, int i2, int i3) {
        this.d = i3;
        this.i = iyVar;
        this.e = modifier;
        this.h = lazyLayoutPrefetchState;
        this.j = obj;
        this.f = i;
        this.g = i2;
    }

    public /* synthetic */ yl(Painter painter, ColorProducer colorProducer, String str, Modifier modifier, int i, int i2) {
        this.d = 1;
        this.h = painter;
        this.i = colorProducer;
        this.j = str;
        this.e = modifier;
        this.f = i;
        this.g = i2;
    }

    public /* synthetic */ yl(Object obj, Object obj2, Object obj3, ty tyVar, int i, int i2, int i3) {
        this.d = i3;
        this.h = obj;
        this.i = obj2;
        this.e = obj3;
        this.j = tyVar;
        this.f = i;
        this.g = i2;
    }
}
