package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import java.util.BitSet;
import java.util.Objects;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class w80 extends Drawable {
    public v80 a;
    public final xo0[] b;
    public final xo0[] c;
    public final BitSet d;
    public boolean e;
    public final Matrix f;
    public final Path g;
    public final Path h;
    public final RectF i;
    public final RectF j;
    public final Region k;
    public final Region l;
    public po0 m;
    public final Paint n;
    public final Paint o;
    public final p7 p;
    public final ro0 q;
    public PorterDuffColorFilter r;
    public PorterDuffColorFilter s;
    public final RectF t;

    static {
        Paint paint = new Paint(1);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public w80(v80 v80Var) {
        this.b = new xo0[4];
        this.c = new xo0[4];
        this.d = new BitSet(8);
        this.f = new Matrix();
        this.g = new Path();
        this.h = new Path();
        this.i = new RectF();
        this.j = new RectF();
        this.k = new Region();
        this.l = new Region();
        Paint paint = new Paint(1);
        this.n = paint;
        Paint paint2 = new Paint(1);
        this.o = paint2;
        new oo0();
        this.q = Looper.getMainLooper().getThread() == Thread.currentThread() ? qo0.a : new ro0();
        this.t = new RectF();
        this.a = v80Var;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        g();
        f(getState());
        this.p = new p7(this);
    }

    public final void a(RectF rectF, Path path) {
        v80 v80Var = this.a;
        this.q.a(v80Var.a, v80Var.h, rectF, this.p, path);
        if (this.a.g != 1.0f) {
            Matrix matrix = this.f;
            matrix.reset();
            float f = this.a.g;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.t, true);
    }

    public final int b(int i) {
        this.a.getClass();
        v80 v80Var = this.a;
        v80Var.getClass();
        vs vsVar = v80Var.b;
        if (vsVar == null || !vsVar.a || fj.d(i, 255) != vsVar.c) {
            return i;
        }
        return fj.d(fj.b(fj.d(vsVar.b, Math.round(Color.alpha(r3) * 0.0f)), fj.d(i, 255)), Color.alpha(i));
    }

    public final RectF c() {
        Rect bounds = getBounds();
        RectF rectF = this.i;
        rectF.set(bounds);
        return rectF;
    }

    public final boolean d() {
        Paint.Style style = this.a.l;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.o.getStrokeWidth() > 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        Paint paint;
        Paint paint2;
        int i2;
        float f;
        Path path;
        Canvas canvas2;
        Paint paint3;
        Paint paint4;
        PorterDuffColorFilter porterDuffColorFilter = this.r;
        Paint paint5 = this.n;
        paint5.setColorFilter(porterDuffColorFilter);
        int alpha = paint5.getAlpha();
        int i3 = this.a.i;
        paint5.setAlpha(((i3 + (i3 >>> 7)) * alpha) >>> 8);
        PorterDuffColorFilter porterDuffColorFilter2 = this.s;
        Paint paint6 = this.o;
        paint6.setColorFilter(porterDuffColorFilter2);
        this.a.getClass();
        paint6.setStrokeWidth(0.0f);
        int alpha2 = paint6.getAlpha();
        int i4 = this.a.i;
        paint6.setAlpha(((i4 + (i4 >>> 7)) * alpha2) >>> 8);
        boolean z = this.e;
        RectF rectF = this.j;
        Path path2 = this.h;
        Path path3 = this.g;
        if (z) {
            float f2 = -(d() ? paint6.getStrokeWidth() / 2.0f : 0.0f);
            po0 po0Var = this.a.a;
            q10 q10Var = po0Var.a;
            q10 q10Var2 = po0Var.b;
            q10 q10Var3 = po0Var.c;
            q10 q10Var4 = po0Var.d;
            f = 2.0f;
            hn hnVar = po0Var.e;
            hn hnVar2 = po0Var.f;
            i2 = alpha2;
            hn hnVar3 = po0Var.g;
            i = alpha;
            hn hnVar4 = po0Var.h;
            paint2 = paint6;
            ts tsVar = po0Var.i;
            ts tsVar2 = po0Var.j;
            paint = paint5;
            ts tsVar3 = po0Var.k;
            ts tsVar4 = po0Var.l;
            if (!(hnVar instanceof oi0)) {
                hnVar = new l4(f2, hnVar);
            }
            if (!(hnVar2 instanceof oi0)) {
                hnVar2 = new l4(f2, hnVar2);
            }
            if (!(hnVar4 instanceof oi0)) {
                hnVar4 = new l4(f2, hnVar4);
            }
            if (!(hnVar3 instanceof oi0)) {
                hnVar3 = new l4(f2, hnVar3);
            }
            po0 po0Var2 = new po0();
            po0Var2.a = q10Var;
            po0Var2.b = q10Var2;
            po0Var2.c = q10Var3;
            po0Var2.d = q10Var4;
            po0Var2.e = hnVar;
            po0Var2.f = hnVar2;
            po0Var2.g = hnVar3;
            po0Var2.h = hnVar4;
            po0Var2.i = tsVar;
            po0Var2.j = tsVar2;
            po0Var2.k = tsVar3;
            po0Var2.l = tsVar4;
            this.m = po0Var2;
            float f3 = this.a.h;
            rectF.set(c());
            float strokeWidth = d() ? paint2.getStrokeWidth() / 2.0f : 0.0f;
            rectF.inset(strokeWidth, strokeWidth);
            path2 = path2;
            this.q.a(po0Var2, f3, rectF, null, path2);
            path = path3;
            a(c(), path);
            this.e = false;
        } else {
            i = alpha;
            paint = paint5;
            paint2 = paint6;
            i2 = alpha2;
            f = 2.0f;
            path = path3;
        }
        v80 v80Var = this.a;
        v80Var.getClass();
        if (v80Var.j > 0 && !this.a.a.d(c())) {
            path.isConvex();
        }
        v80 v80Var2 = this.a;
        Paint.Style style = v80Var2.l;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            po0 po0Var3 = v80Var2.a;
            RectF c = c();
            if (po0Var3.d(c)) {
                float a = po0Var3.f.a(c) * this.a.h;
                canvas2 = canvas;
                paint3 = paint;
                canvas2.drawRoundRect(c, a, a, paint3);
            } else {
                canvas2 = canvas;
                paint3 = paint;
                canvas2.drawPath(path, paint3);
            }
        } else {
            canvas2 = canvas;
            paint3 = paint;
        }
        if (d()) {
            po0 po0Var4 = this.m;
            rectF.set(c());
            float strokeWidth2 = d() ? paint2.getStrokeWidth() / f : 0.0f;
            rectF.inset(strokeWidth2, strokeWidth2);
            if (po0Var4.d(rectF)) {
                float a2 = po0Var4.f.a(rectF) * this.a.h;
                paint4 = paint2;
                canvas2.drawRoundRect(rectF, a2, a2, paint4);
            } else {
                paint4 = paint2;
                canvas2.drawPath(path2, paint4);
            }
        } else {
            paint4 = paint2;
        }
        paint3.setAlpha(i);
        paint4.setAlpha(i2);
    }

    public final void e(Context context) {
        this.a.b = new vs(context);
        this.a.getClass();
        this.a.j = (int) Math.ceil(0.0d);
        this.a.k = (int) Math.ceil(0.0d);
        g();
        super.invalidateSelf();
    }

    public final boolean f(int[] iArr) {
        boolean z;
        Paint paint;
        int color;
        int colorForState;
        if (this.a.c == null || color == (colorForState = this.a.c.getColorForState(iArr, (color = (paint = this.n).getColor())))) {
            z = false;
        } else {
            paint.setColor(colorForState);
            z = true;
        }
        this.a.getClass();
        return z;
    }

    public final boolean g() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.r;
        PorterDuffColorFilter porterDuffColorFilter3 = this.s;
        v80 v80Var = this.a;
        ColorStateList colorStateList = v80Var.d;
        PorterDuff.Mode mode = v80Var.e;
        if (colorStateList == null || mode == null) {
            int color = this.n.getColor();
            int b = b(color);
            porterDuffColorFilter = b != color ? new PorterDuffColorFilter(b, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(b(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.r = porterDuffColorFilter;
        this.a.getClass();
        this.s = null;
        this.a.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.r) && Objects.equals(porterDuffColorFilter3, this.s)) ? false : true;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.a.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        this.a.getClass();
        if (this.a.a.d(c())) {
            outline.setRoundRect(getBounds(), this.a.a.e.a(c()) * this.a.h);
            return;
        }
        RectF c = c();
        Path path = this.g;
        a(c, path);
        if (Build.VERSION.SDK_INT >= 30) {
            outline.setPath(path);
        } else {
            try {
                outline.setConvexPath(path);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.a.f;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.k;
        region.set(bounds);
        RectF c = c();
        Path path = this.g;
        a(c, path);
        Region region2 = this.l;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.a.d;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.a.getClass();
        this.a.getClass();
        ColorStateList colorStateList2 = this.a.c;
        return colorStateList2 != null && colorStateList2.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        v80 v80Var = this.a;
        v80 v80Var2 = new v80();
        v80Var2.c = null;
        v80Var2.d = null;
        v80Var2.e = PorterDuff.Mode.SRC_IN;
        v80Var2.f = null;
        v80Var2.g = 1.0f;
        v80Var2.h = 1.0f;
        v80Var2.i = 255;
        v80Var2.j = 0;
        v80Var2.k = 0;
        v80Var2.l = Paint.Style.FILL_AND_STROKE;
        v80Var2.a = v80Var.a;
        v80Var2.b = v80Var.b;
        v80Var2.c = v80Var.c;
        v80Var2.e = v80Var.e;
        v80Var2.d = v80Var.d;
        v80Var2.i = v80Var.i;
        v80Var2.g = v80Var.g;
        v80Var2.k = v80Var.k;
        v80Var2.h = v80Var.h;
        v80Var2.j = v80Var.j;
        v80Var2.l = v80Var.l;
        Rect rect = v80Var.f;
        if (rect != null) {
            v80Var2.f = new Rect(rect);
        }
        this.a = v80Var2;
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.e = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z = f(iArr) || g();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        v80 v80Var = this.a;
        if (v80Var.i != i) {
            v80Var.i = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.getClass();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.a.d = colorStateList;
        g();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        v80 v80Var = this.a;
        if (v80Var.e != mode) {
            v80Var.e = mode;
            g();
            super.invalidateSelf();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public w80(po0 po0Var) {
        this(r0);
        v80 v80Var = new v80();
        v80Var.c = null;
        v80Var.d = null;
        v80Var.e = PorterDuff.Mode.SRC_IN;
        v80Var.f = null;
        v80Var.g = 1.0f;
        v80Var.h = 1.0f;
        v80Var.i = 255;
        v80Var.j = 0;
        v80Var.k = 0;
        v80Var.l = Paint.Style.FILL_AND_STROKE;
        v80Var.a = po0Var;
        v80Var.b = null;
    }
}
