package androidx.compose.material3;

import android.graphics.Outline;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.Window;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.material3.internal.BasicEdgeToEdgeDialog_androidKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.ViewRootForInspector;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.SecureFlagPolicy;
import defpackage.d41;
import defpackage.dq;
import defpackage.fk;
import defpackage.gc;
import defpackage.hd0;
import defpackage.iy;
import defpackage.my;
import defpackage.p01;
import defpackage.p10;
import defpackage.q10;
import defpackage.q31;
import defpackage.r31;
import defpackage.s31;
import defpackage.un;
import defpackage.w01;
import defpackage.y80;
import java.util.UUID;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class ModalBottomSheetDialogWrapper extends fk implements ViewRootForInspector {
    private final View composeView;
    private long contentColor;
    private final ModalBottomSheetDialogLayout dialogLayout;
    private final float maxSupportedElevation;
    private iy onDismissRequest;
    private ModalBottomSheetProperties properties;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class PredictiveBackOnBackPressedCallback extends hd0 {
        private iy onDismissRequest;
        private final Animatable<Float, AnimationVector1D> predictiveBackProgress;
        private final un scope;

        public PredictiveBackOnBackPressedCallback(boolean z, un unVar, Animatable<Float, AnimationVector1D> animatable, iy iyVar) {
            super(z);
            this.scope = unVar;
            this.predictiveBackProgress = animatable;
            this.onDismissRequest = iyVar;
        }

        public final iy getOnDismissRequest() {
            return this.onDismissRequest;
        }

        public final Animatable<Float, AnimationVector1D> getPredictiveBackProgress() {
            return this.predictiveBackProgress;
        }

        public final un getScope() {
            return this.scope;
        }

        @Override // defpackage.hd0
        public void handleOnBackCancelled() {
            p01.t(this.scope, null, null, new ModalBottomSheetDialogWrapper$PredictiveBackOnBackPressedCallback$handleOnBackCancelled$1(this, null), 3);
        }

        @Override // defpackage.hd0
        public void handleOnBackPressed() {
            this.onDismissRequest.invoke();
        }

        @Override // defpackage.hd0
        public void handleOnBackProgressed(gc gcVar) {
            p01.t(this.scope, null, null, new ModalBottomSheetDialogWrapper$PredictiveBackOnBackPressedCallback$handleOnBackProgressed$1(this, gcVar, null), 3);
        }

        @Override // defpackage.hd0
        public void handleOnBackStarted(gc gcVar) {
            p01.t(this.scope, null, null, new ModalBottomSheetDialogWrapper$PredictiveBackOnBackPressedCallback$handleOnBackStarted$1(this, gcVar, null), 3);
        }

        public final void setOnDismissRequest(iy iyVar) {
            this.onDismissRequest = iyVar;
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private ModalBottomSheetDialogWrapper(iy iyVar, ModalBottomSheetProperties modalBottomSheetProperties, long j, View view, LayoutDirection layoutDirection, Density density, UUID uuid, Animatable<Float, AnimationVector1D> animatable, un unVar) {
        super(new ContextThemeWrapper(view.getContext(), R.style.EdgeToEdgeFloatingDialogWindowTheme));
        this.onDismissRequest = iyVar;
        this.properties = modalBottomSheetProperties;
        this.contentColor = j;
        this.composeView = view;
        float m7611constructorimpl = Dp.m7611constructorimpl(8.0f);
        this.maxSupportedElevation = m7611constructorimpl;
        Window window = getWindow();
        if (window == null) {
            defpackage.o.f("Dialog has no window");
            throw null;
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        d41.H(window, false);
        ModalBottomSheetDialogLayout modalBottomSheetDialogLayout = new ModalBottomSheetDialogLayout(getContext(), window);
        modalBottomSheetDialogLayout.setTag(androidx.compose.ui.R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        modalBottomSheetDialogLayout.setClipChildren(false);
        modalBottomSheetDialogLayout.setElevation(density.mo367toPx0680j_4(m7611constructorimpl));
        modalBottomSheetDialogLayout.setOutlineProvider(new ViewOutlineProvider() { // from class: androidx.compose.material3.ModalBottomSheetDialogWrapper$1$2
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view2, Outline outline) {
                outline.setRect(0, 0, view2.getWidth(), view2.getHeight());
                outline.setAlpha(0.0f);
            }
        });
        this.dialogLayout = modalBottomSheetDialogLayout;
        setContentView(modalBottomSheetDialogLayout);
        modalBottomSheetDialogLayout.setTag(com.lumi.singularity.R.id.view_tree_lifecycle_owner, q10.o(view));
        modalBottomSheetDialogLayout.setTag(com.lumi.singularity.R.id.view_tree_view_model_store_owner, p01.n(view));
        modalBottomSheetDialogLayout.setTag(com.lumi.singularity.R.id.view_tree_saved_state_registry_owner, y80.t(view));
        m2144updateParameters9LQNqLg(this.onDismissRequest, this.properties, this.contentColor, layoutDirection);
        window.getDecorView();
        int i = Build.VERSION.SDK_INT;
        p10 s31Var = i >= 35 ? new s31(window) : i >= 30 ? new r31(window) : new q31(window);
        Boolean isAppearanceLightStatusBars$material3 = this.properties.isAppearanceLightStatusBars$material3();
        s31Var.M(isAppearanceLightStatusBars$material3 != null ? isAppearanceLightStatusBars$material3.booleanValue() : ModalBottomSheet_androidKt.m2152isDark8_81llA(this.contentColor));
        Boolean isAppearanceLightNavigationBars$material3 = this.properties.isAppearanceLightNavigationBars$material3();
        s31Var.L(isAppearanceLightNavigationBars$material3 != null ? isAppearanceLightNavigationBars$material3.booleanValue() : ModalBottomSheet_androidKt.m2152isDark8_81llA(this.contentColor));
        getOnBackPressedDispatcher().a(this, new PredictiveBackOnBackPressedCallback(this.properties.getShouldDismissOnBackPress(), unVar, animatable, new f(this, 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 _init_$lambda$3(ModalBottomSheetDialogWrapper modalBottomSheetDialogWrapper) {
        modalBottomSheetDialogWrapper.onDismissRequest.invoke();
        return w01.a;
    }

    private final void setLayoutDirection(LayoutDirection layoutDirection) {
        ModalBottomSheetDialogLayout modalBottomSheetDialogLayout = this.dialogLayout;
        int i = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        int i2 = 1;
        if (i == 1) {
            i2 = 0;
        } else if (i != 2) {
            defpackage.o.n();
            return;
        }
        modalBottomSheetDialogLayout.setLayoutDirection(i2);
    }

    private final void setSecurePolicy(SecureFlagPolicy secureFlagPolicy) {
        boolean shouldApplySecureFlag = BasicEdgeToEdgeDialog_androidKt.shouldApplySecureFlag(secureFlagPolicy, ModalBottomSheet_androidKt.isFlagSecureEnabled(this.composeView));
        Window window = getWindow();
        window.getClass();
        window.setFlags(shouldApplySecureFlag ? 8192 : -8193, 8192);
    }

    public final void disposeComposition() {
        this.dialogLayout.disposeComposition();
    }

    @Override // androidx.compose.ui.platform.ViewRootForInspector
    public AbstractComposeView getSubCompositionView() {
        return this.dialogLayout;
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (onTouchEvent) {
            this.onDismissRequest.invoke();
        }
        return onTouchEvent;
    }

    public final void setContent(CompositionContext compositionContext, my myVar) {
        this.dialogLayout.setContent(compositionContext, myVar);
    }

    /* renamed from: updateParameters-9LQNqLg, reason: not valid java name */
    public final void m2144updateParameters9LQNqLg(iy iyVar, ModalBottomSheetProperties modalBottomSheetProperties, long j, LayoutDirection layoutDirection) {
        this.onDismissRequest = iyVar;
        this.properties = modalBottomSheetProperties;
        this.contentColor = j;
        setSecurePolicy(modalBottomSheetProperties.getSecurePolicy());
        setLayoutDirection(layoutDirection);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(Build.VERSION.SDK_INT >= 30 ? 48 : 16);
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
    }

    public /* synthetic */ ModalBottomSheetDialogWrapper(iy iyVar, ModalBottomSheetProperties modalBottomSheetProperties, long j, View view, LayoutDirection layoutDirection, Density density, UUID uuid, Animatable animatable, un unVar, dq dqVar) {
        this(iyVar, modalBottomSheetProperties, j, view, layoutDirection, density, uuid, animatable, unVar);
    }
}
