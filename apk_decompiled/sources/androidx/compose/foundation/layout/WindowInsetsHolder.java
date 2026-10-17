package androidx.compose.foundation.layout;

import android.os.Build;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.a31;
import defpackage.dq;
import defpackage.ky;
import defpackage.m31;
import defpackage.or;
import defpackage.p11;
import defpackage.p31;
import defpackage.pr;
import defpackage.q11;
import defpackage.te0;
import defpackage.u11;
import defpackage.v00;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WindowInsetsHolder {
    private static boolean testInsets;
    private int accessCount;
    private final AndroidWindowInsets captionBar;
    private final ValueInsets captionBarIgnoringVisibility;
    private final boolean consumes;
    private final MutableState cutoutPath$delegate;
    private final AndroidWindowInsets displayCutout;
    private final AndroidWindowInsets ime;
    private final ValueInsets imeAnimationSource;
    private final ValueInsets imeAnimationTarget;
    private final InsetsListener insetsListener;
    private final AndroidWindowInsets mandatorySystemGestures;
    private final AndroidWindowInsets navigationBars;
    private final ValueInsets navigationBarsIgnoringVisibility;
    private final WindowInsets safeContent;
    private final WindowInsets safeDrawing;
    private final WindowInsets safeGestures;
    private final AndroidWindowInsets statusBars;
    private final ValueInsets statusBarsIgnoringVisibility;
    private final AndroidWindowInsets systemBars;
    private final ValueInsets systemBarsIgnoringVisibility;
    private final AndroidWindowInsets systemGestures;
    private final AndroidWindowInsets tappableElement;
    private final ValueInsets tappableElementIgnoringVisibility;
    private final ValueInsets waterfall;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final WeakHashMap<View, WindowInsetsHolder> viewMap = new WeakHashMap<>();

    /* JADX WARN: Removed duplicated region for block: B:18:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private WindowInsetsHolder(p31 p31Var, View view) {
        AndroidWindowInsets androidWindowInsets;
        Path path;
        p31 a;
        pr f;
        pr f2;
        Companion companion = Companion;
        AndroidWindowInsets systemInsets = companion.systemInsets(p31Var, 4, "captionBar");
        this.captionBar = systemInsets;
        AndroidWindowInsets systemInsets2 = companion.systemInsets(p31Var, Fields.SpotShadowColor, "displayCutout");
        this.displayCutout = systemInsets2;
        AndroidWindowInsets systemInsets3 = companion.systemInsets(p31Var, 8, "ime");
        this.ime = systemInsets3;
        AndroidWindowInsets systemInsets4 = companion.systemInsets(p31Var, 32, "mandatorySystemGestures");
        this.mandatorySystemGestures = systemInsets4;
        AndroidWindowInsets systemInsets5 = companion.systemInsets(p31Var, 2, "navigationBars");
        this.navigationBars = systemInsets5;
        AndroidWindowInsets systemInsets6 = companion.systemInsets(p31Var, 1, "statusBars");
        this.statusBars = systemInsets6;
        AndroidWindowInsets systemInsets7 = companion.systemInsets(p31Var, 519, "systemBars");
        this.systemBars = systemInsets7;
        AndroidWindowInsets systemInsets8 = companion.systemInsets(p31Var, 16, "systemGestures");
        this.systemGestures = systemInsets8;
        AndroidWindowInsets systemInsets9 = companion.systemInsets(p31Var, 64, "tappableElement");
        this.tappableElement = systemInsets9;
        v00 v00Var = v00.e;
        ValueInsets ValueInsets = WindowInsets_androidKt.ValueInsets((p31Var == null || (f2 = p31Var.a.f()) == null) ? v00Var : f2.a(), "waterfall");
        this.waterfall = ValueInsets;
        if (p31Var == null || (f = p31Var.a.f()) == null) {
            androidWindowInsets = systemInsets6;
        } else {
            androidWindowInsets = systemInsets6;
            android.graphics.Path a2 = Build.VERSION.SDK_INT >= 31 ? or.a(f.a) : null;
            if (a2 != null) {
                path = AndroidPath_androidKt.asComposePath(a2);
                this.cutoutPath$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(path, null, 2, null);
                WindowInsets union = WindowInsetsKt.union(WindowInsetsKt.union(systemInsets7, systemInsets3), systemInsets2);
                this.safeDrawing = union;
                WindowInsets union2 = WindowInsetsKt.union(WindowInsetsKt.union(WindowInsetsKt.union(systemInsets9, systemInsets4), systemInsets8), ValueInsets);
                this.safeGestures = union2;
                this.safeContent = WindowInsetsKt.union(union, union2);
                this.captionBarIgnoringVisibility = companion.valueInsetsIgnoringVisibility(p31Var, 4, "captionBarIgnoringVisibility");
                this.navigationBarsIgnoringVisibility = companion.valueInsetsIgnoringVisibility(p31Var, 2, "navigationBarsIgnoringVisibility");
                this.statusBarsIgnoringVisibility = companion.valueInsetsIgnoringVisibility(p31Var, 1, "statusBarsIgnoringVisibility");
                this.systemBarsIgnoringVisibility = companion.valueInsetsIgnoringVisibility(p31Var, 519, "systemBarsIgnoringVisibility");
                this.tappableElementIgnoringVisibility = companion.valueInsetsIgnoringVisibility(p31Var, 64, "tappableElementIgnoringVisibility");
                this.imeAnimationTarget = WindowInsets_androidKt.ValueInsets(v00Var, "imeAnimationTarget");
                this.imeAnimationSource = WindowInsets_androidKt.ValueInsets(v00Var, "imeAnimationSource");
                Object parent = view.getParent();
                View view2 = !(parent instanceof View) ? (View) parent : null;
                Object tag = view2 == null ? view2.getTag(androidx.compose.ui.R.id.consume_window_insets_tag) : null;
                Boolean bool = !(tag instanceof Boolean) ? (Boolean) tag : null;
                this.consumes = bool == null ? bool.booleanValue() : false;
                this.insetsListener = new InsetsListener(this);
                int i = u11.a;
                a = q11.a(view);
                if (a == null) {
                    m31 m31Var = a.a;
                    systemInsets.setVisible(m31Var.q(4));
                    systemInsets2.setVisible(m31Var.q(Fields.SpotShadowColor));
                    systemInsets3.setVisible(m31Var.q(8));
                    systemInsets4.setVisible(m31Var.q(32));
                    systemInsets5.setVisible(m31Var.q(2));
                    androidWindowInsets.setVisible(m31Var.q(1));
                    systemInsets7.setVisible(m31Var.q(519));
                    systemInsets8.setVisible(m31Var.q(16));
                    systemInsets9.setVisible(m31Var.q(64));
                    return;
                }
                return;
            }
        }
        path = null;
        this.cutoutPath$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(path, null, 2, null);
        WindowInsets union3 = WindowInsetsKt.union(WindowInsetsKt.union(systemInsets7, systemInsets3), systemInsets2);
        this.safeDrawing = union3;
        WindowInsets union22 = WindowInsetsKt.union(WindowInsetsKt.union(WindowInsetsKt.union(systemInsets9, systemInsets4), systemInsets8), ValueInsets);
        this.safeGestures = union22;
        this.safeContent = WindowInsetsKt.union(union3, union22);
        this.captionBarIgnoringVisibility = companion.valueInsetsIgnoringVisibility(p31Var, 4, "captionBarIgnoringVisibility");
        this.navigationBarsIgnoringVisibility = companion.valueInsetsIgnoringVisibility(p31Var, 2, "navigationBarsIgnoringVisibility");
        this.statusBarsIgnoringVisibility = companion.valueInsetsIgnoringVisibility(p31Var, 1, "statusBarsIgnoringVisibility");
        this.systemBarsIgnoringVisibility = companion.valueInsetsIgnoringVisibility(p31Var, 519, "systemBarsIgnoringVisibility");
        this.tappableElementIgnoringVisibility = companion.valueInsetsIgnoringVisibility(p31Var, 64, "tappableElementIgnoringVisibility");
        this.imeAnimationTarget = WindowInsets_androidKt.ValueInsets(v00Var, "imeAnimationTarget");
        this.imeAnimationSource = WindowInsets_androidKt.ValueInsets(v00Var, "imeAnimationSource");
        Object parent2 = view.getParent();
        if (!(parent2 instanceof View)) {
        }
        if (view2 == null) {
        }
        if (!(tag instanceof Boolean)) {
        }
        this.consumes = bool == null ? bool.booleanValue() : false;
        this.insetsListener = new InsetsListener(this);
        int i2 = u11.a;
        a = q11.a(view);
        if (a == null) {
        }
    }

    private final void setCutoutPath(Path path) {
        this.cutoutPath$delegate.setValue(path);
    }

    public static /* synthetic */ void update$default(WindowInsetsHolder windowInsetsHolder, p31 p31Var, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        windowInsetsHolder.update(p31Var, i);
    }

    public final void decrementAccessors(View view) {
        int i = this.accessCount - 1;
        this.accessCount = i;
        if (i == 0) {
            int i2 = u11.a;
            p11.g(view, null);
            a31.a(view, null);
            view.removeOnAttachStateChangeListener(this.insetsListener);
        }
    }

    public final AndroidWindowInsets getCaptionBar() {
        return this.captionBar;
    }

    public final ValueInsets getCaptionBarIgnoringVisibility() {
        return this.captionBarIgnoringVisibility;
    }

    public final boolean getConsumes() {
        return this.consumes;
    }

    public final Path getCutoutPath() {
        return (Path) this.cutoutPath$delegate.getValue();
    }

    public final AndroidWindowInsets getDisplayCutout() {
        return this.displayCutout;
    }

    public final AndroidWindowInsets getIme() {
        return this.ime;
    }

    public final ValueInsets getImeAnimationSource() {
        return this.imeAnimationSource;
    }

    public final ValueInsets getImeAnimationTarget() {
        return this.imeAnimationTarget;
    }

    public final AndroidWindowInsets getMandatorySystemGestures() {
        return this.mandatorySystemGestures;
    }

    public final AndroidWindowInsets getNavigationBars() {
        return this.navigationBars;
    }

    public final ValueInsets getNavigationBarsIgnoringVisibility() {
        return this.navigationBarsIgnoringVisibility;
    }

    public final WindowInsets getSafeContent() {
        return this.safeContent;
    }

    public final WindowInsets getSafeDrawing() {
        return this.safeDrawing;
    }

    public final WindowInsets getSafeGestures() {
        return this.safeGestures;
    }

    public final AndroidWindowInsets getStatusBars() {
        return this.statusBars;
    }

    public final ValueInsets getStatusBarsIgnoringVisibility() {
        return this.statusBarsIgnoringVisibility;
    }

    public final AndroidWindowInsets getSystemBars() {
        return this.systemBars;
    }

    public final ValueInsets getSystemBarsIgnoringVisibility() {
        return this.systemBarsIgnoringVisibility;
    }

    public final AndroidWindowInsets getSystemGestures() {
        return this.systemGestures;
    }

    public final AndroidWindowInsets getTappableElement() {
        return this.tappableElement;
    }

    public final ValueInsets getTappableElementIgnoringVisibility() {
        return this.tappableElementIgnoringVisibility;
    }

    public final ValueInsets getWaterfall() {
        return this.waterfall;
    }

    public final void incrementAccessors(View view) {
        if (this.accessCount == 0) {
            InsetsListener insetsListener = this.insetsListener;
            int i = u11.a;
            p11.g(view, insetsListener);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(this.insetsListener);
            a31.a(view, this.insetsListener);
        }
        this.accessCount++;
    }

    public final void update(p31 p31Var, int i) {
        Path path = null;
        if (testInsets) {
            android.view.WindowInsets b = p31Var.b();
            b.getClass();
            p31Var = p31.c(b, null);
        }
        this.captionBar.update$foundation_layout(p31Var, i);
        this.ime.update$foundation_layout(p31Var, i);
        this.displayCutout.update$foundation_layout(p31Var, i);
        this.navigationBars.update$foundation_layout(p31Var, i);
        this.statusBars.update$foundation_layout(p31Var, i);
        this.systemBars.update$foundation_layout(p31Var, i);
        this.systemGestures.update$foundation_layout(p31Var, i);
        this.tappableElement.update$foundation_layout(p31Var, i);
        this.mandatorySystemGestures.update$foundation_layout(p31Var, i);
        if (i == 0) {
            ValueInsets valueInsets = this.captionBarIgnoringVisibility;
            m31 m31Var = p31Var.a;
            valueInsets.setValue$foundation_layout(WindowInsets_androidKt.toInsetsValues(m31Var.h(4)));
            this.navigationBarsIgnoringVisibility.setValue$foundation_layout(WindowInsets_androidKt.toInsetsValues(m31Var.h(2)));
            this.statusBarsIgnoringVisibility.setValue$foundation_layout(WindowInsets_androidKt.toInsetsValues(m31Var.h(1)));
            this.systemBarsIgnoringVisibility.setValue$foundation_layout(WindowInsets_androidKt.toInsetsValues(m31Var.h(519)));
            this.tappableElementIgnoringVisibility.setValue$foundation_layout(WindowInsets_androidKt.toInsetsValues(m31Var.h(64)));
            pr f = m31Var.f();
            this.waterfall.setValue$foundation_layout(WindowInsets_androidKt.toInsetsValues(f != null ? f.a() : v00.e));
            if (f != null) {
                android.graphics.Path a = Build.VERSION.SDK_INT >= 31 ? or.a(f.a) : null;
                if (a != null) {
                    path = AndroidPath_androidKt.asComposePath(a);
                }
            }
            setCutoutPath(path);
        }
        Snapshot.Companion.sendApplyNotifications();
    }

    public final void updateImeAnimationSource(p31 p31Var) {
        this.imeAnimationSource.setValue$foundation_layout(WindowInsets_androidKt.toInsetsValues(p31Var.a.g(8)));
    }

    public final void updateImeAnimationTarget(p31 p31Var) {
        this.imeAnimationTarget.setValue$foundation_layout(WindowInsets_androidKt.toInsetsValues(p31Var.a.g(8)));
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final DisposableEffectResult current$lambda$0$0(final WindowInsetsHolder windowInsetsHolder, final View view, DisposableEffectScope disposableEffectScope) {
            windowInsetsHolder.incrementAccessors(view);
            return new DisposableEffectResult() { // from class: androidx.compose.foundation.layout.WindowInsetsHolder$Companion$current$lambda$0$0$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                    WindowInsetsHolder.this.decrementAccessors(view);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final AndroidWindowInsets systemInsets(p31 p31Var, int i, String str) {
            AndroidWindowInsets androidWindowInsets = new AndroidWindowInsets(i, str);
            if (p31Var != null) {
                androidWindowInsets.update$foundation_layout(p31Var, i);
            }
            return androidWindowInsets;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ValueInsets valueInsetsIgnoringVisibility(p31 p31Var, int i, String str) {
            v00 v00Var;
            if (p31Var == null || (v00Var = p31Var.a.h(i)) == null) {
                v00Var = v00.e;
            }
            return WindowInsets_androidKt.ValueInsets(v00Var, str);
        }

        public final WindowInsetsHolder current(Composer composer, int i) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1366542614, i, -1, "androidx.compose.foundation.layout.WindowInsetsHolder.Companion.current (WindowInsets.android.kt:574)");
            }
            View view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
            WindowInsetsHolder orCreateFor = getOrCreateFor(view);
            boolean changedInstance = composer.changedInstance(orCreateFor) | composer.changedInstance(view);
            Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new te0(26, orCreateFor, view);
                composer.updateRememberedValue(rememberedValue);
            }
            EffectsKt.DisposableEffect(orCreateFor, (ky) rememberedValue, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return orCreateFor;
        }

        public final WindowInsetsHolder getOrCreateFor(View view) {
            WindowInsetsHolder windowInsetsHolder;
            synchronized (WindowInsetsHolder.viewMap) {
                try {
                    WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
                    Object obj = weakHashMap.get(view);
                    Object obj2 = obj;
                    if (obj == null) {
                        WindowInsetsHolder windowInsetsHolder2 = new WindowInsetsHolder(null, view, false ? 1 : 0);
                        weakHashMap.put(view, windowInsetsHolder2);
                        obj2 = windowInsetsHolder2;
                    }
                    windowInsetsHolder = (WindowInsetsHolder) obj2;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return windowInsetsHolder;
        }

        public final void setUseTestInsets(boolean z) {
            WindowInsetsHolder.testInsets = z;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getConsumes$annotations() {
    }

    public /* synthetic */ WindowInsetsHolder(p31 p31Var, View view, dq dqVar) {
        this(p31Var, view);
    }
}
