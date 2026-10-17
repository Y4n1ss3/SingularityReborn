package defpackage;

import android.graphics.Typeface;
import androidx.compose.ui.graphics.Fields;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class f90 {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;

    public f90(Typeface typeface, d90 d90Var) {
        int i;
        int i2;
        int i3;
        int i4;
        this.d = typeface;
        this.a = d90Var;
        this.c = new e90(Fields.RotationZ);
        int a = d90Var.a(6);
        if (a != 0) {
            int i5 = a + d90Var.d;
            i = ((ByteBuffer) d90Var.g).getInt(((ByteBuffer) d90Var.g).getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.b = new char[i * 2];
        int a2 = d90Var.a(6);
        if (a2 != 0) {
            int i6 = a2 + d90Var.d;
            i2 = ((ByteBuffer) d90Var.g).getInt(((ByteBuffer) d90Var.g).getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            r01 r01Var = new r01(this, i7);
            c90 b = r01Var.b();
            int a3 = b.a(4);
            Character.toChars(a3 != 0 ? ((ByteBuffer) b.g).getInt(a3 + b.d) : 0, (char[]) this.b, i7 * 2);
            c90 b2 = r01Var.b();
            int a4 = b2.a(16);
            if (a4 != 0) {
                int i8 = a4 + b2.d;
                i3 = ((ByteBuffer) b2.g).getInt(((ByteBuffer) b2.g).getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            if (!(i3 > 0)) {
                o.m("invalid metadata codepoint length");
                throw null;
            }
            e90 e90Var = (e90) this.c;
            c90 b3 = r01Var.b();
            int a5 = b3.a(16);
            if (a5 != 0) {
                int i9 = a5 + b3.d;
                i4 = ((ByteBuffer) b3.g).getInt(((ByteBuffer) b3.g).getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            e90Var.a(r01Var, 0, i4 - 1);
        }
    }

    public w11 a(ji jiVar, String str) {
        w11 w11Var;
        w11 a;
        synchronized (((zk0) this.d)) {
            try {
                t60 t60Var = (t60) this.a;
                t60Var.getClass();
                w11Var = (w11) t60Var.a.get(str);
                if (jiVar.c(w11Var)) {
                    if (((z11) this.b) instanceof jl0) {
                        w11Var.getClass();
                    }
                    w11Var.getClass();
                } else {
                    ja0 ja0Var = new ja0((to) this.c);
                    ja0Var.a.put(p01.f, str);
                    z11 z11Var = (z11) this.b;
                    try {
                        try {
                            a = z11Var.c(jiVar, ja0Var);
                        } catch (AbstractMethodError unused) {
                            Class cls = jiVar.d;
                            cls.getClass();
                            a = z11Var.a(cls);
                        }
                    } catch (AbstractMethodError unused2) {
                        Class cls2 = jiVar.d;
                        cls2.getClass();
                        a = z11Var.b(cls2, ja0Var);
                    }
                    w11Var = a;
                    t60 t60Var2 = (t60) this.a;
                    t60Var2.getClass();
                    w11Var.getClass();
                    w11 w11Var2 = (w11) t60Var2.a.put(str, w11Var);
                    if (w11Var2 != null) {
                        w11Var2.clear$lifecycle_viewmodel_release();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return w11Var;
    }

    public f90(t60 t60Var, z11 z11Var, to toVar) {
        t60Var.getClass();
        this.a = t60Var;
        this.b = z11Var;
        this.c = toVar;
        this.d = new zk0(7);
    }
}
