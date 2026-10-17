package defpackage;

import android.content.SharedPreferences;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.FocusableNode;
import androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl;
import androidx.compose.foundation.lazy.grid.LazyGridItemProviderKt;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.layout.LazySaveableStateHolder;
import androidx.compose.foundation.lazy.layout.LazySaveableStateHolderKt;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderImpl;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState;
import androidx.compose.foundation.pager.LazyLayoutPagerKt;
import androidx.compose.foundation.pager.PagerLazyLayoutItemProvider;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.TextLinkScope;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuItem;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession;
import androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider;
import androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdownProvider_androidKt;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider;
import androidx.compose.material3.AppBarMenuState;
import androidx.compose.material3.ClickableAppBarItem;
import androidx.compose.material3.DefaultModalWideNavigationRailOverride;
import androidx.compose.material3.DrawerState;
import androidx.compose.material3.DrawerValue;
import androidx.compose.material3.ModalWideNavigationRailOverrideScope;
import androidx.compose.material3.NavigationDrawerKt;
import androidx.compose.material3.TooltipState;
import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.material3.internal.AnimatedShapeKt;
import androidx.compose.material3.internal.BasicTooltipKt;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.LinkComposer;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NextFrameEndCallbackQueue;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.State;
import androidx.compose.runtime.retain.RetainKt;
import androidx.compose.runtime.retain.RetainedValueHolder;
import androidx.compose.runtime.retain.RetainedValuesStore;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.tooling.ComposeStackTrace;
import androidx.compose.runtime.tooling.CompositionErrorContextImpl;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.spatial.RectListKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.unit.IntOffset;
import java.util.regex.Matcher;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class v4 implements iy {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ v4(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iy
    public final Object invoke() {
        w01 trySnapTo$lambda$9;
        w01 observeReadsAndGet$lambda$0;
        w01 animateValueAsState$lambda$7$0;
        w01 rememberAnimatedShape$lambda$4$lambda$3;
        w01 BasicTextField$lambda$20$0;
        AnnotatedString LayoutWithLinksAndInlineContent_11Od_4g$lambda$1$0;
        boolean anchorSemantics$lambda$12$lambda$11;
        w01 MenuContent$lambda$2$lambda$1;
        ComposeStackTrace attachComposeStackTrace$lambda$0;
        w01 ModalWideNavigationRail$lambda$16$lambda$15;
        w01 ModalWideNavigationRail$lambda$18$lambda$17;
        w01 ModalWideNavigationRail$lambda$22$lambda$21;
        w01 DefaultTextContextMenuDropdown$lambda$0$0$0$1;
        IntOffset OpenContextMenu$lambda$0$0;
        w01 retrievePinnableContainer$lambda$0;
        w01 insertMovableContentGuarded$lambda$0$0$1$0$0$0$0;
        LazyGridItemProviderImpl rememberLazyGridItemProviderLambda$lambda$0$1;
        PagerLazyLayoutItemProvider rememberPagerItemProviderLambda$lambda$0$1;
        LazySaveableStateHolder LazySaveableStateHolderProvider$lambda$0$0;
        LazyStaggeredGridItemProviderImpl rememberStaggeredGridItemProviderLambda$lambda$0$1;
        w01 insertMovableContentGuarded$lambda$0$0$1$0$0$0$0$0;
        float ModalNavigationDrawer_FHprtrg$lambda$24$lambda$16$lambda$15;
        DrawerState rememberDrawerState$lambda$3$lambda$2;
        w01 onNewAwaiters$lambda$0;
        w01 performRecompose$lambda$0$0;
        w01 retainImpl$lambda$1$0;
        int i = this.d;
        int i2 = 0;
        w01 w01Var = w01.a;
        Object obj = this.f;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                trySnapTo$lambda$9 = AnchoredDraggableState.trySnapTo$lambda$9((AnchoredDraggableState) obj2, obj);
                return trySnapTo$lambda$9;
            case 1:
                observeReadsAndGet$lambda$0 = AndroidTextContextMenuToolbarProvider.observeReadsAndGet$lambda$0((ji0) obj2, (iy) obj);
                return observeReadsAndGet$lambda$0;
            case 2:
                animateValueAsState$lambda$7$0 = AnimateAsStateKt.animateValueAsState$lambda$7$0((zg) obj2, obj);
                return animateValueAsState$lambda$7$0;
            case 3:
                rememberAnimatedShape$lambda$4$lambda$3 = AnimatedShapeKt.rememberAnimatedShape$lambda$4$lambda$3((zg) obj2, (RoundedCornerShape) obj);
                return rememberAnimatedShape$lambda$4$lambda$3;
            case 4:
                ((iy) ((xe0) ((MutableState) obj2).getValue()).e).invoke();
                ((MutableState) obj).setValue(Boolean.FALSE);
                return w01Var;
            case 5:
                p01.t((un) obj2, null, null, new y9((SharedPreferences) obj, null, i2), 3);
                return w01Var;
            case 6:
                BasicTextField$lambda$20$0 = BasicTextFieldKt.BasicTextField$lambda$20$0((TextFieldValue) obj2, (MutableState) obj);
                return BasicTextField$lambda$20$0;
            case 7:
                LayoutWithLinksAndInlineContent_11Od_4g$lambda$1$0 = BasicTextKt.LayoutWithLinksAndInlineContent_11Od_4g$lambda$1$0((TextLinkScope) obj2, (AnnotatedString) obj);
                return LayoutWithLinksAndInlineContent_11Od_4g$lambda$1$0;
            case 8:
                anchorSemantics$lambda$12$lambda$11 = BasicTooltipKt.anchorSemantics$lambda$12$lambda$11((un) obj2, (TooltipState) obj);
                return Boolean.valueOf(anchorSemantics$lambda$12$lambda$11);
            case 9:
                MenuContent$lambda$2$lambda$1 = ClickableAppBarItem.MenuContent$lambda$2$lambda$1((ClickableAppBarItem) obj2, (AppBarMenuState) obj);
                return MenuContent$lambda$2$lambda$1;
            case 10:
                attachComposeStackTrace$lambda$0 = CompositionErrorContextImpl.attachComposeStackTrace$lambda$0((CompositionErrorContextImpl) obj2, obj);
                return attachComposeStackTrace$lambda$0;
            case 11:
                ModalWideNavigationRail$lambda$16$lambda$15 = DefaultModalWideNavigationRailOverride.ModalWideNavigationRail$lambda$16$lambda$15((zg) obj2, (ModalWideNavigationRailOverrideScope) obj);
                return ModalWideNavigationRail$lambda$16$lambda$15;
            case Matrix.TranslateX /* 12 */:
                ModalWideNavigationRail$lambda$18$lambda$17 = DefaultModalWideNavigationRailOverride.ModalWideNavigationRail$lambda$18$lambda$17((un) obj2, (ModalWideNavigationRailOverrideScope) obj);
                return ModalWideNavigationRail$lambda$18$lambda$17;
            case Matrix.TranslateY /* 13 */:
                ModalWideNavigationRail$lambda$22$lambda$21 = DefaultModalWideNavigationRailOverride.ModalWideNavigationRail$lambda$22$lambda$21((un) obj2, (Animatable) obj);
                return ModalWideNavigationRail$lambda$22$lambda$21;
            case Matrix.TranslateZ /* 14 */:
                DefaultTextContextMenuDropdown$lambda$0$0$0$1 = DefaultTextContextMenuDropdownProvider_androidKt.DefaultTextContextMenuDropdown$lambda$0$0$0$1((TextContextMenuItem) obj2, (TextContextMenuSession) obj);
                return DefaultTextContextMenuDropdown$lambda$0$0$0$1;
            case 15:
                OpenContextMenu$lambda$0$0 = DefaultTextContextMenuDropdownProvider_androidKt.OpenContextMenu$lambda$0$0((TextContextMenuDataProvider) obj2, (iy) obj);
                return OpenContextMenu$lambda$0$0;
            case 16:
                retrievePinnableContainer$lambda$0 = FocusableNode.retrievePinnableContainer$lambda$0((ji0) obj2, (FocusableNode) obj);
                return retrievePinnableContainer$lambda$0;
            case 17:
                insertMovableContentGuarded$lambda$0$0$1$0$0$0$0 = GapComposer.insertMovableContentGuarded$lambda$0$0$1$0$0$0$0((GapComposer) obj2, (MovableContentStateReference) obj);
                return insertMovableContentGuarded$lambda$0$0$1$0$0$0$0;
            case 18:
                rememberLazyGridItemProviderLambda$lambda$0$1 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda$lambda$0$1((State) obj2, (LazyGridState) obj);
                return rememberLazyGridItemProviderLambda$lambda$0$1;
            case 19:
                rememberPagerItemProviderLambda$lambda$0$1 = LazyLayoutPagerKt.rememberPagerItemProviderLambda$lambda$0$1((State) obj2, (PagerState) obj);
                return rememberPagerItemProviderLambda$lambda$0$1;
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                LazySaveableStateHolderProvider$lambda$0$0 = LazySaveableStateHolderKt.LazySaveableStateHolderProvider$lambda$0$0((SaveableStateRegistry) obj2, (SaveableStateHolder) obj);
                return LazySaveableStateHolderProvider$lambda$0$0;
            case 21:
                rememberStaggeredGridItemProviderLambda$lambda$0$1 = LazyStaggeredGridItemProviderKt.rememberStaggeredGridItemProviderLambda$lambda$0$1((State) obj2, (LazyStaggeredGridState) obj);
                return rememberStaggeredGridItemProviderLambda$lambda$0$1;
            case 22:
                insertMovableContentGuarded$lambda$0$0$1$0$0$0$0$0 = LinkComposer.insertMovableContentGuarded$lambda$0$0$1$0$0$0$0$0((LinkComposer) obj2, (MovableContentStateReference) obj);
                return insertMovableContentGuarded$lambda$0$0$1$0$0$0$0$0;
            case 23:
                ((ky) obj2).invoke((ku) obj);
                return w01Var;
            case 24:
                ModalNavigationDrawer_FHprtrg$lambda$24$lambda$16$lambda$15 = NavigationDrawerKt.ModalNavigationDrawer_FHprtrg$lambda$24$lambda$16$lambda$15(0.0f, (DrawerState) obj2, (MutableFloatState) obj);
                return Float.valueOf(ModalNavigationDrawer_FHprtrg$lambda$24$lambda$16$lambda$15);
            case RectListKt.BitOffsetForParentId /* 25 */:
                rememberDrawerState$lambda$3$lambda$2 = NavigationDrawerKt.rememberDrawerState$lambda$3$lambda$2((DrawerValue) obj2, (ky) obj);
                return rememberDrawerState$lambda$3$lambda$2;
            case 26:
                onNewAwaiters$lambda$0 = NextFrameEndCallbackQueue.onNewAwaiters$lambda$0((NextFrameEndCallbackQueue) obj2, (iy) obj);
                return onNewAwaiters$lambda$0;
            case 27:
                performRecompose$lambda$0$0 = Recomposer.performRecompose$lambda$0$0((gb0) obj2, (ControlledComposition) obj);
                return performRecompose$lambda$0$0;
            case 28:
                String str = (String) obj;
                Matcher matcher = ((ni0) obj2).d.matcher(str);
                matcher.getClass();
                return cq.n(matcher, 0, str);
            default:
                retainImpl$lambda$1$0 = RetainKt.retainImpl$lambda$1$0((RetainedValueHolder) obj2, (RetainedValuesStore) obj);
                return retainImpl$lambda$1$0;
        }
    }
}
