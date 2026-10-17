package defpackage;

import android.app.Activity;
import androidx.compose.foundation.contextmenu.ContextMenuColors;
import androidx.compose.foundation.contextmenu.ContextMenuUiKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSlots;
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider_androidKt;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TabKt;
import androidx.compose.material3.TopAppBarDefaults;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class m6 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ m6(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 ProvidePlatformTextContextMenuToolbar$lambda$5;
        w01 ContextMenuPopup$lambda$1;
        LazyStaggeredGridSlots rememberColumnSlots$lambda$0$0;
        LazyStaggeredGridSlots rememberRowSlots$lambda$0$0;
        w01 detectCursorHandleDragGestures$lambda$3;
        int i = this.d;
        w01 w01Var = w01.a;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        int i2 = 1;
        Object obj3 = this.g;
        Object obj4 = this.f;
        Object obj5 = this.e;
        switch (i) {
            case 0:
                ProvidePlatformTextContextMenuToolbar$lambda$5 = AndroidTextContextMenuToolbarProvider_androidKt.ProvidePlatformTextContextMenuToolbar$lambda$5((Modifier) obj5, (MutableState) obj4, (my) obj3, (Composer) obj, ((Integer) obj2).intValue());
                return ProvidePlatformTextContextMenuToolbar$lambda$5;
            case 1:
                List list = (List) obj5;
                PagerState pagerState = (PagerState) obj4;
                un unVar = (un) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((intValue & 3) != 2, intValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2120865123, intValue, -1, "com.lumi.singularity.ui.activities.AppsScreen.<anonymous>.<anonymous>.<anonymous> (AppsActivity.kt:704)");
                    }
                    int i3 = 0;
                    for (Object obj6 : list) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            y80.V();
                            throw null;
                        }
                        String str = (String) ((xe0) obj6).e;
                        boolean z = pagerState.getCurrentPage() == i3;
                        boolean changedInstance = composer.changedInstance(unVar) | composer.changed(pagerState) | composer.changed(i3);
                        Object rememberedValue = composer.rememberedValue();
                        if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                            rememberedValue = new s8(unVar, pagerState, i3, objArr == true ? 1 : 0);
                            composer.updateRememberedValue(rememberedValue);
                        }
                        TabKt.m2498TabwqdebIU(z, (iy) rememberedValue, null, false, ComposableLambdaKt.rememberComposableLambda(775626714, true, new n2(str, i2), composer, 54), null, 0L, 0L, null, composer, 24576, 492);
                        i3 = i4;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return w01Var;
            case 2:
                ky kyVar = (ky) obj5;
                MutableState mutableState = (MutableState) obj4;
                MutableState mutableState2 = (MutableState) obj3;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (composer2.shouldExecute((intValue2 & 3) != 2, intValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1037448838, intValue2, -1, "com.lumi.singularity.ui.activities.AppsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppsActivity.kt:836)");
                    }
                    String str2 = (String) mutableState.getValue();
                    boolean z2 = !(str2 == null || ds0.n0(str2));
                    boolean changed = composer2.changed(z2) | composer2.changed(kyVar);
                    Object rememberedValue2 = composer2.rememberedValue();
                    if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
                        rememberedValue2 = new r9(i2, kyVar, z2, mutableState2);
                        composer2.updateRememberedValue(rememberedValue2);
                    }
                    ButtonKt.Button((iy) rememberedValue2, null, false, RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f)), null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(2072545430, true, new s9(z2, objArr2 == true ? 1 : 0), composer2, 54), composer2, 805306368, 502);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return w01Var;
            case 3:
                ContextMenuPopup$lambda$1 = ContextMenuUiKt.ContextMenuPopup$lambda$1((Modifier) obj5, (ContextMenuColors) obj4, (ky) obj3, (Composer) obj, ((Integer) obj2).intValue());
                return ContextMenuPopup$lambda$1;
            case 4:
                rememberColumnSlots$lambda$0$0 = LazyStaggeredGridDslKt.rememberColumnSlots$lambda$0$0((PaddingValues) obj5, (StaggeredGridCells) obj4, (Arrangement.Horizontal) obj3, (Density) obj, (Constraints) obj2);
                return rememberColumnSlots$lambda$0$0;
            case 5:
                rememberRowSlots$lambda$0$0 = LazyStaggeredGridDslKt.rememberRowSlots$lambda$0$0((PaddingValues) obj5, (StaggeredGridCells) obj4, (Arrangement.Vertical) obj3, (Density) obj, (Constraints) obj2);
                return rememberRowSlots$lambda$0$0;
            case 6:
                String str3 = (String) obj5;
                Activity activity = (Activity) obj4;
                SnapshotStateList snapshotStateList = (SnapshotStateList) obj3;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (composer3.shouldExecute((intValue3 & 3) != 2, intValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1822867599, intValue3, -1, "com.lumi.singularity.ui.activities.TerminalScreen.<anonymous> (TerminalActivity.kt:107)");
                    }
                    ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(129508397, true, new n2(str3, 3), composer3, 54);
                    ComposableLambda rememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(-1373589909, true, new g8(activity, 4), composer3, 54);
                    ComposableLambda rememberComposableLambda3 = ComposableLambdaKt.rememberComposableLambda(-1083149086, true, new x6(snapshotStateList, 12), composer3, 54);
                    TopAppBarDefaults topAppBarDefaults = TopAppBarDefaults.INSTANCE;
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i5 = MaterialTheme.$stable;
                    AppBarKt.m1624TopAppBarGHTll3U(rememberComposableLambda, null, rememberComposableLambda2, rememberComposableLambda3, 0.0f, null, topAppBarDefaults.m2822topAppBarColors5tl4gsc(materialTheme.getColorScheme(composer3, i5).m1781getSurface0d7_KjU(), 0L, 0L, materialTheme.getColorScheme(composer3, i5).m1764getOnSurface0d7_KjU(), 0L, 0L, composer3, TopAppBarDefaults.$stable << 18, 54), null, composer3, 3462, 178);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                return w01Var;
            default:
                detectCursorHandleDragGestures$lambda$3 = TextFieldSelectionState.detectCursorHandleDragGestures$lambda$3((ii0) obj5, (TextFieldSelectionState) obj4, (ii0) obj3, (PointerInputChange) obj, (Offset) obj2);
                return detectCursorHandleDragGestures$lambda$3;
        }
    }
}
