package androidx.compose.ui.platform;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import defpackage.dq;
import defpackage.my;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ComposeView extends AbstractComposeView {
    private final MutableState<my> content;
    private boolean shouldCreateCompositionOnAttachedToWindow;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ ComposeView(Context context, AttributeSet attributeSet, int i, int i2, dq dqVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void Content(Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(420213850);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(420213850, i2, -1, "androidx.compose.ui.platform.ComposeView.Content (ComposeView.android.kt:619)");
            }
            my value = this.content.getValue();
            if (value == null) {
                startRestartGroup.startReplaceGroup(-1238823553);
            } else {
                startRestartGroup.startReplaceGroup(98585282);
                value.invoke(startRestartGroup, 0);
            }
            startRestartGroup.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ComposeView$Content$1(this, i));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.compose.ui.platform.ComposeView";
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    public final void setContent(my myVar) {
        this.shouldCreateCompositionOnAttachedToWindow = true;
        this.content.setValue(myVar);
        if (isAttachedToWindow() || getComposeViewContext$ui() != null) {
            createComposition();
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        private Companion() {
        }
    }

    public ComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ComposeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.content = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    public ComposeView(Context context) {
        this(context, null, 0, 6, null);
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}
