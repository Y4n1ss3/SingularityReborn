package androidx.compose.material.ripple;

import android.content.Context;
import android.view.ViewGroup;
import defpackage.y80;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RippleContainer extends ViewGroup {
    public static final int $stable = 8;
    private final int MaxRippleHosts;
    private int nextHostIndex;
    private final RippleHostMap rippleHostMap;
    private final List<RippleHostView> rippleHosts;
    private final List<RippleHostView> unusedRippleHosts;

    public RippleContainer(Context context) {
        super(context);
        this.MaxRippleHosts = 5;
        ArrayList arrayList = new ArrayList();
        this.rippleHosts = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.unusedRippleHosts = arrayList2;
        this.rippleHostMap = new RippleHostMap();
        setClipChildren(false);
        RippleHostView rippleHostView = new RippleHostView(context);
        addView(rippleHostView);
        arrayList.add(rippleHostView);
        arrayList2.add(rippleHostView);
        this.nextHostIndex = 1;
        setTag(androidx.compose.ui.R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    public final void disposeRippleIfNeeded(RippleHostKey rippleHostKey) {
        rippleHostKey.onResetRippleHostView();
        RippleHostView rippleHostView = this.rippleHostMap.get(rippleHostKey);
        if (rippleHostView != null) {
            rippleHostView.disposeRipple();
            this.rippleHostMap.remove(rippleHostKey);
            this.unusedRippleHosts.add(rippleHostView);
        }
    }

    public final RippleHostView getRippleHostView(RippleHostKey rippleHostKey) {
        RippleHostView rippleHostView = this.rippleHostMap.get(rippleHostKey);
        if (rippleHostView != null) {
            return rippleHostView;
        }
        List<RippleHostView> list = this.unusedRippleHosts;
        list.getClass();
        RippleHostView remove = list.isEmpty() ? null : list.remove(0);
        if (remove == null) {
            if (this.nextHostIndex > y80.v(this.rippleHosts)) {
                remove = new RippleHostView(getContext());
                addView(remove);
                this.rippleHosts.add(remove);
            } else {
                remove = this.rippleHosts.get(this.nextHostIndex);
                RippleHostKey rippleHostKey2 = this.rippleHostMap.get(remove);
                if (rippleHostKey2 != null) {
                    rippleHostKey2.onResetRippleHostView();
                    this.rippleHostMap.remove(rippleHostKey2);
                    remove.disposeRipple();
                }
            }
            int i = this.nextHostIndex;
            if (i < this.MaxRippleHosts - 1) {
                this.nextHostIndex = i + 1;
            } else {
                this.nextHostIndex = 0;
            }
        }
        this.rippleHostMap.set(rippleHostKey, remove);
        return remove;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
