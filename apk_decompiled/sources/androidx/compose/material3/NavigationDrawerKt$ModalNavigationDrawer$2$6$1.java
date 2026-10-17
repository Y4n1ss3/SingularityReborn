package androidx.compose.material3;

import androidx.compose.foundation.gestures.AnchoredDraggableKt;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.foundation.gestures.DraggableAnchorsConfig;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import defpackage.gy;
import defpackage.ky;
import defpackage.w01;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NavigationDrawerKt$ModalNavigationDrawer$2$6$1 implements MeasurePolicy {
    final /* synthetic */ MutableState<Boolean> $anchorsInitialized$delegate;
    final /* synthetic */ DrawerState $drawerState;
    final /* synthetic */ float $maxValue;
    final /* synthetic */ MutableFloatState $minValue$delegate;

    public NavigationDrawerKt$ModalNavigationDrawer$2$6$1(DrawerState drawerState, MutableState<Boolean> mutableState, MutableFloatState mutableFloatState, float f) {
        this.$drawerState = drawerState;
        this.$anchorsInitialized$delegate = mutableState;
        this.$minValue$delegate = mutableFloatState;
        this.$maxValue = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measure_3p2s80s$lambda$5(DrawerState drawerState, int i, List list, MutableState mutableState, MutableFloatState mutableFloatState, float f, Placeable.PlacementScope placementScope) {
        boolean ModalNavigationDrawer_FHprtrg$lambda$5;
        boolean ModalNavigationDrawer_FHprtrg$lambda$52;
        float positionOf = drawerState.getAnchoredDraggableState$material3().getAnchors().positionOf(DrawerValue.Closed);
        float f2 = -i;
        ModalNavigationDrawer_FHprtrg$lambda$5 = NavigationDrawerKt.ModalNavigationDrawer_FHprtrg$lambda$5(mutableState);
        if (!ModalNavigationDrawer_FHprtrg$lambda$5 || positionOf != f2) {
            ModalNavigationDrawer_FHprtrg$lambda$52 = NavigationDrawerKt.ModalNavigationDrawer_FHprtrg$lambda$5(mutableState);
            int i2 = 1;
            if (!ModalNavigationDrawer_FHprtrg$lambda$52) {
                NavigationDrawerKt.ModalNavigationDrawer_FHprtrg$lambda$6(mutableState, true);
            }
            mutableFloatState.setFloatValue(f2);
            AnchoredDraggableState.updateAnchors$default(drawerState.getAnchoredDraggableState$material3(), AnchoredDraggableKt.DraggableAnchors(new l(f, i2, mutableFloatState)), null, 2, null);
        }
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            Placeable.PlacementScope.placeRelative$default(placementScope, (Placeable) list.get(i3), 0, 0, 0.0f, 4, null);
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measure_3p2s80s$lambda$5$lambda$3(float f, MutableFloatState mutableFloatState, DraggableAnchorsConfig draggableAnchorsConfig) {
        float floatValue;
        DrawerValue drawerValue = DrawerValue.Closed;
        floatValue = mutableFloatState.getFloatValue();
        draggableAnchorsConfig.at(drawerValue, floatValue);
        draggableAnchorsConfig.at(DrawerValue.Open, f);
        return w01.a;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo5measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        int i;
        Integer valueOf;
        long m7554copyZbe2FdA$default = Constraints.m7554copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null);
        final ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = 1;
            if (i2 >= size) {
                break;
            }
            i2 = gy.a(list.get(i2), m7554copyZbe2FdA$default, arrayList, i2, 1);
        }
        Integer num = null;
        if (arrayList.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((Placeable) arrayList.get(0)).getWidth());
            int size2 = arrayList.size() - 1;
            if (1 <= size2) {
                int i3 = 1;
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((Placeable) arrayList.get(i3)).getWidth());
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i3 == size2) {
                        break;
                    }
                    i3++;
                }
            }
        }
        int intValue = valueOf != null ? valueOf.intValue() : 0;
        if (!arrayList.isEmpty()) {
            Integer valueOf3 = Integer.valueOf(((Placeable) arrayList.get(0)).getHeight());
            int size3 = arrayList.size() - 1;
            if (1 <= size3) {
                while (true) {
                    Integer valueOf4 = Integer.valueOf(((Placeable) arrayList.get(i)).getHeight());
                    if (valueOf4.compareTo(valueOf3) > 0) {
                        valueOf3 = valueOf4;
                    }
                    if (i == size3) {
                        break;
                    }
                    i++;
                }
            }
            num = valueOf3;
        }
        int intValue2 = num != null ? num.intValue() : 0;
        final DrawerState drawerState = this.$drawerState;
        final int i4 = intValue;
        final MutableState<Boolean> mutableState = this.$anchorsInitialized$delegate;
        final MutableFloatState mutableFloatState = this.$minValue$delegate;
        final float f = this.$maxValue;
        return MeasureScope.layout$default(measureScope, i4, intValue2, null, new ky() { // from class: androidx.compose.material3.u0
            @Override // defpackage.ky
            public final Object invoke(Object obj) {
                w01 measure_3p2s80s$lambda$5;
                measure_3p2s80s$lambda$5 = NavigationDrawerKt$ModalNavigationDrawer$2$6$1.measure_3p2s80s$lambda$5(DrawerState.this, i4, arrayList, mutableState, mutableFloatState, f, (Placeable.PlacementScope) obj);
                return measure_3p2s80s$lambda$5;
            }
        }, 4, null);
    }
}
