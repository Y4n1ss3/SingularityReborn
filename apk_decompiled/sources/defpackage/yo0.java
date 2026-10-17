package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class yo0 {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();

    public yo0() {
        d(0.0f, 270.0f, 0.0f);
    }

    public final void a(float f) {
        float f2 = this.d;
        if (f2 == f) {
            return;
        }
        float f3 = ((f - f2) + 360.0f) % 360.0f;
        if (f3 > 180.0f) {
            return;
        }
        float f4 = this.b;
        float f5 = this.c;
        uo0 uo0Var = new uo0(f4, f5, f4, f5);
        uo0Var.f = this.d;
        uo0Var.g = f3;
        this.g.add(new so0(uo0Var));
        this.d = f;
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((wo0) arrayList.get(i)).a(matrix, path);
        }
    }

    public final void c(float f, float f2) {
        vo0 vo0Var = new vo0();
        vo0Var.b = f;
        vo0Var.c = f2;
        this.f.add(vo0Var);
        to0 to0Var = new to0(vo0Var, this.b, this.c);
        float a = to0Var.a() + 270.0f;
        float a2 = to0Var.a() + 270.0f;
        a(a);
        this.g.add(to0Var);
        this.d = a2;
        this.b = f;
        this.c = f2;
    }

    public final void d(float f, float f2, float f3) {
        this.a = f;
        this.b = 0.0f;
        this.c = f;
        this.d = f2;
        this.e = (f2 + f3) % 360.0f;
        this.f.clear();
        this.g.clear();
    }
}
