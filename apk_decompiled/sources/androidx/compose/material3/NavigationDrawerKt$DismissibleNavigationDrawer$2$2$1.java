package androidx.compose.material3;

import androidx.compose.foundation.gestures.AnchoredDraggableKt;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.foundation.gestures.DraggableAnchorsConfig;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import defpackage.ky;
import defpackage.w01;
import defpackage.y80;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NavigationDrawerKt$DismissibleNavigationDrawer$2$2$1 implements MeasurePolicy {
    final /* synthetic */ MutableState<Boolean> $anchorsInitialized$delegate;
    final /* synthetic */ DrawerState $drawerState;

    public NavigationDrawerKt$DismissibleNavigationDrawer$2$2$1(DrawerState drawerState, MutableState<Boolean> mutableState) {
        this.$drawerState = drawerState;
        this.$anchorsInitialized$delegate = mutableState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measure_3p2s80s$lambda$1(DrawerState drawerState, Placeable placeable, Placeable placeable2, MutableState mutableState, Placeable.PlacementScope placementScope) {
        boolean DismissibleNavigationDrawer$lambda$27;
        boolean DismissibleNavigationDrawer$lambda$272;
        float positionOf = drawerState.getAnchoredDraggableState$material3().getAnchors().positionOf(DrawerValue.Closed);
        final float f = -placeable.getWidth();
        DismissibleNavigationDrawer$lambda$27 = NavigationDrawerKt.DismissibleNavigationDrawer$lambda$27(mutableState);
        if (!DismissibleNavigationDrawer$lambda$27 || positionOf != f) {
            DismissibleNavigationDrawer$lambda$272 = NavigationDrawerKt.DismissibleNavigationDrawer$lambda$27(mutableState);
            if (!DismissibleNavigationDrawer$lambda$272) {
                NavigationDrawerKt.DismissibleNavigationDrawer$lambda$28(mutableState, true);
            }
            AnchoredDraggableState.updateAnchors$default(drawerState.getAnchoredDraggableState$material3(), AnchoredDraggableKt.DraggableAnchors(new ky() { // from class: androidx.compose.material3.t0
                @Override // defpackage.ky
                public final Object invoke(Object obj) {
                    w01 measure_3p2s80s$lambda$1$lambda$0;
                    measure_3p2s80s$lambda$1$lambda$0 = NavigationDrawerKt$DismissibleNavigationDrawer$2$2$1.measure_3p2s80s$lambda$1$lambda$0(f, (DraggableAnchorsConfig) obj);
                    return measure_3p2s80s$lambda$1$lambda$0;
                }
            }), null, 2, null);
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, y80.P(drawerState.requireOffset$material3()) + placeable.getWidth(), 0, 0.0f, 4, null);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, y80.P(drawerState.requireOffset$material3()), 0, 0.0f, 4, null);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measure_3p2s80s$lambda$1$lambda$0(float f, DraggableAnchorsConfig draggableAnchorsConfig) {
        draggableAnchorsConfig.at(DrawerValue.Closed, f);
        draggableAnchorsConfig.at(DrawerValue.Open, 0.0f);
        return w01.a;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo5measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        final Placeable mo6234measureBRTryo0 = list.get(0).mo6234measureBRTryo0(j);
        final Placeable mo6234measureBRTryo02 = list.get(1).mo6234measureBRTryo0(j);
        int width = mo6234measureBRTryo02.getWidth();
        int height = mo6234measureBRTryo02.getHeight();
        final DrawerState drawerState = this.$drawerState;
        final MutableState<Boolean> mutableState = this.$anchorsInitialized$delegate;
        return MeasureScope.layout$default(measureScope, width, height, null, new ky() { // from class: androidx.compose.material3.s0
            @Override // defpackage.ky
            public final Object invoke(Object obj) {
                w01 measure_3p2s80s$lambda$1;
                measure_3p2s80s$lambda$1 = NavigationDrawerKt$DismissibleNavigationDrawer$2$2$1.measure_3p2s80s$lambda$1(DrawerState.this, mo6234measureBRTryo0, mo6234measureBRTryo02, mutableState, (Placeable.PlacementScope) obj);
                return measure_3p2s80s$lambda$1;
            }
        }, 4, null);
    }
}
