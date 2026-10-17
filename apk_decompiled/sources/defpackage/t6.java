package defpackage;

import androidx.compose.foundation.lazy.LazyListIntervalContent;
import androidx.compose.foundation.lazy.LazyListItemProviderKt;
import androidx.compose.foundation.lazy.grid.LazyGridIntervalContent;
import androidx.compose.foundation.lazy.grid.LazyGridItemProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridIntervalContent;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt;
import androidx.compose.foundation.text.selection.SelectionMagnifierKt;
import androidx.compose.material.ripple.RippleAlpha;
import androidx.compose.material.ripple.RippleIndicationInstance;
import androidx.compose.material3.AppBarColumnKt;
import androidx.compose.material3.AppBarColumnScopeImpl;
import androidx.compose.material3.AppBarRowKt;
import androidx.compose.material3.AppBarRowScopeImpl;
import androidx.compose.material3.DefaultModalWideNavigationRailOverride;
import androidx.compose.material3.NavigationBarKt;
import androidx.compose.material3.NavigationItemKt;
import androidx.compose.material3.NavigationRailKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Matrix;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class t6 implements iy {
    public final /* synthetic */ int d;
    public final /* synthetic */ State e;

    public /* synthetic */ t6(State state, int i) {
        this.d = i;
        this.e = state;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        AppBarColumnScopeImpl AppBarColumn$lambda$1$lambda$0;
        AppBarRowScopeImpl AppBarRow$lambda$1$lambda$0;
        boolean ModalWideNavigationRail$lambda$3$lambda$2;
        boolean ModalWideNavigationRail$lambda$6$lambda$5;
        LazyGridIntervalContent rememberLazyGridItemProviderLambda$lambda$0$0;
        LazyLayoutItemProvider LazyLayout$lambda$1$0$0;
        LazyListIntervalContent rememberLazyListItemProviderLambda$lambda$0$0;
        LazyStaggeredGridIntervalContent rememberStaggeredGridItemProviderLambda$lambda$0$0;
        float NavigationBarItem$lambda$15$lambda$12$lambda$11;
        float NavigationBarItem$lambda$15$lambda$14$lambda$13;
        float AnimatedNavigationItem_DQd_Gtc$lambda$26$lambda$23$lambda$22;
        float AnimatedNavigationItem_DQd_Gtc$lambda$26$lambda$25$lambda$24;
        float NavigationItem_8Df7sds$lambda$9$lambda$8$lambda$7;
        float NavigationRailItem$lambda$10$lambda$7$lambda$6;
        float NavigationRailItem$lambda$10$lambda$9$lambda$8;
        RippleAlpha stateLayer$lambda$0;
        Offset animatedSelectionMagnifier$lambda$0$1$0;
        boolean CommonDecorationBox$lambda$18$lambda$7$lambda$6;
        boolean CommonDecorationBox$lambda$18$lambda$10$lambda$9;
        int i = this.d;
        State state = this.e;
        switch (i) {
            case 0:
                AppBarColumn$lambda$1$lambda$0 = AppBarColumnKt.AppBarColumn$lambda$1$lambda$0(state);
                return AppBarColumn$lambda$1$lambda$0;
            case 1:
                AppBarRow$lambda$1$lambda$0 = AppBarRowKt.AppBarRow$lambda$1$lambda$0(state);
                return AppBarRow$lambda$1$lambda$0;
            case 2:
                ModalWideNavigationRail$lambda$3$lambda$2 = DefaultModalWideNavigationRailOverride.ModalWideNavigationRail$lambda$3$lambda$2(state);
                return Boolean.valueOf(ModalWideNavigationRail$lambda$3$lambda$2);
            case 3:
                ModalWideNavigationRail$lambda$6$lambda$5 = DefaultModalWideNavigationRailOverride.ModalWideNavigationRail$lambda$6$lambda$5(state);
                return Boolean.valueOf(ModalWideNavigationRail$lambda$6$lambda$5);
            case 4:
                rememberLazyGridItemProviderLambda$lambda$0$0 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda$lambda$0$0(state);
                return rememberLazyGridItemProviderLambda$lambda$0$0;
            case 5:
                LazyLayout$lambda$1$0$0 = LazyLayoutKt.LazyLayout$lambda$1$0$0(state);
                return LazyLayout$lambda$1$0$0;
            case 6:
                rememberLazyListItemProviderLambda$lambda$0$0 = LazyListItemProviderKt.rememberLazyListItemProviderLambda$lambda$0$0(state);
                return rememberLazyListItemProviderLambda$lambda$0$0;
            case 7:
                rememberStaggeredGridItemProviderLambda$lambda$0$0 = LazyStaggeredGridItemProviderKt.rememberStaggeredGridItemProviderLambda$lambda$0$0(state);
                return rememberStaggeredGridItemProviderLambda$lambda$0$0;
            case 8:
                NavigationBarItem$lambda$15$lambda$12$lambda$11 = NavigationBarKt.NavigationBarItem$lambda$15$lambda$12$lambda$11(state);
                return Float.valueOf(NavigationBarItem$lambda$15$lambda$12$lambda$11);
            case 9:
                NavigationBarItem$lambda$15$lambda$14$lambda$13 = NavigationBarKt.NavigationBarItem$lambda$15$lambda$14$lambda$13(state);
                return Float.valueOf(NavigationBarItem$lambda$15$lambda$14$lambda$13);
            case 10:
                AnimatedNavigationItem_DQd_Gtc$lambda$26$lambda$23$lambda$22 = NavigationItemKt.AnimatedNavigationItem_DQd_Gtc$lambda$26$lambda$23$lambda$22(state);
                return Float.valueOf(AnimatedNavigationItem_DQd_Gtc$lambda$26$lambda$23$lambda$22);
            case 11:
                AnimatedNavigationItem_DQd_Gtc$lambda$26$lambda$25$lambda$24 = NavigationItemKt.AnimatedNavigationItem_DQd_Gtc$lambda$26$lambda$25$lambda$24(state);
                return Float.valueOf(AnimatedNavigationItem_DQd_Gtc$lambda$26$lambda$25$lambda$24);
            case Matrix.TranslateX /* 12 */:
                NavigationItem_8Df7sds$lambda$9$lambda$8$lambda$7 = NavigationItemKt.NavigationItem_8Df7sds$lambda$9$lambda$8$lambda$7(state);
                return Float.valueOf(NavigationItem_8Df7sds$lambda$9$lambda$8$lambda$7);
            case Matrix.TranslateY /* 13 */:
                NavigationRailItem$lambda$10$lambda$7$lambda$6 = NavigationRailKt.NavigationRailItem$lambda$10$lambda$7$lambda$6(state);
                return Float.valueOf(NavigationRailItem$lambda$10$lambda$7$lambda$6);
            case Matrix.TranslateZ /* 14 */:
                NavigationRailItem$lambda$10$lambda$9$lambda$8 = NavigationRailKt.NavigationRailItem$lambda$10$lambda$9$lambda$8(state);
                return Float.valueOf(NavigationRailItem$lambda$10$lambda$9$lambda$8);
            case 15:
                stateLayer$lambda$0 = RippleIndicationInstance.stateLayer$lambda$0(state);
                return stateLayer$lambda$0;
            case 16:
                animatedSelectionMagnifier$lambda$0$1$0 = SelectionMagnifierKt.animatedSelectionMagnifier$lambda$0$1$0(state);
                return animatedSelectionMagnifier$lambda$0$1$0;
            case 17:
                CommonDecorationBox$lambda$18$lambda$7$lambda$6 = TextFieldImplKt.CommonDecorationBox$lambda$18$lambda$7$lambda$6(state);
                return Boolean.valueOf(CommonDecorationBox$lambda$18$lambda$7$lambda$6);
            default:
                CommonDecorationBox$lambda$18$lambda$10$lambda$9 = TextFieldImplKt.CommonDecorationBox$lambda$18$lambda$10$lambda$9(state);
                return Boolean.valueOf(CommonDecorationBox$lambda$18$lambda$10$lambda$9);
        }
    }
}
