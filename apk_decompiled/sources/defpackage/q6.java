package defpackage;

import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.contextmenu.ContextMenuColors;
import androidx.compose.foundation.contextmenu.ContextMenuScope;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactoryKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.text.AnnotatedStringResolveInlineContentKt;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuData;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession;
import androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdownProvider_androidKt;
import androidx.compose.material3.AppBarMenuState;
import androidx.compose.material3.BasicAlertDialogOverrideScope;
import androidx.compose.material3.ClickableAppBarItem;
import androidx.compose.material3.CustomAppBarItem;
import androidx.compose.material3.DatePickerColors;
import androidx.compose.material3.DatePickerKt;
import androidx.compose.material3.DefaultBasicAlertDialogOverride;
import androidx.compose.material3.DefaultModalWideNavigationRailOverride;
import androidx.compose.material3.DefaultNavigationBarOverride;
import androidx.compose.material3.DefaultNavigationRailOverride;
import androidx.compose.material3.DefaultShortNavigationBarOverride;
import androidx.compose.material3.DefaultSingleRowTopAppBarOverride;
import androidx.compose.material3.DefaultTwoRowsTopAppBarOverride;
import androidx.compose.material3.DefaultWideNavigationRailOverride;
import androidx.compose.material3.DrawerState;
import androidx.compose.material3.ModalWideNavigationRailOverrideScope;
import androidx.compose.material3.NavigationBarOverrideScope;
import androidx.compose.material3.NavigationDrawerKt;
import androidx.compose.material3.NavigationItemKt;
import androidx.compose.material3.NavigationRailOverrideScope;
import androidx.compose.material3.SearchBarKt;
import androidx.compose.material3.SheetDefaultsKt;
import androidx.compose.material3.ShortNavigationBarOverrideScope;
import androidx.compose.material3.SingleRowTopAppBarOverrideScope;
import androidx.compose.material3.TabKt;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.TwoRowsTopAppBarOverrideScope;
import androidx.compose.material3.WideNavigationRailOverrideScope;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalContext;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaNImpl;
import androidx.compose.runtime.retain.LocalRetainedValuesStoreKt;
import androidx.compose.runtime.retain.RetainedValuesStore;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.spatial.RectListKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class q6 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ q6(Object obj, int i, Object obj2, int i2) {
        this.d = i2;
        this.f = obj;
        this.e = i;
        this.g = obj2;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 InlineChildren$lambda$1;
        w01 Canvas$lambda$0;
        w01 MenuContent$lambda$3;
        w01 invoke$lambda$0;
        w01 invoke$lambda$02;
        w01 CompositionLocalProvider$lambda$1;
        w01 CompositionLocalProvider$lambda$0;
        w01 CompositionLocalProvider$lambda$3;
        w01 Content$lambda$1;
        w01 MenuContent$lambda$1;
        w01 WeekDays$lambda$49;
        w01 BasicAlertDialog$lambda$0;
        w01 ModalWideNavigationRail$lambda$23;
        w01 NavigationBar$lambda$0;
        w01 NavigationRail$lambda$0;
        w01 ShortNavigationBar$lambda$0;
        w01 SingleRowTopAppBar$lambda$16;
        w01 DefaultTextContextMenuDropdown$lambda$1;
        w01 TwoRowsTopAppBar$lambda$28;
        w01 WideNavigationRail$lambda$0;
        w01 SkippableItem_JVlU9Rs$lambda$0;
        w01 LocalRetainedValuesStoreProvider$lambda$2;
        w01 DrawerPredictiveBackHandler$lambda$62;
        w01 IndicatorRipple$lambda$42;
        w01 DetectClickFromInteractionSource$lambda$73;
        w01 DragHandleWithTooltip$lambda$1;
        w01 TabBaselineLayout$lambda$11;
        w01 ProvideTextStyle$lambda$20;
        int i = this.d;
        w01 w01Var = w01.a;
        int i2 = this.e;
        Object obj3 = this.g;
        Object obj4 = this.f;
        switch (i) {
            case 0:
                InlineChildren$lambda$1 = AnnotatedStringResolveInlineContentKt.InlineChildren$lambda$1((AnnotatedString) obj4, (List) obj3, i2, (Composer) obj, ((Integer) obj2).intValue());
                return InlineChildren$lambda$1;
            case 1:
                ((Integer) obj2).intValue();
                kb.l((iy) obj4, (ky) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return w01Var;
            case 2:
                Canvas$lambda$0 = CanvasKt.Canvas$lambda$0((Modifier) obj4, (ky) obj3, i2, (Composer) obj, ((Integer) obj2).intValue());
                return Canvas$lambda$0;
            case 3:
                MenuContent$lambda$3 = ClickableAppBarItem.MenuContent$lambda$3((ClickableAppBarItem) obj4, (AppBarMenuState) obj3, i2, (Composer) obj, ((Integer) obj2).intValue());
                return MenuContent$lambda$3;
            case 4:
                invoke$lambda$0 = ComposableLambdaImpl.invoke$lambda$0((ComposableLambdaImpl) obj4, obj3, i2, (Composer) obj, ((Integer) obj2).intValue());
                return invoke$lambda$0;
            case 5:
                invoke$lambda$02 = ComposableLambdaNImpl.invoke$lambda$0((Object[]) obj4, i2, (ComposableLambdaNImpl) obj3, (Composer) obj, ((Integer) obj2).intValue());
                return invoke$lambda$02;
            case 6:
                CompositionLocalProvider$lambda$1 = CompositionLocalKt.CompositionLocalProvider$lambda$1((ProvidedValue) obj4, (my) obj3, i2, (Composer) obj, ((Integer) obj2).intValue());
                return CompositionLocalProvider$lambda$1;
            case 7:
                CompositionLocalProvider$lambda$0 = CompositionLocalKt.CompositionLocalProvider$lambda$0((ProvidedValue[]) obj4, (my) obj3, i2, (Composer) obj, ((Integer) obj2).intValue());
                return CompositionLocalProvider$lambda$0;
            case 8:
                CompositionLocalProvider$lambda$3 = CompositionLocalKt.CompositionLocalProvider$lambda$3((CompositionLocalContext) obj4, (my) obj3, i2, (Composer) obj, ((Integer) obj2).intValue());
                return CompositionLocalProvider$lambda$3;
            case 9:
                Content$lambda$1 = ContextMenuScope.Content$lambda$1((ContextMenuScope) obj4, (ContextMenuColors) obj3, i2, (Composer) obj, ((Integer) obj2).intValue());
                return Content$lambda$1;
            case 10:
                ((Integer) obj2).getClass();
                um.b((jm) obj4, (iy) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return w01Var;
            case 11:
                MenuContent$lambda$1 = CustomAppBarItem.MenuContent$lambda$1((CustomAppBarItem) obj4, (AppBarMenuState) obj3, i2, (Composer) obj, ((Integer) obj2).intValue());
                return MenuContent$lambda$1;
            case Matrix.TranslateX /* 12 */:
                WeekDays$lambda$49 = DatePickerKt.WeekDays$lambda$49((DatePickerColors) obj4, (CalendarModel) obj3, i2, (Composer) obj, ((Integer) obj2).intValue());
                return WeekDays$lambda$49;
            case Matrix.TranslateY /* 13 */:
                BasicAlertDialog$lambda$0 = DefaultBasicAlertDialogOverride.BasicAlertDialog$lambda$0((DefaultBasicAlertDialogOverride) obj4, (BasicAlertDialogOverrideScope) obj3, i2, (Composer) obj, ((Integer) obj2).intValue());
                return BasicAlertDialog$lambda$0;
            case Matrix.TranslateZ /* 14 */:
                ModalWideNavigationRail$lambda$23 = DefaultModalWideNavigationRailOverride.ModalWideNavigationRail$lambda$23((DefaultModalWideNavigationRailOverride) obj4, (ModalWideNavigationRailOverrideScope) obj3, i2, (Composer) obj, ((Integer) obj2).intValue());
                return ModalWideNavigationRail$lambda$23;
            case 15:
                NavigationBar$lambda$0 = DefaultNavigationBarOverride.NavigationBar$lambda$0((DefaultNavigationBarOverride) obj4, (NavigationBarOverrideScope) obj3, i2, (Composer) obj, ((Integer) obj2).intValue());
                return NavigationBar$lambda$0;
            case 16:
                NavigationRail$lambda$0 = DefaultNavigationRailOverride.NavigationRail$lambda$0((DefaultNavigationRailOverride) obj4, (NavigationRailOverrideScope) obj3, i2, (Composer) obj, ((Integer) obj2).intValue());
                return NavigationRail$lambda$0;
            case 17:
                ShortNavigationBar$lambda$0 = DefaultShortNavigationBarOverride.ShortNavigationBar$lambda$0((DefaultShortNavigationBarOverride) obj4, (ShortNavigationBarOverrideScope) obj3, i2, (Composer) obj, ((Integer) obj2).intValue());
                return ShortNavigationBar$lambda$0;
            case 18:
                SingleRowTopAppBar$lambda$16 = DefaultSingleRowTopAppBarOverride.SingleRowTopAppBar$lambda$16((DefaultSingleRowTopAppBarOverride) obj4, (SingleRowTopAppBarOverrideScope) obj3, i2, (Composer) obj, ((Integer) obj2).intValue());
                return SingleRowTopAppBar$lambda$16;
            case 19:
                DefaultTextContextMenuDropdown$lambda$1 = DefaultTextContextMenuDropdownProvider_androidKt.DefaultTextContextMenuDropdown$lambda$1((TextContextMenuSession) obj4, (TextContextMenuData) obj3, i2, (Composer) obj, ((Integer) obj2).intValue());
                return DefaultTextContextMenuDropdown$lambda$1;
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                TwoRowsTopAppBar$lambda$28 = DefaultTwoRowsTopAppBarOverride.TwoRowsTopAppBar$lambda$28((DefaultTwoRowsTopAppBarOverride) obj4, (TwoRowsTopAppBarOverrideScope) obj3, i2, (Composer) obj, ((Integer) obj2).intValue());
                return TwoRowsTopAppBar$lambda$28;
            case 21:
                WideNavigationRail$lambda$0 = DefaultWideNavigationRailOverride.WideNavigationRail$lambda$0((DefaultWideNavigationRailOverride) obj4, (WideNavigationRailOverrideScope) obj3, i2, (Composer) obj, ((Integer) obj2).intValue());
                return WideNavigationRail$lambda$0;
            case 22:
                SkippableItem_JVlU9Rs$lambda$0 = LazyLayoutItemContentFactoryKt.SkippableItem_JVlU9Rs$lambda$0((LazyLayoutItemProvider) obj4, i2, obj3, (Composer) obj, ((Integer) obj2).intValue());
                return SkippableItem_JVlU9Rs$lambda$0;
            case 23:
                LocalRetainedValuesStoreProvider$lambda$2 = LocalRetainedValuesStoreKt.LocalRetainedValuesStoreProvider$lambda$2((RetainedValuesStore) obj4, (my) obj3, i2, (Composer) obj, ((Integer) obj2).intValue());
                return LocalRetainedValuesStoreProvider$lambda$2;
            case 24:
                DrawerPredictiveBackHandler$lambda$62 = NavigationDrawerKt.DrawerPredictiveBackHandler$lambda$62((DrawerState) obj4, (ny) obj3, i2, (Composer) obj, ((Integer) obj2).intValue());
                return DrawerPredictiveBackHandler$lambda$62;
            case RectListKt.BitOffsetForParentId /* 25 */:
                IndicatorRipple$lambda$42 = NavigationItemKt.IndicatorRipple$lambda$42((InteractionSource) obj4, (Shape) obj3, i2, (Composer) obj, ((Integer) obj2).intValue());
                return IndicatorRipple$lambda$42;
            case 26:
                DetectClickFromInteractionSource$lambda$73 = SearchBarKt.DetectClickFromInteractionSource$lambda$73((InteractionSource) obj4, (iy) obj3, i2, (Composer) obj, ((Integer) obj2).intValue());
                return DetectClickFromInteractionSource$lambda$73;
            case 27:
                DragHandleWithTooltip$lambda$1 = SheetDefaultsKt.DragHandleWithTooltip$lambda$1((ColumnScope) obj4, (my) obj3, i2, (Composer) obj, ((Integer) obj2).intValue());
                return DragHandleWithTooltip$lambda$1;
            case 28:
                TabBaselineLayout$lambda$11 = TabKt.TabBaselineLayout$lambda$11((my) obj4, (my) obj3, i2, (Composer) obj, ((Integer) obj2).intValue());
                return TabBaselineLayout$lambda$11;
            default:
                ProvideTextStyle$lambda$20 = TextKt.ProvideTextStyle$lambda$20((TextStyle) obj4, (my) obj3, i2, (Composer) obj, ((Integer) obj2).intValue());
                return ProvideTextStyle$lambda$20;
        }
    }

    public /* synthetic */ q6(Object obj, Object obj2, int i, int i2) {
        this.d = i2;
        this.f = obj;
        this.g = obj2;
        this.e = i;
    }
}
