package androidx.compose.material3.internal;

import android.graphics.Outline;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.Window;
import androidx.compose.material3.ModalBottomSheet_androidKt;
import androidx.compose.material3.R;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.ViewRootForInspector;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.DialogProperties;
import androidx.compose.ui.window.SecureFlagPolicy;
import defpackage.d41;
import defpackage.fk;
import defpackage.iy;
import defpackage.my;
import defpackage.o;
import defpackage.p01;
import defpackage.p10;
import defpackage.q10;
import defpackage.q31;
import defpackage.r31;
import defpackage.s31;
import defpackage.y80;
import java.util.UUID;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class DialogWrapper extends fk implements ViewRootForInspector {
    private final View composeView;
    private final DialogLayout dialogLayout;
    private final float maxSupportedElevation;
    private iy onDismissRequest;
    private DialogProperties properties;

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

    public DialogWrapper(iy iyVar, DialogProperties dialogProperties, View view, LayoutDirection layoutDirection, Density density, UUID uuid, boolean z, boolean z2) {
        super(new ContextThemeWrapper(view.getContext(), R.style.EdgeToEdgeFloatingDialogWindowTheme));
        this.onDismissRequest = iyVar;
        this.properties = dialogProperties;
        this.composeView = view;
        float m7611constructorimpl = Dp.m7611constructorimpl(8.0f);
        this.maxSupportedElevation = m7611constructorimpl;
        Window window = getWindow();
        if (window == null) {
            o.f("Dialog has no window");
            throw null;
        }
        d41.H(window, false);
        DialogLayout dialogLayout = new DialogLayout(getContext(), window);
        dialogLayout.setTag(androidx.compose.ui.R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        dialogLayout.setClipChildren(false);
        dialogLayout.setElevation(density.mo367toPx0680j_4(m7611constructorimpl));
        dialogLayout.setOutlineProvider(new ViewOutlineProvider() { // from class: androidx.compose.material3.internal.DialogWrapper$1$2
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view2, Outline outline) {
                outline.setRect(0, 0, view2.getWidth(), view2.getHeight());
                outline.setAlpha(0.0f);
            }
        });
        this.dialogLayout = dialogLayout;
        setContentView(dialogLayout);
        dialogLayout.setTag(com.lumi.singularity.R.id.view_tree_lifecycle_owner, q10.o(view));
        dialogLayout.setTag(com.lumi.singularity.R.id.view_tree_view_model_store_owner, p01.n(view));
        dialogLayout.setTag(com.lumi.singularity.R.id.view_tree_saved_state_registry_owner, y80.t(view));
        updateParameters(this.onDismissRequest, this.properties, layoutDirection, z, z2);
    }

    private final void setLayoutDirection(LayoutDirection layoutDirection) {
        DialogLayout dialogLayout = this.dialogLayout;
        int i = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        int i2 = 1;
        if (i == 1) {
            i2 = 0;
        } else if (i != 2) {
            o.n();
            return;
        }
        dialogLayout.setLayoutDirection(i2);
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

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (!this.properties.getDismissOnBackPress() || !keyEvent.isTracking() || keyEvent.isCanceled() || i != 111) {
            return super.onKeyUp(i, keyEvent);
        }
        this.onDismissRequest.invoke();
        return true;
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

    public final void updateParameters(iy iyVar, DialogProperties dialogProperties, LayoutDirection layoutDirection, boolean z, boolean z2) {
        this.onDismissRequest = iyVar;
        this.properties = dialogProperties;
        setSecurePolicy(dialogProperties.getSecurePolicy());
        setLayoutDirection(layoutDirection);
        Window window = getWindow();
        if (window != null) {
            window.getDecorView();
            int i = Build.VERSION.SDK_INT;
            p10 s31Var = i >= 35 ? new s31(window) : i >= 30 ? new r31(window) : new q31(window);
            s31Var.M(z);
            s31Var.L(z2);
            window.setLayout(-1, -1);
            window.setSoftInputMode(Build.VERSION.SDK_INT >= 30 ? 48 : 16);
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
    }
}
