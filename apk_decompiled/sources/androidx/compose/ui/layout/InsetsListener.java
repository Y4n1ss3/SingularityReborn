package androidx.compose.ui.layout;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.layout.WindowInsetsRulers;
import androidx.compose.ui.platform.AndroidComposeView;
import defpackage.a31;
import defpackage.fb0;
import defpackage.fd0;
import defpackage.g10;
import defpackage.m31;
import defpackage.p11;
import defpackage.p31;
import defpackage.pl0;
import defpackage.pr;
import defpackage.q10;
import defpackage.q21;
import defpackage.r21;
import defpackage.u11;
import defpackage.v00;
import defpackage.xa0;
import defpackage.z21;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class InsetsListener extends r21 implements Runnable, fd0, View.OnAttachStateChangeListener {
    public static final int $stable = 8;
    private final AndroidComposeView composeView;
    private final SnapshotStateList<RectRulers> displayCutoutRulers;
    private final xa0 displayCutouts;
    private final MutableIntState generation;
    private final pl0 insetsValues;
    private boolean prepared;
    private int runningAnimationMask;
    private p31 savedInsets;

    public InsetsListener(AndroidComposeView androidComposeView) {
        super(1);
        this.composeView = androidComposeView;
        fb0 fb0Var = new fb0(9);
        WindowInsetsRulers.Companion companion = WindowInsetsRulers.Companion;
        fb0Var.l(companion.getCaptionBar(), new WindowWindowInsetsAnimationValues("caption bar"));
        fb0Var.l(companion.getDisplayCutout(), new WindowWindowInsetsAnimationValues("display cutout"));
        fb0Var.l(companion.getIme(), new WindowWindowInsetsAnimationValues("ime"));
        fb0Var.l(companion.getMandatorySystemGestures(), new WindowWindowInsetsAnimationValues("mandatory system gestures"));
        fb0Var.l(companion.getNavigationBars(), new WindowWindowInsetsAnimationValues("navigation bars"));
        fb0Var.l(companion.getStatusBars(), new WindowWindowInsetsAnimationValues("status bars"));
        fb0Var.l(companion.getSystemGestures(), new WindowWindowInsetsAnimationValues("system gestures"));
        fb0Var.l(companion.getTappableElement(), new WindowWindowInsetsAnimationValues("tappable element"));
        fb0Var.l(companion.getWaterfall(), new WindowWindowInsetsAnimationValues("waterfall"));
        this.insetsValues = fb0Var;
        this.generation = SnapshotIntStateKt.mutableIntStateOf(0);
        this.displayCutouts = new xa0(4);
        this.displayCutoutRulers = SnapshotStateKt.mutableStateListOf();
    }

    private final void stopAnimationForRuler(WindowWindowInsetsAnimationValues windowWindowInsetsAnimationValues) {
        windowWindowInsetsAnimationValues.setAnimating(false);
        windowWindowInsetsAnimationValues.m6389setSourceValueInsetsYnlvx88(ValueInsets_androidKt.getUnsetValueInsets());
        windowWindowInsetsAnimationValues.m6390setTargetValueInsetsYnlvx88(ValueInsets_androidKt.getUnsetValueInsets());
    }

    private final void updateInsetAnimationInfo(WindowWindowInsetsAnimationValues windowWindowInsetsAnimationValues, a31 a31Var) {
        windowWindowInsetsAnimationValues.setFraction(a31Var.a.c());
        z21 z21Var = a31Var.a;
        windowWindowInsetsAnimationValues.setAlpha(z21Var.a());
        windowWindowInsetsAnimationValues.setDurationMillis(z21Var.b());
    }

    private final void updateInsets(p31 p31Var) {
        g10 g10Var;
        char c;
        char c2;
        boolean z;
        char c3;
        boolean z2;
        boolean z3;
        long m6372constructorimpl;
        long[] jArr;
        int[] iArr;
        Object[] objArr;
        long[] jArr2;
        int[] iArr2;
        Object[] objArr2;
        long j;
        char c4;
        int i;
        g10Var = WindowInsetsRulers_androidKt.WindowInsetsTypeMap;
        int[] iArr3 = g10Var.b;
        Object[] objArr3 = g10Var.c;
        long[] jArr3 = g10Var.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i2 = 0;
            z2 = false;
            z3 = false;
            char c5 = 16;
            c = ' ';
            while (true) {
                long j2 = jArr3[i2];
                c2 = '0';
                z = true;
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((j2 & 255) < 128) {
                            int i6 = (i2 << 3) + i5;
                            c4 = c5;
                            int i7 = iArr3[i6];
                            WindowInsetsRulers windowInsetsRulers = (WindowInsetsRulers) objArr3[i6];
                            m31 m31Var = p31Var.a;
                            jArr2 = jArr3;
                            v00 g = m31Var.g(i7);
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            long m6372constructorimpl2 = ValueInsets.m6372constructorimpl((g.a << 48) | (g.b << 32) | (g.c << c4) | g.d);
                            Object d = this.insetsValues.d(windowInsetsRulers);
                            d.getClass();
                            WindowWindowInsetsAnimationValues windowWindowInsetsAnimationValues = (WindowWindowInsetsAnimationValues) d;
                            j = j2;
                            if (!ValueInsets.m6374equalsimpl0(m6372constructorimpl2, windowWindowInsetsAnimationValues.m6383getCurrenthdzbrEE())) {
                                windowWindowInsetsAnimationValues.m6387setCurrentYnlvx88(m6372constructorimpl2);
                                z2 = true;
                                if (!ValueInsets.m6374equalsimpl0(m6372constructorimpl2, ValueInsets_androidKt.getZeroValueInsets())) {
                                    z3 = true;
                                }
                            }
                            if (i7 != 8) {
                                v00 h = m31Var.h(i7);
                                long m6372constructorimpl3 = ValueInsets.m6372constructorimpl(h.d | (h.a << 48) | (h.b << 32) | (h.c << c4));
                                if (!ValueInsets.m6374equalsimpl0(windowWindowInsetsAnimationValues.m6384getMaximumhdzbrEE(), m6372constructorimpl3)) {
                                    windowWindowInsetsAnimationValues.m6388setMaximumYnlvx88(m6372constructorimpl3);
                                    z2 = true;
                                    if (!ValueInsets.m6374equalsimpl0(m6372constructorimpl3, ValueInsets_androidKt.getZeroValueInsets())) {
                                        z3 = true;
                                    }
                                }
                            }
                            windowWindowInsetsAnimationValues.setVisible(m31Var.q(i7));
                            i = 8;
                        } else {
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            j = j2;
                            c4 = c5;
                            i = i3;
                        }
                        j2 = j >> i;
                        i5++;
                        i3 = i;
                        c5 = c4;
                        jArr3 = jArr2;
                        iArr3 = iArr2;
                        objArr3 = objArr2;
                    }
                    jArr = jArr3;
                    iArr = iArr3;
                    objArr = objArr3;
                    c3 = c5;
                    if (i4 != i3) {
                        break;
                    }
                } else {
                    jArr = jArr3;
                    iArr = iArr3;
                    objArr = objArr3;
                    c3 = c5;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                c5 = c3;
                jArr3 = jArr;
                iArr3 = iArr;
                objArr3 = objArr;
            }
        } else {
            c = ' ';
            c2 = '0';
            z = true;
            c3 = 16;
            z2 = false;
            z3 = false;
        }
        pr f = p31Var.a.f();
        if (f == null) {
            m6372constructorimpl = ValueInsets_androidKt.getZeroValueInsets();
        } else {
            v00 a = f.a();
            m6372constructorimpl = ValueInsets.m6372constructorimpl((a.a << c2) | (a.b << c) | (a.c << c3) | a.d);
        }
        Object d2 = this.insetsValues.d(WindowInsetsRulers.Companion.getWaterfall());
        d2.getClass();
        WindowWindowInsetsAnimationValues windowWindowInsetsAnimationValues2 = (WindowWindowInsetsAnimationValues) d2;
        windowWindowInsetsAnimationValues2.setVisible(!ValueInsets.m6374equalsimpl0(m6372constructorimpl, ValueInsets_androidKt.getZeroValueInsets()));
        if (!ValueInsets.m6374equalsimpl0(windowWindowInsetsAnimationValues2.m6383getCurrenthdzbrEE(), m6372constructorimpl)) {
            windowWindowInsetsAnimationValues2.m6387setCurrentYnlvx88(m6372constructorimpl);
            windowWindowInsetsAnimationValues2.m6388setMaximumYnlvx88(m6372constructorimpl);
            z2 = z;
            if (!ValueInsets.m6374equalsimpl0(m6372constructorimpl, ValueInsets_androidKt.getZeroValueInsets())) {
                z3 = z2;
            }
        }
        if (f == null) {
            xa0 xa0Var = this.displayCutouts;
            if (xa0Var.b > 0) {
                xa0Var.j();
                this.displayCutoutRulers.clear();
                z2 = z;
            }
        } else {
            List<Rect> boundingRects = f.a.getBoundingRects();
            int size = boundingRects.size();
            xa0 xa0Var2 = this.displayCutouts;
            if (size < xa0Var2.b) {
                xa0Var2.m(boundingRects.size(), this.displayCutouts.b);
                this.displayCutoutRulers.removeRange(boundingRects.size(), this.displayCutoutRulers.size());
                z2 = z;
            } else {
                int size2 = boundingRects.size() - this.displayCutouts.b;
                int i8 = 0;
                while (i8 < size2) {
                    xa0 xa0Var3 = this.displayCutouts;
                    xa0Var3.g(SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(boundingRects.get(xa0Var3.b), null, 2, null));
                    this.displayCutoutRulers.add(RectRulersKt.RectRulers("display cutout rect " + this.displayCutouts.b));
                    i8++;
                    z2 = z;
                }
            }
            int size3 = boundingRects.size();
            for (int i9 = 0; i9 < size3; i9++) {
                Rect rect = boundingRects.get(i9);
                MutableState mutableState = (MutableState) this.displayCutouts.b(i9);
                if (!q10.b(mutableState.getValue(), rect)) {
                    mutableState.setValue(rect);
                    z2 = z;
                }
            }
            if (!boundingRects.isEmpty()) {
                z3 = z;
            }
        }
        if ((z3 || this.generation.getIntValue() != 0) && z2) {
            MutableIntState mutableIntState = this.generation;
            mutableIntState.setIntValue(mutableIntState.getIntValue() + 1);
            Snapshot.Companion.sendApplyNotifications();
        }
    }

    public final AndroidComposeView getComposeView() {
        return this.composeView;
    }

    public final SnapshotStateList<RectRulers> getDisplayCutoutRulers() {
        return this.displayCutoutRulers;
    }

    public final xa0 getDisplayCutouts() {
        return this.displayCutouts;
    }

    public final MutableIntState getGeneration() {
        return this.generation;
    }

    public final pl0 getInsetsValues() {
        return this.insetsValues;
    }

    @Override // defpackage.fd0
    public p31 onApplyWindowInsets(View view, p31 p31Var) {
        if (this.prepared) {
            this.savedInsets = p31Var;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return p31Var;
            }
        } else if (this.runningAnimationMask == 0) {
            updateInsets(p31Var);
        }
        return p31Var;
    }

    @Override // defpackage.r21
    public void onEnd(a31 a31Var) {
        g10 g10Var;
        this.prepared = false;
        int d = a31Var.a.d();
        this.runningAnimationMask &= ~d;
        this.savedInsets = null;
        g10Var = WindowInsetsRulers_androidKt.WindowInsetsTypeMap;
        WindowInsetsRulers windowInsetsRulers = (WindowInsetsRulers) g10Var.b(d);
        if (windowInsetsRulers != null) {
            Object d2 = this.insetsValues.d(windowInsetsRulers);
            d2.getClass();
            WindowWindowInsetsAnimationValues windowWindowInsetsAnimationValues = (WindowWindowInsetsAnimationValues) d2;
            windowWindowInsetsAnimationValues.setFraction(0.0f);
            windowWindowInsetsAnimationValues.setAlpha(1.0f);
            windowWindowInsetsAnimationValues.setDurationMillis(0L);
            windowWindowInsetsAnimationValues.setFraction(0.0f);
            stopAnimationForRuler(windowWindowInsetsAnimationValues);
            MutableIntState mutableIntState = this.generation;
            mutableIntState.setIntValue(mutableIntState.getIntValue() + 1);
            Snapshot.Companion.sendApplyNotifications();
        }
        super.onEnd(a31Var);
    }

    @Override // defpackage.r21
    public void onPrepare(a31 a31Var) {
        this.prepared = true;
        super.onPrepare(a31Var);
    }

    @Override // defpackage.r21
    public p31 onProgress(p31 p31Var, List<a31> list) {
        g10 g10Var;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a31 a31Var = list.get(i);
            int d = a31Var.a.d();
            g10Var = WindowInsetsRulers_androidKt.WindowInsetsTypeMap;
            WindowInsetsRulers windowInsetsRulers = (WindowInsetsRulers) g10Var.b(d);
            if (windowInsetsRulers != null) {
                Object d2 = this.insetsValues.d(windowInsetsRulers);
                d2.getClass();
                WindowWindowInsetsAnimationValues windowWindowInsetsAnimationValues = (WindowWindowInsetsAnimationValues) d2;
                if (windowWindowInsetsAnimationValues.isAnimating()) {
                    updateInsetAnimationInfo(windowWindowInsetsAnimationValues, a31Var);
                }
            }
        }
        updateInsets(p31Var);
        return p31Var;
    }

    @Override // defpackage.r21
    public q21 onStart(a31 a31Var, q21 q21Var) {
        g10 g10Var;
        p31 p31Var = this.savedInsets;
        this.prepared = false;
        this.savedInsets = null;
        if (a31Var.a.b() > 0 && p31Var != null) {
            int d = a31Var.a.d();
            this.runningAnimationMask |= d;
            g10Var = WindowInsetsRulers_androidKt.WindowInsetsTypeMap;
            WindowInsetsRulers windowInsetsRulers = (WindowInsetsRulers) g10Var.b(d);
            if (windowInsetsRulers != null) {
                Object d2 = this.insetsValues.d(windowInsetsRulers);
                d2.getClass();
                WindowWindowInsetsAnimationValues windowWindowInsetsAnimationValues = (WindowWindowInsetsAnimationValues) d2;
                v00 g = p31Var.a.g(d);
                long m6372constructorimpl = ValueInsets.m6372constructorimpl(g.d | (g.a << 48) | (g.b << 32) | (g.c << 16));
                long m6383getCurrenthdzbrEE = windowWindowInsetsAnimationValues.m6383getCurrenthdzbrEE();
                if (!ValueInsets.m6374equalsimpl0(m6372constructorimpl, m6383getCurrenthdzbrEE)) {
                    windowWindowInsetsAnimationValues.m6389setSourceValueInsetsYnlvx88(m6383getCurrenthdzbrEE);
                    windowWindowInsetsAnimationValues.m6390setTargetValueInsetsYnlvx88(m6372constructorimpl);
                    windowWindowInsetsAnimationValues.setAnimating(true);
                    updateInsetAnimationInfo(windowWindowInsetsAnimationValues, a31Var);
                    MutableIntState mutableIntState = this.generation;
                    mutableIntState.setIntValue(mutableIntState.getIntValue() + 1);
                    Snapshot.Companion.sendApplyNotifications();
                }
            }
        }
        return q21Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        int i = u11.a;
        p11.g(view, this);
        a31.a(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        int i = u11.a;
        p11.g(view, null);
        a31.a(view, null);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.prepared) {
            this.runningAnimationMask = 0;
            this.prepared = false;
            p31 p31Var = this.savedInsets;
            if (p31Var != null) {
                updateInsets(p31Var);
                this.savedInsets = null;
            }
        }
    }
}
