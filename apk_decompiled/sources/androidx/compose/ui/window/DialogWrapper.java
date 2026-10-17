package androidx.compose.ui.window;

import android.graphics.Outline;
import android.os.Build;
import android.os.IBinder;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.ui.R;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.ViewRootForInspector;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.cq;
import defpackage.d41;
import defpackage.f30;
import defpackage.fk;
import defpackage.hd0;
import defpackage.iy;
import defpackage.ky;
import defpackage.my;
import defpackage.o;
import defpackage.p01;
import defpackage.q10;
import defpackage.w01;
import defpackage.y80;
import java.util.UUID;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class DialogWrapper extends fk implements ViewRootForInspector {
    private final View composeView;
    private final DialogLayout dialogLayout;
    private boolean isPressOutside;
    private final float maxSupportedElevation;
    private iy onDismissRequest;
    private DialogProperties properties;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final /* synthetic */ class WhenMappings {
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

    public DialogWrapper(iy iyVar, DialogProperties dialogProperties, View view, LayoutDirection layoutDirection, Density density, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), dialogProperties.getDecorFitsSystemWindows() ? R.style.DialogWindowTheme : R.style.FloatingDialogWindowTheme));
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
        applyWindowTypeAndToken(this.properties);
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        d41.H(window, this.properties.getDecorFitsSystemWindows());
        window.setGravity(17);
        if (!this.properties.getDecorFitsSystemWindows()) {
            window.addFlags(65792);
            WindowManager.LayoutParams attributes = window.getAttributes();
            Api28Impl.INSTANCE.setLayoutInDisplayCutout(attributes);
            if (Build.VERSION.SDK_INT >= 30) {
                Api30Impl api30Impl = Api30Impl.INSTANCE;
                api30Impl.setFitInsetsSides(attributes, 0);
                api30Impl.setFitInsetsTypes(attributes, 0);
            }
            window.setAttributes(attributes);
        }
        DialogLayout dialogLayout = new DialogLayout(getContext(), window);
        setTitle(this.properties.getWindowTitle());
        dialogLayout.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        dialogLayout.setClipChildren(false);
        dialogLayout.setElevation(density.mo367toPx0680j_4(m7611constructorimpl));
        dialogLayout.setOutlineProvider(new ViewOutlineProvider() { // from class: androidx.compose.ui.window.DialogWrapper$1$2
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view2, Outline outline) {
                outline.setRect(0, 0, view2.getWidth(), view2.getHeight());
                outline.setAlpha(0.0f);
            }
        });
        this.dialogLayout = dialogLayout;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            _init_$disableClipping(viewGroup);
        }
        setContentView(dialogLayout);
        dialogLayout.setTag(com.lumi.singularity.R.id.view_tree_lifecycle_owner, q10.o(view));
        dialogLayout.setTag(com.lumi.singularity.R.id.view_tree_view_model_store_owner, p01.n(view));
        dialogLayout.setTag(com.lumi.singularity.R.id.view_tree_saved_state_registry_owner, y80.t(view));
        updateParameters(this.onDismissRequest, this.properties, layoutDirection);
        cq.b(getOnBackPressedDispatcher(), this, new AnonymousClass2());
    }

    private static final void _init_$disableClipping(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof DialogLayout) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                _init_$disableClipping(viewGroup2);
            }
        }
    }

    private final void applyWindowTypeAndToken(DialogProperties dialogProperties) {
        Window window = getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.type = dialogProperties.getWindowType();
            IBinder windowToken = dialogProperties.getWindowToken();
            if (windowToken != null) {
                attributes.token = windowToken;
            }
            window.setAttributes(attributes);
        }
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
        boolean shouldApplySecureFlag = SecureFlagPolicy_androidKt.shouldApplySecureFlag(secureFlagPolicy, AndroidPopup_androidKt.isFlagSecureEnabled(this.composeView));
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
        if (!this.properties.getDismissOnClickOutside() || this.dialogLayout.isInsideContent(motionEvent)) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0 || actionMasked == 1 || actionMasked == 3) {
                this.isPressOutside = false;
                return onTouchEvent;
            }
        } else {
            int actionMasked2 = motionEvent.getActionMasked();
            if (actionMasked2 == 0) {
                this.isPressOutside = true;
                return true;
            }
            if (actionMasked2 != 1) {
                if (actionMasked2 == 3) {
                    this.isPressOutside = false;
                    return onTouchEvent;
                }
            } else if (this.isPressOutside) {
                this.onDismissRequest.invoke();
                this.isPressOutside = false;
                return true;
            }
        }
        return onTouchEvent;
    }

    public final void setContent(CompositionContext compositionContext, my myVar) {
        this.dialogLayout.setContent(compositionContext, myVar);
    }

    public final void updateParameters(iy iyVar, DialogProperties dialogProperties, LayoutDirection layoutDirection) {
        this.onDismissRequest = iyVar;
        this.properties = dialogProperties;
        setSecurePolicy(dialogProperties.getSecurePolicy());
        setLayoutDirection(layoutDirection);
        boolean decorFitsSystemWindows = dialogProperties.getDecorFitsSystemWindows();
        this.dialogLayout.updateProperties(dialogProperties.getUsePlatformDefaultWidth(), decorFitsSystemWindows);
        setCanceledOnTouchOutside(dialogProperties.getDismissOnClickOutside());
        Window window = getWindow();
        if (window != null) {
            window.setSoftInputMode(decorFitsSystemWindows ? 0 : Build.VERSION.SDK_INT < 31 ? 16 : 48);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    /* renamed from: androidx.compose.ui.window.DialogWrapper$2, reason: invalid class name */
    public static final class AnonymousClass2 extends f30 implements ky {
        public AnonymousClass2() {
            super(1);
        }

        public final void invoke(hd0 hd0Var) {
            if (DialogWrapper.this.properties.getDismissOnBackPress()) {
                DialogWrapper.this.onDismissRequest.invoke();
            }
        }

        @Override // defpackage.ky
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((hd0) obj);
            return w01.a;
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
    }
}
