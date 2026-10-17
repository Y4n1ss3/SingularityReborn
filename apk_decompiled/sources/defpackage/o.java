package defpackage;

import androidx.compose.runtime.CancellationHandle;
import androidx.compose.runtime.ShouldPauseCallback;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.compose.ui.layout.LayoutNodeSubcompositionsState;
import java.io.FileNotFoundException;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements CancellationHandle, DoubleFunction, ShouldPauseCallback {
    public final /* synthetic */ int a;

    public /* synthetic */ o(int i) {
        this.a = i;
    }

    public static /* synthetic */ void a() {
        throw new ConcurrentModificationException();
    }

    public static /* synthetic */ void b(int i, String str) {
        throw new IllegalStateException((str + i).toString());
    }

    public static /* synthetic */ void c(Object obj) {
        throw new IllegalArgumentException(obj.toString());
    }

    public static /* synthetic */ void d(Object obj, int i, int i2, String str) {
        throw new IllegalArgumentException(str + i + obj + i2);
    }

    public static /* synthetic */ void e(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void f(String str) {
        throw new IllegalStateException(str);
    }

    public static /* synthetic */ void g(String str, int i, Object obj) {
        throw new IllegalStateException((str + i + obj).toString());
    }

    public static /* synthetic */ void h(String str, Object obj, Object obj2) {
        throw new IllegalArgumentException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void i(StringBuilder sb, int i) {
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public static /* synthetic */ void j() {
        throw new tj();
    }

    public static /* synthetic */ void k(Object obj, int i, int i2, String str) {
        throw new IllegalArgumentException((str + i + obj + i2).toString());
    }

    public static /* synthetic */ void l(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void m(String str) {
        throw new IllegalArgumentException(str);
    }

    public static /* synthetic */ void n() {
        throw new tj();
    }

    public static /* synthetic */ void o(Object obj, int i, int i2, String str) {
        throw new IndexOutOfBoundsException(str + i + obj + i2);
    }

    public static /* synthetic */ void p(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void q() {
        throw new NoSuchElementException();
    }

    public static /* synthetic */ void r(Object obj, int i, int i2, String str) {
        throw new IndexOutOfBoundsException(str + i + obj + i2 + ((Object) ")."));
    }

    public static /* synthetic */ void s(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void t(Object obj, String str) {
        throw new IllegalArgumentException((str + obj).toString());
    }

    public static /* synthetic */ void u(Object obj, String str) {
        throw new FileNotFoundException(str + obj);
    }

    @Override // androidx.compose.runtime.CancellationHandle
    public void cancel() {
        CancellationHandle.Companion.Empty$lambda$0();
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public double invoke(double d) {
        double ExtendedSrgb$lambda$0;
        double ExtendedSrgb$lambda$1;
        double Bt2020Hlg$lambda$0;
        double Bt2020Hlg$lambda$1;
        double Bt2020Pq$lambda$0;
        double Bt2020Pq$lambda$1;
        double DoubleIdentity$lambda$0;
        switch (this.a) {
            case 6:
                ExtendedSrgb$lambda$0 = ColorSpaces.ExtendedSrgb$lambda$0(d);
                return ExtendedSrgb$lambda$0;
            case 7:
                ExtendedSrgb$lambda$1 = ColorSpaces.ExtendedSrgb$lambda$1(d);
                return ExtendedSrgb$lambda$1;
            case 8:
                Bt2020Hlg$lambda$0 = ColorSpaces.Bt2020Hlg$lambda$0(d);
                return Bt2020Hlg$lambda$0;
            case 9:
                Bt2020Hlg$lambda$1 = ColorSpaces.Bt2020Hlg$lambda$1(d);
                return Bt2020Hlg$lambda$1;
            case 10:
                Bt2020Pq$lambda$0 = ColorSpaces.Bt2020Pq$lambda$0(d);
                return Bt2020Pq$lambda$0;
            case 11:
                Bt2020Pq$lambda$1 = ColorSpaces.Bt2020Pq$lambda$1(d);
                return Bt2020Pq$lambda$1;
            default:
                DoubleIdentity$lambda$0 = Rgb.DoubleIdentity$lambda$0(d);
                return DoubleIdentity$lambda$0;
        }
    }

    @Override // androidx.compose.runtime.ShouldPauseCallback
    public boolean shouldPause() {
        boolean applyPausedPrecomposition$lambda$0$0$0;
        applyPausedPrecomposition$lambda$0$0$0 = LayoutNodeSubcompositionsState.applyPausedPrecomposition$lambda$0$0$0();
        return applyPausedPrecomposition$lambda$0$0$0;
    }
}
