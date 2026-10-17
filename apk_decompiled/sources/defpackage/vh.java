package defpackage;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.contextmenu.ContextMenuColors;
import androidx.compose.foundation.contextmenu.ContextMenuUiKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.CheckboxColors;
import androidx.compose.material3.CheckboxKt;
import androidx.compose.material3.ExposedDropdownMenuBoxScope;
import androidx.compose.material3.IconButtonColors;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.state.ToggleableState;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class vh implements my {
    public final /* synthetic */ int d = 2;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Modifier f;
    public final /* synthetic */ iy g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    public /* synthetic */ vh(iy iyVar, Modifier modifier, boolean z, IconButtonColors iconButtonColors, MutableInteractionSource mutableInteractionSource, my myVar, int i, int i2) {
        this.g = iyVar;
        this.f = modifier;
        this.e = z;
        this.j = iconButtonColors;
        this.l = mutableInteractionSource;
        this.k = myVar;
        this.h = i;
        this.i = i2;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 TriStateCheckbox$lambda$8;
        w01 ContextMenuItem$lambda$2;
        w01 ExposedDropdownMenu$lambda$9;
        w01 IconButton$lambda$0;
        int i = this.d;
        Object obj3 = this.l;
        Object obj4 = this.k;
        Object obj5 = this.j;
        switch (i) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                TriStateCheckbox$lambda$8 = CheckboxKt.TriStateCheckbox$lambda$8((ToggleableState) obj5, this.g, this.f, this.e, (CheckboxColors) obj4, (MutableInteractionSource) obj3, this.h, this.i, (Composer) obj, intValue);
                return TriStateCheckbox$lambda$8;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                ContextMenuItem$lambda$2 = ContextMenuUiKt.ContextMenuItem$lambda$2((String) obj5, this.e, (ContextMenuColors) obj4, this.f, (ny) obj3, this.g, this.h, this.i, (Composer) obj, intValue2);
                return ContextMenuItem$lambda$2;
            case 2:
                int intValue3 = ((Integer) obj2).intValue();
                ExposedDropdownMenu$lambda$9 = ExposedDropdownMenuBoxScope.ExposedDropdownMenu$lambda$9((ExposedDropdownMenuBoxScope) obj5, this.e, this.g, this.f, (ScrollState) obj4, (ny) obj3, this.h, this.i, (Composer) obj, intValue3);
                return ExposedDropdownMenu$lambda$9;
            case 3:
                int intValue4 = ((Integer) obj2).intValue();
                IconButton$lambda$0 = IconButtonKt.IconButton$lambda$0(this.g, this.f, this.e, (IconButtonColors) obj5, (MutableInteractionSource) obj3, (my) obj4, this.h, this.i, (Composer) obj, intValue4);
                return IconButton$lambda$0;
            default:
                ((Integer) obj2).getClass();
                e80.a((ImageVector) obj5, (String) obj4, (String) obj3, this.f, this.e, this.g, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.h | 1), this.i);
                return w01.a;
        }
    }

    public /* synthetic */ vh(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, boolean z, iy iyVar, Modifier modifier, ScrollState scrollState, ny nyVar, int i, int i2) {
        this.j = exposedDropdownMenuBoxScope;
        this.e = z;
        this.g = iyVar;
        this.f = modifier;
        this.k = scrollState;
        this.l = nyVar;
        this.h = i;
        this.i = i2;
    }

    public /* synthetic */ vh(ImageVector imageVector, String str, String str2, Modifier modifier, boolean z, iy iyVar, int i, int i2) {
        this.j = imageVector;
        this.k = str;
        this.l = str2;
        this.f = modifier;
        this.e = z;
        this.g = iyVar;
        this.h = i;
        this.i = i2;
    }

    public /* synthetic */ vh(ToggleableState toggleableState, iy iyVar, Modifier modifier, boolean z, CheckboxColors checkboxColors, MutableInteractionSource mutableInteractionSource, int i, int i2) {
        this.j = toggleableState;
        this.g = iyVar;
        this.f = modifier;
        this.e = z;
        this.k = checkboxColors;
        this.l = mutableInteractionSource;
        this.h = i;
        this.i = i2;
    }

    public /* synthetic */ vh(String str, boolean z, ContextMenuColors contextMenuColors, Modifier modifier, ny nyVar, iy iyVar, int i, int i2) {
        this.j = str;
        this.e = z;
        this.k = contextMenuColors;
        this.f = modifier;
        this.l = nyVar;
        this.g = iyVar;
        this.h = i;
        this.i = i2;
    }
}
