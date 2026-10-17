package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract class l7 extends AutoCompleteTextView {
    public static final int[] g = {R.attr.popupBackground};
    public final m7 d;
    public final w7 e;
    public final p7 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l7(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.lumi.singularity.R.attr.autoCompleteTextViewStyle);
        o7 o7Var;
        boolean z;
        boolean z2;
        String str;
        String str2;
        boolean z3;
        char c;
        int resourceId;
        ColorStateList q;
        int i;
        int resourceId2;
        ColorStateList colorStateList;
        int resourceId3;
        ColorStateList g2;
        int resourceId4;
        int[] iArr = vh0.b;
        Object obj = sv0.a;
        if (!(context.getResources() instanceof uv0)) {
            context.getResources();
            int i2 = h11.a;
        }
        Context context2 = getContext();
        ThreadLocal threadLocal = uu0.a;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(vh0.c);
        try {
            if (!obtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
            obtainStyledAttributes.recycle();
            Context context3 = getContext();
            TypedArray obtainStyledAttributes2 = context3.obtainStyledAttributes(attributeSet, g, com.lumi.singularity.R.attr.autoCompleteTextViewStyle, 0);
            if (obtainStyledAttributes2.hasValue(0)) {
                setDropDownBackgroundDrawable((!obtainStyledAttributes2.hasValue(0) || (resourceId4 = obtainStyledAttributes2.getResourceId(0, 0)) == 0) ? obtainStyledAttributes2.getDrawable(0) : aj0.c().d(context3, resourceId4));
            }
            obtainStyledAttributes2.recycle();
            m7 m7Var = new m7(this);
            this.d = m7Var;
            Context context4 = getContext();
            int[] iArr2 = vh0.g;
            TypedArray obtainStyledAttributes3 = context4.obtainStyledAttributes(attributeSet, iArr2, com.lumi.singularity.R.attr.autoCompleteTextViewStyle, 0);
            Context context5 = getContext();
            int i3 = u11.a;
            s11.a(this, context5, iArr2, attributeSet, obtainStyledAttributes3, com.lumi.singularity.R.attr.autoCompleteTextViewStyle, 0);
            try {
                if (obtainStyledAttributes3.hasValue(0)) {
                    m7Var.c = obtainStyledAttributes3.getResourceId(0, -1);
                    o7 o7Var2 = m7Var.b;
                    Context context6 = getContext();
                    int i4 = m7Var.c;
                    synchronized (o7Var2) {
                        g2 = o7Var2.a.g(context6, i4);
                    }
                    if (g2 != null) {
                        m7Var.b(g2);
                    }
                }
                if (obtainStyledAttributes3.hasValue(1)) {
                    if (!obtainStyledAttributes3.hasValue(1) || (resourceId3 = obtainStyledAttributes3.getResourceId(1, 0)) == 0 || (colorStateList = cq.q(context4, resourceId3)) == null) {
                        colorStateList = obtainStyledAttributes3.getColorStateList(1);
                    }
                    p11.d(this, colorStateList);
                }
                if (obtainStyledAttributes3.hasValue(2)) {
                    p11.e(this, ns.a(obtainStyledAttributes3.getInt(2, -1)));
                }
                obtainStyledAttributes3.recycle();
                w7 w7Var = new w7(this);
                this.e = w7Var;
                int[] iArr3 = vh0.f;
                a8 a8Var = w7Var.i;
                Context context7 = getContext();
                synchronized (o7.class) {
                    try {
                        if (o7.c == null) {
                            o7.b();
                        }
                        o7Var = o7.c;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                int[] iArr4 = vh0.a;
                TypedArray obtainStyledAttributes4 = context7.obtainStyledAttributes(attributeSet, iArr4, com.lumi.singularity.R.attr.autoCompleteTextViewStyle, 0);
                s11.a(this, getContext(), iArr4, attributeSet, obtainStyledAttributes4, com.lumi.singularity.R.attr.autoCompleteTextViewStyle, 0);
                int resourceId5 = obtainStyledAttributes4.getResourceId(0, -1);
                if (obtainStyledAttributes4.hasValue(3)) {
                    w7Var.b = w7.c(context7, o7Var, obtainStyledAttributes4.getResourceId(3, 0));
                }
                if (obtainStyledAttributes4.hasValue(1)) {
                    w7Var.c = w7.c(context7, o7Var, obtainStyledAttributes4.getResourceId(1, 0));
                }
                if (obtainStyledAttributes4.hasValue(4)) {
                    w7Var.d = w7.c(context7, o7Var, obtainStyledAttributes4.getResourceId(4, 0));
                }
                if (obtainStyledAttributes4.hasValue(2)) {
                    w7Var.e = w7.c(context7, o7Var, obtainStyledAttributes4.getResourceId(2, 0));
                }
                if (obtainStyledAttributes4.hasValue(5)) {
                    w7Var.f = w7.c(context7, o7Var, obtainStyledAttributes4.getResourceId(5, 0));
                }
                if (obtainStyledAttributes4.hasValue(6)) {
                    w7Var.g = w7.c(context7, o7Var, obtainStyledAttributes4.getResourceId(6, 0));
                }
                obtainStyledAttributes4.recycle();
                boolean z4 = getTransformationMethod() instanceof PasswordTransformationMethod;
                if (resourceId5 != -1) {
                    TypedArray obtainStyledAttributes5 = context7.obtainStyledAttributes(resourceId5, iArr3);
                    c8 c8Var = new c8(context7, obtainStyledAttributes5);
                    if (z4 || !obtainStyledAttributes5.hasValue(14)) {
                        z = false;
                        z2 = false;
                    } else {
                        z2 = obtainStyledAttributes5.getBoolean(14, false);
                        z = true;
                    }
                    w7Var.d(context7, c8Var);
                    str2 = obtainStyledAttributes5.hasValue(15) ? obtainStyledAttributes5.getString(15) : null;
                    str = obtainStyledAttributes5.hasValue(13) ? obtainStyledAttributes5.getString(13) : null;
                    c8Var.k();
                } else {
                    z = false;
                    z2 = false;
                    str = null;
                    str2 = null;
                }
                TypedArray obtainStyledAttributes6 = context7.obtainStyledAttributes(attributeSet, iArr3, com.lumi.singularity.R.attr.autoCompleteTextViewStyle, 0);
                c8 c8Var2 = new c8(context7, obtainStyledAttributes6);
                if (!z4 && obtainStyledAttributes6.hasValue(14)) {
                    z2 = obtainStyledAttributes6.getBoolean(14, false);
                    z = true;
                }
                boolean z5 = z2;
                str2 = obtainStyledAttributes6.hasValue(15) ? obtainStyledAttributes6.getString(15) : str2;
                str = obtainStyledAttributes6.hasValue(13) ? obtainStyledAttributes6.getString(13) : str;
                if (obtainStyledAttributes6.hasValue(0) && obtainStyledAttributes6.getDimensionPixelSize(0, -1) == 0) {
                    setTextSize(0, 0.0f);
                }
                w7Var.d(context7, c8Var2);
                c8Var2.k();
                if (!z4 && z) {
                    setAllCaps(z5);
                }
                Typeface typeface = w7Var.l;
                if (typeface != null) {
                    if (w7Var.k == -1) {
                        setTypeface(typeface, w7Var.j);
                    } else {
                        setTypeface(typeface);
                    }
                }
                if (str != null) {
                    u7.d(this, str);
                }
                if (str2 != null) {
                    t7.b(this, t7.a(str2));
                }
                Context context8 = a8Var.h;
                TypedArray obtainStyledAttributes7 = context8.obtainStyledAttributes(attributeSet, iArr, com.lumi.singularity.R.attr.autoCompleteTextViewStyle, 0);
                l7 l7Var = a8Var.g;
                s11.a(l7Var, l7Var.getContext(), iArr, attributeSet, obtainStyledAttributes7, com.lumi.singularity.R.attr.autoCompleteTextViewStyle, 0);
                if (obtainStyledAttributes7.hasValue(5)) {
                    a8Var.a = obtainStyledAttributes7.getInt(5, 0);
                }
                float dimension = obtainStyledAttributes7.hasValue(4) ? obtainStyledAttributes7.getDimension(4, -1.0f) : -1.0f;
                float dimension2 = obtainStyledAttributes7.hasValue(2) ? obtainStyledAttributes7.getDimension(2, -1.0f) : -1.0f;
                float dimension3 = obtainStyledAttributes7.hasValue(1) ? obtainStyledAttributes7.getDimension(1, -1.0f) : -1.0f;
                if (!obtainStyledAttributes7.hasValue(3) || (resourceId2 = obtainStyledAttributes7.getResourceId(3, 0)) <= 0) {
                    z3 = false;
                    c = 3;
                } else {
                    c = 3;
                    TypedArray obtainTypedArray = obtainStyledAttributes7.getResources().obtainTypedArray(resourceId2);
                    int length = obtainTypedArray.length();
                    int[] iArr5 = new int[length];
                    z3 = false;
                    if (length > 0) {
                        for (int i5 = 0; i5 < length; i5++) {
                            iArr5[i5] = obtainTypedArray.getDimensionPixelSize(i5, -1);
                        }
                        int[] a = a8.a(iArr5);
                        a8Var.e = a;
                        boolean z6 = a.length > 0;
                        a8Var.f = z6;
                        if (z6) {
                            a8Var.a = 1;
                            a8Var.c = a[0];
                            a8Var.d = a[r5 - 1];
                            a8Var.b = -1.0f;
                        }
                    }
                    obtainTypedArray.recycle();
                }
                obtainStyledAttributes7.recycle();
                int i6 = a8Var.a;
                if (i6 == 1) {
                    boolean z7 = a8Var.f;
                    if (!z7) {
                        DisplayMetrics displayMetrics = context8.getResources().getDisplayMetrics();
                        if (dimension2 == -1.0f) {
                            i = 2;
                            dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                        } else {
                            i = 2;
                        }
                        dimension3 = dimension3 == -1.0f ? TypedValue.applyDimension(i, 112.0f, displayMetrics) : dimension3;
                        dimension = dimension == -1.0f ? 1.0f : dimension;
                        if (dimension2 <= 0.0f) {
                            throw new IllegalArgumentException("Minimum auto-size text size (" + dimension2 + "px) is less or equal to (0px)");
                        }
                        if (dimension3 <= dimension2) {
                            throw new IllegalArgumentException("Maximum auto-size text size (" + dimension3 + "px) is less or equal to minimum auto-size text size (" + dimension2 + "px)");
                        }
                        if (dimension <= 0.0f) {
                            throw new IllegalArgumentException("The auto-size step granularity (" + dimension + "px) is less or equal to (0px)");
                        }
                        a8Var.a = 1;
                        a8Var.c = dimension2;
                        a8Var.d = dimension3;
                        a8Var.b = dimension;
                        a8Var.f = z3;
                        i6 = 1;
                        z7 = false;
                    }
                    if (i6 == 1 && (!z7 || a8Var.e.length == 0)) {
                        int floor = ((int) Math.floor((a8Var.d - a8Var.c) / a8Var.b)) + 1;
                        int[] iArr6 = new int[floor];
                        for (int i7 = 0; i7 < floor; i7++) {
                            iArr6[i7] = Math.round((i7 * a8Var.b) + a8Var.c);
                        }
                        a8Var.e = a8.a(iArr6);
                    }
                }
                if (a8Var.a != 0) {
                    int[] iArr7 = a8Var.e;
                    if (iArr7.length > 0) {
                        if (u7.a(this) != -1.0f) {
                            u7.b(this, Math.round(a8Var.c), Math.round(a8Var.d), Math.round(a8Var.b), 0);
                        } else {
                            u7.c(this, iArr7, 0);
                        }
                    }
                }
                TypedArray obtainStyledAttributes8 = context7.obtainStyledAttributes(attributeSet, iArr);
                int resourceId6 = obtainStyledAttributes8.getResourceId(8, -1);
                Drawable a2 = resourceId6 != -1 ? o7Var.a(context7, resourceId6) : null;
                int resourceId7 = obtainStyledAttributes8.getResourceId(13, -1);
                Drawable a3 = resourceId7 != -1 ? o7Var.a(context7, resourceId7) : null;
                int resourceId8 = obtainStyledAttributes8.getResourceId(9, -1);
                Drawable a4 = resourceId8 != -1 ? o7Var.a(context7, resourceId8) : null;
                int resourceId9 = obtainStyledAttributes8.getResourceId(6, -1);
                Drawable a5 = resourceId9 != -1 ? o7Var.a(context7, resourceId9) : null;
                int resourceId10 = obtainStyledAttributes8.getResourceId(10, -1);
                Drawable a6 = resourceId10 != -1 ? o7Var.a(context7, resourceId10) : null;
                int resourceId11 = obtainStyledAttributes8.getResourceId(7, -1);
                Drawable a7 = resourceId11 != -1 ? o7Var.a(context7, resourceId11) : null;
                if (a6 != null || a7 != null) {
                    Drawable[] a8 = s7.a(this);
                    s7.b(this, a6 == null ? a8[0] : a6, a3 == null ? a8[1] : a3, a7 == null ? a8[2] : a7, a5 == null ? a8[c] : a5);
                } else if (a2 != null || a3 != null || a4 != null || a5 != null) {
                    Drawable[] a9 = s7.a(this);
                    Drawable drawable = a9[0];
                    if (drawable == null && a9[2] == null) {
                        Drawable[] compoundDrawables = getCompoundDrawables();
                        setCompoundDrawablesWithIntrinsicBounds(a2 == null ? compoundDrawables[0] : a2, a3 == null ? compoundDrawables[1] : a3, a4 == null ? compoundDrawables[2] : a4, a5 == null ? compoundDrawables[c] : a5);
                    } else {
                        s7.b(this, drawable, a3 == null ? a9[1] : a3, a9[2], a5 == null ? a9[c] : a5);
                    }
                }
                if (obtainStyledAttributes8.hasValue(11)) {
                    setCompoundDrawableTintList((!obtainStyledAttributes8.hasValue(11) || (resourceId = obtainStyledAttributes8.getResourceId(11, 0)) == 0 || (q = cq.q(context7, resourceId)) == null) ? obtainStyledAttributes8.getColorStateList(11) : q);
                }
                int i8 = -1;
                if (obtainStyledAttributes8.hasValue(12)) {
                    setCompoundDrawableTintMode(ns.a(obtainStyledAttributes8.getInt(12, -1)));
                }
                int dimensionPixelSize = obtainStyledAttributes8.getDimensionPixelSize(15, -1);
                int dimensionPixelSize2 = obtainStyledAttributes8.getDimensionPixelSize(18, -1);
                int dimensionPixelSize3 = obtainStyledAttributes8.getDimensionPixelSize(19, -1);
                obtainStyledAttributes8.recycle();
                if (dimensionPixelSize != -1) {
                    if (dimensionPixelSize < 0) {
                        throw new IllegalArgumentException();
                    }
                    setFirstBaselineToTopHeight(dimensionPixelSize);
                }
                if (dimensionPixelSize2 != -1) {
                    if (dimensionPixelSize2 < 0) {
                        throw new IllegalArgumentException();
                    }
                    Paint.FontMetricsInt fontMetricsInt = getPaint().getFontMetricsInt();
                    int i9 = getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
                    if (dimensionPixelSize2 > Math.abs(i9)) {
                        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), dimensionPixelSize2 - i9);
                    }
                    i8 = -1;
                }
                if (dimensionPixelSize3 != i8) {
                    if (dimensionPixelSize3 < 0) {
                        throw new IllegalArgumentException();
                    }
                    if (dimensionPixelSize3 != getPaint().getFontMetricsInt(null)) {
                        setLineSpacing(dimensionPixelSize3 - r0, 1.0f);
                    }
                }
                this.e.b();
                p7 p7Var = new p7(this, 0);
                this.f = p7Var;
                obtainStyledAttributes3 = getContext().obtainStyledAttributes(attributeSet, iArr, com.lumi.singularity.R.attr.autoCompleteTextViewStyle, 0);
                try {
                    boolean z8 = obtainStyledAttributes3.hasValue(14) ? obtainStyledAttributes3.getBoolean(14, true) : true;
                    obtainStyledAttributes3.recycle();
                    p7Var.h(z8);
                    KeyListener keyListener = getKeyListener();
                    if (keyListener instanceof NumberKeyListener) {
                        return;
                    }
                    boolean isFocusable = super.isFocusable();
                    boolean isClickable = super.isClickable();
                    boolean isLongClickable = super.isLongClickable();
                    int inputType = super.getInputType();
                    KeyListener f = p7Var.f(keyListener);
                    if (f == keyListener) {
                        return;
                    }
                    super.setKeyListener(f);
                    super.setRawInputType(inputType);
                    super.setFocusable(isFocusable);
                    super.setClickable(isClickable);
                    super.setLongClickable(isLongClickable);
                } finally {
                }
            } finally {
            }
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        m7 m7Var = this.d;
        if (m7Var != null) {
            m7Var.a();
        }
        w7 w7Var = this.e;
        if (w7Var != null) {
            w7Var.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    public ColorStateList getSupportBackgroundTintList() {
        tv0 tv0Var;
        m7 m7Var = this.d;
        if (m7Var == null || (tv0Var = m7Var.e) == null) {
            return null;
        }
        return tv0Var.a;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        tv0 tv0Var;
        m7 m7Var = this.d;
        if (m7Var == null || (tv0Var = m7Var.e) == null) {
            return null;
        }
        return tv0Var.b;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        tv0 tv0Var = this.e.h;
        if (tv0Var != null) {
            return tv0Var.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        tv0 tv0Var = this.e.h;
        if (tv0Var != null) {
            return tv0Var.b;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            }
        }
        p7 p7Var = (p7) this.f.d;
        if (onCreateInputConnection == null) {
            return null;
        }
        return onCreateInputConnection instanceof ht ? onCreateInputConnection : new ht((l7) ((bg) p7Var.d).a, onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        m7 m7Var = this.d;
        if (m7Var != null) {
            m7Var.c = -1;
            m7Var.b(null);
            m7Var.a();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        ColorStateList colorStateList;
        super.setBackgroundResource(i);
        m7 m7Var = this.d;
        if (m7Var != null) {
            m7Var.c = i;
            o7 o7Var = m7Var.b;
            if (o7Var != null) {
                Context context = m7Var.a.getContext();
                synchronized (o7Var) {
                    colorStateList = o7Var.a.g(context, i);
                }
            } else {
                colorStateList = null;
            }
            m7Var.b(colorStateList);
            m7Var.a();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        w7 w7Var = this.e;
        if (w7Var != null) {
            w7Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        w7 w7Var = this.e;
        if (w7Var != null) {
            w7Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(aj0.c().d(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.f.h(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f.f(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        m7 m7Var = this.d;
        if (m7Var != null) {
            tv0 tv0Var = m7Var.e;
            if (tv0Var == null) {
                tv0Var = new tv0();
                m7Var.e = tv0Var;
            }
            tv0Var.a = colorStateList;
            tv0Var.d = true;
            m7Var.a();
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        m7 m7Var = this.d;
        if (m7Var != null) {
            tv0 tv0Var = m7Var.e;
            if (tv0Var == null) {
                tv0Var = new tv0();
                m7Var.e = tv0Var;
            }
            tv0Var.b = mode;
            tv0Var.c = true;
            m7Var.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        w7 w7Var = this.e;
        tv0 tv0Var = w7Var.h;
        if (tv0Var == null) {
            tv0Var = new tv0();
            w7Var.h = tv0Var;
        }
        tv0 tv0Var2 = tv0Var;
        tv0Var.a = colorStateList;
        tv0Var.d = colorStateList != null;
        w7Var.b = tv0Var2;
        w7Var.c = tv0Var2;
        w7Var.d = tv0Var2;
        w7Var.e = tv0Var2;
        w7Var.f = tv0Var2;
        w7Var.g = tv0Var2;
        w7Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        w7 w7Var = this.e;
        tv0 tv0Var = w7Var.h;
        if (tv0Var == null) {
            tv0Var = new tv0();
            w7Var.h = tv0Var;
        }
        tv0 tv0Var2 = tv0Var;
        tv0Var.b = mode;
        tv0Var.c = mode != null;
        w7Var.b = tv0Var2;
        w7Var.c = tv0Var2;
        w7Var.d = tv0Var2;
        w7Var.e = tv0Var2;
        w7Var.f = tv0Var2;
        w7Var.g = tv0Var2;
        w7Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        String string;
        super.setTextAppearance(context, i);
        w7 w7Var = this.e;
        if (w7Var != null) {
            l7 l7Var = w7Var.a;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, vh0.f);
            c8 c8Var = new c8(context, obtainStyledAttributes);
            if (obtainStyledAttributes.hasValue(14)) {
                l7Var.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
            }
            if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
                l7Var.setTextSize(0, 0.0f);
            }
            w7Var.d(context, c8Var);
            if (obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
                u7.d(l7Var, string);
            }
            c8Var.k();
            Typeface typeface = w7Var.l;
            if (typeface != null) {
                l7Var.setTypeface(typeface, w7Var.j);
            }
        }
    }
}
