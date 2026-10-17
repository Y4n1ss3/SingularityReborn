package defpackage;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardElevation;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.CheckboxColors;
import androidx.compose.material3.CheckboxKt;
import androidx.compose.material3.DatePickerColors;
import androidx.compose.material3.DatePickerFormatter;
import androidx.compose.material3.DatePickerKt;
import androidx.compose.material3.DatePickerState;
import androidx.compose.material3.DateRangePickerKt;
import androidx.compose.material3.DateRangePickerState;
import androidx.compose.material3.IconButtonColors;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.state.ToggleableState;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class kg implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Modifier f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    public /* synthetic */ kg(ToggleableState toggleableState, iy iyVar, Stroke stroke, Stroke stroke2, Modifier modifier, boolean z, CheckboxColors checkboxColors, MutableInteractionSource mutableInteractionSource, int i, int i2) {
        this.d = 1;
        this.k = toggleableState;
        this.e = iyVar;
        this.l = stroke;
        this.m = stroke2;
        this.f = modifier;
        this.g = z;
        this.n = checkboxColors;
        this.h = mutableInteractionSource;
        this.i = i;
        this.j = i2;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 ElevatedCard$lambda$4;
        w01 TriStateCheckbox$lambda$9;
        w01 DatePicker$lambda$3;
        w01 DateRangePicker$lambda$3;
        w01 OutlinedIconButton$lambda$18;
        w01 LazyColumn$lambda$2;
        w01 LazyRow$lambda$2;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                ElevatedCard$lambda$4 = CardKt.ElevatedCard$lambda$4((iy) this.e, this.f, this.g, (Shape) this.k, (CardColors) this.l, (CardElevation) this.m, (MutableInteractionSource) this.h, (ny) this.n, this.i, this.j, (Composer) obj, intValue);
                return ElevatedCard$lambda$4;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                TriStateCheckbox$lambda$9 = CheckboxKt.TriStateCheckbox$lambda$9((ToggleableState) this.k, (iy) this.e, (Stroke) this.l, (Stroke) this.m, this.f, this.g, (CheckboxColors) this.n, (MutableInteractionSource) this.h, this.i, this.j, (Composer) obj, intValue2);
                return TriStateCheckbox$lambda$9;
            case 2:
                int intValue3 = ((Integer) obj2).intValue();
                DatePicker$lambda$3 = DatePickerKt.DatePicker$lambda$3((DatePickerState) this.e, this.f, (DatePickerFormatter) this.k, (DatePickerColors) this.l, (my) this.m, (my) this.h, this.g, (FocusRequester) this.n, this.i, this.j, (Composer) obj, intValue3);
                return DatePicker$lambda$3;
            case 3:
                int intValue4 = ((Integer) obj2).intValue();
                DateRangePicker$lambda$3 = DateRangePickerKt.DateRangePicker$lambda$3((DateRangePickerState) this.e, this.f, (DatePickerFormatter) this.k, (DatePickerColors) this.l, (my) this.m, (my) this.h, this.g, (FocusRequester) this.n, this.i, this.j, (Composer) obj, intValue4);
                return DateRangePicker$lambda$3;
            case 4:
                int intValue5 = ((Integer) obj2).intValue();
                OutlinedIconButton$lambda$18 = IconButtonKt.OutlinedIconButton$lambda$18((iy) this.e, this.f, this.g, (Shape) this.k, (IconButtonColors) this.l, (BorderStroke) this.m, (MutableInteractionSource) this.h, (my) this.n, this.i, this.j, (Composer) obj, intValue5);
                return OutlinedIconButton$lambda$18;
            case 5:
                int intValue6 = ((Integer) obj2).intValue();
                LazyColumn$lambda$2 = LazyDslKt.LazyColumn$lambda$2(this.f, (LazyListState) this.e, (PaddingValues) this.k, this.g, (Arrangement.Vertical) this.l, (Alignment.Horizontal) this.m, (FlingBehavior) this.h, (ky) this.n, this.i, this.j, (Composer) obj, intValue6);
                return LazyColumn$lambda$2;
            default:
                int intValue7 = ((Integer) obj2).intValue();
                LazyRow$lambda$2 = LazyDslKt.LazyRow$lambda$2(this.f, (LazyListState) this.e, (PaddingValues) this.k, this.g, (Arrangement.Horizontal) this.l, (Alignment.Vertical) this.m, (FlingBehavior) this.h, (ky) this.n, this.i, this.j, (Composer) obj, intValue7);
                return LazyRow$lambda$2;
        }
    }

    public /* synthetic */ kg(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z, Object obj, Object obj2, FlingBehavior flingBehavior, ky kyVar, int i, int i2, int i3) {
        this.d = i3;
        this.f = modifier;
        this.e = lazyListState;
        this.k = paddingValues;
        this.g = z;
        this.l = obj;
        this.m = obj2;
        this.h = flingBehavior;
        this.n = kyVar;
        this.i = i;
        this.j = i2;
    }

    public /* synthetic */ kg(iy iyVar, Modifier modifier, boolean z, Shape shape, Object obj, Object obj2, MutableInteractionSource mutableInteractionSource, ty tyVar, int i, int i2, int i3) {
        this.d = i3;
        this.e = iyVar;
        this.f = modifier;
        this.g = z;
        this.k = shape;
        this.l = obj;
        this.m = obj2;
        this.h = mutableInteractionSource;
        this.n = tyVar;
        this.i = i;
        this.j = i2;
    }

    public /* synthetic */ kg(Object obj, Modifier modifier, DatePickerFormatter datePickerFormatter, DatePickerColors datePickerColors, my myVar, my myVar2, boolean z, FocusRequester focusRequester, int i, int i2, int i3) {
        this.d = i3;
        this.e = obj;
        this.f = modifier;
        this.k = datePickerFormatter;
        this.l = datePickerColors;
        this.m = myVar;
        this.h = myVar2;
        this.g = z;
        this.n = focusRequester;
        this.i = i;
        this.j = i2;
    }
}
