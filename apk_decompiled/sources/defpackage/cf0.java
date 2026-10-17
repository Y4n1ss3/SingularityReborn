package defpackage;

import android.graphics.Path;
import android.graphics.PathIterator;
import androidx.graphics.path.ConicConverter;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class cf0 extends df0 {
    public final PathIterator e;
    public final ConicConverter f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cf0(Path path, int i, float f) {
        super(path, i, f);
        path.getClass();
        if (i == 0) {
            throw null;
        }
        PathIterator pathIterator = path.getPathIterator();
        pathIterator.getClass();
        this.e = pathIterator;
        ConicConverter conicConverter = new ConicConverter();
        conicConverter.c = new float[130];
        this.f = conicConverter;
    }

    @Override // defpackage.df0
    public final int a(boolean z) {
        boolean z2 = z && this.b == 2;
        PathIterator pathIterator = this.a.getPathIterator();
        pathIterator.getClass();
        float[] fArr = new float[8];
        int i = 0;
        while (pathIterator.hasNext()) {
            if (pathIterator.next(fArr, 0) == 3 && z2) {
                float f = fArr[6];
                float f2 = this.c;
                ConicConverter conicConverter = this.f;
                conicConverter.a(f, f2, fArr, 0);
                i += conicConverter.a;
            } else {
                i++;
            }
        }
        return i;
    }

    @Override // defpackage.df0
    public final boolean b() {
        return this.e.hasNext();
    }

    @Override // defpackage.df0
    public final ff0 c(float[] fArr, int i) {
        ff0 ff0Var;
        fArr.getClass();
        ConicConverter conicConverter = this.f;
        int i2 = conicConverter.b;
        int i3 = conicConverter.a;
        ff0 ff0Var2 = ff0.f;
        if (i2 < i3) {
            conicConverter.b(fArr, i);
            return ff0Var2;
        }
        int next = this.e.next(fArr, i);
        ff0[] ff0VarArr = ef0.a;
        ff0 ff0Var3 = ff0.g;
        switch (next) {
            case 0:
                ff0Var = ff0.d;
                break;
            case 1:
                ff0Var = ff0.e;
                break;
            case 2:
                ff0Var = ff0Var2;
                break;
            case 3:
                ff0Var = ff0Var3;
                break;
            case 4:
                ff0Var = ff0.h;
                break;
            case 5:
                ff0Var = ff0.i;
                break;
            case 6:
                ff0Var = ff0.j;
                break;
            default:
                o.m(j50.h(next, "Unknown path segment type "));
                return null;
        }
        if (ff0Var != ff0Var3 || this.b != 2) {
            return ff0Var;
        }
        conicConverter.a(fArr[i + 6], this.c, fArr, i);
        if (conicConverter.a > 0) {
            conicConverter.b(fArr, i);
        }
        return ff0Var2;
    }
}
