package defpackage;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class oc0 {
    public ViewParent a;
    public ViewParent b;
    public final View c;
    public boolean d;
    public int[] e;

    public oc0(View view) {
        this.c = view;
    }

    public final ViewParent a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i != 1) {
            return null;
        }
        return this.b;
    }

    public final boolean b(int i, int i2) {
        boolean onStartNestedScroll;
        if (a(i2) != null) {
            return true;
        }
        if (this.d) {
            View view = this.c;
            View view2 = view;
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                boolean z = parent instanceof pc0;
                if (z) {
                    onStartNestedScroll = ((pc0) parent).onStartNestedScroll(view2, view, i, i2);
                } else {
                    if (i2 == 0) {
                        try {
                            onStartNestedScroll = parent.onStartNestedScroll(view2, view, i);
                        } catch (AbstractMethodError e) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e);
                        }
                    }
                    onStartNestedScroll = false;
                }
                if (onStartNestedScroll) {
                    if (i2 == 0) {
                        this.a = parent;
                    } else if (i2 == 1) {
                        this.b = parent;
                    }
                    if (z) {
                        ((pc0) parent).onNestedScrollAccepted(view2, view, i, i2);
                    } else if (i2 == 0) {
                        try {
                            parent.onNestedScrollAccepted(view2, view, i);
                        } catch (AbstractMethodError e2) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e2);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view2 = parent;
                }
            }
        }
        return false;
    }

    public final void c(int i) {
        ViewParent a = a(i);
        if (a != null) {
            boolean z = a instanceof pc0;
            View view = this.c;
            if (z) {
                ((pc0) a).onStopNestedScroll(view, i);
            } else if (i == 0) {
                try {
                    a.onStopNestedScroll(view);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + a + " does not implement interface method onStopNestedScroll", e);
                }
            }
            if (i == 0) {
                this.a = null;
            } else {
                if (i != 1) {
                    return;
                }
                this.b = null;
            }
        }
    }
}
