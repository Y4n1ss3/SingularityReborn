package androidx.compose.material3;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.compose.material3.internal.PredictiveBack;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.DialogWindowProvider;
import defpackage.iy;
import defpackage.ky;
import defpackage.my;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class ModalWideNavigationRailDialogLayout extends AbstractComposeView implements DialogWindowProvider {
    private Object backCallback;
    private final MutableState content$delegate;
    private final LayoutDirection layoutDirection;
    private final iy onDismissRequest;
    private final ky onPredictiveBack;
    private final iy onPredictiveBackCancelled;
    private final RailPredictiveBackState predictiveBackState;
    private boolean shouldCreateCompositionOnAttachedToWindow;
    private final boolean shouldDismissOnBackPress;
    private final Window window;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Api33Impl {
        public static final Api33Impl INSTANCE = new Api33Impl();

        private Api33Impl() {
        }

        public static final OnBackInvokedCallback createBackCallback(final iy iyVar) {
            return new OnBackInvokedCallback() { // from class: androidx.compose.material3.o0
                public final void onBackInvoked() {
                    iy.this.invoke();
                }
            };
        }

        public static final void maybeRegisterBackCallback(View view, Object obj) {
            OnBackInvokedDispatcher findOnBackInvokedDispatcher;
            if (!(obj instanceof OnBackInvokedCallback) || (findOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
                return;
            }
            findOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj);
        }

        public static final void maybeUnregisterBackCallback(View view, Object obj) {
            OnBackInvokedDispatcher findOnBackInvokedDispatcher;
            if (!(obj instanceof OnBackInvokedCallback) || (findOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
                return;
            }
            findOnBackInvokedDispatcher.unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Api34Impl {
        public static final Api34Impl INSTANCE = new Api34Impl();

        private Api34Impl() {
        }

        public static final OnBackAnimationCallback createBackCallback(final iy iyVar, final ky kyVar, final iy iyVar2, final RailPredictiveBackState railPredictiveBackState, final LayoutDirection layoutDirection) {
            return new OnBackAnimationCallback() { // from class: androidx.compose.material3.ModalWideNavigationRailDialogLayout$Api34Impl$createBackCallback$1
                public void onBackCancelled() {
                    iyVar2.invoke();
                }

                public void onBackInvoked() {
                    iyVar.invoke();
                }

                public void onBackProgressed(BackEvent backEvent) {
                    RailPredictiveBackState.this.update(backEvent.getSwipeEdge() == 0, layoutDirection == LayoutDirection.Rtl);
                    kyVar.invoke(Float.valueOf(PredictiveBack.INSTANCE.transform$material3(backEvent.getProgress())));
                }

                public void onBackStarted(BackEvent backEvent) {
                    RailPredictiveBackState.this.update(backEvent.getSwipeEdge() == 0, layoutDirection == LayoutDirection.Rtl);
                    kyVar.invoke(Float.valueOf(PredictiveBack.INSTANCE.transform$material3(backEvent.getProgress())));
                }
            };
        }
    }

    public ModalWideNavigationRailDialogLayout(Context context, Window window, boolean z, iy iyVar, ky kyVar, iy iyVar2, RailPredictiveBackState railPredictiveBackState, LayoutDirection layoutDirection) {
        super(context, null, 0, 6, null);
        this.window = window;
        this.shouldDismissOnBackPress = z;
        this.onDismissRequest = iyVar;
        this.onPredictiveBack = kyVar;
        this.onPredictiveBackCancelled = iyVar2;
        this.predictiveBackState = railPredictiveBackState;
        this.layoutDirection = layoutDirection;
        this.content$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ComposableSingletons$WideNavigationRail_androidKt.INSTANCE.getLambda$2011757776$material3(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Content$lambda$0(ModalWideNavigationRailDialogLayout modalWideNavigationRailDialogLayout, int i, Composer composer, int i2) {
        modalWideNavigationRailDialogLayout.Content(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    private final my getContent() {
        return (my) this.content$delegate.getValue();
    }

    private final void maybeRegisterBackCallback() {
        int i;
        if (!this.shouldDismissOnBackPress || (i = Build.VERSION.SDK_INT) < 33) {
            return;
        }
        Object obj = this.backCallback;
        if (obj == null) {
            iy iyVar = this.onDismissRequest;
            obj = i >= 34 ? Api34Impl.createBackCallback(iyVar, this.onPredictiveBack, this.onPredictiveBackCancelled, this.predictiveBackState, this.layoutDirection) : Api33Impl.createBackCallback(iyVar);
            this.backCallback = obj;
        }
        Api33Impl.maybeRegisterBackCallback(this, obj);
    }

    private final void maybeUnregisterBackCallback() {
        if (Build.VERSION.SDK_INT >= 33) {
            Api33Impl.maybeUnregisterBackCallback(this, this.backCallback);
        }
        this.backCallback = null;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void Content(Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-640057148);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 1;
        if (startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-640057148, i2, -1, "androidx.compose.material3.ModalWideNavigationRailDialogLayout.Content (WideNavigationRail.android.kt:202)");
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

    public final boolean getShouldDismissOnBackPress() {
        return this.shouldDismissOnBackPress;
    }

    @Override // androidx.compose.ui.window.DialogWindowProvider
    public Window getWindow() {
        return this.window;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        maybeRegisterBackCallback();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        maybeUnregisterBackCallback();
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
