package androidx.compose.ui.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MonotonicFrameClock;
import androidx.compose.runtime.PausableMonotonicFrameClock;
import androidx.compose.runtime.Recomposer;
import androidx.compose.ui.MotionDurationScale;
import androidx.compose.ui.R;
import androidx.compose.ui.internal.InlineClassHelperKt;
import defpackage.d41;
import defpackage.f80;
import defpackage.fb0;
import defpackage.ji0;
import defpackage.kn;
import defpackage.nq;
import defpackage.nr;
import defpackage.o;
import defpackage.of;
import defpackage.p01;
import defpackage.p10;
import defpackage.pw;
import defpackage.q10;
import defpackage.q40;
import defpackage.ql0;
import defpackage.qs0;
import defpackage.s40;
import defpackage.st;
import defpackage.tr0;
import defpackage.ts;
import defpackage.un;
import defpackage.ur0;
import defpackage.w01;
import defpackage.w40;
import defpackage.xn;
import defpackage.y40;
import defpackage.y80;
import defpackage.zg;
import defpackage.zl;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class WindowRecomposer_androidKt {
    private static final fb0 animationScale;

    static {
        long[] jArr = ql0.a;
        animationScale = new fb0();
    }

    public static final Recomposer createLifecycleAwareWindowRecomposer(final View view, kn knVar, s40 s40Var) {
        final PausableMonotonicFrameClock pausableMonotonicFrameClock;
        if (knVar.get(ts.i) == null || knVar.get(MonotonicFrameClock.Key) == null) {
            knVar = AndroidUiDispatcher.Companion.getCurrentThread().plus(knVar);
        }
        MonotonicFrameClock monotonicFrameClock = (MonotonicFrameClock) knVar.get(MonotonicFrameClock.Key);
        if (monotonicFrameClock != null) {
            pausableMonotonicFrameClock = new PausableMonotonicFrameClock(monotonicFrameClock);
            pausableMonotonicFrameClock.pause();
        } else {
            pausableMonotonicFrameClock = null;
        }
        final ji0 ji0Var = new ji0();
        kn knVar2 = (MotionDurationScale) knVar.get(MotionDurationScale.Key);
        if (knVar2 == null) {
            knVar2 = new MotionDurationScaleImpl(view.getContext().getApplicationContext());
            ji0Var.d = knVar2;
        }
        kn plus = knVar.plus(pausableMonotonicFrameClock != null ? pausableMonotonicFrameClock : st.d).plus(knVar2);
        final Recomposer recomposer = new Recomposer(plus);
        recomposer.pauseCompositionFrameClock();
        final zl a = p10.a(plus);
        if (s40Var == null) {
            y40 o = q10.o(view);
            s40Var = o != null ? o.getLifecycle() : null;
        }
        if (s40Var != null) {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view2) {
                    view.removeOnAttachStateChangeListener(this);
                    recomposer.cancel();
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view2) {
                }
            });
            s40Var.a(new w40() { // from class: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2

                /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
                public static final /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[q40.values().length];
                        try {
                            iArr[q40.ON_CREATE.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[q40.ON_START.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[q40.ON_STOP.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
                            iArr[q40.ON_DESTROY.ordinal()] = 4;
                        } catch (NoSuchFieldError unused4) {
                        }
                        try {
                            iArr[q40.ON_PAUSE.ordinal()] = 5;
                        } catch (NoSuchFieldError unused5) {
                        }
                        try {
                            iArr[q40.ON_RESUME.ordinal()] = 6;
                        } catch (NoSuchFieldError unused6) {
                        }
                        try {
                            iArr[q40.ON_ANY.ordinal()] = 7;
                        } catch (NoSuchFieldError unused7) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                @Override // defpackage.w40
                public void onStateChanged(y40 y40Var, q40 q40Var) {
                    switch (WhenMappings.$EnumSwitchMapping$0[q40Var.ordinal()]) {
                        case 1:
                            p01.t(un.this, null, xn.g, new WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1(ji0Var, recomposer, y40Var, this, null), 1);
                            break;
                        case 2:
                            PausableMonotonicFrameClock pausableMonotonicFrameClock2 = pausableMonotonicFrameClock;
                            if (pausableMonotonicFrameClock2 != null) {
                                pausableMonotonicFrameClock2.resume();
                            }
                            recomposer.resumeCompositionFrameClock();
                            break;
                        case 3:
                            recomposer.pauseCompositionFrameClock();
                            break;
                        case 4:
                            recomposer.cancel();
                            break;
                        case 5:
                        case 6:
                        case 7:
                            break;
                        default:
                            o.n();
                            break;
                    }
                }
            });
            return recomposer;
        }
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("ViewTreeLifecycleOwner not found from " + view);
        o.j();
        return null;
    }

    public static /* synthetic */ Recomposer createLifecycleAwareWindowRecomposer$default(View view, kn knVar, s40 s40Var, int i, Object obj) {
        if ((i & 1) != 0) {
            knVar = st.d;
        }
        if ((i & 2) != 0) {
            s40Var = null;
        }
        return createLifecycleAwareWindowRecomposer(view, knVar, s40Var);
    }

    public static final CompositionContext findViewTreeCompositionContext(View view) {
        CompositionContext compositionContext = getCompositionContext(view);
        if (compositionContext != null) {
            return compositionContext;
        }
        Object parent = view.getParent();
        while (compositionContext == null && (parent instanceof View)) {
            View view2 = (View) parent;
            compositionContext = getCompositionContext(view2);
            parent = p10.u(view2);
        }
        return compositionContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r5v0, types: [androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1] */
    public static final ur0 getAnimationScaleFlowFor(Context context) {
        ur0 ur0Var;
        fb0 fb0Var = animationScale;
        synchronized (fb0Var) {
            try {
                Object d = fb0Var.d(context);
                if (d == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    final of b = d41.b(-1, 6, null);
                    final Handler createAsync = Handler.createAsync(Looper.getMainLooper());
                    pw pwVar = new pw(new WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(contentResolver, uriFor, new ContentObserver(createAsync) { // from class: androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1
                        @Override // android.database.ContentObserver
                        public void onChange(boolean z, Uri uri) {
                            zg.this.m(w01.a);
                        }
                    }, b, context, null), 2);
                    qs0 qs0Var = new qs0(null);
                    nq nqVar = nr.a;
                    d = p10.O(pwVar, new zl(y80.I(qs0Var, f80.a)), new tr0(), Float.valueOf(readAnimationScale(context)));
                    fb0Var.l(context, d);
                }
                ur0Var = (ur0) d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ur0Var;
    }

    public static final CompositionContext getCompositionContext(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof CompositionContext) {
            return (CompositionContext) tag;
        }
        return null;
    }

    public static final View getContentChild(View view) {
        Object u = p10.u(view);
        while (u instanceof View) {
            View view2 = (View) u;
            if (view2.getId() == 16908290) {
                break;
            }
            u = view2.getParent();
            view = view2;
        }
        return view;
    }

    public static final Recomposer getWindowRecomposer(View view) {
        if (!view.isAttachedToWindow()) {
            InlineClassHelperKt.throwIllegalStateException("Cannot locate windowRecomposer; View " + view + " is not attached to a window");
        }
        View contentChild = getContentChild(view);
        CompositionContext compositionContext = getCompositionContext(contentChild);
        if (compositionContext == null) {
            return WindowRecomposerPolicy.INSTANCE.createAndInstallWindowRecomposer$ui(contentChild);
        }
        if (compositionContext instanceof Recomposer) {
            return (Recomposer) compositionContext;
        }
        o.f("root viewTreeParentCompositionContext is not a Recomposer");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float readAnimationScale(Context context) {
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    public static final void setCompositionContext(View view, CompositionContext compositionContext) {
        view.setTag(R.id.androidx_compose_ui_view_composition_context, compositionContext);
    }

    public static /* synthetic */ void getWindowRecomposer$annotations(View view) {
    }
}
