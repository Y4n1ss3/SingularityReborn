package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ak0 extends q10 {
    @Override // defpackage.q10
    public final void p(yo0 yo0Var, float f, float f2) {
        yo0Var.d(f2 * f, 180.0f, 90.0f);
        float f3 = f2 * 2.0f * f;
        uo0 uo0Var = new uo0(0.0f, 0.0f, f3, f3);
        uo0Var.f = 180.0f;
        uo0Var.g = 90.0f;
        yo0Var.f.add(uo0Var);
        so0 so0Var = new so0(uo0Var);
        yo0Var.a(180.0f);
        yo0Var.g.add(so0Var);
        yo0Var.d = 270.0f;
        float f4 = (0.0f + f3) * 0.5f;
        float f5 = (f3 - 0.0f) / 2.0f;
        yo0Var.b = (((float) Math.cos(Math.toRadians(270.0d))) * f5) + f4;
        yo0Var.c = (f5 * ((float) Math.sin(Math.toRadians(270.0d)))) + f4;
    }
}
