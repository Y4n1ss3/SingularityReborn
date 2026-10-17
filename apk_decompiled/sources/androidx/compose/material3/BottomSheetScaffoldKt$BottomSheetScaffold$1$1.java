package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Shape;
import defpackage.iy;
import defpackage.my;
import defpackage.ny;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BottomSheetScaffoldKt$BottomSheetScaffold$1$1 implements my {
    final /* synthetic */ ny $content;
    final /* synthetic */ BottomSheetScaffoldState $scaffoldState;
    final /* synthetic */ long $sheetContainerColor;
    final /* synthetic */ ny $sheetContent;
    final /* synthetic */ long $sheetContentColor;
    final /* synthetic */ my $sheetDragHandle;
    final /* synthetic */ float $sheetMaxWidth;
    final /* synthetic */ float $sheetPeekHeight;
    final /* synthetic */ float $sheetShadowElevation;
    final /* synthetic */ Shape $sheetShape;
    final /* synthetic */ boolean $sheetSwipeEnabled;
    final /* synthetic */ float $sheetTonalElevation;
    final /* synthetic */ ny $snackbarHost;
    final /* synthetic */ my $topBar;

    public BottomSheetScaffoldKt$BottomSheetScaffold$1$1(BottomSheetScaffoldState bottomSheetScaffoldState, my myVar, ny nyVar, float f, float f2, boolean z, Shape shape, long j, long j2, float f3, float f4, my myVar2, ny nyVar2, ny nyVar3) {
        this.$scaffoldState = bottomSheetScaffoldState;
        this.$topBar = myVar;
        this.$content = nyVar;
        this.$sheetPeekHeight = f;
        this.$sheetMaxWidth = f2;
        this.$sheetSwipeEnabled = z;
        this.$sheetShape = shape;
        this.$sheetContainerColor = j;
        this.$sheetContentColor = j2;
        this.$sheetTonalElevation = f3;
        this.$sheetShadowElevation = f4;
        this.$sheetDragHandle = myVar2;
        this.$sheetContent = nyVar2;
        this.$snackbarHost = nyVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invoke$lambda$1$lambda$0(BottomSheetScaffoldState bottomSheetScaffoldState) {
        return bottomSheetScaffoldState.getBottomSheetState().requireOffset();
    }

    public final void invoke(Composer composer, int i) {
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(999829022, i, -1, "androidx.compose.material3.BottomSheetScaffold.<anonymous>.<anonymous> (BottomSheetScaffold.kt:140)");
        }
        SheetState bottomSheetState = this.$scaffoldState.getBottomSheetState();
        my myVar = this.$topBar;
        final ny nyVar = this.$content;
        final float f = this.$sheetPeekHeight;
        ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-519581786, true, new my() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffold$1$1.1
            public final void invoke(Composer composer2, int i2) {
                if (!composer2.shouldExecute((i2 & 3) != 2, i2 & 1)) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-519581786, i2, -1, "androidx.compose.material3.BottomSheetScaffold.<anonymous>.<anonymous>.<anonymous> (BottomSheetScaffold.kt:142)");
                }
                ny.this.invoke(PaddingKt.m759PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, f, 7, null), composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // defpackage.my
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return w01.a;
            }
        }, composer, 54);
        final BottomSheetScaffoldState bottomSheetScaffoldState = this.$scaffoldState;
        final float f2 = this.$sheetPeekHeight;
        final float f3 = this.$sheetMaxWidth;
        final boolean z = this.$sheetSwipeEnabled;
        final Shape shape = this.$sheetShape;
        final long j = this.$sheetContainerColor;
        final long j2 = this.$sheetContentColor;
        final float f4 = this.$sheetTonalElevation;
        final float f5 = this.$sheetShadowElevation;
        final my myVar2 = this.$sheetDragHandle;
        final ny nyVar2 = this.$sheetContent;
        ComposableLambda rememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(-815624571, true, new my() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffold$1$1.2
            public final void invoke(Composer composer2, int i2) {
                if (!composer2.shouldExecute((i2 & 3) != 2, i2 & 1)) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-815624571, i2, -1, "androidx.compose.material3.BottomSheetScaffold.<anonymous>.<anonymous>.<anonymous> (BottomSheetScaffold.kt:147)");
                }
                BottomSheetScaffoldKt.m1648StandardBottomSheetw7I5h1o(BottomSheetScaffoldState.this.getBottomSheetState(), f2, f3, z, shape, j, j2, f4, f5, myVar2, nyVar2, composer2, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // defpackage.my
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return w01.a;
            }
        }, composer, 54);
        final ny nyVar3 = this.$snackbarHost;
        final BottomSheetScaffoldState bottomSheetScaffoldState2 = this.$scaffoldState;
        ComposableLambda rememberComposableLambda3 = ComposableLambdaKt.rememberComposableLambda(-1111667356, true, new my() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffold$1$1.3
            public final void invoke(Composer composer2, int i2) {
                if (!composer2.shouldExecute((i2 & 3) != 2, i2 & 1)) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1111667356, i2, -1, "androidx.compose.material3.BottomSheetScaffold.<anonymous>.<anonymous>.<anonymous> (BottomSheetScaffold.kt:143)");
                }
                ny.this.invoke(bottomSheetScaffoldState2.getSnackbarHostState(), composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // defpackage.my
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return w01.a;
            }
        }, composer, 54);
        boolean changed = composer.changed(this.$scaffoldState);
        BottomSheetScaffoldState bottomSheetScaffoldState3 = this.$scaffoldState;
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new f(bottomSheetScaffoldState3, 0);
            composer.updateRememberedValue(rememberedValue);
        }
        BottomSheetScaffoldKt.BottomSheetScaffoldLayout(myVar, rememberComposableLambda, rememberComposableLambda2, rememberComposableLambda3, (iy) rememberedValue, bottomSheetState, composer, 3504);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Override // defpackage.my
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return w01.a;
    }
}
