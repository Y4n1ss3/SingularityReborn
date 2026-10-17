package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract class e50 extends ViewGroup {
    public boolean d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public float j;
    public boolean k;
    public int[] l;
    public int[] m;
    public Drawable n;
    public int o;
    public int p;
    public int q;
    public int r;

    public final void a(Canvas canvas, int i) {
        this.n.setBounds(getPaddingLeft() + this.r, i, (getWidth() - getPaddingRight()) - this.r, this.p + i);
        this.n.draw(canvas);
    }

    public final void b(Canvas canvas, int i) {
        this.n.setBounds(i, getPaddingTop() + this.r, this.o + i, (getHeight() - getPaddingBottom()) - this.r);
        this.n.draw(canvas);
    }

    public final boolean c(int i) {
        if (i == 0) {
            return (this.q & 1) != 0;
        }
        int childCount = getChildCount();
        int i2 = this.q;
        if (i == childCount) {
            return (i2 & 4) != 0;
        }
        if ((i2 & 2) != 0) {
            for (int i3 = i - 1; i3 >= 0; i3--) {
                if (getChildAt(i3).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof d50;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        int i = this.g;
        if (i == 0) {
            return new d50(-2, -2);
        }
        if (i == 1) {
            return new d50(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new d50(getContext(), attributeSet);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.e < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.e;
        if (childCount <= i2) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.e == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i3 = this.f;
        if (this.g == 1 && (i = this.h & 112) != 48) {
            if (i == 16) {
                i3 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.i) / 2;
            } else if (i == 80) {
                i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.i;
            }
        }
        return i3 + ((LinearLayout.LayoutParams) ((d50) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.e;
    }

    public Drawable getDividerDrawable() {
        return this.n;
    }

    public int getDividerPadding() {
        return this.r;
    }

    public int getDividerWidth() {
        return this.o;
    }

    public int getGravity() {
        return this.h;
    }

    public int getOrientation() {
        return this.g;
    }

    public int getShowDividers() {
        return this.q;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.j;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i;
        if (this.n == null) {
            return;
        }
        int i2 = 0;
        if (this.g == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i2 < virtualChildCount) {
                View childAt = getChildAt(i2);
                if (childAt != null && childAt.getVisibility() != 8 && c(i2)) {
                    a(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((d50) childAt.getLayoutParams())).topMargin) - this.p);
                }
                i2++;
            }
            if (c(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                a(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.p : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((d50) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        int i3 = d21.a;
        int i4 = u11.a;
        boolean z = getLayoutDirection() == 1;
        while (i2 < virtualChildCount2) {
            View childAt3 = getChildAt(i2);
            if (childAt3 != null && childAt3.getVisibility() != 8 && c(i2)) {
                d50 d50Var = (d50) childAt3.getLayoutParams();
                b(canvas, z ? childAt3.getRight() + ((LinearLayout.LayoutParams) d50Var).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) d50Var).leftMargin) - this.o);
            }
            i2++;
        }
        if (c(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                d50 d50Var2 = (d50) childAt4.getLayoutParams();
                if (z) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) d50Var2).leftMargin;
                    i = this.o;
                    right = left - i;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) d50Var2).rightMargin;
                }
            } else if (z) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.o;
                right = left - i;
            }
            b(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0195  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        char c;
        int i14;
        int i15;
        int i16;
        int i17 = 8;
        char c2 = 2;
        if (this.g == 1) {
            int paddingLeft = getPaddingLeft();
            int i18 = i3 - i;
            int paddingRight = i18 - getPaddingRight();
            int paddingRight2 = (i18 - paddingLeft) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i19 = this.h;
            int i20 = i19 & 112;
            int i21 = 8388615 & i19;
            int paddingTop = i20 != 16 ? i20 != 80 ? getPaddingTop() : ((getPaddingTop() + i4) - i2) - this.i : getPaddingTop() + (((i4 - i2) - this.i) / 2);
            int i22 = 0;
            while (i22 < virtualChildCount) {
                View childAt = getChildAt(i22);
                if (childAt == null || childAt.getVisibility() == i17) {
                    c = c2;
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    d50 d50Var = (d50) childAt.getLayoutParams();
                    c = c2;
                    int i23 = ((LinearLayout.LayoutParams) d50Var).gravity;
                    if (i23 < 0) {
                        i23 = i21;
                    }
                    int i24 = u11.a;
                    int absoluteGravity = Gravity.getAbsoluteGravity(i23, getLayoutDirection()) & 7;
                    if (absoluteGravity == 1) {
                        i14 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) d50Var).leftMargin;
                        i15 = ((LinearLayout.LayoutParams) d50Var).rightMargin;
                    } else if (absoluteGravity != 5) {
                        i16 = ((LinearLayout.LayoutParams) d50Var).leftMargin + paddingLeft;
                        if (c(i22)) {
                            paddingTop += this.p;
                        }
                        int i25 = paddingTop + ((LinearLayout.LayoutParams) d50Var).topMargin;
                        childAt.layout(i16, i25, measuredWidth + i16, i25 + measuredHeight);
                        paddingTop = measuredHeight + ((LinearLayout.LayoutParams) d50Var).bottomMargin + i25;
                    } else {
                        i14 = paddingRight - measuredWidth;
                        i15 = ((LinearLayout.LayoutParams) d50Var).rightMargin;
                    }
                    i16 = i14 - i15;
                    if (c(i22)) {
                    }
                    int i252 = paddingTop + ((LinearLayout.LayoutParams) d50Var).topMargin;
                    childAt.layout(i16, i252, measuredWidth + i16, i252 + measuredHeight);
                    paddingTop = measuredHeight + ((LinearLayout.LayoutParams) d50Var).bottomMargin + i252;
                }
                i22++;
                c2 = c;
                i17 = 8;
            }
            return;
        }
        int i26 = d21.a;
        int i27 = u11.a;
        boolean z2 = getLayoutDirection() == 1;
        int paddingTop2 = getPaddingTop();
        int i28 = i4 - i2;
        int paddingBottom = i28 - getPaddingBottom();
        int paddingBottom2 = (i28 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i29 = this.h;
        int i30 = 8388615 & i29;
        int i31 = i29 & 112;
        boolean z3 = this.d;
        int[] iArr = this.l;
        int[] iArr2 = this.m;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i30, getLayoutDirection());
        int paddingLeft2 = absoluteGravity2 != 1 ? absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i3) - i) - this.i : getPaddingLeft() + (((i3 - i) - this.i) / 2);
        if (z2) {
            i6 = virtualChildCount2 - 1;
            i5 = -1;
        } else {
            i5 = 1;
            i6 = 0;
        }
        int i32 = 0;
        while (i32 < virtualChildCount2) {
            int i33 = (i5 * i32) + i6;
            View childAt2 = getChildAt(i33);
            if (childAt2 == null) {
                i7 = i6;
            } else {
                i7 = i6;
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight2 = childAt2.getMeasuredHeight();
                    d50 d50Var2 = (d50) childAt2.getLayoutParams();
                    int i34 = paddingLeft2;
                    if (z3) {
                        i8 = paddingTop2;
                        if (((LinearLayout.LayoutParams) d50Var2).height != -1) {
                            i9 = childAt2.getBaseline();
                            i10 = ((LinearLayout.LayoutParams) d50Var2).gravity;
                            if (i10 < 0) {
                                i10 = i31;
                            }
                            i11 = i10 & 112;
                            if (i11 == 16) {
                                if (i11 == 48) {
                                    i12 = i8 + ((LinearLayout.LayoutParams) d50Var2).topMargin;
                                    if (i9 != -1) {
                                        i12 = (iArr[1] - i9) + i12;
                                    }
                                } else if (i11 != 80) {
                                    i12 = i8;
                                } else {
                                    i12 = (paddingBottom - measuredHeight2) - ((LinearLayout.LayoutParams) d50Var2).bottomMargin;
                                    if (i9 != -1) {
                                        i13 = iArr2[2] - (childAt2.getMeasuredHeight() - i9);
                                    }
                                }
                                int i35 = (c(i33) ? i34 + this.o : i34) + ((LinearLayout.LayoutParams) d50Var2).leftMargin;
                                childAt2.layout(i35, i12, i35 + measuredWidth2, i12 + measuredHeight2);
                                paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) d50Var2).rightMargin + i35;
                                i32++;
                                i6 = i7;
                                paddingTop2 = i8;
                            } else {
                                i12 = ((paddingBottom2 - measuredHeight2) / 2) + i8 + ((LinearLayout.LayoutParams) d50Var2).topMargin;
                                i13 = ((LinearLayout.LayoutParams) d50Var2).bottomMargin;
                            }
                            i12 -= i13;
                            int i352 = (c(i33) ? i34 + this.o : i34) + ((LinearLayout.LayoutParams) d50Var2).leftMargin;
                            childAt2.layout(i352, i12, i352 + measuredWidth2, i12 + measuredHeight2);
                            paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) d50Var2).rightMargin + i352;
                            i32++;
                            i6 = i7;
                            paddingTop2 = i8;
                        }
                    } else {
                        i8 = paddingTop2;
                    }
                    i9 = -1;
                    i10 = ((LinearLayout.LayoutParams) d50Var2).gravity;
                    if (i10 < 0) {
                    }
                    i11 = i10 & 112;
                    if (i11 == 16) {
                    }
                    i12 -= i13;
                    int i3522 = (c(i33) ? i34 + this.o : i34) + ((LinearLayout.LayoutParams) d50Var2).leftMargin;
                    childAt2.layout(i3522, i12, i3522 + measuredWidth2, i12 + measuredHeight2);
                    paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) d50Var2).rightMargin + i3522;
                    i32++;
                    i6 = i7;
                    paddingTop2 = i8;
                }
            }
            i8 = paddingTop2;
            i32++;
            i6 = i7;
            paddingTop2 = i8;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:224:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0148  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i2) {
        int[] iArr;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z;
        int baseline;
        int i9;
        int i10;
        int[] iArr2;
        int i11;
        int i12;
        boolean z2;
        boolean z3;
        d50 d50Var;
        int i13;
        int[] iArr3;
        int i14;
        View view;
        int i15;
        boolean z4;
        boolean z5;
        int max;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        boolean z6;
        int i24;
        int i25;
        int i26;
        View view2;
        boolean z7;
        boolean z8;
        e50 e50Var = this;
        int i27 = e50Var.g;
        int i28 = -2;
        int i29 = 0;
        int i30 = GroupFlagsKt.IsSubcompositionContextFlag;
        int i31 = 8;
        if (i27 == 1) {
            e50Var.i = 0;
            int virtualChildCount = e50Var.getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int i32 = e50Var.e;
            boolean z9 = e50Var.k;
            int i33 = 0;
            int i34 = 0;
            int i35 = 0;
            boolean z10 = false;
            int i36 = 0;
            boolean z11 = false;
            boolean z12 = true;
            float f = 0.0f;
            int i37 = 0;
            while (i33 < virtualChildCount) {
                int i38 = mode;
                View childAt = e50Var.getChildAt(i33);
                if (childAt == null) {
                    e50Var.i = e50Var.i;
                } else if (childAt.getVisibility() != i31) {
                    if (e50Var.c(i33)) {
                        e50Var.i += e50Var.p;
                    }
                    d50 d50Var2 = (d50) childAt.getLayoutParams();
                    float f2 = ((LinearLayout.LayoutParams) d50Var2).weight;
                    f += f2;
                    if (mode2 == i30 && ((LinearLayout.LayoutParams) d50Var2).height == 0 && f2 > 0.0f) {
                        int i39 = e50Var.i;
                        e50Var.i = Math.max(i39, ((LinearLayout.LayoutParams) d50Var2).topMargin + i39 + ((LinearLayout.LayoutParams) d50Var2).bottomMargin);
                        view2 = childAt;
                        i23 = mode2;
                        i24 = i32;
                        z6 = z9;
                        i25 = i33;
                        z10 = true;
                        i26 = i38;
                    } else {
                        if (((LinearLayout.LayoutParams) d50Var2).height != 0 || f2 <= 0.0f) {
                            i20 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) d50Var2).height = i28;
                            i20 = 0;
                        }
                        if (f == 0.0f) {
                            i21 = i33;
                            i22 = e50Var.i;
                        } else {
                            i21 = i33;
                            i22 = 0;
                        }
                        i23 = mode2;
                        z6 = z9;
                        i24 = i32;
                        i25 = i21;
                        i26 = i38;
                        e50Var.measureChildWithMargins(childAt, i, 0, i2, i22);
                        if (i20 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) d50Var2).height = i20;
                        }
                        int measuredHeight = childAt.getMeasuredHeight();
                        int i40 = e50Var.i;
                        view2 = childAt;
                        e50Var.i = Math.max(i40, i40 + measuredHeight + ((LinearLayout.LayoutParams) d50Var2).topMargin + ((LinearLayout.LayoutParams) d50Var2).bottomMargin);
                        if (z6) {
                            i37 = Math.max(measuredHeight, i37);
                        }
                    }
                    if (i24 >= 0 && i24 == i25 + 1) {
                        e50Var.f = e50Var.i;
                    }
                    if (i25 < i24 && ((LinearLayout.LayoutParams) d50Var2).weight > 0.0f) {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                    if (i26 == 1073741824 || ((LinearLayout.LayoutParams) d50Var2).width != -1) {
                        z7 = false;
                    } else {
                        z7 = true;
                        z11 = true;
                    }
                    int i41 = ((LinearLayout.LayoutParams) d50Var2).leftMargin + ((LinearLayout.LayoutParams) d50Var2).rightMargin;
                    int measuredWidth = view2.getMeasuredWidth() + i41;
                    i29 = Math.max(i29, measuredWidth);
                    int measuredState = view2.getMeasuredState();
                    boolean z13 = z7;
                    int combineMeasuredStates = View.combineMeasuredStates(i36, measuredState);
                    if (z12) {
                        i36 = combineMeasuredStates;
                        if (((LinearLayout.LayoutParams) d50Var2).width == -1) {
                            z8 = true;
                            if (((LinearLayout.LayoutParams) d50Var2).weight <= 0.0f) {
                                if (!z13) {
                                    i41 = measuredWidth;
                                }
                                i35 = Math.max(i35, i41);
                            } else {
                                if (!z13) {
                                    i41 = measuredWidth;
                                }
                                i34 = Math.max(i34, i41);
                            }
                            z12 = z8;
                            i33 = i25 + 1;
                            i32 = i24;
                            mode = i26;
                            z9 = z6;
                            mode2 = i23;
                            i28 = -2;
                            i30 = GroupFlagsKt.IsSubcompositionContextFlag;
                            i31 = 8;
                        }
                    } else {
                        i36 = combineMeasuredStates;
                    }
                    z8 = false;
                    if (((LinearLayout.LayoutParams) d50Var2).weight <= 0.0f) {
                    }
                    z12 = z8;
                    i33 = i25 + 1;
                    i32 = i24;
                    mode = i26;
                    z9 = z6;
                    mode2 = i23;
                    i28 = -2;
                    i30 = GroupFlagsKt.IsSubcompositionContextFlag;
                    i31 = 8;
                }
                i23 = mode2;
                i24 = i32;
                z6 = z9;
                i25 = i33;
                i26 = i38;
                i33 = i25 + 1;
                i32 = i24;
                mode = i26;
                z9 = z6;
                mode2 = i23;
                i28 = -2;
                i30 = GroupFlagsKt.IsSubcompositionContextFlag;
                i31 = 8;
            }
            int i42 = mode;
            int i43 = mode2;
            boolean z14 = z9;
            int i44 = i36;
            int i45 = i2;
            if (e50Var.i > 0 && e50Var.c(virtualChildCount)) {
                e50Var.i += e50Var.p;
            }
            if (z14 && (i43 == Integer.MIN_VALUE || i43 == 0)) {
                e50Var.i = 0;
                for (int i46 = 0; i46 < virtualChildCount; i46++) {
                    View childAt2 = e50Var.getChildAt(i46);
                    if (childAt2 == null) {
                        e50Var.i = e50Var.i;
                    } else if (childAt2.getVisibility() != 8) {
                        d50 d50Var3 = (d50) childAt2.getLayoutParams();
                        int i47 = e50Var.i;
                        e50Var.i = Math.max(i47, i47 + i37 + ((LinearLayout.LayoutParams) d50Var3).topMargin + ((LinearLayout.LayoutParams) d50Var3).bottomMargin);
                    }
                }
            }
            int paddingBottom = e50Var.getPaddingBottom() + e50Var.getPaddingTop() + e50Var.i;
            e50Var.i = paddingBottom;
            int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, e50Var.getSuggestedMinimumHeight()), i45, 0);
            int i48 = (resolveSizeAndState & 16777215) - e50Var.i;
            if (z10 || (i48 != 0 && f > 0.0f)) {
                float f3 = e50Var.j;
                if (f3 > 0.0f) {
                    f = f3;
                }
                e50Var.i = 0;
                int i49 = i44;
                int i50 = 0;
                while (i50 < virtualChildCount) {
                    View childAt3 = e50Var.getChildAt(i50);
                    if (childAt3.getVisibility() == 8) {
                        i17 = i50;
                    } else {
                        d50 d50Var4 = (d50) childAt3.getLayoutParams();
                        float f4 = ((LinearLayout.LayoutParams) d50Var4).weight;
                        if (f4 > 0.0f) {
                            int i51 = (int) ((i48 * f4) / f);
                            f -= f4;
                            i48 -= i51;
                            i17 = i50;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, e50Var.getPaddingRight() + e50Var.getPaddingLeft() + ((LinearLayout.LayoutParams) d50Var4).leftMargin + ((LinearLayout.LayoutParams) d50Var4).rightMargin, ((LinearLayout.LayoutParams) d50Var4).width);
                            if (((LinearLayout.LayoutParams) d50Var4).height == 0) {
                                i19 = GroupFlagsKt.IsSubcompositionContextFlag;
                                if (i43 == 1073741824) {
                                    if (i51 <= 0) {
                                        i51 = 0;
                                    }
                                    childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i51, GroupFlagsKt.IsSubcompositionContextFlag));
                                    i49 = View.combineMeasuredStates(i49, childAt3.getMeasuredState() & (-256));
                                }
                            } else {
                                i19 = GroupFlagsKt.IsSubcompositionContextFlag;
                            }
                            int measuredHeight2 = childAt3.getMeasuredHeight() + i51;
                            if (measuredHeight2 < 0) {
                                measuredHeight2 = 0;
                            }
                            childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight2, i19));
                            i49 = View.combineMeasuredStates(i49, childAt3.getMeasuredState() & (-256));
                        } else {
                            i17 = i50;
                        }
                        int i52 = ((LinearLayout.LayoutParams) d50Var4).leftMargin + ((LinearLayout.LayoutParams) d50Var4).rightMargin;
                        int measuredWidth2 = childAt3.getMeasuredWidth() + i52;
                        i29 = Math.max(i29, measuredWidth2);
                        if (i42 != 1073741824) {
                            i18 = -1;
                            if (((LinearLayout.LayoutParams) d50Var4).width == -1) {
                                measuredWidth2 = i52;
                            }
                        } else {
                            i18 = -1;
                        }
                        i34 = Math.max(i34, measuredWidth2);
                        boolean z15 = z12 && ((LinearLayout.LayoutParams) d50Var4).width == i18;
                        int i53 = e50Var.i;
                        e50Var.i = Math.max(i53, childAt3.getMeasuredHeight() + i53 + ((LinearLayout.LayoutParams) d50Var4).topMargin + ((LinearLayout.LayoutParams) d50Var4).bottomMargin);
                        z12 = z15;
                    }
                    i50 = i17 + 1;
                }
                e50Var.i = e50Var.getPaddingBottom() + e50Var.getPaddingTop() + e50Var.i;
                i44 = i49;
            } else {
                i34 = Math.max(i34, i35);
                if (z14 && i43 != 1073741824) {
                    for (int i54 = 0; i54 < virtualChildCount; i54++) {
                        View childAt4 = e50Var.getChildAt(i54);
                        if (childAt4 != null && childAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((d50) childAt4.getLayoutParams())).weight > 0.0f) {
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), GroupFlagsKt.IsSubcompositionContextFlag), View.MeasureSpec.makeMeasureSpec(i37, GroupFlagsKt.IsSubcompositionContextFlag));
                        }
                    }
                }
            }
            if (z12 || i42 == 1073741824) {
                i34 = i29;
            }
            e50Var.setMeasuredDimension(View.resolveSizeAndState(Math.max(e50Var.getPaddingRight() + e50Var.getPaddingLeft() + i34, e50Var.getSuggestedMinimumWidth()), i, i44), resolveSizeAndState);
            if (z11) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(e50Var.getMeasuredWidth(), GroupFlagsKt.IsSubcompositionContextFlag);
                int i55 = 0;
                while (i55 < virtualChildCount) {
                    View childAt5 = e50Var.getChildAt(i55);
                    if (childAt5.getVisibility() != 8) {
                        d50 d50Var5 = (d50) childAt5.getLayoutParams();
                        if (((LinearLayout.LayoutParams) d50Var5).width == -1) {
                            int i56 = ((LinearLayout.LayoutParams) d50Var5).height;
                            ((LinearLayout.LayoutParams) d50Var5).height = childAt5.getMeasuredHeight();
                            e50Var.measureChildWithMargins(childAt5, makeMeasureSpec, 0, i45, 0);
                            ((LinearLayout.LayoutParams) d50Var5).height = i56;
                        }
                    }
                    i55++;
                    i45 = i2;
                }
                return;
            }
            return;
        }
        int i57 = i;
        e50Var.i = 0;
        int virtualChildCount2 = e50Var.getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i57);
        int mode4 = View.MeasureSpec.getMode(i2);
        int[] iArr4 = e50Var.l;
        if (iArr4 == null || (iArr = e50Var.m) == null) {
            iArr4 = new int[4];
            e50Var.l = iArr4;
            iArr = new int[4];
            e50Var.m = iArr;
        }
        int[] iArr5 = iArr4;
        int[] iArr6 = iArr;
        iArr5[3] = -1;
        char c = 2;
        iArr5[2] = -1;
        iArr5[1] = -1;
        iArr5[0] = -1;
        iArr6[3] = -1;
        iArr6[2] = -1;
        iArr6[1] = -1;
        iArr6[0] = -1;
        boolean z16 = e50Var.d;
        boolean z17 = e50Var.k;
        boolean z18 = mode3 == 1073741824;
        float f5 = 0.0f;
        boolean z19 = true;
        int i58 = 0;
        int i59 = 0;
        int i60 = 0;
        int i61 = 0;
        int i62 = 0;
        int i63 = 0;
        boolean z20 = false;
        boolean z21 = false;
        while (i58 < virtualChildCount2) {
            char c2 = c;
            View childAt6 = e50Var.getChildAt(i58);
            if (childAt6 == null) {
                e50Var.i = e50Var.i;
                i12 = i58;
                i16 = i60;
                iArr3 = iArr5;
                iArr2 = iArr6;
                z2 = z16;
                z3 = z17;
            } else {
                int i64 = i59;
                if (childAt6.getVisibility() == 8) {
                    i57 = i;
                    i12 = i58;
                    i16 = i60;
                    iArr2 = iArr6;
                    z2 = z16;
                    z3 = z17;
                    i59 = i64;
                    iArr3 = iArr5;
                } else {
                    if (e50Var.c(i58)) {
                        e50Var.i += e50Var.o;
                    }
                    d50 d50Var6 = (d50) childAt6.getLayoutParams();
                    float f6 = ((LinearLayout.LayoutParams) d50Var6).weight;
                    f5 += f6;
                    int i65 = i58;
                    if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) d50Var6).width == 0 && f6 > 0.0f) {
                        int i66 = e50Var.i;
                        int i67 = ((LinearLayout.LayoutParams) d50Var6).leftMargin;
                        if (z18) {
                            e50Var.i = i67 + ((LinearLayout.LayoutParams) d50Var6).rightMargin + i66;
                        } else {
                            e50Var.i = Math.max(i66, i66 + i67 + ((LinearLayout.LayoutParams) d50Var6).rightMargin);
                        }
                        if (z16) {
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt6.measure(makeMeasureSpec2, makeMeasureSpec2);
                            view = childAt6;
                            z2 = z16;
                            z3 = z17;
                            i13 = i64;
                            i12 = i65;
                            d50Var = d50Var6;
                            iArr3 = iArr5;
                            iArr2 = iArr6;
                            i57 = i;
                            i14 = i60;
                            i11 = i61;
                        } else {
                            view = childAt6;
                            z2 = z16;
                            z3 = z17;
                            z21 = true;
                            i13 = i64;
                            i12 = i65;
                            i15 = GroupFlagsKt.IsSubcompositionContextFlag;
                            d50Var = d50Var6;
                            iArr3 = iArr5;
                            iArr2 = iArr6;
                            i57 = i;
                            i14 = i60;
                            i11 = i61;
                            if (mode4 == i15 && ((LinearLayout.LayoutParams) d50Var).height == -1) {
                                z4 = true;
                                z20 = true;
                            } else {
                                z4 = false;
                            }
                            int i68 = ((LinearLayout.LayoutParams) d50Var).topMargin + ((LinearLayout.LayoutParams) d50Var).bottomMargin;
                            int measuredHeight3 = view.getMeasuredHeight() + i68;
                            i63 = View.combineMeasuredStates(i63, view.getMeasuredState());
                            if (z2) {
                                z5 = z4;
                            } else {
                                int baseline2 = view.getBaseline();
                                z5 = z4;
                                if (baseline2 != -1) {
                                    int i69 = ((LinearLayout.LayoutParams) d50Var).gravity;
                                    if (i69 < 0) {
                                        i69 = e50Var.h;
                                    }
                                    int i70 = (((i69 & 112) >> 4) & (-2)) >> 1;
                                    iArr3[i70] = Math.max(iArr3[i70], baseline2);
                                    iArr2[i70] = Math.max(iArr2[i70], measuredHeight3 - baseline2);
                                }
                            }
                            int max2 = Math.max(i13, measuredHeight3);
                            boolean z22 = !z19 && ((LinearLayout.LayoutParams) d50Var).height == -1;
                            if (((LinearLayout.LayoutParams) d50Var).weight <= 0.0f) {
                                if (!z5) {
                                    i68 = measuredHeight3;
                                }
                                i61 = Math.max(i11, i68);
                                max = i14;
                            } else {
                                if (!z5) {
                                    i68 = measuredHeight3;
                                }
                                max = Math.max(i14, i68);
                                i61 = i11;
                            }
                            int i71 = max;
                            i59 = max2;
                            i16 = i71;
                            z19 = z22;
                        }
                    } else {
                        if (((LinearLayout.LayoutParams) d50Var6).width != 0 || f6 <= 0.0f) {
                            i10 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) d50Var6).width = -2;
                            i10 = 0;
                        }
                        iArr2 = iArr6;
                        i11 = i61;
                        i12 = i65;
                        z2 = z16;
                        z3 = z17;
                        int i72 = i10;
                        d50Var = d50Var6;
                        i13 = i64;
                        i57 = i;
                        iArr3 = iArr5;
                        i14 = i60;
                        e50Var.measureChildWithMargins(childAt6, i57, f5 == 0.0f ? e50Var.i : 0, i2, 0);
                        if (i72 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) d50Var).width = i72;
                        }
                        int measuredWidth3 = childAt6.getMeasuredWidth();
                        int i73 = e50Var.i;
                        int i74 = ((LinearLayout.LayoutParams) d50Var).leftMargin;
                        if (z18) {
                            view = childAt6;
                            e50Var.i = i74 + measuredWidth3 + ((LinearLayout.LayoutParams) d50Var).rightMargin + i73;
                        } else {
                            view = childAt6;
                            e50Var.i = Math.max(i73, i73 + measuredWidth3 + i74 + ((LinearLayout.LayoutParams) d50Var).rightMargin);
                        }
                        if (z3) {
                            i62 = Math.max(measuredWidth3, i62);
                        }
                    }
                    i15 = GroupFlagsKt.IsSubcompositionContextFlag;
                    if (mode4 == i15) {
                    }
                    z4 = false;
                    int i682 = ((LinearLayout.LayoutParams) d50Var).topMargin + ((LinearLayout.LayoutParams) d50Var).bottomMargin;
                    int measuredHeight32 = view.getMeasuredHeight() + i682;
                    i63 = View.combineMeasuredStates(i63, view.getMeasuredState());
                    if (z2) {
                    }
                    int max22 = Math.max(i13, measuredHeight32);
                    if (z19) {
                    }
                    if (((LinearLayout.LayoutParams) d50Var).weight <= 0.0f) {
                    }
                    int i712 = max;
                    i59 = max22;
                    i16 = i712;
                    z19 = z22;
                }
            }
            i60 = i16;
            i58 = i12 + 1;
            c = c2;
            iArr5 = iArr3;
            iArr6 = iArr2;
            z16 = z2;
            z17 = z3;
        }
        int[] iArr7 = iArr5;
        int[] iArr8 = iArr6;
        char c3 = c;
        boolean z23 = z16;
        boolean z24 = z17;
        int i75 = i59;
        int i76 = i60;
        int i77 = i61;
        if (e50Var.i > 0 && e50Var.c(virtualChildCount2)) {
            e50Var.i += e50Var.o;
        }
        int i78 = iArr7[1];
        int max3 = (i78 == -1 && iArr7[0] == -1 && iArr7[c3] == -1 && iArr7[3] == -1) ? i75 : Math.max(i75, Math.max(iArr8[3], Math.max(iArr8[0], Math.max(iArr8[1], iArr8[c3]))) + Math.max(iArr7[3], Math.max(iArr7[0], Math.max(i78, iArr7[c3]))));
        if (z24 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
            e50Var.i = 0;
            for (int i79 = 0; i79 < virtualChildCount2; i79++) {
                View childAt7 = e50Var.getChildAt(i79);
                if (childAt7 == null) {
                    e50Var.i = e50Var.i;
                } else if (childAt7.getVisibility() != 8) {
                    d50 d50Var7 = (d50) childAt7.getLayoutParams();
                    int i80 = e50Var.i;
                    if (z18) {
                        e50Var.i = ((LinearLayout.LayoutParams) d50Var7).leftMargin + i62 + ((LinearLayout.LayoutParams) d50Var7).rightMargin + i80;
                    } else {
                        e50Var.i = Math.max(i80, i80 + i62 + ((LinearLayout.LayoutParams) d50Var7).leftMargin + ((LinearLayout.LayoutParams) d50Var7).rightMargin);
                    }
                }
            }
        }
        int paddingRight = e50Var.getPaddingRight() + e50Var.getPaddingLeft() + e50Var.i;
        e50Var.i = paddingRight;
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, e50Var.getSuggestedMinimumWidth()), i57, 0);
        int i81 = (resolveSizeAndState2 & 16777215) - e50Var.i;
        if (z21 || (i81 != 0 && f5 > 0.0f)) {
            float f7 = e50Var.j;
            if (f7 > 0.0f) {
                f5 = f7;
            }
            iArr7[3] = -1;
            iArr7[c3] = -1;
            iArr7[1] = -1;
            iArr7[0] = -1;
            iArr8[3] = -1;
            iArr8[c3] = -1;
            iArr8[1] = -1;
            iArr8[0] = -1;
            e50Var.i = 0;
            max3 = -1;
            int i82 = 0;
            while (i82 < virtualChildCount2) {
                View childAt8 = e50Var.getChildAt(i82);
                if (childAt8 == null || childAt8.getVisibility() == 8) {
                    i7 = resolveSizeAndState2;
                } else {
                    d50 d50Var8 = (d50) childAt8.getLayoutParams();
                    float f8 = ((LinearLayout.LayoutParams) d50Var8).weight;
                    if (f8 > 0.0f) {
                        int i83 = (int) ((i81 * f8) / f5);
                        f5 -= f8;
                        i81 -= i83;
                        i7 = resolveSizeAndState2;
                        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i2, e50Var.getPaddingBottom() + e50Var.getPaddingTop() + ((LinearLayout.LayoutParams) d50Var8).topMargin + ((LinearLayout.LayoutParams) d50Var8).bottomMargin, ((LinearLayout.LayoutParams) d50Var8).height);
                        if (((LinearLayout.LayoutParams) d50Var8).width == 0) {
                            i9 = GroupFlagsKt.IsSubcompositionContextFlag;
                            if (mode3 == 1073741824) {
                                if (i83 <= 0) {
                                    i83 = 0;
                                }
                                childAt8.measure(View.MeasureSpec.makeMeasureSpec(i83, GroupFlagsKt.IsSubcompositionContextFlag), childMeasureSpec2);
                                i63 = View.combineMeasuredStates(i63, childAt8.getMeasuredState() & (-16777216));
                            }
                        } else {
                            i9 = GroupFlagsKt.IsSubcompositionContextFlag;
                        }
                        int measuredWidth4 = childAt8.getMeasuredWidth() + i83;
                        if (measuredWidth4 < 0) {
                            measuredWidth4 = 0;
                        }
                        childAt8.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i9), childMeasureSpec2);
                        i63 = View.combineMeasuredStates(i63, childAt8.getMeasuredState() & (-16777216));
                    } else {
                        i7 = resolveSizeAndState2;
                    }
                    int i84 = e50Var.i;
                    if (z18) {
                        e50Var.i = childAt8.getMeasuredWidth() + ((LinearLayout.LayoutParams) d50Var8).leftMargin + ((LinearLayout.LayoutParams) d50Var8).rightMargin + i84;
                    } else {
                        e50Var.i = Math.max(i84, childAt8.getMeasuredWidth() + i84 + ((LinearLayout.LayoutParams) d50Var8).leftMargin + ((LinearLayout.LayoutParams) d50Var8).rightMargin);
                    }
                    boolean z25 = mode4 != 1073741824 && ((LinearLayout.LayoutParams) d50Var8).height == -1;
                    int i85 = ((LinearLayout.LayoutParams) d50Var8).topMargin + ((LinearLayout.LayoutParams) d50Var8).bottomMargin;
                    int measuredHeight4 = childAt8.getMeasuredHeight() + i85;
                    max3 = Math.max(max3, measuredHeight4);
                    if (!z25) {
                        i85 = measuredHeight4;
                    }
                    int max4 = Math.max(i76, i85);
                    if (z19) {
                        i8 = -1;
                        if (((LinearLayout.LayoutParams) d50Var8).height == -1) {
                            z = true;
                            if (!z23 && (baseline = childAt8.getBaseline()) != i8) {
                                int i86 = ((LinearLayout.LayoutParams) d50Var8).gravity;
                                if (i86 < 0) {
                                    i86 = e50Var.h;
                                }
                                int i87 = (((i86 & 112) >> 4) & (-2)) >> 1;
                                iArr7[i87] = Math.max(iArr7[i87], baseline);
                                iArr8[i87] = Math.max(iArr8[i87], measuredHeight4 - baseline);
                            }
                            z19 = z;
                            i76 = max4;
                        }
                    } else {
                        i8 = -1;
                    }
                    z = false;
                    if (!z23) {
                    }
                    z19 = z;
                    i76 = max4;
                }
                i82++;
                resolveSizeAndState2 = i7;
            }
            i3 = resolveSizeAndState2;
            i4 = -16777216;
            e50Var.i = e50Var.getPaddingRight() + e50Var.getPaddingLeft() + e50Var.i;
            int i88 = iArr7[1];
            if (i88 == -1 && iArr7[0] == -1 && iArr7[c3] == -1 && iArr7[3] == -1) {
                i5 = 0;
            } else {
                i5 = 0;
                max3 = Math.max(max3, Math.max(iArr8[3], Math.max(iArr8[0], Math.max(iArr8[1], iArr8[c3]))) + Math.max(iArr7[3], Math.max(iArr7[0], Math.max(i88, iArr7[c3]))));
            }
            i6 = i76;
        } else {
            i6 = Math.max(i76, i77);
            if (z24 && mode3 != 1073741824) {
                for (int i89 = 0; i89 < virtualChildCount2; i89++) {
                    View childAt9 = e50Var.getChildAt(i89);
                    if (childAt9 != null && childAt9.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((d50) childAt9.getLayoutParams())).weight > 0.0f) {
                        childAt9.measure(View.MeasureSpec.makeMeasureSpec(i62, GroupFlagsKt.IsSubcompositionContextFlag), View.MeasureSpec.makeMeasureSpec(childAt9.getMeasuredHeight(), GroupFlagsKt.IsSubcompositionContextFlag));
                    }
                }
            }
            i3 = resolveSizeAndState2;
            i4 = -16777216;
            i5 = 0;
        }
        if (!z19 && mode4 != 1073741824) {
            max3 = i6;
        }
        e50Var.setMeasuredDimension(i3 | (i63 & i4), View.resolveSizeAndState(Math.max(e50Var.getPaddingBottom() + e50Var.getPaddingTop() + max3, e50Var.getSuggestedMinimumHeight()), i2, i63 << 16));
        if (z20) {
            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(e50Var.getMeasuredHeight(), GroupFlagsKt.IsSubcompositionContextFlag);
            int i90 = i5;
            while (i90 < virtualChildCount2) {
                View childAt10 = e50Var.getChildAt(i90);
                if (childAt10.getVisibility() != 8) {
                    d50 d50Var9 = (d50) childAt10.getLayoutParams();
                    if (((LinearLayout.LayoutParams) d50Var9).height == -1) {
                        int i91 = ((LinearLayout.LayoutParams) d50Var9).width;
                        ((LinearLayout.LayoutParams) d50Var9).width = childAt10.getMeasuredWidth();
                        e50Var.measureChildWithMargins(childAt10, i57, 0, makeMeasureSpec3, 0);
                        ((LinearLayout.LayoutParams) d50Var9).width = i91;
                    }
                }
                i90++;
                e50Var = this;
                i57 = i;
            }
        }
    }

    public void setBaselineAligned(boolean z) {
        this.d = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.e = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.n) {
            return;
        }
        this.n = drawable;
        if (drawable != null) {
            this.o = drawable.getIntrinsicWidth();
            this.p = drawable.getIntrinsicHeight();
        } else {
            this.o = 0;
            this.p = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.r = i;
    }

    public void setGravity(int i) {
        if (this.h != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.h = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.h;
        if ((8388615 & i3) != i2) {
            this.h = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.k = z;
    }

    public void setOrientation(int i) {
        if (this.g != i) {
            this.g = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.q) {
            requestLayout();
        }
        this.q = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.h;
        if ((i3 & 112) != i2) {
            this.h = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.j = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new d50(layoutParams);
    }
}
