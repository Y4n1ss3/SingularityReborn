package defpackage;

import androidx.compose.animation.core.TransitionKt;
import androidx.compose.foundation.text.TextLinkScope;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuProvider;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuProviderKt;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.DefaultModalWideNavigationRailOverride;
import androidx.compose.material3.DefaultShortNavigationBarOverride;
import androidx.compose.material3.DefaultWideNavigationRailOverride;
import androidx.compose.material3.ModalWideNavigationRailOverride;
import androidx.compose.material3.Shapes;
import androidx.compose.material3.ShapesKt;
import androidx.compose.material3.ShortNavigationBarOverride;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TopAppBarDefaults;
import androidx.compose.material3.Typography;
import androidx.compose.material3.TypographyKt;
import androidx.compose.material3.WideNavigationRailOverride;
import androidx.compose.material3.tokens.TypographyTokensKt;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.text.SpanStyleKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.util.UUID;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class sn0 implements iy {
    public final /* synthetic */ int d;

    public /* synthetic */ sn0(int i) {
        this.d = i;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        SelectionRegistrar LocalSelectionRegistrar$lambda$0;
        Shapes LocalShapes$lambda$0;
        ShortNavigationBarOverride shortNavigationBarOverride;
        w01 w01Var;
        TextForegroundStyle textForegroundStyle;
        Dp LocalAbsoluteTonalElevation$lambda$3;
        TextContextMenuProvider LocalTextContextMenuDropdownProvider$lambda$0;
        TextContextMenuProvider LocalTextContextMenuToolbarProvider$lambda$0;
        String defaultDetectTextFieldTapGestures$lambda$0$0;
        TextStyle defaultTextStyle;
        IntOffset textRange$lambda$0$0;
        IntOffset textRange$lambda$0$1;
        TextSelectionColors textSelectionColors;
        boolean exitUntilCollapsedScrollBehavior$lambda$10$lambda$9;
        boolean enterAlwaysScrollBehavior$lambda$7$lambda$6;
        boolean pinnedScrollBehavior$lambda$2$lambda$1;
        boolean enterAlwaysScrollBehavior$lambda$5$lambda$4;
        SnapshotStateObserver SeekableStateObserver_delegate$lambda$0;
        Typography LocalTypography$lambda$0;
        WideNavigationRailOverride wideNavigationRailOverride;
        ModalWideNavigationRailOverride modalWideNavigationRailOverride;
        UUID randomUUID;
        WindowLayoutComponent a;
        switch (this.d) {
            case 0:
                LocalSelectionRegistrar$lambda$0 = SelectionRegistrarKt.LocalSelectionRegistrar$lambda$0();
                return LocalSelectionRegistrar$lambda$0;
            case 1:
                LocalShapes$lambda$0 = ShapesKt.LocalShapes$lambda$0();
                return LocalShapes$lambda$0;
            case 2:
                shortNavigationBarOverride = DefaultShortNavigationBarOverride.INSTANCE;
                return shortNavigationBarOverride;
            case 3:
                w01Var = w01.a;
                return w01Var;
            case 4:
                textForegroundStyle = SpanStyleKt.DefaultColorForegroundStyle;
                return textForegroundStyle;
            case 5:
                return new sb(l10.a);
            case 6:
                LocalAbsoluteTonalElevation$lambda$3 = SurfaceKt.LocalAbsoluteTonalElevation$lambda$3();
                return LocalAbsoluteTonalElevation$lambda$3;
            case 7:
                LocalTextContextMenuDropdownProvider$lambda$0 = TextContextMenuProviderKt.LocalTextContextMenuDropdownProvider$lambda$0();
                return LocalTextContextMenuDropdownProvider$lambda$0;
            case 8:
                LocalTextContextMenuToolbarProvider$lambda$0 = TextContextMenuProviderKt.LocalTextContextMenuToolbarProvider$lambda$0();
                return LocalTextContextMenuToolbarProvider$lambda$0;
            case 9:
                defaultDetectTextFieldTapGestures$lambda$0$0 = TextFieldSelectionStateKt.defaultDetectTextFieldTapGestures$lambda$0$0();
                return defaultDetectTextFieldTapGestures$lambda$0$0;
            case 10:
                defaultTextStyle = TypographyTokensKt.getDefaultTextStyle();
                return defaultTextStyle;
            case 11:
                textRange$lambda$0$0 = TextLinkScope.textRange$lambda$0$0();
                return textRange$lambda$0$0;
            case Matrix.TranslateX /* 12 */:
                textRange$lambda$0$1 = TextLinkScope.textRange$lambda$0$1();
                return textRange$lambda$0$1;
            case Matrix.TranslateY /* 13 */:
                textSelectionColors = TextSelectionColorsKt.DefaultTextSelectionColors;
                return textSelectionColors;
            case Matrix.TranslateZ /* 14 */:
                exitUntilCollapsedScrollBehavior$lambda$10$lambda$9 = TopAppBarDefaults.exitUntilCollapsedScrollBehavior$lambda$10$lambda$9();
                return Boolean.valueOf(exitUntilCollapsedScrollBehavior$lambda$10$lambda$9);
            case 15:
                enterAlwaysScrollBehavior$lambda$7$lambda$6 = TopAppBarDefaults.enterAlwaysScrollBehavior$lambda$7$lambda$6();
                return Boolean.valueOf(enterAlwaysScrollBehavior$lambda$7$lambda$6);
            case 16:
                pinnedScrollBehavior$lambda$2$lambda$1 = TopAppBarDefaults.pinnedScrollBehavior$lambda$2$lambda$1();
                return Boolean.valueOf(pinnedScrollBehavior$lambda$2$lambda$1);
            case 17:
                enterAlwaysScrollBehavior$lambda$5$lambda$4 = TopAppBarDefaults.enterAlwaysScrollBehavior$lambda$5$lambda$4();
                return Boolean.valueOf(enterAlwaysScrollBehavior$lambda$5$lambda$4);
            case 18:
                SeekableStateObserver_delegate$lambda$0 = TransitionKt.SeekableStateObserver_delegate$lambda$0();
                return SeekableStateObserver_delegate$lambda$0;
            case 19:
                LocalTypography$lambda$0 = TypographyKt.LocalTypography$lambda$0();
                return LocalTypography$lambda$0;
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                wideNavigationRailOverride = DefaultWideNavigationRailOverride.INSTANCE;
                return wideNavigationRailOverride;
            case 21:
                modalWideNavigationRailOverride = DefaultModalWideNavigationRailOverride.INSTANCE;
                return modalWideNavigationRailOverride;
            case 22:
                randomUUID = UUID.randomUUID();
                return randomUUID;
            default:
                try {
                    ClassLoader classLoader = o21.class.getClassLoader();
                    ok0 ok0Var = classLoader != null ? new ok0(classLoader, new ql(classLoader, 0)) : null;
                    if (ok0Var == null || (a = ok0Var.a()) == null) {
                        return null;
                    }
                    ql qlVar = new ql(classLoader, 0);
                    int a2 = zu.a();
                    return a2 >= 9 ? new yu(a, qlVar) : a2 >= 6 ? new xu(a, qlVar) : a2 >= 2 ? new wu(a, qlVar) : a2 == 1 ? new vu(a, qlVar) : new tu();
                } catch (Throwable unused) {
                    return null;
                }
        }
    }
}
