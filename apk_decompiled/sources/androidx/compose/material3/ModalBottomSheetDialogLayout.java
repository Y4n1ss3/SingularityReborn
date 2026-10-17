package androidx.compose.material3;

import android.content.Context;
import android.view.Window;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.window.DialogWindowProvider;
import defpackage.my;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class ModalBottomSheetDialogLayout extends AbstractComposeView implements DialogWindowProvider {
    private final MutableState content$delegate;
    private boolean shouldCreateCompositionOnAttachedToWindow;
    private final Window window;

    public ModalBottomSheetDialogLayout(Context context, Window window) {
        super(context, null, 0, 6, null);
        this.window = window;
        this.content$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ComposableSingletons$ModalBottomSheet_androidKt.INSTANCE.m1836getLambda$91331245$material3(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Content$lambda$0(ModalBottomSheetDialogLayout modalBottomSheetDialogLayout, int i, Composer composer, int i2) {
        modalBottomSheetDialogLayout.Content(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    private final my getContent() {
        return (my) this.content$delegate.getValue();
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void Content(Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(576708319);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 0;
        if (startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(576708319, i2, -1, "androidx.compose.material3.ModalBottomSheetDialogLayout.Content (ModalBottomSheet.android.kt:437)");
            }
            getContent().invoke(startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new i0(this, i, i3));
        }
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    @Override // androidx.compose.ui.window.DialogWindowProvider
    public Window getWindow() {
        return this.window;
    }

    public final void setContent(CompositionContext compositionContext, my myVar) {
        setParentCompositionContext(compositionContext);
        setContent(myVar);
        this.shouldCreateCompositionOnAttachedToWindow = true;
        createComposition();
    }

    private final void setContent(my myVar) {
        this.content$delegate.setValue(myVar);
    }
}
