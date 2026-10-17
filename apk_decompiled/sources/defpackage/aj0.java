package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import com.lumi.singularity.R;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class aj0 {
    public static aj0 g;
    public WeakHashMap a;
    public final WeakHashMap b = new WeakHashMap(0);
    public TypedValue c;
    public boolean d;
    public n7 e;
    public static final PorterDuff.Mode f = PorterDuff.Mode.SRC_IN;
    public static final zi0 h = new zi0(6);

    public static synchronized aj0 c() {
        aj0 aj0Var;
        synchronized (aj0.class) {
            aj0Var = g;
            if (aj0Var == null) {
                aj0Var = new aj0();
                g = aj0Var;
            }
        }
        return aj0Var;
    }

    public static synchronized PorterDuffColorFilter f(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (aj0.class) {
            zi0 zi0Var = h;
            zi0Var.getClass();
            int i2 = (31 + i) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) zi0Var.a(Integer.valueOf(mode.hashCode() + i2));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
            }
        }
        return porterDuffColorFilter;
    }

    public static void i(Drawable drawable, tv0 tv0Var, int[] iArr) {
        int[] state = drawable.getState();
        int[] iArr2 = ns.a;
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z = tv0Var.d;
        if (!z && !tv0Var.c) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilter = null;
        ColorStateList colorStateList = z ? tv0Var.a : null;
        PorterDuff.Mode mode = tv0Var.c ? tv0Var.b : f;
        if (colorStateList != null && mode != null) {
            porterDuffColorFilter = f(colorStateList.getColorForState(iArr, 0), mode);
        }
        drawable.setColorFilter(porterDuffColorFilter);
    }

    public final void a(Context context, int i, ColorStateList colorStateList) {
        WeakHashMap weakHashMap = this.a;
        if (weakHashMap == null) {
            weakHashMap = new WeakHashMap();
            this.a = weakHashMap;
        }
        kr0 kr0Var = (kr0) weakHashMap.get(context);
        if (kr0Var == null) {
            kr0Var = new kr0();
            this.a.put(context, kr0Var);
        }
        int i2 = kr0Var.f;
        if (i2 != 0 && i <= kr0Var.d[i2 - 1]) {
            kr0Var.b(i, colorStateList);
            return;
        }
        if (i2 >= kr0Var.d.length) {
            int i3 = (i2 + 1) * 4;
            int i4 = 4;
            while (true) {
                if (i4 >= 32) {
                    break;
                }
                int i5 = (1 << i4) - 12;
                if (i3 <= i5) {
                    i3 = i5;
                    break;
                }
                i4++;
            }
            int i6 = i3 / 4;
            kr0Var.d = Arrays.copyOf(kr0Var.d, i6);
            kr0Var.e = Arrays.copyOf(kr0Var.e, i6);
        }
        kr0Var.d[i2] = i;
        kr0Var.e[i2] = colorStateList;
        kr0Var.f = i2 + 1;
    }

    public final Drawable b(Context context, int i) {
        LayerDrawable layerDrawable;
        Drawable newDrawable;
        TypedValue typedValue = this.c;
        if (typedValue == null) {
            typedValue = new TypedValue();
            this.c = typedValue;
        }
        context.getResources().getValue(i, typedValue, true);
        long j = (typedValue.assetCookie << 32) | typedValue.data;
        synchronized (this) {
            r60 r60Var = (r60) this.b.get(context);
            layerDrawable = null;
            if (r60Var != null) {
                WeakReference weakReference = (WeakReference) r60Var.a(j);
                if (weakReference != null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                    if (constantState != null) {
                        newDrawable = constantState.newDrawable(context.getResources());
                    } else {
                        r60Var.d(j);
                    }
                }
            }
            newDrawable = null;
        }
        if (newDrawable != null) {
            return newDrawable;
        }
        if (this.e != null) {
            if (i == R.drawable.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{d(context, R.drawable.abc_cab_background_internal_bg), d(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else if (i == R.drawable.abc_ratingbar_material) {
                layerDrawable = n7.c(this, context, R.dimen.abc_star_big);
            } else if (i == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawable = n7.c(this, context, R.dimen.abc_star_medium);
            } else if (i == R.drawable.abc_ratingbar_small_material) {
                layerDrawable = n7.c(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawable == null) {
            return layerDrawable;
        }
        layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
        synchronized (this) {
            try {
                Drawable.ConstantState constantState2 = layerDrawable.getConstantState();
                if (constantState2 == null) {
                    return layerDrawable;
                }
                r60 r60Var2 = (r60) this.b.get(context);
                if (r60Var2 == null) {
                    r60Var2 = new r60();
                    this.b.put(context, r60Var2);
                }
                r60Var2.c(j, new WeakReference(constantState2));
                return layerDrawable;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized Drawable d(Context context, int i) {
        return e(context, i);
    }

    public final synchronized Drawable e(Context context, int i) {
        Drawable b;
        try {
            if (!this.d) {
                this.d = true;
                Drawable d = d(context, R.drawable.abc_vector_test);
                if (d == null || !"android.graphics.drawable.VectorDrawable".equals(d.getClass().getName())) {
                    this.d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            b = b(context, i);
            if (b == null) {
                b = context.getDrawable(i);
            }
            if (b != null) {
                b = h(context, i, b);
            }
            if (b != null) {
                int[] iArr = ns.a;
                String name = b.getClass().getName();
                if (Build.VERSION.SDK_INT < 31 && "android.graphics.drawable.ColorStateListDrawable".equals(name)) {
                    int[] state = b.getState();
                    if (state != null && state.length != 0) {
                        b.setState(ns.b);
                        b.setState(state);
                    }
                    b.setState(ns.a);
                    b.setState(state);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return b;
    }

    public final synchronized ColorStateList g(Context context, int i) {
        ColorStateList colorStateList;
        kr0 kr0Var;
        WeakHashMap weakHashMap = this.a;
        ColorStateList colorStateList2 = null;
        colorStateList = (weakHashMap == null || (kr0Var = (kr0) weakHashMap.get(context)) == null) ? null : (ColorStateList) cq.h(kr0Var, i);
        if (colorStateList == null) {
            n7 n7Var = this.e;
            if (n7Var != null) {
                colorStateList2 = n7Var.d(context, i);
            }
            if (colorStateList2 != null) {
                a(context, i, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable h(Context context, int i, Drawable drawable) {
        int round;
        PorterDuffColorFilter f2;
        ColorStateList g2 = g(context, i);
        if (g2 != null) {
            int[] iArr = ns.a;
            Drawable mutate = drawable.mutate();
            mutate.setTintList(g2);
            PorterDuff.Mode mode = null;
            if (this.e != null && i == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                mutate.setTintMode(mode);
            }
            return mutate;
        }
        n7 n7Var = this.e;
        int i2 = R.attr.colorControlNormal;
        if (n7Var != null) {
            if (i == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int b = uu0.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = o7.b;
                n7.e(findDrawableByLayerId, b, mode2);
                n7.e(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), uu0.b(context, R.attr.colorControlNormal), mode2);
                n7.e(layerDrawable.findDrawableByLayerId(android.R.id.progress), uu0.b(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i == R.drawable.abc_ratingbar_material || i == R.drawable.abc_ratingbar_indicator_material || i == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int a = uu0.a(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = o7.b;
                n7.e(findDrawableByLayerId2, a, mode3);
                n7.e(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), uu0.b(context, R.attr.colorControlActivated), mode3);
                n7.e(layerDrawable2.findDrawableByLayerId(android.R.id.progress), uu0.b(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        n7 n7Var2 = this.e;
        if (n7Var2 != null) {
            PorterDuff.Mode mode4 = o7.b;
            boolean z = true;
            if (!n7.a(i, n7Var2.a)) {
                if (n7.a(i, n7Var2.c)) {
                    i2 = R.attr.colorControlActivated;
                } else {
                    boolean a2 = n7.a(i, n7Var2.d);
                    i2 = android.R.attr.colorBackground;
                    if (a2) {
                        mode4 = PorterDuff.Mode.MULTIPLY;
                    } else if (i == R.drawable.abc_list_divider_mtrl_alpha) {
                        round = Math.round(40.8f);
                        i2 = android.R.attr.colorForeground;
                        if (z) {
                            int[] iArr2 = ns.a;
                            Drawable mutate2 = drawable.mutate();
                            int b2 = uu0.b(context, i2);
                            synchronized (o7.class) {
                                f2 = f(b2, mode4);
                            }
                            mutate2.setColorFilter(f2);
                            if (round != -1) {
                                mutate2.setAlpha(round);
                            }
                        }
                    } else if (i != R.drawable.abc_dialog_material_background) {
                        i2 = 0;
                        z = false;
                    }
                }
            }
            round = -1;
            if (z) {
            }
        }
        return drawable;
    }
}
