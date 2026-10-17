package androidx.compose.ui.window;

import android.content.Context;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.platform.AbstractComposeView;
import defpackage.a31;
import defpackage.fd0;
import defpackage.my;
import defpackage.oy;
import defpackage.p11;
import defpackage.p31;
import defpackage.q21;
import defpackage.r21;
import defpackage.u11;
import defpackage.v00;
import defpackage.y80;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class DialogLayout extends AbstractComposeView implements DialogWindowProvider, fd0 {
    private final MutableState content$delegate;
    private boolean decorFitsSystemWindows;
    private boolean hasCalledSetLayout;
    private boolean shouldCreateCompositionOnAttachedToWindow;
    private boolean usePlatformDefaultWidth;
    private final Window window;

    public DialogLayout(Context context, Window window) {
        super(context, null, 0, 6, null);
        this.window = window;
        this.content$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ComposableSingletons$AndroidDialog_androidKt.INSTANCE.getLambda$210148896$ui(), null, 2, null);
        int i = u11.a;
        p11.g(this, this);
        a31.a(this, new r21() { // from class: androidx.compose.ui.window.DialogLayout.1
            {
                super(1);
            }

            @Override // defpackage.r21
            public p31 onProgress(p31 p31Var, List<a31> list) {
                DialogLayout dialogLayout = DialogLayout.this;
                if (!dialogLayout.decorFitsSystemWindows) {
                    View childAt = dialogLayout.getChildAt(0);
                    int max = Math.max(0, childAt.getLeft());
                    int max2 = Math.max(0, childAt.getTop());
                    int max3 = Math.max(0, dialogLayout.getWidth() - childAt.getRight());
                    int max4 = Math.max(0, dialogLayout.getHeight() - childAt.getBottom());
                    if (max != 0 || max2 != 0 || max3 != 0 || max4 != 0) {
                        return p31Var.a.n(max, max2, max3, max4);
                    }
                }
                return p31Var;
            }

            @Override // defpackage.r21
            public q21 onStart(a31 a31Var, q21 q21Var) {
                DialogLayout dialogLayout = DialogLayout.this;
                if (!dialogLayout.decorFitsSystemWindows) {
                    View childAt = dialogLayout.getChildAt(0);
                    int max = Math.max(0, childAt.getLeft());
                    int max2 = Math.max(0, childAt.getTop());
                    int max3 = Math.max(0, dialogLayout.getWidth() - childAt.getRight());
                    int max4 = Math.max(0, dialogLayout.getHeight() - childAt.getBottom());
                    if (max != 0 || max2 != 0 || max3 != 0 || max4 != 0) {
                        v00 b = v00.b(max, max2, max3, max4);
                        int i2 = b.a;
                        v00 v00Var = q21Var.a;
                        int i3 = b.b;
                        int i4 = b.c;
                        int i5 = b.d;
                        return new q21(p31.a(v00Var, i2, i3, i4, i5), p31.a(q21Var.b, i2, i3, i4, i5));
                    }
                }
                return q21Var;
            }
        });
    }

    private final my getContent() {
        return (my) this.content$delegate.getValue();
    }

    private final int getMaxDialogHeightExcludingInsets(Window window, int i) {
        int i2 = Build.VERSION.SDK_INT;
        return i2 < 30 ? Api21Impl.INSTANCE.getMaxDialogHeightExcludingSystemBarInsets(window) : i2 < 32 ? Api30Impl.INSTANCE.getMaxDialogHeightExcludingSystemBarInsets(window) : i;
    }

    private final <T> T insetValue(T t, oy oyVar) {
        if (!this.decorFitsSystemWindows) {
            View childAt = getChildAt(0);
            int max = Math.max(0, childAt.getLeft());
            int max2 = Math.max(0, childAt.getTop());
            int max3 = Math.max(0, getWidth() - childAt.getRight());
            int max4 = Math.max(0, getHeight() - childAt.getBottom());
            if (max != 0 || max2 != 0 || max3 != 0 || max4 != 0) {
                return (T) oyVar.invoke(Integer.valueOf(max), Integer.valueOf(max2), Integer.valueOf(max3), Integer.valueOf(max4));
            }
        }
        return t;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void Content(Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(1735448596);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1735448596, i2, -1, "androidx.compose.ui.window.DialogLayout.Content (AndroidDialog.android.kt:506)");
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
            endRestartGroup.updateScope(new DialogLayout$Content$4(this, i));
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

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void internalOnLayout$ui(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int paddingLeft = (((i5 - measuredWidth) - paddingRight) / 2) + getPaddingLeft();
        int paddingTop = (((i6 - measuredHeight) - paddingBottom) / 2) + getPaddingTop();
        childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight + paddingTop);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void internalOnMeasure$ui(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.internalOnMeasure$ui(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        int maxDialogHeightExcludingInsets = (mode == Integer.MIN_VALUE && !this.usePlatformDefaultWidth && getWindow().getAttributes().height == -2) ? this.decorFitsSystemWindows ? getMaxDialogHeightExcludingInsets(getWindow(), size2) : size2 + 1 : size2;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i3 = size - paddingRight;
        if (i3 < 0) {
            i3 = 0;
        }
        int i4 = maxDialogHeightExcludingInsets - paddingBottom;
        int i5 = i4 >= 0 ? i4 : 0;
        int mode2 = View.MeasureSpec.getMode(i);
        if (mode2 != 0) {
            i = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        }
        if (mode != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
        }
        childAt.measure(i, i2);
        if (mode2 == Integer.MIN_VALUE) {
            size = Math.min(size, childAt.getMeasuredWidth() + paddingRight);
        } else if (mode2 != 1073741824) {
            size = childAt.getMeasuredWidth() + paddingRight;
        }
        setMeasuredDimension(size, mode != Integer.MIN_VALUE ? mode != 1073741824 ? childAt.getMeasuredHeight() + paddingBottom : size2 : Math.min(size2, childAt.getMeasuredHeight() + paddingBottom));
        if (this.decorFitsSystemWindows || childAt.getMeasuredHeight() + paddingBottom <= size2 || getWindow().getAttributes().height != -2) {
            return;
        }
        getWindow().addFlags(Integer.MIN_VALUE);
        if (this.usePlatformDefaultWidth) {
            return;
        }
        getWindow().setLayout(-1, -1);
    }

    public final boolean isInsideContent(MotionEvent motionEvent) {
        View childAt;
        int P;
        if (Math.abs(motionEvent.getX()) > Float.MAX_VALUE || Math.abs(motionEvent.getY()) > Float.MAX_VALUE || (childAt = getChildAt(0)) == null) {
            return false;
        }
        int left = childAt.getLeft() + getLeft();
        int width = childAt.getWidth() + left;
        int top = childAt.getTop() + getTop();
        int height = childAt.getHeight() + top;
        int P2 = y80.P(motionEvent.getX());
        return left <= P2 && P2 <= width && top <= (P = y80.P(motionEvent.getY())) && P <= height;
    }

    @Override // defpackage.fd0
    public p31 onApplyWindowInsets(View view, p31 p31Var) {
        if (!this.decorFitsSystemWindows) {
            View childAt = getChildAt(0);
            int max = Math.max(0, childAt.getLeft());
            int max2 = Math.max(0, childAt.getTop());
            int max3 = Math.max(0, getWidth() - childAt.getRight());
            int max4 = Math.max(0, getHeight() - childAt.getBottom());
            if (max != 0 || max2 != 0 || max3 != 0 || max4 != 0) {
                return p31Var.a.n(max, max2, max3, max4);
            }
        }
        return p31Var;
    }

    public final void setContent(CompositionContext compositionContext, my myVar) {
        setParentCompositionContext(compositionContext);
        setContent(myVar);
        this.shouldCreateCompositionOnAttachedToWindow = true;
        createComposition();
    }

    public final void updateProperties(boolean z, boolean z2) {
        boolean z3 = (this.hasCalledSetLayout && z == this.usePlatformDefaultWidth && z2 == this.decorFitsSystemWindows) ? false : true;
        this.usePlatformDefaultWidth = z;
        this.decorFitsSystemWindows = z2;
        if (z3) {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            int i = z ? -2 : -1;
            if (i == attributes.width && this.hasCalledSetLayout) {
                return;
            }
            getWindow().setLayout(i, -2);
            this.hasCalledSetLayout = true;
        }
    }

    private final void setContent(my myVar) {
        this.content$delegate.setValue(myVar);
    }
}
