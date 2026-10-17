package defpackage;

import androidx.compose.foundation.contextmenu.ContextMenuColors;
import androidx.compose.foundation.contextmenu.ContextMenuUiKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactoryKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider_androidKt;
import androidx.compose.material3.BadgeKt;
import androidx.compose.material3.DatePickerColors;
import androidx.compose.material3.DatePickerKt;
import androidx.compose.material3.NavigationDrawerKt;
import androidx.compose.material3.SnackbarData;
import androidx.compose.material3.SnackbarHostKt;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.material3.TimePickerColors;
import androidx.compose.material3.TimePickerKt;
import androidx.compose.material3.TimePickerState;
import androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class g1 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ g1(LazyLayoutItemProvider lazyLayoutItemProvider, Object obj, int i, Object obj2, int i2) {
        this.d = 6;
        this.h = lazyLayoutItemProvider;
        this.e = obj;
        this.f = i;
        this.i = obj2;
        this.g = i2;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 ObserveState$lambda$13;
        w01 ProvidePlatformTextContextMenuToolbar$lambda$6;
        w01 BadgedBox$lambda$2;
        w01 ContextMenuColumn$lambda$0;
        w01 ContextMenuColumnBuilder$lambda$1;
        w01 DisplayModeToggleButton_iUJLfQg$lambda$11;
        w01 SkippableItem_JVlU9Rs$lambda$1;
        w01 LazyLayoutPinnableItem$lambda$2;
        w01 PermanentNavigationDrawer$lambda$42;
        w01 SnackbarHost$lambda$1;
        w01 FadeInFadeOutWithScale$lambda$7;
        w01 TimeInput$lambda$5;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                ObserveState$lambda$13 = AccessibilityServiceStateProvider_androidKt.ObserveState$lambda$13((y40) this.h, (ky) this.e, (iy) this.i, this.f, this.g, (Composer) obj, intValue);
                return ObserveState$lambda$13;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                ProvidePlatformTextContextMenuToolbar$lambda$6 = AndroidTextContextMenuToolbarProvider_androidKt.ProvidePlatformTextContextMenuToolbar$lambda$6((Modifier) this.h, (ky) this.e, (my) this.i, this.f, this.g, (Composer) obj, intValue2);
                return ProvidePlatformTextContextMenuToolbar$lambda$6;
            case 2:
                int intValue3 = ((Integer) obj2).intValue();
                BadgedBox$lambda$2 = BadgeKt.BadgedBox$lambda$2((ny) this.h, (Modifier) this.e, (ny) this.i, this.f, this.g, (Composer) obj, intValue3);
                return BadgedBox$lambda$2;
            case 3:
                int intValue4 = ((Integer) obj2).intValue();
                ContextMenuColumn$lambda$0 = ContextMenuUiKt.ContextMenuColumn$lambda$0((ContextMenuColors) this.h, (Modifier) this.e, (ny) this.i, this.f, this.g, (Composer) obj, intValue4);
                return ContextMenuColumn$lambda$0;
            case 4:
                int intValue5 = ((Integer) obj2).intValue();
                ContextMenuColumnBuilder$lambda$1 = ContextMenuUiKt.ContextMenuColumnBuilder$lambda$1((Modifier) this.h, (ContextMenuColors) this.i, (ky) this.e, this.f, this.g, (Composer) obj, intValue5);
                return ContextMenuColumnBuilder$lambda$1;
            case 5:
                int intValue6 = ((Integer) obj2).intValue();
                DisplayModeToggleButton_iUJLfQg$lambda$11 = DatePickerKt.DisplayModeToggleButton_iUJLfQg$lambda$11((Modifier) this.h, this.f, (ky) this.e, (DatePickerColors) this.i, this.g, (Composer) obj, intValue6);
                return DisplayModeToggleButton_iUJLfQg$lambda$11;
            case 6:
                int intValue7 = ((Integer) obj2).intValue();
                SkippableItem_JVlU9Rs$lambda$1 = LazyLayoutItemContentFactoryKt.SkippableItem_JVlU9Rs$lambda$1((LazyLayoutItemProvider) this.h, this.e, this.f, this.i, this.g, (Composer) obj, intValue7);
                return SkippableItem_JVlU9Rs$lambda$1;
            case 7:
                int intValue8 = ((Integer) obj2).intValue();
                LazyLayoutPinnableItem$lambda$2 = LazyLayoutPinnableItemKt.LazyLayoutPinnableItem$lambda$2(this.h, this.f, (LazyLayoutPinnedItemList) this.e, (my) this.i, this.g, (Composer) obj, intValue8);
                return LazyLayoutPinnableItem$lambda$2;
            case 8:
                int intValue9 = ((Integer) obj2).intValue();
                PermanentNavigationDrawer$lambda$42 = NavigationDrawerKt.PermanentNavigationDrawer$lambda$42((my) this.h, (Modifier) this.e, (my) this.i, this.f, this.g, (Composer) obj, intValue9);
                return PermanentNavigationDrawer$lambda$42;
            case 9:
                int intValue10 = ((Integer) obj2).intValue();
                SnackbarHost$lambda$1 = SnackbarHostKt.SnackbarHost$lambda$1((SnackbarHostState) this.h, (Modifier) this.e, (ny) this.i, this.f, this.g, (Composer) obj, intValue10);
                return SnackbarHost$lambda$1;
            case 10:
                int intValue11 = ((Integer) obj2).intValue();
                FadeInFadeOutWithScale$lambda$7 = SnackbarHostKt.FadeInFadeOutWithScale$lambda$7((SnackbarData) this.h, (Modifier) this.e, (ny) this.i, this.f, this.g, (Composer) obj, intValue11);
                return FadeInFadeOutWithScale$lambda$7;
            default:
                int intValue12 = ((Integer) obj2).intValue();
                TimeInput$lambda$5 = TimePickerKt.TimeInput$lambda$5((TimePickerState) this.h, (Modifier) this.e, (TimePickerColors) this.i, this.f, this.g, (Composer) obj, intValue12);
                return TimeInput$lambda$5;
        }
    }

    public /* synthetic */ g1(Modifier modifier, ContextMenuColors contextMenuColors, ky kyVar, int i, int i2) {
        this.d = 4;
        this.h = modifier;
        this.i = contextMenuColors;
        this.e = kyVar;
        this.f = i;
        this.g = i2;
    }

    public /* synthetic */ g1(Object obj, int i, Object obj2, Object obj3, int i2, int i3) {
        this.d = i3;
        this.h = obj;
        this.f = i;
        this.e = obj2;
        this.i = obj3;
        this.g = i2;
    }

    public /* synthetic */ g1(Object obj, Object obj2, Object obj3, int i, int i2, int i3) {
        this.d = i3;
        this.h = obj;
        this.e = obj2;
        this.i = obj3;
        this.f = i;
        this.g = i2;
    }
}
