package defpackage;

import androidx.compose.foundation.DefaultDebugIndication;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.OverscrollConfiguration;
import androidx.compose.foundation.OverscrollConfiguration_androidKt;
import androidx.compose.foundation.content.internal.ReceiveContentConfiguration;
import androidx.compose.foundation.content.internal.ReceiveContentConfigurationKt;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.text.selection.PlatformSelectionBehaviors_androidKt;
import androidx.compose.foundation.text.selection.SelectionContainerKt;
import androidx.compose.foundation.text.selection.SelectionRegistrarImpl;
import androidx.compose.material.ripple.DebugRippleTheme;
import androidx.compose.material.ripple.RippleTheme;
import androidx.compose.material3.DefaultNavigationBarOverride;
import androidx.compose.material3.DefaultNavigationRailOverride;
import androidx.compose.material3.InteractiveComponentSizeKt;
import androidx.compose.material3.MaterialThemeKt;
import androidx.compose.material3.MotionScheme;
import androidx.compose.material3.NavigationBarOverride;
import androidx.compose.material3.NavigationRailOverride;
import androidx.compose.material3.RippleConfiguration;
import androidx.compose.material3.RippleKt;
import androidx.compose.material3.SearchBarDefaults;
import androidx.compose.material3.pulltorefresh.PullToRefreshKt;
import androidx.compose.material3.pulltorefresh.PullToRefreshStateImpl;
import androidx.compose.runtime.HostDefaultProvider;
import androidx.compose.runtime.HostDefaultProviderKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.retain.ForgetfulRetainedValuesStore;
import androidx.compose.runtime.retain.ManagedRetainedValuesStoreKt;
import androidx.compose.runtime.retain.RetainManagedRetainedValuesStoreWrapper;
import androidx.compose.runtime.retain.RetainedValuesStore;
import androidx.compose.runtime.retain.RetainedValuesStoreRegistryKt;
import androidx.compose.runtime.retain.RetainedValuesStoreRegistryWrapper;
import androidx.compose.runtime.saveable.SaveableStateHolderImpl;
import androidx.compose.runtime.saveable.SaveableStateHolderKt;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.runtime.tooling.InspectionTablesKt;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.spatial.RectListKt;
import androidx.compose.ui.unit.Dp;
import java.util.Set;
import java.util.UUID;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class ms implements iy {
    public final /* synthetic */ int d;

    public /* synthetic */ ms(int i) {
        this.d = i;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        boolean detectDragGestures$lambda$5;
        w01 w01Var;
        boolean detectDragGestures$lambda$9;
        HostDefaultProvider LocalHostDefaultProvider$lambda$0;
        Indication indication;
        Set LocalInspectionTables$lambda$0;
        boolean LocalMinimumInteractiveComponentEnforcement$lambda$0;
        Dp LocalMinimumInteractiveComponentSize$lambda$1;
        w01 w01Var2;
        RetainedValuesStore retainedValuesStore;
        RetainManagedRetainedValuesStoreWrapper retainManagedRetainedValuesStore$lambda$0$0;
        boolean LocalUsingExpressiveTheme$lambda$3;
        MotionScheme _localMotionScheme$lambda$5;
        UUID randomUUID;
        NavigationBarOverride navigationBarOverride;
        NavigationRailOverride navigationRailOverride;
        OverscrollConfiguration LocalOverscrollConfiguration$lambda$0;
        kn LocalTextClassifierCoroutineContext$lambda$0;
        PullToRefreshStateImpl rememberPullToRefreshState$lambda$3$lambda$2;
        ReceiveContentConfiguration ModifierLocalReceiveContent$lambda$0;
        RetainedValuesStoreRegistryWrapper retainRetainedValuesStoreRegistry$lambda$0$0;
        RippleConfiguration LocalRippleConfiguration$lambda$0;
        RippleTheme rippleTheme;
        SaveableStateHolderImpl rememberSaveableStateHolder$lambda$0$0;
        SaveableStateRegistry LocalSaveableStateRegistry$lambda$0;
        boolean enterAlwaysSearchBarScrollBehavior$lambda$1$lambda$0;
        SelectionRegistrarImpl SelectionContainer$lambda$5$0;
        switch (this.d) {
            case 0:
                detectDragGestures$lambda$5 = DragGestureDetectorKt.detectDragGestures$lambda$5();
                return Boolean.valueOf(detectDragGestures$lambda$5);
            case 1:
                w01Var = w01.a;
                return w01Var;
            case 2:
                detectDragGestures$lambda$9 = DragGestureDetectorKt.detectDragGestures$lambda$9();
                return Boolean.valueOf(detectDragGestures$lambda$9);
            case 3:
                LocalHostDefaultProvider$lambda$0 = HostDefaultProviderKt.LocalHostDefaultProvider$lambda$0();
                return LocalHostDefaultProvider$lambda$0;
            case 4:
                indication = DefaultDebugIndication.INSTANCE;
                return indication;
            case 5:
                LocalInspectionTables$lambda$0 = InspectionTablesKt.LocalInspectionTables$lambda$0();
                return LocalInspectionTables$lambda$0;
            case 6:
                LocalMinimumInteractiveComponentEnforcement$lambda$0 = InteractiveComponentSizeKt.LocalMinimumInteractiveComponentEnforcement$lambda$0();
                return Boolean.valueOf(LocalMinimumInteractiveComponentEnforcement$lambda$0);
            case 7:
                LocalMinimumInteractiveComponentSize$lambda$1 = InteractiveComponentSizeKt.LocalMinimumInteractiveComponentSize$lambda$1();
                return LocalMinimumInteractiveComponentSize$lambda$1;
            case 8:
                w01Var2 = w01.a;
                return w01Var2;
            case 9:
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            case 10:
                retainedValuesStore = ForgetfulRetainedValuesStore.INSTANCE;
                return retainedValuesStore;
            case 11:
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
            case Matrix.TranslateX /* 12 */:
                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            case Matrix.TranslateY /* 13 */:
                retainManagedRetainedValuesStore$lambda$0$0 = ManagedRetainedValuesStoreKt.retainManagedRetainedValuesStore$lambda$0$0();
                return retainManagedRetainedValuesStore$lambda$0$0;
            case Matrix.TranslateZ /* 14 */:
                LocalUsingExpressiveTheme$lambda$3 = MaterialThemeKt.LocalUsingExpressiveTheme$lambda$3();
                return Boolean.valueOf(LocalUsingExpressiveTheme$lambda$3);
            case 15:
                _localMotionScheme$lambda$5 = MaterialThemeKt._localMotionScheme$lambda$5();
                return _localMotionScheme$lambda$5;
            case 16:
                randomUUID = UUID.randomUUID();
                return randomUUID;
            case 17:
                navigationBarOverride = DefaultNavigationBarOverride.INSTANCE;
                return navigationBarOverride;
            case 18:
                navigationRailOverride = DefaultNavigationRailOverride.INSTANCE;
                return navigationRailOverride;
            case 19:
                LocalOverscrollConfiguration$lambda$0 = OverscrollConfiguration_androidKt.LocalOverscrollConfiguration$lambda$0();
                return LocalOverscrollConfiguration$lambda$0;
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                LocalTextClassifierCoroutineContext$lambda$0 = PlatformSelectionBehaviors_androidKt.LocalTextClassifierCoroutineContext$lambda$0();
                return LocalTextClassifierCoroutineContext$lambda$0;
            case 21:
                rememberPullToRefreshState$lambda$3$lambda$2 = PullToRefreshKt.rememberPullToRefreshState$lambda$3$lambda$2();
                return rememberPullToRefreshState$lambda$3$lambda$2;
            case 22:
                ModifierLocalReceiveContent$lambda$0 = ReceiveContentConfigurationKt.ModifierLocalReceiveContent$lambda$0();
                return ModifierLocalReceiveContent$lambda$0;
            case 23:
                retainRetainedValuesStoreRegistry$lambda$0$0 = RetainedValuesStoreRegistryKt.retainRetainedValuesStoreRegistry$lambda$0$0();
                return retainRetainedValuesStoreRegistry$lambda$0$0;
            case 24:
                LocalRippleConfiguration$lambda$0 = RippleKt.LocalRippleConfiguration$lambda$0();
                return LocalRippleConfiguration$lambda$0;
            case RectListKt.BitOffsetForParentId /* 25 */:
                rippleTheme = DebugRippleTheme.INSTANCE;
                return rippleTheme;
            case 26:
                rememberSaveableStateHolder$lambda$0$0 = SaveableStateHolderKt.rememberSaveableStateHolder$lambda$0$0();
                return rememberSaveableStateHolder$lambda$0$0;
            case 27:
                LocalSaveableStateRegistry$lambda$0 = SaveableStateRegistryKt.LocalSaveableStateRegistry$lambda$0();
                return LocalSaveableStateRegistry$lambda$0;
            case 28:
                enterAlwaysSearchBarScrollBehavior$lambda$1$lambda$0 = SearchBarDefaults.enterAlwaysSearchBarScrollBehavior$lambda$1$lambda$0();
                return Boolean.valueOf(enterAlwaysSearchBarScrollBehavior$lambda$1$lambda$0);
            default:
                SelectionContainer$lambda$5$0 = SelectionContainerKt.SelectionContainer$lambda$5$0();
                return SelectionContainer$lambda$5$0;
        }
    }
}
