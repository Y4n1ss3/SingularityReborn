package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.CoreTextFieldKt;
import androidx.compose.foundation.text.TextLinkScope;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession;
import androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdownProvider_androidKt;
import androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProviderKt;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider;
import androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt;
import androidx.compose.foundation.text.selection.OffsetProvider;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.material3.ExposedDropdownMenu_androidKt;
import androidx.compose.material3.SegmentedButtonKt;
import androidx.compose.material3.TimePickerDialogKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.retain.RetainedValuesStoreRegistry;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.unit.Density;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class z5 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ z5(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.d = i2;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
        this.e = i;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 HandlePopup$lambda$1;
        w01 ProvideBasicTextContextMenu$lambda$0;
        w01 Canvas$lambda$2;
        w01 invoke$lambda$1;
        w01 CoreTextFieldRootBox$lambda$1;
        w01 OpenContextMenu$lambda$3;
        w01 SoftKeyboardListener$lambda$6;
        w01 LocalRetainedValuesStoreProvider$lambda$0;
        w01 SegmentedButtonContent$lambda$15;
        w01 StyleAnnotation$lambda$1;
        w01 TimePickerCustomLayout$lambda$3;
        int i = this.d;
        w01 w01Var = w01.a;
        int i2 = this.e;
        Object obj3 = this.g;
        Object obj4 = this.h;
        Object obj5 = this.f;
        switch (i) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                HandlePopup$lambda$1 = AndroidSelectionHandles_androidKt.HandlePopup$lambda$1((OffsetProvider) obj5, (Alignment) obj3, (my) obj4, this.e, (Composer) obj, intValue);
                return HandlePopup$lambda$1;
            case 1:
                ((Integer) obj2).getClass();
                kb.k((Drawable) obj5, (String) obj3, (Modifier) obj4, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return w01Var;
            case 2:
                ((Integer) obj2).getClass();
                kb.a((String) obj5, (String) obj3, (my) obj4, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return w01Var;
            case 3:
                int intValue2 = ((Integer) obj2).intValue();
                ProvideBasicTextContextMenu$lambda$0 = BasicTextContextMenuProviderKt.ProvideBasicTextContextMenu$lambda$0((ProvidableCompositionLocal) obj5, (py) obj3, (my) obj4, this.e, (Composer) obj, intValue2);
                return ProvideBasicTextContextMenu$lambda$0;
            case 4:
                int intValue3 = ((Integer) obj2).intValue();
                Canvas$lambda$2 = CanvasKt.Canvas$lambda$2((Modifier) obj5, (String) obj3, (ky) obj4, this.e, (Composer) obj, intValue3);
                return Canvas$lambda$2;
            case 5:
                int intValue4 = ((Integer) obj2).intValue();
                invoke$lambda$1 = ComposableLambdaImpl.invoke$lambda$1((ComposableLambdaImpl) obj5, this.g, this.h, this.e, (Composer) obj, intValue4);
                return invoke$lambda$1;
            case 6:
                ((Integer) obj2).intValue();
                um.a((km) obj5, (ky) obj3, (ky) obj4, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return w01Var;
            case 7:
                int intValue5 = ((Integer) obj2).intValue();
                CoreTextFieldRootBox$lambda$1 = CoreTextFieldKt.CoreTextFieldRootBox$lambda$1((Modifier) obj5, (TextFieldSelectionManager) obj3, (my) obj4, this.e, (Composer) obj, intValue5);
                return CoreTextFieldRootBox$lambda$1;
            case 8:
                int intValue6 = ((Integer) obj2).intValue();
                OpenContextMenu$lambda$3 = DefaultTextContextMenuDropdownProvider_androidKt.OpenContextMenu$lambda$3((TextContextMenuSession) obj5, (TextContextMenuDataProvider) obj3, (iy) obj4, this.e, (Composer) obj, intValue6);
                return OpenContextMenu$lambda$3;
            case 9:
                int intValue7 = ((Integer) obj2).intValue();
                SoftKeyboardListener$lambda$6 = ExposedDropdownMenu_androidKt.SoftKeyboardListener$lambda$6((View) obj5, (Density) obj3, (iy) obj4, this.e, (Composer) obj, intValue7);
                return SoftKeyboardListener$lambda$6;
            case 10:
                int intValue8 = ((Integer) obj2).intValue();
                LocalRetainedValuesStoreProvider$lambda$0 = RetainedValuesStoreRegistry.LocalRetainedValuesStoreProvider$lambda$0((RetainedValuesStoreRegistry) obj5, this.g, (my) obj4, this.e, (Composer) obj, intValue8);
                return LocalRetainedValuesStoreProvider$lambda$0;
            case 11:
                int intValue9 = ((Integer) obj2).intValue();
                SegmentedButtonContent$lambda$15 = SegmentedButtonKt.SegmentedButtonContent$lambda$15((my) obj4, (my) obj5, (PaddingValues) obj3, this.e, (Composer) obj, intValue9);
                return SegmentedButtonContent$lambda$15;
            case Matrix.TranslateX /* 12 */:
                int intValue10 = ((Integer) obj2).intValue();
                StyleAnnotation$lambda$1 = TextLinkScope.StyleAnnotation$lambda$1((TextLinkScope) obj5, (Object[]) obj3, (ky) obj4, this.e, (Composer) obj, intValue10);
                return StyleAnnotation$lambda$1;
            default:
                int intValue11 = ((Integer) obj2).intValue();
                TimePickerCustomLayout$lambda$3 = TimePickerDialogKt.TimePickerCustomLayout$lambda$3((my) obj4, (my) obj5, (ny) obj3, this.e, (Composer) obj, intValue11);
                return TimePickerCustomLayout$lambda$3;
        }
    }

    public /* synthetic */ z5(my myVar, my myVar2, Object obj, int i, int i2) {
        this.d = i2;
        this.h = myVar;
        this.f = myVar2;
        this.g = obj;
        this.e = i;
    }
}
